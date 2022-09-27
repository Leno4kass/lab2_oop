package lab2.kryklya.ad212;

public class Item {
        //class body

        //class fields
        private String name;
        private float price;

        //constructor with two parameters
        public Item(String name, float price) {
            this.name = name;
            this.price = price;
            ifPriceNegative();

        }

        //getters
        public String getName() {
            return name;
        }

        public float getPrice() {
            return price;
        }

        //setters
        public void setName (String name) {
            this.name = name;
        }

        public void setPrice(float price) {
            this.price = price;
            ifPriceNegative();
        }

        //decrease in price by a certain percentage
        public void decreasePrice(float percent) {
            decrease(percent);
        }

        private void decrease(float percent) {
            price -= price * percent / 100;
            ifPriceNegative();
        }

        //increase in price by a certain percentage
        public void increasePrice(float percent) {
            increase(percent);
        }

        private void increase(float percent) {
            price += price * percent / 100;
            ifPriceNegative();
        }

    //private method with negative price test
    private void ifPriceNegative() {
        if (price < 0) {
            price = 0;
        }
    }
}

