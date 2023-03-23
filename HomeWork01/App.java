import java.time.LocalDate;
import java.util.ArrayList;

import Products.*;
import Products.Groups.Base.Product;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Bread("Бородинский", 45.5, 1., "шт.", LocalDate.of(2023, 3, 9), "ржаная"));
        products.add(new Diapers("Pampers", 850., 1., "упак.", 45, "Xl", 15., 18., "трусики"));
        products.add(new Egg("Синявинские",52.5,1.,"упак.",LocalDate.of(2023,04,15),10));
        products.add(new Egg("Перепелиные",75.5,1.,"упак.",LocalDate.of(2023,03,15),12));
        products.add(new Lemonade("Тархун", 40.5, 1., "бут.", 1.5));
        products.add(new Mask("Медведь", 620.5, 1., "шт.", 1, true));
        products.add(new Milk("milk", 69.5, 100., "шт.", 1.0, 3.2, LocalDate.of(2023, 11, 10)));
        products.add(new Nipple("Good Child",150.5,1.,"шт.",0,true));
        products.add(new ToiletPaper("Бархатная",40.5, 1., "упак.", 4, 2));
        
        for (Product product : products) {
            System.out.println(product);
        }
    }
}