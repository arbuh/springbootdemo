package io.github.arbuh.springbootdemo.model.ride;

import java.util.UUID;

public record RideStatusUpdate(UUID rideId, RideStatus status) {
}
