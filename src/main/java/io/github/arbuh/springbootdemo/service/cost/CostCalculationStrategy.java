package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.ride.RideRequest;

import java.math.BigDecimal;

public interface CostCalculationStrategy {
    public BigDecimal calculateCost(RideRequest rideRequest);
}
