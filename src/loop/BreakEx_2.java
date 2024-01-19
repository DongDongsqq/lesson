package loop;

public class BreakEx_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; sum <= 10; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
    }
}
