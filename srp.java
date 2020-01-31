// SRP(Single responsibility principle)
public class Product {
    private String productname;
    public static void productDB(String productname) {
        System.out.println("product details");
        // storing product details into database
    }
    public static void producer() {
        System.out.print("produces the product");
    }
    public static void consumer() {
        System.out.println("consumes the product");
    }
}

public class Product1 {
    private String productname;
    public static void productDB(String productname) {
        System.out.println("product details");
        // storing product details into database
    }
}


public class Producer {
    public static void producer() {
        System.out.println("produces the product");
    }
}


public class Consumer {
    public static void consumer() {
        System.out.println("consumes the product");
    }
}
