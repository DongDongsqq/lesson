package operator;

public class Logical1 {
    public static void main(String[] args) {
        // && -> and, || -> or, ! -> 거짓이면 참, 참이면 거짓을 반환
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(!true);
        System.out.println(!false);

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
