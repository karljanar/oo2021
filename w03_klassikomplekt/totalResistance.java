public class totalResistance {

    public double totalResit(){
        double tR = 0;
        if(Resistors.resistors.keySet().contains("s1")){
            for (double i : Resistors.resistors.values()) {
                tR += i;
            }
        } else {
            for(double i : Resistors.resistors.values()){
                tR += Math.pow(i, -1);
            }
            tR = (double) Math.round(Math.pow(tR, -1) * 100d) / 100d;
        }
        return tR;
    }
}
