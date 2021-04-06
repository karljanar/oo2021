package v3;

import java.util.ArrayList;
import java.util.List;

public class Roopyhendus implements Voolujuht{

    List<Boolean> hoidla = new ArrayList<Boolean>();
    public void lisa(Boolean v){hoidla.add(v);}

    public boolean kasJuhib(){
        for(int i = 0; i<hoidla.size(); i++){

            if(hoidla.get(i).equals(true)){
                return true;
            }
        }
        return false;
    };
}
