package Comp;

public class ScoreCal2 {
    public static void main(String[] args) {
        int dollar = 1000;
        int result;
        if (dollar <0){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else {
            result = dollar * 1300;
            System.out.println("환전금액은  " + result + "원 입니다.");
        }
    }
}
