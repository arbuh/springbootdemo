package io.github.arbuh.springbootdemo.model.driver;

import io.github.arbuh.springbootdemo.model.Location;
import io.github.arbuh.springbootdemo.model.ride.RideStatusObserver;
import io.github.arbuh.springbootdemo.model.ride.RideStatusUpdate;
import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.util.UUID;

public record Driver(UUID id, Location location, DriverStatus status, Vehicle vehicle) implements RideStatusObserver {
    @Override
    public void getUpdate(RideStatusUpdate update) {
        System.out.printf("Driver %s gets ride %s status update: %s", this.id, update.rideId(), update.status());
    }
}
