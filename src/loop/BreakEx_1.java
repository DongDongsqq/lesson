package loop;

public class BreakEx_1 {
    public static void main(String[] args) {
       int sum = 0;
       int i = 0;
       while (true){
           sum += i;
           i ++;
           if (sum> 16){
               System.out.println("sum = " + sum);
               break;
           }
       }
    }
}
