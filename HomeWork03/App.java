package HomeWork03;

import HomeWork03.Figures.*;

public class App{
    public static void main(String[] args) {
        FigureCollection figures = new FigureCollection();
        figures.add(new Circle(3));
        figures.add(new Triangle(3,4,6));
        figures.add(new Triangle(3,5,7));

        System.out.println(figures.getAllInfo());
        figures.sort();
        System.out.println(figures.getAllInfo());
        System.out.println(figures.getInfo(1));
        figures.remove(1);
        System.out.println(figures.getAllInfo());
    }
}