package io.github.arbuh.springbootdemo.model.driver;

import io.github.arbuh.springbootdemo.model.Location;
import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.util.UUID;

public record Driver(UUID id, Location location, DriverStatus status, Vehicle vehicle) {
}
