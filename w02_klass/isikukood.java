public class isikukood{
    String sisu;
    public isikukood(String uusSisu){
        sisu=uusSisu;
        if(sisu.length()!=11){
            throw new RuntimeException("vigane pikkus");
        }
    }
    public String kuuNumber(){
        return sisu.substring(3, 5);
    }

    public String kuuPaev(){
        return sisu.substring(5, 7);
    }

    public String sugu(){
        int suguN = Integer.parseInt(sisu.substring(0, 1));
        if(suguN % 2 == 0){
            return "N";
        } else {
            return "M";
        }
    }

    public String aasta(){
        String kaheKohaline = sisu.substring(0, 1);
        String kaheLopp = sisu.substring(1, 3);
        if(kaheKohaline.equals("5") || kaheKohaline.equals("6")){
            kaheKohaline = "20" + kaheLopp;
        }
        if(kaheKohaline.equals("4") || kaheKohaline.equals("3")){
            kaheKohaline = "19" + kaheLopp;
        }
        if(kaheKohaline.equals("1") || kaheKohaline.equals("2")){
            kaheKohaline = "18" + kaheLopp;
        }


        return kaheKohaline;
    }

}