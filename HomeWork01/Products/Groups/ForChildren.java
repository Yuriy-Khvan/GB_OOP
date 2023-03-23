package Products.Groups;
import Products.Groups.Base.Product;

public class ForChildren extends Product {
    int minAge;
    boolean isHypoallergenic;

    public ForChildren(String name, Double price, Double quantity, String unit, int minAge, boolean isHypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.isHypoallergenic = isHypoallergenic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Minimal age: %d  ", this.minAge));
        sb.append(String.format("Is hipoallergenic: %s  ", this.isHypoallergenic ? "Yes" : "No"));
        return sb.toString();
    }

}