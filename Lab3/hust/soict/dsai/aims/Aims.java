package Lab3;

import Lab2.Cart;
import Lab2.DigitalVideoDisc;

public class Aims {
    public Aims() {
    }

    public static void main(String[] args) {
        // tao doi tuong gio hang
        Lab2.Cart anOrder = new Cart();

        //tao cac dia moi va them vao cart
        Lab2.DigitalVideoDisc dvd1 = new Lab2.DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95F);
        anOrder.addDigitalVideoDisc(dvd1);

        Lab2.DigitalVideoDisc dvd2 = new Lab2.DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95F);
        anOrder.addDigitalVideoDisc(dvd2);

        Lab2.DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99F);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd1);
        //In tong so tien
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        System.out.println(anOrder.toString());
    }
}
