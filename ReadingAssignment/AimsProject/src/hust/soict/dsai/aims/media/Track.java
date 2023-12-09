package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    // Constructors
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Play DVD: " + this.getTitle());
        System.out.println("Play length: " + this.getLength());
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

}
