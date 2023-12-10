package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {

//Create a new cart

        Cart anOrder = new Cart();

//Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd2, dvd3);
        anOrder.addMedia(dvd1);

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
        Book book3 = new Book("Title3", "Category3", 19.99f, authors3);

        anOrder.addMedia(book1, book2, book3);

//print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        // Kiểm tra xem xóa khỏi giỏ hàng thành công không
        anOrder.removeMedia(dvd3);
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.print();
    }
}
