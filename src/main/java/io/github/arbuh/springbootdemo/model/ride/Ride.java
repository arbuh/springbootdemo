package io.github.arbuh.springbootdemo.model.ride;

import io.github.arbuh.springbootdemo.model.driver.Driver;
import io.github.arbuh.springbootdemo.model.Location;
import io.github.arbuh.springbootdemo.model.Passenger;

import java.math.BigDecimal;
import java.util.UUID;

public record Ride(
        UUID id,
        Location start,
        Location end,
        BigDecimal distance,
        RideStatus status,
        RideType type,
        Passenger passenger,
        Driver driver
) {
}
