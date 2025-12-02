package io.github.arbuh.springbootdemo.model;

import java.util.UUID;

public record Ride(UUID id, Location start, Location end, String status, String type) {
}
