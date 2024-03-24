package Interface;
import java.util.*;

interface Audioplayer{
    void play(Videoplayer video);

}
interface Videoplayer{
    void play(String name);
}
class MP3 implements Audioplayer{
    String name="Panasonic";

    @Override
    public void play(Videoplayer video) {
        video.play(name);
    }
}
class MP4 implements Videoplayer{

    @Override
    public void play(String name) {
        System.out.println(name+" MP4 player plays both audio and Video files");
    }
}

public class multimedia {
    public static void main(String[]args){
        MP3 mp3=new MP3();
        MP4 mp4=new MP4();
        mp3.play(mp4);
    }
}
