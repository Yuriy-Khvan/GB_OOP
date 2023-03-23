package Products;

import Products.Groups.Hygiene;

public class Diapers extends Hygiene {
    String size;
    double minWeight;
    double maxWeight;
    String type;

    public Diapers(String name, Double price, Double quantity, String unit, int piecesInPackaging, String size,
            double minWeight, double maxWeight, String type) {
        super(name, price, quantity, unit, piecesInPackaging);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Diapers: " + super.toString());
        sb.append(String.format("Size: %s  ", this.size));
        sb.append(String.format("Minimal weight: %.2f  ", this.minWeight));
        sb.append(String.format("maximal weight: %.2f  ", this.maxWeight));
        sb.append(String.format("Type: %s  ", this.type));
        return sb.toString();
    }
}