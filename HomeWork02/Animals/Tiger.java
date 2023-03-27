package HomeWork02.Animals;

import java.time.LocalDate;

import HomeWork02.Animals.Groups.WildAnimal;

public class Tiger extends WildAnimal{

    public Tiger(int height, Double weight, String eyeColor, String habitat, LocalDate dateOfFound) {
        super(height, weight, eyeColor, habitat, dateOfFound);
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
        String sound = "Тигр-Р-Р-Р! ";
        return sound; 
    }
 
}