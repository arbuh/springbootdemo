package io.github.arbuh.springbootdemo.model.vehicle;

import java.math.BigDecimal;
import java.util.UUID;

public record Bike(UUID id) implements Vehicle {
    private final static BigDecimal price = new BigDecimal("0.7");

    @Override
    public BigDecimal pricePerKm() {
        return price;
    }
}
