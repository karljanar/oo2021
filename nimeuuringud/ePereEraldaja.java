public class ePereEraldaja implements tekstistEraldaja{
    public String eralda(String s){
        String first = s.substring(0, 1);
        String lause[] = s.split(" ");
        String tSona = lause[lause.length - 1];
        return first + ". " + tSona;
    }
}
