package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objects.Car;

public class Main {

    public static void main(String[] args) {

        // создание автомобилей "BMW", "LACHETTI";

        Car bmw = new Car("BMW");
        Car chevrole = new Car("LACHETTI", 20000);

        bmw.turnOn();
        chevrole.turnOn();

        // массив скоростей автомобиля (км/час);
        final int[] speeds = new int[]{20, 60, 100};

        for (int s : speeds) {
            bmw.start(s, 0.5);
        }

        for (int s : speeds) {
            chevrole.start(s, 1.0);
        }

        bmw.turnOff();
        chevrole.turnOff();

        System.out.println("Авто "+bmw.getNameCar() +" пробег = "+bmw.getMileAge());
        System.out.println("Авто "+chevrole.getNameCar()+" пробег = "+chevrole.getMileAge());
    }
}