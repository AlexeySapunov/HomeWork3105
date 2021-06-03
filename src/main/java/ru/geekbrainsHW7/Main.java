package ru.geekbrainsHW7;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, false);
        Plate plate = new Plate(100);
        plate.info();
        cat.Eat(plate);
        plate.info();
        Plate plate1 = new Plate(10);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Boris", 10, false);
        cats[1] = new Cat("Vaska", 20, false);
        cats[2] = new Cat("Mursik", 15, false);
        IntStream.range(0, cats.length).forEach(i -> {
            cats[i].Eat(plate1);
            System.out.println("cat " + cats[i].getName() + "'s satiety " + cats[i].isSatiety());
            if (!cats[i].isSatiety()) {
                plate1.addFood();
            }
        });
    }
}