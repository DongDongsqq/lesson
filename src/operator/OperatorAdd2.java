package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감
        int a = 1;
        int b = 0;
        b = ++a; //-> a의 값을 먼저 증가시키고 그 결과를 b에 대입
        System.out.println("a = " + a + "b = "+b); //결과 : a=2, b=2

        //후위 증감
        int c = 2;
        int d = 3;
        c = d++; // -> d값을 c에 저장한 후 d+1 연산
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //아래 두 식은 동일하게 +1증가, 다른 연산이 없기 때문
        c++;
        System.out.println("c = " + c);
        ++c;
        System.out.println("c = " + c);

    }
}
