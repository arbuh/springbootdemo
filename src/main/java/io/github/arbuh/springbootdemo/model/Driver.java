package io.github.arbuh.springbootdemo.model;

import java.util.UUID;

public record Driver(UUID id, Location location, String status) {
}
