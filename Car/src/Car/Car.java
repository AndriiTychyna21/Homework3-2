package Car;

public class Car {
    private int year;
    private String color;

    public Car() {
        this.year = 2024;
        this.color = "Black";
    }

    public Car(String color) {
        this.year = 2024;
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
