package Products.Groups;
import Products.Groups.Base.Product;

public class Drink extends Product {
    Double volume;

    public Drink(String name, Double price, Double quantity, String unit, Double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Volume: %.2f  ", this.volume));
        return sb.toString();
    }

}
