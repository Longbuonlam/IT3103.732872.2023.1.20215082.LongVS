package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import Lab2.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // tạo giỏ hàng
        Cart anOrder = new Cart();

        // tạo các đĩa mới và thêm vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // in ra tổng số tiền trong giỏ hàng
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        System.out.println(anOrder.toString());

    }
}
