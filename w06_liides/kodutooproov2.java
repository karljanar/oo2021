public class kodutooproov2 {
    public static void main(String[] arg){

        vooluahel roop = new serial();
        for (int i =0; i<arg.length; i++){
            roop.addResistors(Double.parseDouble(arg[i]));
        }
        System.out.println("Vooluahela kogutakistus on " + roop.totalResistance());

    }


}
