import java.util.Arrays;

public class kodutoo{

    public static String revString(String str){

        char characters[] = str.toCharArray();
        String reverse = "";
        for(int i=characters.length-1; i>=0; i--){
            reverse += characters[i];
        }
        return reverse.replace(",", "");
    }

    public static void main(String[] arg){
        //System.out.println(revString("abc"));
        String normalStr = Arrays.toString(arg).replace("[", "").replace("]", "");
        //System.out.println(normalStr);
        System.out.println(revString(normalStr));
    }
}