import Car.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("White");
        Car car3 = new Car(2022, "Green");
        Car car4 = new Car(135.7, "White");
        Car car5 = new Car(2019, 140, 1400);
        Car car6 = new Car(2015, 130, "Purple");
        Car car7 = new Car(2023, 360, 798, "Red");
    }
}
