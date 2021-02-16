import java.util.Hashtable;

public class kodutoo2 {
    Hashtable<String, Double> resistors = new Hashtable<String, Double>();
    public Hashtable<String, Double> askResistors(){return resistors;}

    public void addResistors(String resistor, double resistance){
        if(resistors.containsKey(resistor)){
            throw new RuntimeException(resistor + " juba olemas.");
        } else {
            resistors.put(resistor, resistance);
        }
    }

    public double totalResitance(String type){
        double tR = 0;
        if(type.equals("serial")) {
            for (double i : resistors.values()) {
                tR += i;
            }
        } else {
            for(double i : resistors.values()){

                tR += Math.pow(i, -1);
            }
            tR = (double) Math.round(Math.pow(tR, -1) * 100d) / 100d;
        }
        return tR;
    }

    public double current(String type, int voltage){
        double tResistance = totalResitance(type);
        double elecCurrent = voltage / tResistance;
        elecCurrent = (double)Math.round(elecCurrent * 100000d) / 100000d;
        return elecCurrent;
    }

    public double power(String type, int voltage) {
        double elecPower = voltage * current(type, voltage);
        elecPower = (double) Math.round(elecPower * 100000d) / 100000d;
        return elecPower;
    }




}
