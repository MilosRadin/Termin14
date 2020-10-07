package com.ftninfomatika.termin14;

public class Fruit {

    public static Fruit[] fruits = new Fruit[] {
      new Fruit(0,"pomorandza", "narandzaste je boje","", 4.5f),
      new Fruit(1,"limun","zute boje","",3.0f),
      new Fruit(2,"jabuka","crvene je boje","",5f)
    };

    private int id;
    private String name;
    private String description;
    private String imageFileName;
    private float rating;

    public Fruit(int id, String name, String description, String imageFileName, float rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageFileName = imageFileName;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
