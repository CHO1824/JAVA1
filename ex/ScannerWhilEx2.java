package ex;

import java.util.Scanner;

public class ScannerWhilEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("상품의 가격을 입력하세요 (-1을 입력하면 종료)");
            int price = scanner.nextInt();

            if (price == -1){
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("구매하려는 수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            int sum = price * quantity;
            System.out.println("총 비용: " + sum);
        }
    }
}
