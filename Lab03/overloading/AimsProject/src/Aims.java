public class Aims {
    public static void main(String[] args) {

//Create a new cart

        Cart anOrder = new Cart();

//Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1= new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc (dvd1);

        DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3= new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc (dvd2, dvd3);

        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[3];
        dvdList[0] = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        dvdList[1] = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        dvdList[2] = new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvdList);

//print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        // Kiểm tra xem xóa khỏi giỏ hàng thành công không
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
