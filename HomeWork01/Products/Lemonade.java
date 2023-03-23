package Products;

import Products.Groups.Drink;

public class Lemonade extends Drink {

    public Lemonade(String name, Double price, Double quantity, String unit, Double volume) {
        super(name, price, quantity, unit, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lemonade: " + super.toString());
        return sb.toString();
    }
}