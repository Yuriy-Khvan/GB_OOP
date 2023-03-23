package Products;

import java.time.LocalDate;

import Products.Groups.Food;

public class Bread extends Food {
    String flourType;

    public Bread(String name, Double price, Double quantity, String unit, LocalDate expirationDate, String flourType) {
        super(name, price, quantity, unit, expirationDate);
        this.flourType = flourType;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bread: " + super.toString());
        sb.append(String.format("Type of flour: %s  ", this.flourType));
        return sb.toString();
    }
}