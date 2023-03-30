package HomeWork03;

import java.util.ArrayList;
import java.util.Collections;

import HomeWork03.Figures.Base.Figure;
import HomeWork03.Figures.Base.Lengthable;
import HomeWork03.Figures.Base.Perimeterable;

public class FigureCollection{
    ArrayList<Figure> figures;

    public FigureCollection() {
        this.figures = new ArrayList<Figure>();
    }

    public void add(Figure figure){
        figures.add(figure);
    }

    public boolean remove(int index){
        if (index >=0 && index < figures.size()){
            figures.remove(index);
            return true;
        } else return false;        
    }
    public boolean replace(int index, Figure figure){
        if (index >=0 && index < figures.size()){
            figures.remove(index);
            figures.add(index, figure);
            return true;
        } else return false;   
    }
    public void sort(){
        Collections.sort(figures);
    }
    public String getInfoFigure(Figure figure){
        StringBuilder sb = new StringBuilder();
        sb.append(figure + " | ");
        sb.append(String.format("Area: %f  ", figure.area()));
        if(figure instanceof Perimeterable){
            Perimeterable perimeterable = (Perimeterable)figure;
            sb.append(String.format("Length: %f  ", perimeterable.perimeter()));
        }
        if(figure instanceof Lengthable){
            Lengthable lengthable = (Lengthable)figure;
            sb.append(String.format("Length: %f  ", lengthable.length()));
        }
        sb.append("\n");
        return sb.toString();
    }

    public String getInfo(int index){
        StringBuilder sb = new StringBuilder();
        sb.append(getInfoFigure(figures.get(index)));
        return sb.toString();
    }
    public String getAllInfo(){
        StringBuilder sb = new StringBuilder();
        for (Figure figure : figures) {
            sb.append(getInfoFigure(figure));
        }
        return sb.toString();
    }
    
}