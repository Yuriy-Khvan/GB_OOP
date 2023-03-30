package HomeWork03.Figures;

public class Square extends Rectangle{
    public Square(int length){
        super(length, length);

    }
    public Square(){
        this(2);
    }
    @Override
    public String toString(){
        return String.format("Квадрат a = %d",this.sides[0]);
    }
}