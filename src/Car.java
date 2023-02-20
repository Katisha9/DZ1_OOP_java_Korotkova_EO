
public class Car {
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status;

    Car(String model, int year, double price, String color, int power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
    }

    int getYear() {
        return year;
    }

    double getPrice() {
        return price;
    }

    int getPower() {
        return power;
    }


    public void getInfo() {
        System.out.println(model + " " + year + " " + price + " " + color + " " + power);
    }

    public void powerOnCar() {
        this.status = true;
        System.out.println("Автомобиль " + model+ " заведен");
    }
    public void powerOffCar() {
        this.status = false;
        System.out.println("Автомобиль " + model+ " остановлен");
    }
    public void road(String adress) {
        if (status == false) {
            System.out.println("Автомобиль " + model + " не заведен, движение невозможно");
        } else {
            System.out.println("Автомобиль " + model + " едет по адресу: " + adress);
        }
    }

    public static void compare(Car car1, Car car2){
        if (car1.getYear() > car2.getYear())
            System.out.println(car2.model + " более новая, чем " + car1.model);
        else
            System.out.println(car1.model + " более новая, чем " + car2.model);
        if (car1.getPrice() > car2.getPrice())
            System.out.println(car1.model + " более дорогая, чем " + car2.model);
        else
            System.out.println(car2.model + " более дорогая, чем " + car1.model);
        if (car1.getPower() >  car2.getPower())
            System.out.println(car1.model + " более мощная, чем " + car2.model);
        else
            System.out.println(car2.model + "более мощная, чем" + car1.model);

    }
}



