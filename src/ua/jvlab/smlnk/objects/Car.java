package ua.jvlab.smlnk.objects;

public class Car {

    private String nameCar;
    private Engine engine;
    private ClimateControle cc = new ClimateControle(20);
    private double totalPetrol;


    /*конструкторы*/

    public Car(String nameCar) {
        this.nameCar = nameCar;
        engine = new Engine(0, 0);
    }

    public Car(String nameCar, double millAge, double vEng) {
        this.nameCar = nameCar;
        engine = new Engine(millAge, vEng);

    }

    /*геттеры, сеттеры*/

    public String getNameCar() {
        return nameCar;
    }

    public double getMileAge() {
        return engine.getMillAge();
    }

    public double getTotalPetrol() {
        return engine.addPetrol();
    }

    public void setTotalPetrol(double totalPetrol) {
        this.totalPetrol = totalPetrol;
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

