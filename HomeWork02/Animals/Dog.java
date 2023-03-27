package HomeWork02.Animals;

import java.time.LocalDate;

import HomeWork02.Animals.Groups.Pet;

public class Dog extends Pet{
    private boolean hasTraining;
    

    public Dog(int height, Double weight, String eyeColor, String nickname, String breed, boolean hasVaccinations,
            String coatColor,LocalDate dateOfBirth ,  boolean hasTraining) {
        super(height, weight, eyeColor, nickname, breed, hasVaccinations, coatColor, dateOfBirth);
        this.hasTraining = hasTraining;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Class %s, ", this.getClass().getSimpleName()));
        sb.append(super.getInfo());
        sb.append(String.format("hasTraining %s, ", this.hasTraining ? "Yes" : "No"));
        return sb.toString();
    }

    public String makeSound() {
        
        String sound = "Гав! ";
        return sound;     
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public void showAffection() {
        System.out.println("Тяф, тяф. Лащусь.");        
    }

    public boolean isHasTraining() {
        return hasTraining;
    }
    
    public void train (){
        this.hasTraining = true;
    }
    
}