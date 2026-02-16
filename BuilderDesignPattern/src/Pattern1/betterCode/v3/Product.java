package Pattern1.betterCode.v3;

public class Product {


    private String name;
    private String des;
    private int price;
    private String brand;
    private String category;

    private Product(Builder b) {
        this.name = b.name;
        this.des = b.des;
        this.price = b.price;
        this.brand = b.brand;
        this.category = b.category;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String des;
        private int price;
        private String brand;
        private String category;

        public Product build(){

            if (name == null || name.isBlank()) {
                throw new IllegalStateException("Name is required");
            }

            if (price <= 0) {
                throw new IllegalStateException("Price must be greater than 0");
            }

            return new Product(this);
        }


        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDes(String des) {
            this.des = des;
            return this;
        }


        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
