package ua.jvlab.smlnk.objects;

public class Car {

    private String nameCar;
    private Engine engine;
    private ClimateControle cc = new ClimateControle(20);

    /*конструкторы*/

    public Car(String nameCar) {
        this.nameCar = nameCar;
        engine = new Engine(0);
    }

    public Car(String nameCar, double millAge) {
        this.nameCar = nameCar;
        engine = new Engine(millAge);
    }

    /*геттеры, сеттеры*/

    public String getNameCar() {
        return nameCar;
    }

    public double getMileAge() {
        return engine.getMillAge();
    }

    /*методы*/

    // завести мотор;
    public void turnOn() {
        engine.turnOn();
        cc.turnOn();
        cc.setTemp(21);
    }

    // заглушить мотор;
    public void turnOff() {
        engine.turnOff();
        cc.turnOff();
    }

    // установить скорость;
    public void start(int speed, double hours) {

        if (engine.isStarted()) { // еще не заведен мотор;

            // пройденая дистанция
            double distance = speed * hours;
            engine.addMileAge(distance);
        }
    }
}
