package Products;

import java.time.LocalDate;

import Products.Groups.Food;

public class Egg extends Food{
    int piecesInPackaging;
    public Egg(String name, Double price, Double quantity, String unit, LocalDate expirationDate, int piecesInPackaging) {
        super(name, price, quantity, unit, expirationDate);
        this.piecesInPackaging = piecesInPackaging;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Egg: " + super.toString());
        sb.append(String.format("Pieces in packaging: %d  ", this.piecesInPackaging));
        return sb.toString();
    }
}