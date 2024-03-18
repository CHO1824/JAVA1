package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("정수를 입력해주세요.");
            var num = scanner.nextInt();
            sum += num;

            if (num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        System.out.println("두 수의 합: " + sum);
    }
}
