package HomeWork02;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        VC vc = new VC(zoo);
        zoo.addPropertyChangeListener(vc);
        vc.run();
        
        
    }
}