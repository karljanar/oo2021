class kodutoopr{
    public static void main(String[] arg){
        kodutoo2 serialConnection = new kodutoo2();
        serialConnection.addResistors("r1", 30.0);
        //serialConnection.addResistors("r2", 330.0);
        //serialConnection.addResistors("r3", 330.0);

        System.out.println(serialConnection.askResistors());
        System.out.println(serialConnection.totalResitance("serial") + "Ω");
        System.out.println("Elektriahela voolutugevuseks on: " + serialConnection.current("serial", 5) + "A");
        System.out.println("Elektriahela voimsuseks on: " + serialConnection.power("serial", 5) + "W");



        kodutoo2 parallelConnection = new kodutoo2();
        parallelConnection.addResistors("r1", 20.0);
        parallelConnection.addResistors("r2", 33.0);
        parallelConnection.addResistors("r3", 33.0);

        System.out.println(parallelConnection.askResistors());
        System.out.println(parallelConnection.totalResitance("parallel") + "Ω");
        System.out.println("Elektriahela voolutugevuseks on: " + parallelConnection.current("parallel", 5) + "A");
        System.out.println("Elektriahela  voimsuseks on: " + parallelConnection.power("parallel", 5) + "W");


    }
}
