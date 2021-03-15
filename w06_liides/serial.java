import java.util.*;

public class serial implements vooluahel {

    List<Double> resistors = new ArrayList<Double>();
    public void addResistors(double resistance) {
        resistors.add(resistance);
    }


    public double totalResistance() {
        double tR = 0;
        for (int i = 0; i<resistors.size(); i++) {
            tR += resistors.get(i);
        }
        return tR;
    }

}
