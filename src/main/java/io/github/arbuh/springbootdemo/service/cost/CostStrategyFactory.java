package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.Ride;
import io.github.arbuh.springbootdemo.model.RideType;
import org.springframework.stereotype.Service;

@Service
public class CostStrategyFactory {
    private final StandardCostCalculationStrategy standardCostCalculationStrategy;
    private final SharedCostCalculationStrategy sharedCostCalculationStrategy;
    private final LuxuryCostCalculationStrategy luxuryCostCalculationStrategy;

    public CostStrategyFactory(
            StandardCostCalculationStrategy standardCostCalculationStrategy,
            SharedCostCalculationStrategy sharedCostCalculationStrategy,
            LuxuryCostCalculationStrategy luxuryCostCalculationStrategy
    ) {
        this.standardCostCalculationStrategy = standardCostCalculationStrategy;
        this.sharedCostCalculationStrategy = sharedCostCalculationStrategy;
        this.luxuryCostCalculationStrategy = luxuryCostCalculationStrategy;
    }

    public CostCalculationStrategy createStrategy(Ride ride) {
        CostCalculationStrategy costCalculationStrategy;

        switch (ride.type()) {
            case RideType.STANDARD -> {
                costCalculationStrategy = new StandardCostCalculationStrategy();
            }
            case RideType.SHARED -> {
                costCalculationStrategy = new SharedCostCalculationStrategy();
            }
            case RideType.LUXURY -> {
                costCalculationStrategy = new LuxuryCostCalculationStrategy();
            }
            default -> {
                costCalculationStrategy = new StandardCostCalculationStrategy();
            }
        }

        return costCalculationStrategy;
    }
}
