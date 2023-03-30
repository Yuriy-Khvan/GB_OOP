package HomeWork03.Figures.Base;

public abstract class Figure implements iFigure, Comparable<Figure> {
    
    public Figure() {
    }

    public int compareTo(Figure figure) {
        if (this.area() > figure.area()) return 1;
        else if (this.area() < figure.area()) return -1;
        else return 0;
    }
    
}