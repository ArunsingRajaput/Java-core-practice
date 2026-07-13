package oops;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

public class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking Photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        s.takePhoto();
        s.playMusic();
    }
}