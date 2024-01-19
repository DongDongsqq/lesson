package loop;

public class Nest_1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (; i <2; i ++){
            System.out.println("i = " + i + " j = " + j);
            for (; j <3; j ++){
                System.out.println("i = " + i + " j = " + j);
            }
        }
        System.out.println("i = " + i + " j = " + j);
    }
}
