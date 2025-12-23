package io.github.arbuh.springbootdemo.service.cost;

import java.math.BigDecimal;

public interface CostCalculationStrategy {
    public BigDecimal calculateCost(CostData data);
}
