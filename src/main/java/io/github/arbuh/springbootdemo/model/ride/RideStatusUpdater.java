package io.github.arbuh.springbootdemo.model.ride;

public interface RideStatusUpdater {
    public void addObserver(RideStatusObserver observer);
    public void sendUpdate(RideStatusUpdate update);
}
