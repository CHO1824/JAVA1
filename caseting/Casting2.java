

package caseting;

public class Casting2 {
    public static void main(String[] args) {
        //명시적 형변환(직접 변환)
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue); //int형이기 때문에 1
    }
}

