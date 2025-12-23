package io.github.arbuh.springbootdemo.service.match;

import io.github.arbuh.springbootdemo.model.driver.Driver;
import io.github.arbuh.springbootdemo.model.ride.RideRequest;

import java.util.Optional;

public interface MatchService {
    public Optional<Driver> matchWithDriver(RideRequest rideRequest);
}
