public class kodutooproov{
    public static void main(String[] arg){
        Resistors test1 = new Resistors();
        test1.addResistors("s1", 30.0);
        test1.addResistors("s2", 30.0);
        test1.addResistors("s3", 330.0);

        System.out.println(test1.askResistors());
        System.out.println("Elektriahela kogutakistus on: " + test1.totalR() + "Ω");
        System.out.println("Elektriahela voolutugevuseks on: " + test1.current(5) + "A");
        System.out.println("Elektriahela voimsuseks on: " + test1.power(5) + "W");



    }
}
