package Interfaces;

public class EngineClass implements Engine{
    @Override
    public void start() {
        System.out.println("engine starts");
    }

    @Override
    public void stop() {
        System.out.println("engine stops");
    }

    @Override
    public void acc() {
        System.out.println("enginr acc");
    }
}
