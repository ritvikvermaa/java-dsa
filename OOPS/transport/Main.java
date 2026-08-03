package oops.transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Maruti", "800", 4, 5, "Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        MotorCycle m = new MotorCycle("Honda", "CBR350", 2, "V", "Hard");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
