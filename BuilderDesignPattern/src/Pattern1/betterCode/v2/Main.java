package Pattern1.betterCode.v2;

public class Main {

    public static void main(String[] args) {

        Builder b = new Builder();
        b.setPrice(4500);
        b.setName("Iphone 11");
        b.setBrand("Apple");
        Product p = new Product(b);
    }
}
