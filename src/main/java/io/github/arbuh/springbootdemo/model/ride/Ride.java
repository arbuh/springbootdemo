package io.github.arbuh.springbootdemo.model.ride;

import io.github.arbuh.springbootdemo.model.Passenger;
import io.github.arbuh.springbootdemo.model.driver.Driver;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public record Ride(UUID id, Driver driver, List<Passenger> passengers, BigDecimal distance, RideType type,
                   BigDecimal cost) implements RideStatusUpdater {

    @Override
    public void sendUpdate(RideStatusUpdate update) {
        this.driver.getUpdate(update);
        this.passengers.forEach(passenger -> passenger.getUpdate(update));
    }

    public static class RideBuilder {
        private UUID id;
        private Driver driver;
        private List<Passenger> passengers;
        private BigDecimal distance;
        private RideType type;
        private BigDecimal cost;

        public RideBuilder() {
            this.passengers = new ArrayList<>();
        }

        public void setDriver(Driver driver) {
            this.driver = driver;
        }

        public void addPassenger(Passenger passenger) {
            this.passengers.add(passenger);
        }

        public void setDistance(BigDecimal distance) {
            this.distance = distance;
        }

        public void setRideType(RideType type) {
            this.type = type;
        }

        public void setCost(BigDecimal cost) {
            this.cost = cost;
        }

        public Ride build() {
            UUID id = UUID.randomUUID();
            return new Ride(id, this.driver, this.passengers, this.distance, this.type, this.cost);
        }
    }
}

