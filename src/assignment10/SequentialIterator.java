package assignment10;

import java.util.List;

public class SequentialIterator implements PlaylistIterator {
    private List<Song> songs;
    private int position;

    public SequentialIterator(List<Song> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return hasNext() ? songs.get(position++) : null;
    }
}