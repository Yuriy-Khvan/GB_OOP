package Products;

import java.time.LocalDate;
import Products.Groups.Drink;

public class Milk extends Drink {
    double fat;
    LocalDate expirationDate;

    public Milk(String name, Double price, Double quantity, String unit, Double volume, double fat,
            LocalDate expirationDate) {
        super(name, price, quantity, unit, volume);
        this.fat = fat;
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Milk: " + super.toString());
        sb.append(String.format("Fat: %.2f  ", this.fat));
        sb.append(String.format("Expiration date: %s  ", this.expirationDate));
        return sb.toString();
    }
}