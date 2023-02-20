/**
 * Доработайте программу в свободном стиле.
 * Можно сравнить 2 автомобиля между собой
 * Или пусть авто заедет за фруктами :-)
 * Добавьте несколько произвольных методов и свойств
 */

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", 2010, 2000000, "red", 240);
        Car KIA = new Car("KIA", 2011,1000000, "green", 120);

        BMW.getInfo();
        KIA.getInfo();
        System.out.println("________");

        BMW.powerOnCar();
        BMW.road("Ленина 80");
        BMW.powerOffCar();

        KIA.road("Ленина 80");
        KIA.powerOnCar();
        KIA.road("Ленина 80");
        KIA.powerOffCar();

        System.out.println("________");

        Car.compare(BMW, KIA);

    }
}