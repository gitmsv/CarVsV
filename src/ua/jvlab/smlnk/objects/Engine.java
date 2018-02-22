package ua.jvlab.smlnk.objects;

public class Engine {

    /*класс двигатель автобобиля*/

    private double millAge; // пробег двигателя;
    private boolean started; // двигатель вкл./выкл.;

    // dz
    private double vEng; // объем двигателя;

    /*геттеры и сеттеры*/

    public double getMillAge() {
        return millAge;
    }

    public void setMillAge(double millAge) {
        this.millAge = millAge;
    }

    public boolean isStarted() { // boolean-ский геттер;
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public double getvEng(double vEng) {
        return vEng;

    }

    public void setvEng(double vEng) {
        this.vEng = vEng;
    }

    /*кострукторы*/

    public Engine(double millAge, double vEng) {
        super();
        this.millAge = millAge;
        this.vEng = vEng;
    }

    /*методы*/

    public void addMileAge(double millAge) {
        if (started) {
            this.millAge += millAge;
        }
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }

    public double addPetrol() {

        if (vEng <= 1.5 & vEng > 0) {
            return millAge = millAge * 0.1;
        }
        if (vEng > 1.5 & vEng > 0) {
            return millAge = millAge * 0.15;
        }
        return 0;
    }
}