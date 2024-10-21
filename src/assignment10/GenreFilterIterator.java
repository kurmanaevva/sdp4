package assignment10;

import java.util.List;

public class GenreFilterIterator implements PlaylistIterator {
    private List<Song> songs;
    private String genre;
    private int position;

    public GenreFilterIterator(List<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        while (position < songs.size()) {
            if (songs.get(position).getGenre().equalsIgnoreCase(genre)) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Song next() {
        return hasNext() ? songs.get(position++) : null;
    }
}