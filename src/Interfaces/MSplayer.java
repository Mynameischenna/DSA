package Interfaces;

public class MSplayer implements MusicPlayer{
    @Override
    public void startPlayer() {
        System.out.println("music start");
    }

    @Override
    public void stop() {
        System.out.println("music stop");
    }
}
