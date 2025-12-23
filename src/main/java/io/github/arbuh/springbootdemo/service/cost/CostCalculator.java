package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.ride.RideRequest;
import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CostCalculator {
    private CostCalculationStrategy strategy = null;

    public void setCostCalculationStrategy(CostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculateCost(BigDecimal distance, Vehicle vehicle) {
        CostData data = new CostData(distance, vehicle);
        return this.strategy.calculateCost(data);
    }
}
