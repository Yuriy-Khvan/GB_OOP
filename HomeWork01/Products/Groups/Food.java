package Products.Groups;

import java.time.LocalDate;

import Products.Groups.Base.Product;

public class Food extends Product {
    LocalDate expirationDate;

    public Food(String name, Double price, Double quantity, String unit, LocalDate expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Expiration date: %s  ", this.expirationDate));
        return sb.toString();
    }
}
