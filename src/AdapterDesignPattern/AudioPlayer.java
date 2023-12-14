package AdapterDesignPattern;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        //in built support to media mp3 media files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 fileName:"+ fileName);
        }
        //media player is providing support to play other formmats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid media " + audioType + "format not supported");
        }
    }
}
