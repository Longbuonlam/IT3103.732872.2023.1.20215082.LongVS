package Lab3;

import Lab2.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    //init cart
    private Lab2.DigitalVideoDisc[] itemsOrdered = new Lab2.DigitalVideoDisc[20];
    private int qtyOrdered;

    public Cart() {
    }

    //Them dia vao Cart
    public void addDigitalVideoDisc(Lab2.DigitalVideoDisc disc) {
        //chua day cart thi them dia vao
        if (this.qtyOrdered < 20) {
            this.itemsOrdered[this.qtyOrdered] = disc;
            ++this.qtyOrdered;
            System.out.println("The disc has been added.");
        } else {
            //Cart day thi in ra khong the them duoc
            System.out.println("The cart is almost full. Cannot add more discs.");
        }

    }

    //Xoa dia khoi Cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;

        for(int i = 0; i < this.qtyOrdered; ++i) {
            //Tim dia can xoa trong cart
            if (this.itemsOrdered[i].equals(disc)) {
                //tang chi so cua dia dung sau len 1 don vi
                for(int j = i; j < this.qtyOrdered - 1; ++j) {
                    this.itemsOrdered[j] = this.itemsOrdered[j + 1];
                }
                //Xoa dia o vi tri do
                this.itemsOrdered[this.qtyOrdered - 1] = null; //gan null cho phan tu cuoi
                --this.qtyOrdered;
                found = true;
                System.out.println("The disc has been removed.");
                break;  //Thoat chuong trinh va xoa dia
            }
        }

        //Khong tim thay dia
        if (!found) {
            System.out.println("Disc not found in the cart. Cannot remove.");
        }

    }

    //Tinh tong tien
    public float totalCost() {
        // init total
        float total = 0.0F;
        //Duyet qua cart de tinh tong
        for(int i = 0; i < this.qtyOrdered; ++i) {
            total += this.itemsOrdered[i].getCost();
        }

        return total;
    }

    //In ra thong tin cac dia con lai trong gio
    public String toString() {
        String result = "";

        for(int i = 0; i < this.qtyOrdered; ++i) {
            result = result + this.itemsOrdered[i].toString();
            result = result + "\n";
        }

        return result;
    }
}
