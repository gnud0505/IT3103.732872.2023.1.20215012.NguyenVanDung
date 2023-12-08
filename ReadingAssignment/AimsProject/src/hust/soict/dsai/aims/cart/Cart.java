package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;


public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia (Media media){
        this.itemsOrdered.add(media);
        System.out.println("Thêm thành công");
    }

    public void addMedia (Media[] mediaList){
        System.out.println("Thêm danh sách Media");
        for(Media media: mediaList){
            this.addMedia(media);
        }
        System.out.println("---------------------------------");

    }

    public void addMedia (Media media1, Media... mediaList){
        System.out.println("Thêm danh sách Media");
        this.addMedia(media1);
        for(Media media: mediaList){
            this.addMedia(media);
        }
        System.out.println("---------------------------------");

    }

    public void addMedia (Media media1, Media media2) {
        this.addMedia(media1);
        this.addMedia(media2);
    }
    public void removeMedia(Media media) {
        boolean removed = this.itemsOrdered.remove(media);
        if (removed) {
            System.out.println("Xóa ra giỏ hàng thành công");
            return;
        }else {
            System.out.println("Không tồn tại trong giỏ hàng");
        }
    }

    public float totalCost(){
        float tc = 0; // giá tổng
        for(Media media: itemsOrdered){
            tc += media.getCost();
        }
        return tc;
    }

    public void print(){
        System.out.println("-------------------------CART------------------------\nOrdered Items:");
        if(itemsOrdered.size() == 0){
            System.out.println("Chưa order media nào");
        }else {
            for(Media media: itemsOrdered){
                System.out.println(media.toString());
            }
        }
        System.out.println("-------------------------END CART------------------------");
    }


}
