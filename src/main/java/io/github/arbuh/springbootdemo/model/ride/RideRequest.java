package io.github.arbuh.springbootdemo.model.ride;

import io.github.arbuh.springbootdemo.model.Location;

import java.util.UUID;

public record RideRequest(
        UUID id,
        Location start,
        Location end,
        RideType type
) {
}
