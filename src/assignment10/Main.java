package assignment10;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Song A", "Rock"));
        playlist.addSong(new Song("Song B", "Pop"));
        playlist.addSong(new Song("Song C", "Rock"));
        playlist.addSong(new Song("Song D", "Jazz"));
        playlist.addSong(new Song("Song E", "Pop"));

        System.out.println("Sequential Order:");
        PlaylistIterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        System.out.println("\nShuffle Order:");
        PlaylistIterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println("\nFiltered by Genre (Pop):");
        PlaylistIterator genreFilterIterator = playlist.getGenreFilterIterator("Pop");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}