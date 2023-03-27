package HomeWork02.Animals;

import HomeWork02.Animals.Groups.Bird;

public class Stork extends Bird{

    public Stork(int height, Double weight, String eyeColor, int flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Class %s, ", this.getClass().getSimpleName()));
        sb.append(super.getInfo());
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String makeSound() {
        String sound = "Чи-лин!(аист) ";
        return sound; 
    }
    
}