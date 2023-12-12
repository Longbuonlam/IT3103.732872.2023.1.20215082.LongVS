package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        itemCount = 0;
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println("DVD added to the store: " + dvd.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store
    public void removeDVD(int index) {
        if (index >= 0 && index < itemCount) {
            System.out.println("DVD removed from the store: " + itemsInStore[index].getTitle());
            // Shift DVDs to fill the gap
            for (int i = index; i < itemCount - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[itemCount - 1] = null; // Set the last element to null
            itemCount--;
        } else {
            System.out.println("Invalid index. Cannot remove DVD.");
        }
    }

    // Getter method to retrieve the items in the store
    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    // Getter method to retrieve the item count in the store
    public int getItemCount() {
        return itemCount;
    }
}
