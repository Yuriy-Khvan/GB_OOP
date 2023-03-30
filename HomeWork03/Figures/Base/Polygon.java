package HomeWork03.Figures.Base;

import java.lang.management.PlatformLoggingMXBean;

public abstract class Polygon extends Figure implements Perimeterable {
    protected int[] sides;

    protected Polygon(int[] sides) {
        this.sides = sides;
    }

    public double perimeter() {
        int sum = 0;
        for (int side : sides)
            sum += side;
        return sum;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Polygon guest = (Polygon) obj;
        if (sides.length != guest.sides.length) {
            return false;
        }
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] != guest.sides[i]) {
                return false;
            }
        }
        return true;
    }
}