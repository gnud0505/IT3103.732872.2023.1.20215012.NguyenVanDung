package hust.soict.dsai.aims.disc;

import java.util.Objects;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.store.*;


public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
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
        return this.id + ". DVD-" + this.title + "-" + this.category + "-" + this.director + "-" + this.length + ": " + this.cost + "$";
    }

}
