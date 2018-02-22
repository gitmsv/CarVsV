package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objects.Car;

public class Main {

    public static void main(String[] args) {

        // создание автомобилей "BMW X5", "Chevrolet Lacetti";

        Car bmw = new Car("BMW 'X5'", 0,1.4);
        Car chevrolet = new Car("Chevrolet 'Lacetti'", 2000, 4);


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

        System.out.println("                           <<<<<<  Расход ГСМ в зависимости от объема двигателя автомобиля: >>>>>> "+"\n");
        System.out.println("           -> параметры объема задавать у формате: 1.3 или целое 2 - приравнивается к 1500 см куб. или 2000 см куб.и т.д. <-"+"\n");
        System.out.println("                          --> расход двигателя с объемом <= 1.5 тис.см.куб. ~ 10 л / 100 км <--");
        System.out.println("                           --> расход двигателя с объемом > 1.5 тис.см.куб. ~ 15 л / 100 км <--"+"\n");
        System.out.println("                           --> если показано значение пробега, а значение расхода гсм = `ноль`(0). <--");
        System.out.println("                                --> этому может служить, неверный объем(V) двигателя <--");
        System.out.println("               <---! объем двигателя дожен быть целым (int) числом и > нуля или же double ~ х.хх && > 0 !--->"+"\n");


        System.out.println("#: Пробег автомобиля "+bmw.getNameCar() +" равен ~ "+bmw.getMileAge()+" км,"+" расход гсм составил ~ "+bmw.getTotalPetrol()+" л");
        System.out.println("#: Пробег автомобиля "+chevrolet.getNameCar()+" равен ~ "+chevrolet.getMileAge()+" км,"+" расход гсм составил ~ "+chevrolet.getTotalPetrol()+" л");

    }
}

