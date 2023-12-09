package hust.soict.dsai.aims.media;

import java.util.Objects;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    private static int nbDigitalVideoDiscs = 0;

    public Media(String category, String title, float cost) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title) {
        this.id = nbDigitalVideoDiscs++;
        this.title = title;
    }

    protected Media() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
