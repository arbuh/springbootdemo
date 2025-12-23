package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.ride.RideRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CostCalculator {
    private CostCalculationStrategy strategy = null;

    public void setCostCalculationStrategy(CostCalculationStrategy strategy){
        this.strategy = strategy;
    }

    public BigDecimal calculateCost(RideRequest rideRequest) {
        return this.strategy.calculateCost(rideRequest);
    }
}
