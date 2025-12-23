package io.github.arbuh.springbootdemo.model.ride;

import io.github.arbuh.springbootdemo.model.Location;

public record RideRequest(
        Location start,
        Location end,
        RideType type
) {
}
