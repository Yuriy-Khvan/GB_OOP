package HomeWork02;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.util.Scanner;

import HomeWork02.Animals.*;

public class VC implements PropertyChangeListener {
    Zoo zoo;
    boolean isEmptyZoo;
    StringBuilder data;
    StringBuilder menu;
    Scanner scan;

    public VC(Zoo zoo) {
        this.data = new StringBuilder();
        this.menu = new StringBuilder();
        this.zoo = zoo;
        this.isEmptyZoo = this.zoo.isEmpty();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.isEmptyZoo = this.zoo.isEmpty();
    }

    private void update() {
        System.out.print("\033[H\033[J");
        System.out.println(data.toString());
        System.out.println(menu.toString());
    }

    public void run() {
        scan = new Scanner(System.in);
        String s = "";
        int x = -1;
        boolean noExit = true;

        data = new StringBuilder("Zoo:\n");

        menu = makeMenu("Main");

        this.update();

        while (noExit) {

            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (x) {
                case 1:
                    menu = makeMenu("SubMenuAdd");
                    boolean isSubMenu = true;
                    this.update();
                    while (noExit && isSubMenu) {
                        s = scan.next();
                        try {
                            x = Integer.parseInt(s);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод");
                        }
                        switch (x) {
                            case 1:
                                addAnimal("Cat");
                                isSubMenu = false;
                                break;
                            case 2:
                                addAnimal("Chicken");
                                isSubMenu = false;
                                break;
                            case 3:
                                addAnimal("Dog");
                                isSubMenu = false;
                                break;
                            case 4:
                                addAnimal("Stork");
                                isSubMenu = false;
                                break;
                            case 5:
                                addAnimal("Tiger");
                                isSubMenu = false;
                                break;
                            case 6:
                                addAnimal("Wolf");
                                isSubMenu = false;
                                break;
                            case 9:
                                isSubMenu = false;
                                break;
                            case 0:
                                noExit = false;
                                break;
                            default:
                                System.out.println("Неверный ввод");
                                break;
                        }

                    }
                    data = new StringBuilder("Zoo:\n");
                    menu = makeMenu("Main");
                    this.update();
                    break;
                case 2:
                    if (!isEmptyZoo) {
                        int index = getIndex();
                        zoo.remove(index);
                        data = new StringBuilder("Zoo:\n");
                        menu = makeMenu("Main");
                        this.update();
                    } else
                        System.out.println("Неверный ввод");
                    break;
                case 3:
                    if (!isEmptyZoo) {
                        int index = getIndex();
                        data = new StringBuilder("Zoo:\n");
                        data.append(zoo.printInfo(index)+"\n");
                        menu = makeMenu("Main");
                        this.update();   
                    } else
                        System.out.println("Неверный ввод");
                    break;
                case 4:
                    if (!isEmptyZoo) {
                        data = new StringBuilder("Zoo:\n");
                        data.append(zoo.printInfoAll());
                        this.update();
                    } else
                        System.out.println("Неверный ввод");
                    break;
                case 5:
                    if (!isEmptyZoo) {
                        int index = getIndex();
                        data = new StringBuilder("Zoo:\n");
                        data.append(zoo.makeSound(index)+"\n");
                        menu = makeMenu("Main");
                        this.update();
                    } else
                        System.out.println("Неверный ввод");
                    break;
                case 6:
                    if (!isEmptyZoo) {
                        data = new StringBuilder("Zoo:\n");
                        data.append(zoo.makeSoundAll() + "\n");
                        this.update();
                    } else
                        System.out.println("Неверный ввод");
                    break;
                case 0:
                    noExit = false;
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
        }
        System.out.println("До свидания!");
    }

    private StringBuilder makeMenu(String typeMenu) {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu:\n");
        if (typeMenu == "Main") {
            sb.append("1. Для добавления животного в зоопарк введите 1\n");
            if (!isEmptyZoo) {
                sb.append("2. Для удаления животного из зоопарка введите 2\n");
                sb.append("3. Для вывода информации о конкретном животном введите 3\n");
                sb.append("4. Для вывода информации о всех животных введите 4\n");
                sb.append("5. Чтобы заставить животное издать звук, введите 5\n");
                sb.append("6. Чтобы заставить всех животных издать звук, введите 6\n");
            }
        }
        if (typeMenu == "SubMenuAdd") {
            sb.append("1. Для добавления кота в зоопарк введите 1\n");
            sb.append("2. Для добавления курицы в зоопарк введите 2\n");
            sb.append("3. Для добавления собаки в зоопарк введите 3\n");
            sb.append("4. Для добавления аиста в зоопарк введите 4\n");
            sb.append("5. Для добавления тигра в зоопарк введите 5\n");
            sb.append("6. Для добавления волка в зоопарк введите 6\n");
            sb.append("9. Для выхода в главное меню введите 9\n");
        }
        sb.append("0. Чтобы закончить работу приложения, введите 0\n");
        return sb;
    }

    private void addAnimal(String animal){
        System.out.print("int height: ");
        int height = Integer.parseInt(scan.next());
        System.out.print("Double weight: ");
        Double weight = Double.parseDouble(scan.next());
        System.out.print("String eyeColor: ");
        String eyeColor = scan.next();
        String nickname = null;
        String breed = null;
        boolean hasVaccinations = false;
        String coatColor = null;
        int year = 1;
        int month = 1;
        int dayOfMonth = 1;
        LocalDate dateOfBirth = LocalDate.of(year,month, dayOfMonth);
        int flightAltitude = 0;
        String habitat = null;
        LocalDate dateOfFound = LocalDate.of(year,month, dayOfMonth);

        if (animal == "Cat" || animal == "Dog") {
            System.out.print("String nickname: ");
            nickname = scan.next();
            System.out.print("String breed: ");
            breed = scan.next();
            System.out.print("boolean hasVaccinations: ");
            hasVaccinations = Boolean.valueOf(scan.next());
            System.out.print("String coatColor: ");
            coatColor = scan.next();
            System.out.print("LocalDate dateOfBirth (int year): ");
            year = Integer.parseInt(scan.next());
            System.out.print("LocalDate dateOfBirth (int month): ");
            month = Integer.parseInt(scan.next());
            System.out.print("LocalDate dateOfBirth (int dayOfMonth): ");
            dayOfMonth = Integer.parseInt(scan.next());
            dateOfBirth = LocalDate.of(year,month,dayOfMonth);
        }
        if (animal == "Cat"){
            System.out.print("boolean hasWool: ");
            boolean hasWool = Boolean.valueOf(scan.next());
            zoo.add(new Cat(height,weight,eyeColor,nickname,breed,hasVaccinations,coatColor,dateOfBirth,hasWool));
        }
        if (animal == "Dog"){
            System.out.print("boolean hasTraining: ");
            boolean hasTraining = Boolean.valueOf(scan.next());
            zoo.add(new Dog(height,weight,eyeColor,nickname,breed,hasVaccinations,coatColor,dateOfBirth,hasTraining));
        }
        if (animal == "Chicken" || animal == "Stork"){
            System.out.print("int flightAltitude: ");
            flightAltitude = Integer.parseInt(scan.next());
        }
        if (animal == "Chicken"){
            zoo.add(new Chicken(height, weight, eyeColor, flightAltitude));
        }
        if (animal == "Stork"){
            zoo.add(new Stork(height, weight, eyeColor, flightAltitude));
        }
        if (animal == "Tiger" || animal == "Wolf"){
            System.out.print("String habitat: ");
            habitat = scan.next();
            System.out.print("LocalDate dateOfFound (int year): ");
            year = Integer.parseInt(scan.next());
            System.out.print("LocalDate dateOfFound (int month): ");
            month = Integer.parseInt(scan.next());
            System.out.print("LocalDate dateOfFound (int dayOfMonth): ");
            dayOfMonth = Integer.parseInt(scan.next());
            dateOfFound = LocalDate.of(year,month,dayOfMonth);
        }
        if (animal == "Tiger"){
            zoo.add(new Tiger(height, weight, eyeColor, habitat, dateOfFound));
        }
        if (animal == "Wolf"){
            System.out.print("boolean leaderOfPack: ");
            boolean leaderOfPack = Boolean.valueOf(scan.next());
            zoo.add(new Wolf(height, weight, eyeColor, habitat, dateOfFound, leaderOfPack));
        }
    }
    private int getIndex(){
        int maxIndex = zoo.getCount()-1;
        int x = -1;
        do {
            System.out.printf("Введите индекс животного: 0-%d: ", maxIndex);
            String s = scan.next();
                try {
                    x = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод");
                }
            
        } while (!(x>=0 && x<=maxIndex)); 
        return x;
    }

    
}