package Pattern1.betterCode.v1;

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


    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }
}
