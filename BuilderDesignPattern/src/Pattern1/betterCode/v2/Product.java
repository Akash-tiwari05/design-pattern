package Pattern1.betterCode.v2;

import java.util.HashMap;
import java.util.List;

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

    public Product(Builder builder) {
        if(builder.getPrice() > 0){
            this.price = builder.getPrice();
        }

        this.name = builder.getName();
        this.des = builder.getDes();
        this.brand = builder.getBrand();

    }
}

