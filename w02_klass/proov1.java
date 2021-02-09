public class proov1 {
    public static void main(String[] arg){
        isikukood janar = new isikukood("50002270272");
       // isikukood ehh = new isikukood("34501234215");
        System.out.println(janar.kuuPaev());
        System.out.println(janar.kuuNumber());
        System.out.println(janar.aasta());
        System.out.println(janar.sugu());
        /*System.out.println(ehh.kuuPaev());
        System.out.println(ehh.kuuNumber());
        System.out.println(ehh.aasta());
        System.out.println(ehh.sugu());*/
    }
}