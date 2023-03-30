package HomeWork03.Figures;

import HomeWork03.Figures.Base.Polygon;

public class Triangle extends Polygon{
    public Triangle(int a, int b, int c){
        super(new int[]{a,b,c});

    }
    public Triangle(){
        this(3, 3, 2);
    }

    @Override
    public double area() {
        double p = perimeter()/2.0;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }
    @Override
    public String toString() {
        return String.format("Треугольник a, b, c = %d, %d, %d",this.sides[0],this.sides[1],this.sides[2]);
    }
}