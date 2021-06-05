package ru.geekbrainsHW7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            return false;
        }
        return true;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood() {
        food++;
    }
}


