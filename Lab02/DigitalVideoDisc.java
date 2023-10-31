package Lab2;

public class DigitalVideoDisc {
    //Vo Son Long - 20215082
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //Cac ham constructer
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() {

        return this.title;
    }

    public String getCategory() {

        return this.category;
    }

    public String getDirector() {

        return this.director;
    }

    public int getLength() {

        return this.length;
    }

    public float getCost() {

        return this.cost;
    }

    //ham in ra thong tin dia
    public String toString() {

        return "Title: " + this.title + ", Cost: $" + this.cost;
    }
}

