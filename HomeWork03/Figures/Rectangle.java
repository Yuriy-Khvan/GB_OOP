package HomeWork03.Figures;

import HomeWork03.Figures.Base.Polygon;

public class Rectangle extends Polygon{

    public Rectangle(int a, int b){
        super(new int[]{a,b,a,b});
    
    }
    public Rectangle(){
        this(1, 1);
    }
    @Override
    public double area() {
        return sides[0]*sides[1];
    }
    @Override
    public String toString() {
        return String.format("Прямоугольник a x b = %d x %d",this.sides[0],this.sides[1]);
    }
}