package lab2.kryklya.ad212;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cart basket;

        basket = inputItems();

        System.out.println("\nThe cart:");
        outputCart(basket);
        System.out.println("Sum of prices of items: " + basket.sumItemPrice());

        System.out.println("\nIncreased prices in the cart by 15%: ");
        basket.increaseAllPrice(15);
        outputCart(basket);
        System.out.println("Sum of prices of items: " + basket.sumItemPrice());

        System.out.println("\nReduced prices in the basket by 30%: ");
        basket.decreaseAllPrice(30);
        outputCart(basket);
        System.out.println("Sum of prices of items: " + basket.sumItemPrice());
    }

    //adding items to cart
    public static Cart inputItems() {
        int itemNumber;
        Cart basket;
        Scanner nameScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        //input number of items in the cart
        do {
            System.out.println("Input items number in the cart:");
            itemNumber = numberScanner.nextInt();

            if (itemNumber <= 0)
                System.out.println("Input a number more than 0.");
        } while (itemNumber <= 0);

        basket = new Cart(itemNumber);  //cart initialisation

        for (int i = 0; i < itemNumber; i++) {
            System.out.println("\nInput name of item №" + (i + 1));
            String name = nameScanner.nextLine();
            System.out.println("Input price of item №" + (i + 1));
            float price = numberScanner.nextFloat();
            basket.addItem(new Item(name, price));
        }
        return basket;
    }

    public static void outputCart (Cart basket) {
        for (int i=0; i<basket.getNumber(); i++) {
            System.out.println("Item #" + (i + 1) + ": " + basket.getStack()[i].getName() + " - " + basket.getStack()[i].getPrice());
        }
    }
}
