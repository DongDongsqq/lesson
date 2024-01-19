package Comp;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount += 1000;
        }

        if (age <=10){
            discount += 1000;
        }

        System.out.println(price-discount); // 중복 할인 가능이기에 if 를 중첩으로 씀. 하나만 할인 가능하다면 if +else if활용


    }
}
