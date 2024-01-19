package loop;

public class ContinueEx_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i <= 5){
            if (i == 3){
                i ++;
                continue;
            }
            System.out.println("i = " + i);
            i ++;
            sum += i;

            System.out.println("sum = " + sum);
        }
    }
}
