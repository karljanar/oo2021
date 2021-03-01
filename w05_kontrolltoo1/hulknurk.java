import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hulknurk {
    List<Integer> x = new ArrayList<Integer>();
    List<Integer> y = new ArrayList<Integer>();

    public void addToArray(Integer[] xA, Integer[] yA) {
        for(int i=0; i < xA.length; i++){
            x.add(xA[i]);
            y.add(yA[i]);
        }
    }

    public void addToArray2(List<Integer> xA, List<Integer> yA) {
        for(int i=0; i < xA.size(); i++){
            x.add(xA.get(i));
            y.add(yA[i]);
        }
    }

    public String askArray() {
        String fArray = "x koordinaadid: " + x + "\ny koordinaadid: " + y;
        return fArray;
    }

    public double perimeter(){
        double leng = 0;
        for(int i=0; i < x.size()-1; i++) {
            leng += Math.sqrt(Math.pow(x.get(i+1) - x.get(i), 2) + Math.pow(y.get(i+1) - y.get(i), 2));
        }
        leng += Math.sqrt(Math.pow(x.get(x.size()-1) - x.get(0), 2) + Math.pow(y.get(x.size()-1) - y.get(0), 2));
        return (double)Math.round(leng * 10000.0D) / 10000.0D;
    }


}
