package Pattern1.problematicCode;

import java.util.List;


//problematic code
public class Product {

    private String name;
    private String des;
    private int price;
    private String brand;
    private String category;
    private String discount;
    private String createdAt;
    private String updatedAt;
    private List<String> img;


    /*
     PROBLEM 1:
     This is too many parameters.
     Hard to read, hard to maintain.
     This is called Telescoping Constructor Anti-Pattern.
     Better solution -> Builder Pattern


     PROBLEM 2:
     What we want to have optional arguments, we will force to give
     some defaults value to constructor
     */
    //bloated constructor
    public Product(String name, String des, int price,
                   String brand, String category,
                   String discount, String createdAt,
                   String updatedAt, List<String> img) {
        this.name = name;
        this.des = des;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.img = img;
    }

    Product(String name, int price){
        //some logic
    }

    Product(String name, String des, int price){

        //some logic
    }
}
