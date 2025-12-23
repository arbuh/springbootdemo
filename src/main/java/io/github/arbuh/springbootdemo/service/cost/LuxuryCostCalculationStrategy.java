package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.ride.RideRequest;
import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.math.BigDecimal;

public class LuxuryCostCalculationStrategy implements CostCalculationStrategy {
    @Override
    public BigDecimal calculateCost(RideRequest rideRequest) {
        BigDecimal distance = rideRequest.distance();
        Vehicle vehicle = rideRequest.driver().vehicle();
        BigDecimal coefficient = new BigDecimal("2");

        return distance.multiply(vehicle.pricePerKm()).multiply(coefficient);
    }
}
