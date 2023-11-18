package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_LENGTH_STRORE = 10000;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_LENGTH_STRORE];// danh sách store
    private int qtyInStore;

    public void addDVDToStore (DigitalVideoDisc disc){
            this.itemsInStore[this.qtyInStore] = disc;
            System.out.println("Thêm dvd vào store thành công.");
            qtyInStore++;
    }

    public void addDVDToStore (DigitalVideoDisc[] dvdList){
        int i=0;

        System.out.print("-------------\nThêm danh sách đĩa\n");
        while(i < dvdList.length){
            this.itemsInStore[this.qtyInStore] = dvdList[i];
            System.out.println("Thêm dvd vào store thành công.");
            i++;
            qtyInStore++;
        }
        System.out.println("-------------------------");
    }

    public void addDVDToStore (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        this.addDVDToStore(disc1);
        this.addDVDToStore(disc2);
    }

    public void removeDvd(DigitalVideoDisc disc) {
        int index = findDvdIndex(disc);
        if (index == -1) {
            System.out.println("Dvd không tồn tại trong store");
            return;
        }else {
            System.out.println("Xóa dvd ra store thành công");
        }

        // Xóa phần tử disc khỏi itemsInStore
        for (int i = index; i < this.qtyInStore - 1; i++) {
            this.itemsInStore[i] = this.itemsInStore[i + 1];
        }

        // Giảm số lượng đĩa đã đặt hàng
        this.qtyInStore--;

    }

    // Lấy index của disc trong itemsInStore
    private int findDvdIndex(DigitalVideoDisc disc) {
        for (int i = 0; i < this.qtyInStore; i++) {
            if (this.itemsInStore[i].equals(disc)) {
                return i;
            }
        }
        return -1;
    }

}
