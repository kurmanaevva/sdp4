package assignment10;

import java.util.ArrayList;
import java.util.List;

// Playlist class
public class Playlist {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public PlaylistIterator getSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public PlaylistIterator getShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    public PlaylistIterator getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(songs, genre);
    }
}