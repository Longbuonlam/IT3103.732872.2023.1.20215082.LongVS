package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;

    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;


    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        updateDiscCountAndId();
    }


    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        updateDiscCountAndId();
    }



    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        updateDiscCountAndId();
    }


    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        updateDiscCountAndId();
    }



    public void setTitle(String title) {
        this.title = title;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public void setDirector(String director) {
        this.director = director;
    }


    public void setLength(int length) {
        this.length = length;
    }


    public void setCost(float cost) {
        this.cost = cost;
    }


    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    // Additional getter for the "id" attribute
    public int getId() {
        return id;
    }

    // Helper method to update class attribute and assign the appropriate value for "id"
    private void updateDiscCountAndId() {
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    // New method to check if the title matches a given pattern
    public boolean isMatch(String pattern) {
        // Use the contains method to check if the title contains the specified pattern
        return title.toLowerCase().contains(pattern.toLowerCase());
    }

    // ham in ra thong tin dia
    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Cost: $" + cost;
    }

}
