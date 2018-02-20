package ua.jvlab.smlnk.objects;

/*класс климат-контроль*/

public class ClimateControle {

    private boolean on; // вкл./выкл. климат-контроля;
    private int temp; // температура;

    /*геттеры и сеттеры*/

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    /*конструкторы*/

    public ClimateControle(int temp) {
        super();
        this.temp = temp; // градусов;
    }

    /*методы*/

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
}