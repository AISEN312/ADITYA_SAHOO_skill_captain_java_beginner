public class main {
    public static void main(String[] args){
        MusicPlayer Mplayer = new MyMusicPlayer();

        Mplayer.addSong("Song 1");
        Mplayer.addSong("Song 2");
        Mplayer.addSong("Song 3");
        Mplayer.addSong("Song 4");
        Mplayer.addSong("Song 5");

        Mplayer.play();
        Mplayer.pause();

        Mplayer.removeSong("Song 3");

        Mplayer.stop();

    }
}
