package io.github.arbuh.springbootdemo.service.match;

import io.github.arbuh.springbootdemo.model.driver.Driver;
import io.github.arbuh.springbootdemo.model.driver.DriverStatus;
import io.github.arbuh.springbootdemo.model.Location;
import io.github.arbuh.springbootdemo.model.ride.Ride;
import io.github.arbuh.springbootdemo.model.vehicle.Car;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

// TODO: Implement "real" matching based on the distance
@Service
public class StabMatchService implements MatchService {
    private final Driver dummyDriver =
            new Driver(
                    UUID.fromString("60993f70-fc02-4741-970c-abf6cf86d538"),
                    new Location(0.0, 0.0),
                    DriverStatus.AVAILABLE,
                    new Car(UUID.fromString("72bcb30f-468a-4d62-8e3f-9b7c7b5f8095")));

    @Override
    public Optional<Driver> matchWithDriver(Ride ride) {
        return Optional.of(dummyDriver);
    }
}
