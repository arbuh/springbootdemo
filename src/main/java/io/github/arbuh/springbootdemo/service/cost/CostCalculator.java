package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.Ride;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CostCalculator {
    private CostCalculationStrategy strategy = null;

    public void setCostCalculationStrategy(CostCalculationStrategy strategy){
        this.strategy = strategy;
    }

    public BigDecimal calculateCose(Ride ride) {
        return this.strategy.calculateCost(ride);
    }
}
