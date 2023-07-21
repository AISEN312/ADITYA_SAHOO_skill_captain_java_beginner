import java.util.ArrayList;
import java.util.List;


    interface  MusicPlayer{
       void play();
        void stop();
        void pause();
        void addSong(String Song);
        void removeSong(String Song);

    }
    class MyMusicPlayer implements MusicPlayer {
        private List<String> playlist;
        private boolean isPlaying;
        public MyMusicPlayer(){
        this.playlist = new ArrayList<>();
        this.isPlaying = false;}

    @Override
    public void play(){
        if(!playlist.isEmpty()){
            System.out.println("Playing: " + playlist.get(0));
            isPlaying = true;
        } else {
            System.out.println("No songs in the playlist.");
        }
    }




        @Override
        public void pause() {
            if (isPlaying) {
                System.out.println("Paused: " + playlist.get(0));
                isPlaying = false;
            } else {
                System.out.println("No song is currently playing.");
            }
        }
        public void stop(){
            if (isPlaying){
                System.out.println("Stopped: " + playlist.get(0));
                isPlaying = false;
            } else {
                System.out.println("No song is currently playing.");
            }
        }
        @Override
        public void addSong(String song) {
            playlist.add(song);
            System.out.println(song + " added to the playlist.");
        }
        public void removeSong(String song){
            if (playlist.contains(song)) {
                playlist.remove(song);
                System.out.println("Removed song: " + song);
            } else {
                System.out.println("Song not found in the playlist.");
            }
        }


}

