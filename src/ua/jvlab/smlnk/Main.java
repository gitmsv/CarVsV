package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objects.Car;

public class Main {

    public static void main(String[] args) {

        // создание автомобилей "BMW X5", "Chevrolet Lacetti";

        Car bmw = new Car("BMW X5", 0,1.3);
        Car chevrolet = new Car("Chevrolet Lacetti", 2000, 1.8);


        bmw.turnOn();
        chevrolet.turnOn();

        // массив скоростей автомобиля (км/час);
        final int[] speeds = new int[]{20, 60, 100};

        for (int s : speeds) {
            bmw.start(s, 0.5);

        }

        for (int s : speeds) {
            chevrolet.start(s, 1.0);
        }

        bmw.turnOff();
        chevrolet.turnOff();

        System.out.println("Расход топлива в зависимости от объема двигателя, параметры объема");
        System.out.println("задавать у формате: 1.5 - приравнивается к 1500 см куб. и т.д....."+"\n");
        System.out.println("--> двигатель с объемом <= 1.5 тис.см.куб. расходует 10 л топлива на 100 км;");
        System.out.println("--> двигатель с объемом  > 1.5 тис.см.куб. расходует 15 л топлива на 100 км."+"\n");

        System.out.println("Автомобиль "+bmw.getNameCar() +" проехал "+bmw.getMileAge()+" км,"+" расход топлива составил ~ "+bmw.getTotalPetrol()+" л");
        System.out.println("Автомобиль "+chevrolet.getNameCar()+" проехал "+chevrolet.getMileAge()+" км,"+" расход топлива составил ~ "+chevrolet.getTotalPetrol()+" л");

    }
}

