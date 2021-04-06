package v3;
import java.util.*;
public class HulgiUhendus implements Voolujuht{

    List<Voolujuht> hoidla = new ArrayList<>();
    public void lisa(Voolujuht v){hoidla.add(v);}
    public boolean hulgiJuht(){
        for(Voolujuht v: hoidla){
            if(!v.kasJuhib()){
                return  false;
            }
        }
        return true;
    }

    @Override
    public boolean kasJuhib() {
        return false;
    }
}
