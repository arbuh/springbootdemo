package io.github.arbuh.springbootdemo.model;

import java.util.UUID;

public record Ride(UUID id, Location start, Location end, RideStatus status, RideType type, Passenger passenger,
                   Driver driver) {
}
