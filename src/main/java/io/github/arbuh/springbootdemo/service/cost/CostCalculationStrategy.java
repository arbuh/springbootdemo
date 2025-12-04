package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.Ride;

import java.math.BigDecimal;

public interface CostCalculationStrategy {
    public BigDecimal calculateCost(Ride ride);
}
