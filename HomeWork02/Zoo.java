package HomeWork02;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

import HomeWork02.Animals.Groups.Base.Animal;

public class Zoo {
    private ArrayList<Animal> zoo;
    private PropertyChangeSupport support;
    private String notyfy;

    public Zoo() {
        this.support = new PropertyChangeSupport(this);
        this.zoo = new ArrayList<>();
    }

    public void add(Animal animal){
        zoo.add(animal);
        this.setNotufy("add animal in Zoo");
    }

    public void remove(int index){
        zoo.remove(index);
        this.setNotufy("remove animal in Zoo");
    }

    public StringBuilder printInfo(int index){
        return new StringBuilder (zoo.get(index).getInfo());
    }

    public String makeSound(int index){
        return zoo.get(index).makeSound();
    }

    public StringBuilder printInfoAll(){
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < this.zoo.size(); index++) {
            sb.append(printInfo(index)+"\n");
        }
        return sb;
    }

    public String makeSoundAll(){
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < this.zoo.size(); index++) {
            sb.append(makeSound(index)+"\n");
        }
        return sb.toString();
    }

    public boolean isEmpty(){
        return this.zoo.isEmpty();
    }
 
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setNotufy(String value) {
        support.firePropertyChange("Zoo", this.notyfy, value);
        this.notyfy = value;
    }
    public int getCount(){
        return zoo.size();
    }


}