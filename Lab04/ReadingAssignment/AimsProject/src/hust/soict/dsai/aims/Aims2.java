
package hust.soict.dsai.aims;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import java.util.List;
public class Aims2 {
    private static String mediaTitle;
    public static Scanner scanner = new Scanner(System.in);
    public static Store aStore;
    public static Cart aCart = new Cart();
    private static Media foundMedia;
    // Khai báo các biến static
    public static void main(String[] args)
    {   aStore = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f );
        aStore.addMediaToStore(dvd1);

        DigitalVideoDisc dvd2 = new  DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f );
        aStore.addMediaToStore(dvd2);
        DigitalVideoDisc dvd3 = new  DigitalVideoDisc("Aladin",
                "Animation", 18.99f );
        aStore.addMediaToStore(dvd3);
        CompactDisc cd1 = new CompactDisc("Disco Elysium", "High Classic",12.3f);
        CompactDisc cd2 = new CompactDisc("Divine dive", "Blue", 16f);
        aStore.addMediaToStore(cd1);
        aStore.addMediaToStore(cd2);
        //Create new book objects and add them to the cart
        List<String> authors1 = new ArrayList<>();
        authors1.add("Author1");
        authors1.add("Author2");

        List<String> authors2 = new ArrayList<>();
        authors2.add("Author3");
        authors2.add("Author4");

        List<String> authors3 = new ArrayList<>();
        authors3.add("Author5");

        // Tạo 3 đối tượng Book
        Book book1 = new Book("Title1", "Category1", 29.99f, authors1);
        Book book2 = new Book("Title2", "Category2", 39.99f, authors2);

        aStore.addMediaToStore(book1);
        aStore.addMediaToStore(book2);
        // Tạo các media với các loại khác nhau và thêm vào store
        showMenu();
        // Chạy hàm showMenu tạo giao diện cho người dùng
    }

    public static void showMenu() {
        //Hàm cho thấy menu
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        //In ra các lựa chọn
        int choice = scanner.nextInt();
        //Lấy lựa chọn
        switch (choice){
            case 1: storeMenu(); break;
            case 2: updateStore(); break;
            case 3: cartMenu(); break;
            //Với các lựa chọn hợp lệ chạy hàm tương ứng
            case 0: return;
            //Với 0 kết thúc giao diện
            default:
                System.out.println("Error, choose again!");
                //Không báo lỗi và quay lại giao diện
                showMenu();
        }
    }

    public static void storeMenu() {
        //Hàm cho thấy có gì trong store
        aStore.print();
        //In ra những gì đan cos trong store
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        //In ra các lựa chọn
        int choice = scanner.nextInt();
        //Lấy lựa chọn
        switch (choice){
            case 0: showMenu(); break;
            case 1:
                System.out.println("Enter media's title: ");
                scanner.nextLine();
                mediaTitle = scanner.nextLine();
                foundMedia = aStore.searchByTitle(mediaTitle);
                if (foundMedia != null) {
                    mediaDetailsMenu();
                }
                //Trong lựa chọn 1 , lấy tên media rồi tìm nó trong store, nếu tìm thấy vào mediaDetailsMenu
                //Xong quay trở lại giao diện
                storeMenu();
                break;
            case 2:
                System.out.println("Enter media's title");
                scanner.nextLine();
                String mediaTitleAdd = scanner.nextLine();
                foundMedia = aStore.searchByTitle(mediaTitleAdd);
                //Lấy tên media rồi tìm nó trong store và lưu kết quả vào biến foundMedia
                if (foundMedia != null) {
                    aCart.addMedia(foundMedia);
                    aStore.removeMedia(foundMedia);
                    System.out.println("Media added to cart successfully");
                    //Nếu có kết quả thì thêm vào giỏ hàng và bỏ khỏi store
                } else {
                    System.out.println("Media not found in the store");
                    //Không thì báo không tìm thấy
                }

                storeMenu();
                break;
            case 3:
                System.out.println("Enter media's title");
                scanner.nextLine();
                String mediaTitlePlay = scanner.nextLine();
                foundMedia = aStore.searchByTitle(mediaTitlePlay);
                //Lấy tên media rồi tìm nó trong store và lưu kết quả vào biến foundMedia
                if (foundMedia instanceof CompactDisc) {
                    CompactDisc cd = (CompactDisc) foundMedia;
                    cd.play();
                } else if (foundMedia instanceof DigitalVideoDisc) {
                    DigitalVideoDisc dvd = (DigitalVideoDisc) foundMedia;
                    dvd.play();
                }
                //Kiểm tra xem media có phải loại có thể play không rồi play
                else {
                    System.out.println("Media can't be played");
                    //Nếu không báo lỗi
                }
                storeMenu();
                break;
            case 4:
                cartMenu();
                break;
            default:
                System.out.println("Error, choose again!");
                storeMenu();
        }
    }

    public static void mediaDetailsMenu() {
        //method cho xem thông tin của media đã chọn
        int check = 0;
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (foundMedia instanceof CompactDisc || foundMedia instanceof DigitalVideoDisc) {
            System.out.println("2. Play");
            check = 1;
            //Kiểm tra xem media xem có phải loại play được không để in ra lựa chọn
        }
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-(2)");
        int detailMenuChoice = scanner.nextInt();
        switch (detailMenuChoice){
            case 1:
                aCart.addMedia(foundMedia);
                aStore.removeMedia(foundMedia);
                System.out.println("Media added to cart successfully");
                //Thểm media lưu trong biến foundMedia từ trước vào cart rồi bỏ khỏi store
                storeMenu();
                break;
            case 2:
                if (check == 0)
                {
                    System.out.println("Error, choose again!");
                    mediaDetailsMenu();
                    //Nếu media không phải loại play được thì không có lựa chọn 2, coi nó như lựa chọn lõi
                }
                else
                {
                    if (foundMedia instanceof CompactDisc) {
                        CompactDisc cd = (CompactDisc) foundMedia;
                        cd.play();
                    } else if (foundMedia instanceof DigitalVideoDisc) {
                        DigitalVideoDisc dvd = (DigitalVideoDisc) foundMedia;
                        dvd.play();
                    }
                    //Nếu là loại play được thì ép kiểu rồi dùng hàm play tương ứng
                }
                break;
            case 0:
                storeMenu();
                break;
            default:
                System.out.println("Error, choose again!");
                mediaDetailsMenu();
        }
    }
    public static void updateStore(){
        //Method cho cập nhật cửa hàng
        Media item;
        // In các lựa chọn
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add new media.");
        System.out.println("2. Remove media.");
        System.out.println("0. Back");
        System.out.println("---------------------------------");
        System.out.println("Please choose a number 0-1-2");
        int updateStoreChoice = scanner.nextInt();
        switch (updateStoreChoice){
            case 0: showMenu(); break;
            case 1:
                AddMedia();
                break;
            case 2:
                System.out.println("Removed media");
                scanner.nextLine();
                String removeFromStore = scanner.nextLine();
                //Đọc tên media
                item = aStore.searchByTitle(removeFromStore);
                //Tìm trong cửa hàng media đó
                if (item != null) {
                    System.out.println("Xoá media thành công");
                    aStore.removeMedia(item);
                    //nếu có thì loại bỏ và báo
                } else {
                    System.out.println("Can't remove");
                    //Nếu không báo lỗi
                }
                updateStore();
                break;
            default:
                System.out.println("Lỗi hãy chọn  lại!");
                updateStore();
        }
    }

    public static void AddMedia(){
        //Method cho việc thêm media trong store
        String Title;
        //In ra các lựa chọn
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a book.");
        System.out.println("2. Add a DVD.");
        System.out.println("3. Add a CD.");
        System.out.println("0. Back");
        System.out.println("---------------------------------");
        System.out.println("Hãy chọn từ  0-1-2-3");
        int updateStoreChoice = scanner.nextInt();
        scanner.nextLine();
        switch (updateStoreChoice){
            case 0: updateStore(); break;
            case 1:
                System.out.println("Title");
                Title = scanner.nextLine();
                //Lấy tên của book
                Book book = new Book(Title);
                //Tạo một instance mới rồi thêm vào store
                aStore.addMediaToStore(book);
                updateStore();
                break;
            case 2:
                System.out.println("Title");
                Title = scanner.nextLine();
                //Lấy tên
                DigitalVideoDisc dvd = new DigitalVideoDisc(Title);
                aStore.addMediaToStore(dvd);
                //Tạo một instance mới rồi thêm vào store
                updateStore();
                break;
            case 3:
                System.out.println("Title");
                Title = scanner.nextLine();
                //Lấy tên
                CompactDisc cd = new CompactDisc(Title);
                aStore.addMediaToStore(cd);
                updateStore();
                break;
            default:
                System.out.println("Lỗi hãy chọn lại!");
                updateStore();
        }
    }


    public static void cartMenu() {
        //Method cho xem trong cart có gì
        Media item;
        aCart.print();
        //In ra những gì có trong Cart
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Hãy chọn từ : 0-1-2-3-4-5");
        int cartMenuChoice = scanner.nextInt();
        switch (cartMenuChoice){
            case 1:
                filterMenu();
                break;
            case 2:
                sortMenu();
                break;
            case 3:
                System.out.println("Nhập tiêu đề của media: ");
                scanner.nextLine();
                String removeMediaTitle = scanner.nextLine();
                item = aCart.searchByTitle(removeMediaTitle);
                //Lấy tên Media muốn xóa rồi tìm nó
                if (item != null) {
                    System.out.println("Xoá media thành công");
                    aCart.removeMedia(item);
                } else {
                    System.out.println("Không thể xoá");
                }
                //Tìm được thì xóa không thì báo lỗi
                cartMenu();
                break;
            case 4:
                System.out.println("Nhập tiêu đề của media");
                scanner.nextLine();
                String mediaTitlePlay = scanner.nextLine();
                item =  aCart.searchByTitle(mediaTitlePlay);
                //Lấy tên rồi tìm media để play
                if ( item instanceof CompactDisc) {
                    CompactDisc cd = (CompactDisc) item;
                    cd.play();
                } else if (item instanceof DigitalVideoDisc) {
                    DigitalVideoDisc dvd = (DigitalVideoDisc) item;
                    dvd.play();
                }
                else {
                    System.out.println("Không tìm thấy media trong store");
                }
                //Nếu play được thì play không thì báo lỗi
                cartMenu();
                break;
            case 5:
                System.out.println("Đã thêm một yêu cầu");
                cartMenu();
                break;
            case 0:
                storeMenu();
                break;
            default:
                System.out.println("Lỗi hãy chọn lại");
                cartMenu();
        }
    }

    public static void filterMenu(){
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. By ID");
        System.out.println("2. By Title");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Hãy chọn từ : 0-1-2");
        int filterChoice = scanner.nextInt();
        switch (filterChoice){
            case 1:
                System.out.println("Nhập id của media : ");
                int filterID = scanner.nextInt();
                //Lấy Id rồi tìm các id khớp
                aCart.searchById(filterID);
                filterMenu();
                break;
            case 2:
                System.out.println("Nhập tiêu đề của media: ");
                scanner.nextLine();
                String filterTitle = scanner.nextLine();
                //Lấy title rồi tìm các title khớp
                foundMedia = aCart.searchByTitle(filterTitle);
                System.out.println(foundMedia.toString());
                filterMenu();
                break;
            case 0:
                cartMenu();
                break;
            default:
                System.out.println("Lỗi hãy chọn lại");
                filterMenu();
        }
    }

    public static void sortMenu(){
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. By Title");
        System.out.println("2. By Cost");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Hãy chọn từ : 0-1-2");
        int sortChoice = scanner.nextInt();
        switch (sortChoice){
            case 1:
                aCart.sortTitleCostMedia();
                aCart.print();
                //Sort bằng title rồi show lại cart
                sortMenu();
                break;
            case 2:
                aCart.sortCostTitleMedia();
                aCart.print();
                //Sortbycost rồi show lại cart
                sortMenu();
                break;
            case 0:
                cartMenu();
                break;
            default:
                System.out.println("Error, choose again");
                sortMenu();
        }
    }

}
