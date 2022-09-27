package lab2.kryklya.ad212;

public class Cart {

    //a stack that contains objects of the "Item" class
    private Item[] stack;

    //current number of items in the cart
    private int itemCurrentNumber;

    //constructor with 1 parameter - the maximum number of elements on the stack.
    public Cart(int maxNumber) {
        stack=new Item[maxNumber];
        itemCurrentNumber=0;
    }


    //getters
    public Item[] getStack() {
        return stack;
    }
    public int getNumber() {
        return itemCurrentNumber;
    }


    //adds an element
    public void addItem(Item item) {
        if (isStackFull ())
            return;

        stack[itemCurrentNumber]=item;
        itemCurrentNumber++;
    }

    //removes the element
    public void deleteItem() {
        if (isStackEmpty())
            return;

        stack[itemCurrentNumber-1]=null;
        itemCurrentNumber--;
    }

    //calculation of the sum of the prices of goods in the basket
    public float sumItemPrice() {
        float sum=0;          //sum of item prices

        for (Item item : stack) {
            sum += item.getPrice();
        }
        return sum;
    }

    //increase the price of all items in the cart by a certain percentage
    public void increaseAllPrice(float percent) {
        for (Item item : stack) {
            item.increasePrice(percent);
        }
    }

    //decrease the price of all items in the cart by a certain percentage
    public void decreaseAllPrice(float percent) {
        for (Item item : stack) {
            item.decreasePrice(percent);
        }
    }

    //checks if the stack is full and prints out a message
    private boolean isStackFull() {
        boolean exit=itemCurrentNumber==stack.length;

        if(exit)
            System.out.println("Cart is full");
        return exit;
    }

    //checks if the stack is empty and prints out a message
    private boolean isStackEmpty() {
        boolean exit=itemCurrentNumber==0;

        if(exit)
            System.out.println("Cart is empty");
        return exit;
    }
}
