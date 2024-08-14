package Interfaces;

public class Car implements Brake,MusicPlayer,Engine{
    // even if we have same methods names in multiple interfaces only one will be override in the class .
    @Override
    public void start() {

    }

    @Override
    public void startPlayer() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void acc() {

    }

    @Override
    public void brake() {

    }
}
