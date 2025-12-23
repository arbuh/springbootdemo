package io.github.arbuh.springbootdemo.service.ride;

import io.github.arbuh.springbootdemo.model.Passenger;
import io.github.arbuh.springbootdemo.model.driver.Driver;
import io.github.arbuh.springbootdemo.model.ride.Ride;
import io.github.arbuh.springbootdemo.model.ride.RideRequest;
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

    public void process(RideRequest rideRequest, Passenger passenger) {
        Optional<Driver> optionalDriver = this.matchService.matchWithDriver(rideRequest);

        if (optionalDriver.isEmpty()) {
            return;
        }

        Driver driver = optionalDriver.get();
        BigDecimal distance = this.rideDistanceService.calculateRideDistanceInKm(rideRequest);

        CostCalculationStrategy strategy = costStrategyFactory.createStrategy(rideRequest);
        costCalculator.setCostCalculationStrategy(strategy);

        BigDecimal cost = costCalculator.calculateCost(distance, driver.vehicle());

        Ride.RideBuilder builder = new Ride.RideBuilder();
        builder.setDriver(driver);
        builder.setRideType(rideRequest.type());
        builder.addPassenger(passenger);
        builder.setDistance(distance);
        builder.setCost(cost);

        builder.build();

        // TODO: save ride in repo
    }
}
