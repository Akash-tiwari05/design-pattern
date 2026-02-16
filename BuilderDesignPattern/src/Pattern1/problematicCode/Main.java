package Pattern1.problematicCode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /*
            This is too many parameters.
            Hard to read, hard to maintain.
         */
        //this is bed practicing
        //telescoping constructor
        Product p = new Product("Iphone 11","This is an iphone",
                77000, "Apple","Mobiles","10%",
                "01/15/2025", "02/15/2026",new ArrayList<>());
    }
}
