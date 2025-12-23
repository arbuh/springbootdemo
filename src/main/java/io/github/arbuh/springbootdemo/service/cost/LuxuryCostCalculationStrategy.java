package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.math.BigDecimal;

public class LuxuryCostCalculationStrategy implements CostCalculationStrategy {
    @Override
    public BigDecimal calculateCost(CostData data) {
        BigDecimal distance = data.distance();
        Vehicle vehicle = data.vehicle();
        BigDecimal coefficient = new BigDecimal("2");

        return distance.multiply(vehicle.pricePerKm()).multiply(coefficient);
    }
}
