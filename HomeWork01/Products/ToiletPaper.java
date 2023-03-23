package Products;

import Products.Groups.Hygiene;

public class ToiletPaper extends Hygiene {
    int layersCount;

    public ToiletPaper(String name, Double price, Double quantity, String unit, int piecesInPackaging,
            int layersCount) {
        super(name, price, quantity, unit, piecesInPackaging);
        this.layersCount = layersCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Toilet paper: " + super.toString());
        sb.append(String.format("Layers: %d  ", this.layersCount));
        return sb.toString();
    }
}