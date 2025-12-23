package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.ride.Ride;

import java.math.BigDecimal;

public interface CostCalculationStrategy {
    public BigDecimal calculateCost(Ride ride);
}
