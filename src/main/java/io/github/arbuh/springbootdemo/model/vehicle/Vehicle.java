package io.github.arbuh.springbootdemo.model.vehicle;

import java.math.BigDecimal;
import java.util.UUID;

// TODO: use flyweight for vehicles?
public interface Vehicle {
    public UUID id();
    public BigDecimal pricePerKm();
}
