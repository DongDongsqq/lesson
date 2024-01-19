package scanner.Ex;

import java.util.Scanner;

public class ScannerWhile4 {
    public static void main(String[] args) {
        String productName;
        int price;
        int quantity;
        int sum;
        int option;
        int totalCost = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1: 상품 입력, 2: 결제, 3: 프로그램 종료: ");
            option = scanner.nextInt();
            if (option == 1) {
                scanner.nextLine();

                System.out.print("상품 명을 입력하세요: ");
                productName = scanner.nextLine();

                System.out.print("가격을 입력하세요: ");
                price = scanner.nextInt();

                System.out.print("수량을 입력하세요: ");
                quantity = scanner.nextInt();
                totalCost = price * quantity;

                System.out.println("상품명: " + productName + " 가격: " + price + " 수량: " + quantity + " 합계: " +totalCost);
            } else if (option == 2) {
                System.out.println("총 비용 = " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요");
            }
        }
    }
}