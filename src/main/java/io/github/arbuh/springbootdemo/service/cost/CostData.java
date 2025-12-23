package io.github.arbuh.springbootdemo.service.cost;

import io.github.arbuh.springbootdemo.model.vehicle.Vehicle;

import java.math.BigDecimal;

public record CostData(BigDecimal distance, Vehicle vehicle) {
}
