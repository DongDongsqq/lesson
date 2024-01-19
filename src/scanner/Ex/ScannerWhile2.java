package scanner.Ex;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("가격을 입력하세요(-1을 입력하면 종료): ");
            int price = scanner.nextInt();
            if (price == -1){
                break;
            }
            System.out.print("수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            System.out.println("최종 가격 : " + price * quantity);
        }
    }
}