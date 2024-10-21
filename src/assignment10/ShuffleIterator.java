package assignment10;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ShuffleIterator implements PlaylistIterator {
    private List<Song> shuffledSongs;
    private int position;

    public ShuffleIterator(List<Song> songs) {
        this.shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return hasNext() ? shuffledSongs.get(position++) : null;
    }
}