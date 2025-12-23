package io.github.arbuh.springbootdemo.service.distance;

import io.github.arbuh.springbootdemo.model.ride.Ride;

import java.math.BigDecimal;

public interface RideDistanceService {
    BigDecimal calculateRideDistanceInKm(Ride ride);
}
