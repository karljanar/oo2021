public class current {

    public double current(double voltage){
        totalResistance tResistance = new totalResistance();
        double elecCurrent = voltage / tResistance.totalResit();
        elecCurrent = (double)Math.round(elecCurrent * 100000d) / 100000d;
        return elecCurrent;
    }
}
