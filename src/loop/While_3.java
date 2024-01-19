package loop;

public class While_3 {
    public static void main(String[] args) {
        int sum = 0;
        int startNum = 1;
        int endNum = 100;
        while (endNum>=startNum) {
            sum += startNum;
            System.out.println("sum = " + sum + " startNum = " + startNum);
            startNum++;
        }
    }
}
