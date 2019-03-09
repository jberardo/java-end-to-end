package io.joca.locationweb.service;

import java.util.List;

import io.joca.locationweb.entities.Location;

/**
 * @author Joao Berardo
 */
public interface LocationService {
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationById(int id);
	List<Location> getAllLocations();
}
