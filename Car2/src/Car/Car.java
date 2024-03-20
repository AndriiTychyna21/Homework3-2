package Car;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 2024;
        this.speed = 150;
        this.weight = 1500;
        this.color = "Black";
    }

    public Car(String color) {
        this.year = 2024;
        this.speed = 150;
        this.weight = 1500;
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.speed = 150;
        this.weight = 1500;
        this.color = color;
    }

    public Car(double speed, String color) {
        this.year = 2024;
        this.speed = speed;
        this.weight = 1500;
        this.color = color;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Black";
    }

    public Car(int year, double speed, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = 1500;
        this.color = color;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
