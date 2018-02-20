package ua.jvlab.smlnk.objects;

public class Engine {

    /*класс двигатель автобобиля*/

        private double millAge; // пробег двигателя;
        private boolean started; // двигатель вкл./выкл.

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

        /*кострукторы*/

        public Engine(double millAge) {
            super();
            this.millAge = millAge;
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

    }
