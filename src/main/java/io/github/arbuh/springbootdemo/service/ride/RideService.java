package io.github.arbuh.springbootdemo.service.ride;

import io.github.arbuh.springbootdemo.model.Driver;
import io.github.arbuh.springbootdemo.model.Ride;
import io.github.arbuh.springbootdemo.service.cost.CostCalculationStrategy;
import io.github.arbuh.springbootdemo.service.cost.CostCalculator;
import io.github.arbuh.springbootdemo.service.cost.CostStrategyFactory;
import io.github.arbuh.springbootdemo.service.distance.RideDistanceService;
import io.github.arbuh.springbootdemo.service.match.MatchService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class RideService {
    private final MatchService matchService;
    private final RideDistanceService rideDistanceService;
    private final CostStrategyFactory costStrategyFactory;
    private final CostCalculator costCalculator;

    public RideService(MatchService matchService, RideDistanceService rideDistanceService, CostCalculator costCalculator, CostStrategyFactory costStrategyFactory) {
        this.matchService = matchService;
        this.rideDistanceService = rideDistanceService;
        this.costCalculator = costCalculator;
        this.costStrategyFactory = costStrategyFactory;
    }

    public void process(Ride ride) {
        Optional<Driver> optionalDriver = this.matchService.matchWithDriver(ride);

        if (optionalDriver.isEmpty()) {
            return;
        }

        Driver driver = optionalDriver.get();
        BigDecimal distance = this.rideDistanceService.calculateRideDistanceInKm(ride);

        CostCalculationStrategy strategy = costStrategyFactory.createStrategy(ride);
        costCalculator.setCostCalculationStrategy(strategy);

        BigDecimal cost = costCalculator.calculateCose(ride);
    }
}
