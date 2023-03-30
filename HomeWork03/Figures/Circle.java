package HomeWork03.Figures;

import HomeWork03.Figures.Base.Figure;
import HomeWork03.Figures.Base.Lengthable;

public class Circle extends Figure implements Lengthable{
    private int radius;
    public Circle(int radius){
        this.radius  = radius;
    }
    public Circle(){
        this(5);
       
    }
    public double length(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return String.format("Круг R=%d", this.radius);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Circle guest = (Circle) obj;
        return this.radius == guest.radius;
    }

}