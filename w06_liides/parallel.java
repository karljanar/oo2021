import java.util.*;

public class parallel implements vooluahel {

    List<Double> resistors = new ArrayList<Double>();
    @java.lang.Override
    public void addResistors(double resistance) {
        resistors.add(resistance);
    }

    public double totalResistance() {
        double tR = 0;
        for (int i = 0; i<resistors.size(); i++) {
            tR += Math.pow(i, -1);
        }
        tR = (double) Math.round(Math.pow(tR, -1) * 100d) / 100d;
        return tR;
    }

}