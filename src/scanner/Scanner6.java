package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("숫자를 입력하세요: ");

            int num = scanner.nextInt();

            sum = sum + num;
            if (num == 0){
                break;
            }
            System.out.println("sum = " + sum);
        }
    }
}
