package io.github.arbuh.springbootdemo.service.distance;

import io.github.arbuh.springbootdemo.model.ride.RideRequest;

import java.math.BigDecimal;

public interface RideDistanceService {
    BigDecimal calculateRideDistanceInKm(RideRequest rideRequest);
}
