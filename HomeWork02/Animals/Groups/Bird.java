package HomeWork02.Animals.Groups;

import HomeWork02.Animals.Groups.Base.Animal;

public abstract class Bird extends Animal{
    protected int flightAltitude;
    protected void fly(){
        System.err.printf("Я лечу на %d метрах", this.flightAltitude);
    }
    public Bird(int height, Double weight, String eyeColor, int flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }
    
}