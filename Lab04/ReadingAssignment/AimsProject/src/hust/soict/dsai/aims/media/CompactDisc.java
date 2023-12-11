package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(String title){
        super(title);
    }

    public CompactDisc(String title, String artist, float cost){
        super(title, cost);
    }
    public CompactDisc(String title, String artist, ArrayList<Track> tracks) {
        super(title);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String category, String title, float cost, String artist, ArrayList<Track> tracks) {
        super(category, title, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, String director, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, director, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String toString(){
        return super.getId() + ". CD-" + super.getTitle() + "-" + super.getCategory() + "-"
                + super.getDirector() + "-" + super.getLength() + ": " + super.getCost() + "$";
    }
    public void addTrack(Track otherTrack){
        int tmp=0;
        for(Track track : this.tracks){
            if(track.equals(otherTrack)) tmp=1;
        }
        if(tmp == 0){
            tracks.add(otherTrack);
            System.out.println("Them Track thanh cong");
        }
        else {
            System.out.println("Track da ton tai");
        }
    }

    public void removeTrack(Track otherTrack){
        int tmp=0;
        for(Track track : this.tracks){
            if(track.equals(otherTrack)) tmp=1;
        }
        if(tmp == 1){
            tracks.remove(otherTrack);
            System.out.println("Xoa Track thanh cong");
        }
        else {
            System.out.println("Track khong ton tai");
        }
    }

    @Override
    public void play() {
        if(tracks == null){
            System.out.println("Không có track");
            return;
        }
        for(Track track: tracks){
            track.play();
        }

    }

    public String getArtist() {
        return artist;
    }

    public int getLengthCD() {
        int lengthCD = 0;
        for(Track track: this.tracks){
            lengthCD += track.getLength();
        }
        return lengthCD;
    }
}

