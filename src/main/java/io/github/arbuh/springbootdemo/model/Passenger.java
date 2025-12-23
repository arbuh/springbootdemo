package io.github.arbuh.springbootdemo.model;

import io.github.arbuh.springbootdemo.model.ride.RideStatusObserver;
import io.github.arbuh.springbootdemo.model.ride.RideStatusUpdate;

import java.util.UUID;

public record Passenger(UUID id) implements RideStatusObserver {
    @Override
    public void getUpdate(RideStatusUpdate update) {
        System.out.printf("Passenger %s gets ride %s status update: %s", this.id, update.rideId(), update.status());
    }
}
