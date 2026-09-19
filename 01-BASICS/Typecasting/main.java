public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting
        int number = 100;
        double value = number;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + value);

        // Narrowing Casting
        double price = 99.99;
        int convertedPrice = (int) price;

        System.out.println("Original: " + price);
        System.out.println("Converted: " + convertedPrice);
    }
}
