package Products.Groups.Base;

public class Product {

    protected String name;
    protected Double price;
    protected Double quantity;
    protected String unit;

    public Product(String name, Double price, Double quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s  ", this.name));
        sb.append(String.format("Price: %.2f  ", this.price));
        sb.append(String.format("Quantity Unit: %.2f %s  ", this.quantity, this.unit));
        return sb.toString();
    }
}