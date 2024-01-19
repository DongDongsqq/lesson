package loop;

public class BreakEx_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for ( ; ; ){
            i ++;
            sum += i;
            if (sum > 10){
                System.out.println("i = "+ i + " sum = " + sum);
                break;
            }
        }
    }
}
