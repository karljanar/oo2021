public class kodutooproov2{
    public static void main(String[] arg){
        Resistors test2 = new Resistors();
        test2.addResistors("p2", 300.0);
        test2.addResistors("s3", 330.0);

        System.out.println(test2.askResistors());
        System.out.println("Elektriahela kogutakistus on: " + test2.totalR() + "Ω");
        System.out.println("Elektriahela voolutugevuseks on: " + test2.current(5) + "A");
        System.out.println("Elektriahela voimsuseks on: " + test2.power(5) + "W");



    }
}

