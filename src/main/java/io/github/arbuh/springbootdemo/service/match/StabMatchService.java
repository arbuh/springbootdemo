package io.github.arbuh.springbootdemo.service.match;

import io.github.arbuh.springbootdemo.model.Driver;
import io.github.arbuh.springbootdemo.model.Location;
import io.github.arbuh.springbootdemo.model.Ride;

import java.util.Optional;
import java.util.UUID;

// TODO: Implement "real" matching based on the distance
public class StabMatchService implements MatchService {
    private final Driver dummyDriver = new Driver(UUID.fromString("60993f70-fc02-4741-970c-abf6cf86d538"), new Location(0.0, 0.0), "available");

    @Override
    public Optional<Driver> matchWithDriver(Ride ride) {
        return Optional.of(dummyDriver);
    }
}
