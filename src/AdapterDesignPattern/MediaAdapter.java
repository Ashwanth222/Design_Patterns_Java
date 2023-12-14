package AdapterDesignPattern;

public class MediaAdapter implements MediaPlayer {
    public MediaAdapter(String audiotype) {
        if (audiotype.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VLCPlayer();
        } else if (audiotype.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    AdvanceMediaPlayer advanceMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
