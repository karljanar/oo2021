package v3;

import java.util.ArrayList;
import java.util.List;

public class Roopyhendus2 extends HulgiUhendus{


    public boolean kasJuhib(){
        for(Voolujuht v: hoidla){
            if(v.kasJuhib()){
                return true;
            }
        }
        return false;
    };
}
