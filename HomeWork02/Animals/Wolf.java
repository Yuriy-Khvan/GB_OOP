package HomeWork02.Animals;

import java.time.LocalDate;

import HomeWork02.Animals.Groups.WildAnimal;

public class Wolf extends WildAnimal {
    boolean leaderOfPack;

    public Wolf(int height, Double weight, String eyeColor, String habitat, LocalDate dateOfFound,
            boolean leaderOfPack) {
        super(height, weight, eyeColor, habitat, dateOfFound);
        this.leaderOfPack = leaderOfPack;
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Class %s, ", this.getClass().getSimpleName()));
        sb.append(super.getInfo());
        sb.append(String.format("leaderOfPack %s, ", this.leaderOfPack ? "Yes" : "No"));
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String makeSound() {
        String sound = "А-у-у-у-у-у!";
        return sound; 
    }
        
    public boolean isLeaderOfPack() {
        return leaderOfPack;
    }
}