package operator;

public class Comp2 {
    public static void main(String[] args) {
        //문자열 비교는 ==이 아닌 .equals()
        String str1 = "문자열1";
        String str2 = "문자열2";
        
        boolean result1 = "hello".equals("hello");
        System.out.println("result1 = " + result1);
        
        boolean result2 = str1.equals("문자열1");
        System.out.println("result2 = " + result2);
        
        boolean result3 = str1 == str2;
        System.out.println("result3 = " + result3);
                
    }
}
