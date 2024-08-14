package Interfaces;

public class NiceCar {
    private MSplayer player = new MSplayer();
    private EngineClass engine = new EngineClass();

//    public NiceCar(EngineClass engine) {
//        this.engine = engine;
//    }

    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }

    public void startPlayer(){
        player.startPlayer();
    }

}
