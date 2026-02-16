package Pattern1.betterCode.v3;

public class Main {

    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("Iphone 11")
                .setPrice(57000)
                .setDes("Premium Mobiles phone")
                .setCategory("Mobile")
                .setBrand("Apple")
                .build();

        System.out.println(p);
    }
}
