package hust.soict.dsai.aims.cart;

import Lab2.DigitalVideoDisc;

public class Cart {
    //Vo Son Long - 20215082
    public static final int MAX_NUMBERS_ORDERED = 20;

    //init cart
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[20];
    private int qtyOrdered;

    public Cart() {
    }

    //Them dia vao Cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
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
        for (int i = 0; i < qtyOrdered; i++) {
            result += itemsOrdered[i].toString();
            result += "\n";
        }
        return result;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].toString());
        }

        System.out.println("\nTotal cost: " + totalCost() + " $\n");
        System.out.println("***************************************************");
    }

    public void searchByID(int id) {
        System.out.println("Search Result for DVD with ID " + id + ":");

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("DVD - " + itemsOrdered[i].toString());
                return; // Found a match, no need to continue searching
            }
        }

        System.out.println("No match found for DVD with ID " + id);
    }
    public void searchByTitle(String title) {
        System.out.println("Search Result for DVDs with Title '" + title + "':");

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("DVD - " + itemsOrdered[i].toString());
            }
        }

        if (noMatchFound(title)) {
            System.out.println("No match found for DVDs with Title '" + title + "'");
        }
    }
    private boolean noMatchFound(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                return false; // Found a match, no need to continue checking
            }
        }
        return true; // No match found
    }


}
