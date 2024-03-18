package ex;

import java.util.Scanner;

public class ScannerWhilEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하세요.");
            String num1 = scanner.nextLine();
            if (num1.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.println("나이를 입력하세요.");
            String num2 = scanner.nextLine();
            System.out.println("입력한 이름: " + num1 + ", 나이:" + num2);
        }
    }
}
