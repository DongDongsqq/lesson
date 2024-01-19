package scope;

public class Scope1 { //범위
    public static void main(String[] args) {
        int m = 0; // m 생존 시작
        if (true){
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if m = " + x);
        } // x 생존 종료
    }
}
