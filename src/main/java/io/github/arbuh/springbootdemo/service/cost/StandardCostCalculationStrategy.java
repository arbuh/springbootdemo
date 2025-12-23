package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.ride.RideRequest;
import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.math.BigDecimal;

public class StandardCostCalculationStrategy implements CostCalculationStrategy {
    @Override
    public BigDecimal calculateCost(RideRequest rideRequest) {
        BigDecimal distance = rideRequest.distance();
        Vehicle vehicle = rideRequest.driver().vehicle();

        return distance.multiply(vehicle.pricePerKm());
    }
}
