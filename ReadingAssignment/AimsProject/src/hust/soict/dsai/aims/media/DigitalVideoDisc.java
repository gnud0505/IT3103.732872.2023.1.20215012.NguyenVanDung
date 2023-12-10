package hust.soict.dsai.aims.media;

import java.util.Objects;


public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title){
        super(title);
    }

    public DigitalVideoDisc(String category, String title, float cost){
        super(category, title, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalVideoDisc that = (DigitalVideoDisc) o;
        return getLength() == that.getLength() && Float.compare(getCost(), that.getCost()) == 0 && getId() == that.getId() && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getCategory(), that.getCategory()) && Objects.equals(getDirector(), that.getDirector());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getCategory(), getDirector(), getLength(), getCost(), getId());
    }

    public String toString(){
        return this.getId() + ". DVD-" + super.getTitle() + "-" + super.getCategory() + "-" + super.getDirector() + "-" + super.getLength() + ": " + super.getCost() + "$";
    }

    @Override
    public void play() {
        System.out.println("Play DVD: " + this.getTitle());
        System.out.println("Play length: " + this.getLength());
    }


}
