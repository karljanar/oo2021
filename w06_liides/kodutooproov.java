public class kodutooproov {
    public static void main(String[] arg){
        vooluahel jada = new serial();
        for (int i =0; i<arg.length; i++){
            jada.addResistors(Double.parseDouble(arg[i]));
        }
        System.out.println("Vooluahela kogutakistus on " + jada.totalResistance() + "Ω");

    }


}
