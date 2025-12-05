package io.github.arbuh.springbootdemo.model;

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
