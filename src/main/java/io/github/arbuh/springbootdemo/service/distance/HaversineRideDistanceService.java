package io.github.arbuh.springbootdemo.service.distance;

import io.github.arbuh.springbootdemo.model.Ride;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class HaversineRideDistanceService implements RideDistanceService {
    private static final double EARTH_RADIUS_KM = 6371.0;

    @Override
    public BigDecimal calculateRideDistanceInKm(Ride ride) {
        double lat1 = ride.start().latitude();
        double lon1 = ride.start().longitude();
        double lat2 = ride.end().latitude();
        double lon2 = ride.end().longitude();

        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        // Calculate differences
        double deltaLat = lat2Rad - lat1Rad;
        double deltaLon = lon2Rad - lon1Rad;

        // Haversine formula
        double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) *
                        Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return BigDecimal.valueOf(EARTH_RADIUS_KM * c);
    }
}
