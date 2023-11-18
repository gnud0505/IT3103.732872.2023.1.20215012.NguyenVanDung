package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.store.*;


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public Cart() {
        this.qtyOrdered = 0;
    }

    public void addDigitalVideoDisc (DigitalVideoDisc disc){

        if(this.qtyOrdered < this.MAX_NUMBERS_ORDERED){
            // Thêm đĩa nếu giỏ chưa đầy
            this.itemsOrdered[this.qtyOrdered] = disc;

            System.out.println("Đĩa đã được thêm vào");
            if(this.qtyOrdered > this.MAX_NUMBERS_ORDERED-3){
                // Số đĩa > 17 thì đĩa gần đầy
                System.out.println("Giỏ hàng gần đầy");
            }
            this.qtyOrdered ++;
        }else{
            // Giỏ hàng đã đầy
            System.out.println("hust.soict.dsai.aims.cart.Cart đã đầy");
        }
    }

    public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList){
        int i=0;

        System.out.print("-------------\nThêm danh sách đĩa\n");
        while(i < dvdList.length){
            if(this.qtyOrdered < this.MAX_NUMBERS_ORDERED){
                // Thêm đĩa nếu giỏ chưa đầy
                this.itemsOrdered[this.qtyOrdered] = dvdList[i];
                System.out.println("Đĩa đã được thêm vào" );

                if(this.qtyOrdered > this.MAX_NUMBERS_ORDERED-3){
                    // Số đĩa > 17 thì đĩa gần đầy
                    System.out.println("Giỏ hàng gần đầy");
                }
                this.qtyOrdered ++;
                i++;
            }else{
                // Giỏ hàng đã đầy
                System.out.println("hust.soict.dsai.aims.cart.Cart đã đầy");
                break;
            }
        }
        System.out.println("------------");
    }

    public void addDigitalVideoDisc (DigitalVideoDisc div1 ,DigitalVideoDisc... dvdList){
        this.addDigitalVideoDisc(div1);
        for(DigitalVideoDisc dvd : dvdList){
            this.addDigitalVideoDisc(dvd);
        }
    }

    public void addDigitalVideoDisc (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        this.addDigitalVideoDisc(disc1);
        this.addDigitalVideoDisc(disc2);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = findDvdIndex(disc);
        if (index == -1) {
            System.out.println("Dvd không tồn tại trong giỏ hàng");
            return;
        }else {
            System.out.println("Xóa dvd ra giỏ hàng thành công");
        }

        // Xóa phần tử disc khỏi itemsOrdered
        for (int i = index; i < this.qtyOrdered - 1; i++) {
            this.itemsOrdered[i] = this.itemsOrdered[i + 1];
        }

        // Giảm số lượng đĩa đã đặt hàng
        this.qtyOrdered--;

    }

    // Lấy index của disc trong itemsOrdered
    private int findDvdIndex(DigitalVideoDisc disc) {
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrdered[i].equals(disc)) {
                return i;
            }
        }
        return -1;
    }

    public float totalCost(){
        float tc = 0; // giá tổng
        for(int i=0; i< this.qtyOrdered; i++ ){
            tc += this.itemsOrdered[i].getCost();
        }
        return tc;
    }

    public void print(){
        System.out.println("-------------------------CART------------------------\nOrdered Items:");
        if(qtyOrdered == 0){
            System.out.println("Chưa đặt đĩa nào");
        }else {
            for(int i=0; i<qtyOrdered; i++){
                System.out.println(this.itemsOrdered[i].toString());
            }
        }
        System.out.println("-------------------------END CART------------------------");
    }


}
