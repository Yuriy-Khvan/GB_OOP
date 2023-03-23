package Products;

import Products.Groups.ForChildren;

public class Nipple extends ForChildren {

    public Nipple(String name, Double price, Double quantity, String unit, int minAge, boolean isHypoallergenic) {
        super(name, price, quantity, unit, minAge, isHypoallergenic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Nipple: " + super.toString());
        return sb.toString();
    }
}