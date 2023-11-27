import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap cac so nguyen:");
        int number = 1;
        int sum = 0;
        while (number != 0) {
            number = Integer.parseInt(scanner.nextLine());
            if (number % 2 != 0) sum += number;
        }
        System.out.print("Tong cac so le la:"+sum);
    }
}
