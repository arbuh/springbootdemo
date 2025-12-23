package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.math.BigDecimal;

public class StandardCostCalculationStrategy implements CostCalculationStrategy {
    @Override
    public BigDecimal calculateCost(CostData data) {
        BigDecimal distance = data.distance();
        Vehicle vehicle = data.vehicle();

        return distance.multiply(vehicle.pricePerKm());
    }
}
