package Comp;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 1;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = "+ age + " status = "+ status);

/*
        if (age >= 18){
            status = "성인";
        }else {
            status = "미성년자";
        }
        System.out.println("신분 = "+ status); */
    }
}
