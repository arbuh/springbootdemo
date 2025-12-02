package io.github.arbuh.springbootdemo.service.match;

import io.github.arbuh.springbootdemo.model.Driver;
import io.github.arbuh.springbootdemo.model.Ride;

import java.util.Optional;

public interface MatchService {
    public Optional<Driver> matchWithDriver(Ride ride);
}
