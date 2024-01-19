package operator;

public class operator2 {
    public static void main(String[] args) {


        //문자열 + 문자열
        String result1 = "hello" + "world";

        System.out.print(result1);

        String result2 = "it's" + "me";
        System.out.print(result1+result2+System.lineSeparator());

        System.out.println(result1 + "it's \n me");

        //문자열과 숫자 더하기
        String result3 = "a + b =" +10; // -> 컴파일 시 10은 문자열 취급이 된다..."10"
        System.out.println(result3);

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println("result4 = " + result4); // -> "a + b = 20"



    }
}
