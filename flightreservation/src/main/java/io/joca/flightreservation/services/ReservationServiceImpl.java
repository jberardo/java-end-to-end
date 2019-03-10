package io.joca.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.joca.flightreservation.dto.ReservationRequest;
import io.joca.flightreservation.entities.Flight;
import io.joca.flightreservation.entities.Passenger;
import io.joca.flightreservation.entities.Reservation;
import io.joca.flightreservation.repositories.FlightRepository;
import io.joca.flightreservation.repositories.PassengerRepository;
import io.joca.flightreservation.repositories.ReservationRepository;
import io.joca.flightreservation.util.EmailUtil;
import io.joca.flightreservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Value("${io.joca.flightreservation.itinerary.dirpath}")
    private String ITINERARY_DIR;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private PDFGenerator pdfGenerator;

    @Autowired
    private EmailUtil emailUtil;

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        // make payment

        Long flightId = request.getFlightId();
        Flight flight = flightRepository.findById(flightId).orElse(null);

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastName(request.getPassengerLasttName());
        passenger.setEmail(request.getPassengerEmail());
        passenger.setPhone(request.getPassengerPhone());
        Passenger savedPassenger = passengerRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);

        Reservation savedReservation = reservationRepository.save(reservation);

        String filePath = ITINERARY_DIR + savedReservation.getId() + ".pdf";

        pdfGenerator.generateItinerary(savedReservation, filePath);
        emailUtil.sendItinerary(passenger.getEmail(), filePath);
        return savedReservation;
    }
}