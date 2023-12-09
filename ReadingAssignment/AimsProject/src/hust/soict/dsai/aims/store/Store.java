package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();// danh sách store

    public void addMediaToStore (Media media){
        for(Media m: itemsInStore){
            if(m.equals(media)){
                System.out.println("Thêm thất bại. Dã tồn tại trong Store");
                return;
            }
        }
        this.itemsInStore.add(media);
        System.out.println("Thêm dvd vào Store thành công.");
    }

    public void addInStore (Media[] mediaList){
        System.out.println("Thêm danh sách Media");
        for(Media media: mediaList){
            this.addMediaToStore(media);
        }
        System.out.println("---------------------------------");

    }

    public void addMediaToStore (Media media1, Media... mediaList){
        System.out.println("Thêm danh sách Media");
        this.addMediaToStore(media1);
        for(Media media: mediaList){
            this.addMediaToStore(media);
        }
        System.out.println("---------------------------------");

    }

    public void addMediaToStore (Media media1, Media media2) {
        this.addMediaToStore(media1);
        this.addMediaToStore(media2);
    }
    public void removeMedia(Media media) {
        boolean removed = this.itemsInStore.remove(media);
        if (removed) {
            System.out.println("Xóa ra Store thành công");
            return;
        }else {
            System.out.println("Không tồn tại trong Store");
        }
    }

    public float totalCost(){
        float tc = 0; // giá tổng
        for(Media media: itemsInStore){
            tc += media.getCost();
        }
        return tc;
    }




}
