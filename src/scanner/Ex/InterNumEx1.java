package scanner.Ex;

import java.util.Scanner;

public class InterNumEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();
        if (num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for ( ; num1 <= num2; num1 ++){

            System.out.print(num1);

            if (num1 == num2){
                break;
            }
            System.out.print(", ");
        }

    }
}
