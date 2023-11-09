package Assignment.Assignment5.Polymorphism.Example8;

class TemperatureException extends Exception {
    private int temperature;

    TemperatureException() { super("제어 불가"); }
    TemperatureException(String msg) { super(msg); }

    void setTemperature(int t) { temperature = t; }
    int getTemperature() { return temperature; }
}
