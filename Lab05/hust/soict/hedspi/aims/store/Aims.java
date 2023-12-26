package hust.soict.hedspi.aims.store;

import java.util.Scanner;
import javax.swing.JOptionPane;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.exception.DuplicateMediaException;
import hust.soict.hedspi.aims.exception.LimitExceededException;
import hust.soict.hedspi.aims.screen.CartScreen;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.screen.StoreScreen;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.media.Book;


public class Aims {

    private static Scanner sc;
    private static Store store;
    private static Cart cart;
    private static StoreScreen storeScreen;
    private static CartScreen cartScreen;

    public static void main(String[] args) {
        store = new Store();
        cart = new Cart();
        Media[] sampleMedia = new Media[] {
                new DigitalVideoDisc("Doctor Doom", "Sci-fi", "William Parker", 120, 90.00f),
                new DigitalVideoDisc("Love Story", "Romance", "Taylor Swift", 105, 80.00f),
                new DigitalVideoDisc("The Conjuring", "Horror", "Robert Smith", 88, 70.00f),
                new CompactDisc("Yeu 5", "Pop", "Rhymastic", "Rhymastic", 65.00f) {{
                    addTrack(new Track("Yeu 4", 6));
                    addTrack(new Track("Yeu 6", 4));
                }},
                new CompactDisc("Faded", "Electronic", "Alan Walker", "Alan Walker", 50.00f) {{
                    addTrack(new Track("Alan", 5));
                    addTrack(new Track("Walker", 3));
                }},
                new Book("Mystery Town", "Mystery", 49.5f) {{
                    addAuthor("David Johnson");
                }},
                new Book("Titanic", "Romance", 30.00f) {{
                    addAuthor("Olivia Miller");
                    addAuthor("Christopher Davis");
                }},
                new CompactDisc("Her Summer", "Pop", "VU", "VU", 20.00f) {{
                    addTrack(new Track("Pop", 2));
                    addTrack(new Track("Summer", 4));
                }},
                new Book("Assassin", "Oneshot", 39.00f) {{
                    addAuthor("Luna Taylor");
                }}
        };

        try {
            for (Media m : sampleMedia) {
                store.addMedia(m);
            }
        } catch (DuplicateMediaException e) {
            String errorMessage = "Error adding media to store: Duplicate Media - " + e.getMessage();
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (LimitExceededException e) {
            String errorMessage = "Error adding media to store: Limit Exceeded - " + e.getMessage();
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            String errorMessage = "Error adding media to store: " + e.getMessage();
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }


        openStoreScreen();
    }


    public static Store getStore() {
        return store;
    }

    public static Cart getCart() {
        return cart;
    }

    public static StoreScreen getStoreScreen() {
        return storeScreen;
    }

    public static CartScreen getCartScreen() {
        return cartScreen;
    }

    public static void openStoreScreen() {
        try {
            storeScreen = new StoreScreen(store);
        } catch (Exception e) {
            System.err.println("Error opening store screen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void closeStoreScreen() {
        try {
            if (storeScreen != null) {
                storeScreen.setVisible(false);
                storeScreen = null;
            }
        } catch (Exception e) {
            System.err.println("Error closing store screen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void openCartScreen() {
        try {
            cartScreen = new CartScreen(cart);
        } catch (Exception e) {
            System.err.println("Error opening cart screen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void closeCartScreen() {
        try {
            if (cartScreen != null) {
                cartScreen.setVisible(false);
                cartScreen = null;
            }
        } catch (Exception e) {
            System.err.println("Error closing cart screen: " + e.getMessage());
            e.printStackTrace();
        }
    }
}