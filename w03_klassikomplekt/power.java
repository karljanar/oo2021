public class power {
    public double power(double voltage) {
        current I = new current();
        double elecPower = voltage * I.current(voltage);
        elecPower = (double) Math.round(elecPower * 100000d) / 100000d;
        return elecPower;
    }
}