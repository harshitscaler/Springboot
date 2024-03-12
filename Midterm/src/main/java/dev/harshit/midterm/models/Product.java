package dev.harshit.midterm.models;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
    private int id;
    private String title;
    private int price;
    private String  category;
    private String description;
    private String image;

    public int GetById(){
        return this.id;
    }
    public String GetTitle(){
        return this.title;
    }
    public int GetPrice(){
        return this.price;
    }
    public String GetCategory(){
        return this.category;
    }
    public String getDescription(){
        return this.description;
    }
    public String image(){
        return this.image;
    }
}
