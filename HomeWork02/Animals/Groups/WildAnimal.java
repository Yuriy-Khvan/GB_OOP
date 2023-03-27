package HomeWork02.Animals.Groups;

import java.time.LocalDate;

import HomeWork02.Animals.Groups.Base.Animal;

public abstract class WildAnimal extends Animal{
    protected String habitat;
    protected LocalDate dateOfFound;
   
    public WildAnimal(int height, Double weight, String eyeColor, String habitat, LocalDate dateOfFound) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfFound = dateOfFound;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getInfo());
        sb.append(String.format("habitat %s, ", this.habitat));
        sb.append(String.format("dateOfFound %s, ", this.dateOfFound));
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }
    
    
    
}