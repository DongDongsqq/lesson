package operator;

public class Operator1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println(sum);

        //뺼셈
        int diff = a-b;
        System.out.println("diff = " + diff);

        //곱셈
        int multi = a*b;
        System.out.println("multi = " + multi);
        
        int div = a/b; // -> 버림..
        System.out.println("div = " + div);
        
        //나머지
        int mod = a%b;
        System.out.println("mod = " + mod);

        

    }
}
