package io.github.arbuh.springbootdemo.model;

import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.util.UUID;

public record Driver(UUID id, Location location, DriverStatus status, Vehicle vehicle) {
}
