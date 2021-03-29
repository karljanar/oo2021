
public class calc implements calkInterface{

    String vnupp = "";
    double enumb;
    double tnumb;
    int sumbol;
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public void vajutus(String nupp) {
        if(nupp.equals("C")){ vnupp = "0"; }
        else if(vnupp.equals("0")){ vnupp = nupp;
       }
        else if(isNumeric(nupp)){ vnupp += nupp;
        }
        else if(nupp.equals("+")){
        enumb = Double.parseDouble(vnupp);
        vnupp = "";
        sumbol = 1;
        }
        else if(nupp.equals("-")){
            enumb = Double.parseDouble(vnupp);
            vnupp = "";
            sumbol = 2;
        }
        else if(nupp.equals("*")){
            enumb = Double.parseDouble(vnupp);
            vnupp = "";
            sumbol = 3;
        }
        else if(nupp.equals("/")){
            enumb = Double.parseDouble(vnupp);
            vnupp = "";
            sumbol = 4;
        }
        else if(nupp.equals("=")){
            tnumb = Double.parseDouble(vnupp);
            if(sumbol == 1){
                vnupp = String.valueOf(enumb + tnumb);
            } else if(sumbol == 2){
                vnupp = String.valueOf(enumb - tnumb);
            } else if(sumbol == 3){
                vnupp = String.valueOf(enumb * tnumb);
            }else if(sumbol == 4){
                vnupp = String.valueOf(enumb / tnumb);
            }

        }

    }

    @Override
    public String kuvatav() {
        return vnupp;
    }
}
