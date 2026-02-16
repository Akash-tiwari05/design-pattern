package Pattern1.betterCode.v1;

public class Main {

    public static void main(String[] args) {

        /*
        Better than problematic code
        The code is
            1. Readable
            2. Manageable
            3. Extendable
         */
        /// the problem in this code are How to validate before object creation
        Product p = new Product();

        p.setName("Iphone 11");
        p.setBrand("Apple");
        p.setCategory("Mobiles");
        p.setDes("Iphone is premium mobile phone");
        p.setPrice(50000);

        //....
    }
}
