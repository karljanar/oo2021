
public class calc implements calkInterface{

    String vnupp = "";
    double mnupp;
    String katse = "";
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
        katse += nupp;}
        else if(isNumeric(nupp)){ vnupp += nupp;
        katse += nupp;}
        else if(nupp.equals("+")){ katse += nupp;
        }
        else if(nupp.equals("=")){ katse += nupp;
        vnupp = }

    }

    @Override
    public String kuvatav() {
        return vnupp;
    }
}
