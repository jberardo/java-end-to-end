<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservation Details</title>
    </head>
    <body>
        <h2>Flight Details</h2>
        Airlines:  ${reservation.flight.operatingAirlines} <br />
        Flight Number:  ${reservation.flight.flightNumber} <br />
        Departure City:  ${reservation.flight.departureCity} <br />
        Arrival City:  ${reservation.flight.arrivalCity} <br />
        Date of Departure:  ${reservation.flight.dateOfDeparture} <br />
        Estimated Time:  ${reservation.flight.estimatedDepartureTime} <br />


        <h2>Passenger Details</h2>
        First Name: ${reservation.passenger.firstName} <br />
        Last Name: ${reservation.passenger.lastName} <br />
        Email: ${reservation.passenger.email} <br />
        Phone: ${reservation.passenger.phone} <br />

        <form action="completeCheckIn" method="POST"/>
            <pre>
                Enter the number of Bags: <input type="text" name="numberOfBags"/>
                <input type="hidden" name="reservationId" value="${reservation.id}">
                <input type="submit" value="Check In"/>
            </pre>
        </form>
    </body>
</html>