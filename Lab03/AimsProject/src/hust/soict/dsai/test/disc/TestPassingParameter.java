package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.store.*;

public class TestPassingParameter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle","Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella","Science Fiction", "George Lucas", 87, 24.95f);

        swapDVD(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd: " + jungleDVD.toString());
        System.out.println("cinderella dvd title: " + cinderellaDVD.toString());

    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;

    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);

    }

    public static void swapDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        //Swap title
        String title = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(title);

        //Swap category
        String category = dvd1.getCategory();
        dvd1.setCategory(dvd2.getCategory());
        dvd2.setCategory(category);

        //Swap director
        String director = dvd1.getDirector();
        dvd1.setDirector(dvd2.getDirector());
        dvd2.setDirector(title);

        //Swap length
        int length = dvd1.getLength();
        dvd1.setLength(dvd2.getLength());
        dvd2.setLength(length);

        //Swap cost
        float cost = dvd1.getCost();
        dvd1.setCost(dvd2.getCost());
        dvd2.setCost(cost);

        //Swap id
        int id = dvd1.getId();
        dvd1.setId(dvd2.getId());
        dvd2.setId(id);

    }

}
