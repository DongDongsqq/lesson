package scanner.Ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int gugu = scanner.nextInt();
        System.out.println(gugu+"단의 구구단");
        for (int i = 1 ;i < 10; i++ ){
            int sum = gugu * i;
            System.out.println(gugu + " X " + i + " = " + sum);
        }
    }
}
