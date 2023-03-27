package HomeWork02.Animals;

import java.time.LocalDate;

import HomeWork02.Animals.Groups.Pet;

public class Cat extends Pet{
    private boolean hasWool;

    public Cat(int height, Double weight, String eyeColor, String nickname, String breed, boolean hasVaccinations,
            String coatColor, LocalDate dateOfBirth, boolean hasWool) {
        super(height, weight, eyeColor, nickname, breed, hasVaccinations, coatColor, dateOfBirth);
        this.hasWool = hasWool;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Class %s, ", this.getClass().getSimpleName()));
        sb.append(super.getInfo());
        sb.append(String.format("hasWool %s, ", this.hasWool ? "Yes" : "No"));
        return sb.toString();
    }

    public String makeSound() {
        String sound = "Мяу! ";
        return sound;      
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public void showAffection() {
        System.out.println("Мур, мур. Лащусь.");        
    }

    public boolean isHasWool() {
        return hasWool;
    }
    
}