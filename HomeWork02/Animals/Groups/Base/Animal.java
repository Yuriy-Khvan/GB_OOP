package HomeWork02.Animals.Groups.Base;

public abstract class Animal {
    protected int height;
    protected Double weight;
    protected String eyeColor;

    public abstract String makeSound();

    public Animal(int height, Double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("height: %d, weight: %.2f, color of eye: %s", 
        height, weight, eyeColor));
        return sb.toString();      
    }
}