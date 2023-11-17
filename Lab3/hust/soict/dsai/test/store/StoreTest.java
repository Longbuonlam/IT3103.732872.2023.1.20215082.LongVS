package Lab3;

public class StoreTest {
    public static void main(String[] args) {
        // Create an instance of the Store class with a maximum size of 5
        Store myStore = new Store(5);

        // Create some DVDs for testing
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Science Fiction", 25.65f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar", "Science Fiction", 12.54f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romantic", 15.25f);

        // Add DVDs to the store
        myStore.addDVD(dvd1);
        myStore.addDVD(dvd2);
        myStore.addDVD(dvd3);
        myStore.addDVD(dvd4);
        myStore.addDVD(dvd5);
        myStore.addDVD(dvd6);

        // Print the items in the store
        System.out.println("Items in the store:");
        for (DigitalVideoDisc dvd : myStore.getItemsInStore()) {
            if (dvd != null) {
                System.out.println(dvd.toString());
            }
        }

        // Remove a DVD from the store (e.g., removeDVD at index 1)
        myStore.removeDVD(2);

        // Print the updated items in the store
        System.out.println("Items in the store after removal:");
        for (DigitalVideoDisc dvd : myStore.getItemsInStore()) {
            if (dvd != null) {
                System.out.println(dvd.toString());
            }
        }
    }
}
