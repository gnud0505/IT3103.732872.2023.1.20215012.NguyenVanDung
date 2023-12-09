package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disc extends Media{
    private String director;
    private int length;


    public Disc(String title){
        super(title);
    }

    public Disc(String category, String title, float cost){
        super(category, title, cost);
    }

    public Disc(String title, String category, String director, float cost) {
        super(category, title, cost);
        this.director = director;
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super(category, title, cost);
        this.director = director;
        this.length = length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDirector(), getLength());
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }


}


