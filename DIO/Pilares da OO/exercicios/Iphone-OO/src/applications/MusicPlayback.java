package applications;

public class MusicPlayback implements App {

    @Override
    public void start(){
        System.out.println("Start Music Playback");
    }
    
    @Override
    public void close(){
        System.out.println("Music Playback closed");
    }
}

