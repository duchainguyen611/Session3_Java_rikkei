import java.util.Scanner;

public class homeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n:");
        int n = Integer.parseInt(scanner.nextLine());
        int choice;

        do {
            System.out.print("\n**********************PRACTICE**********************\n" +
                    "1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)\n" +
                    "2. In các số nhỏ hơn n và tính tổng\n" +
                    "3. In ra các ước số chẵn của n\n" +
                    "4. In ra các ước số lẻ và số lượng các ước lẻ của n\n" +
                    "5. In ra ước số lẻ lớn nhất của n\n" +
                    "6. Thoát\n" +
                    "Lựa chọn của bạn:");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Dãy số chia hết cho 2 và giảm dần: ");
                    for (int i = n; i >= 2; i--) {
                        if (i % 2 == 0) System.out.printf("%d\t", i);
                    }
                    break;
                case 2:
                    int sum = 0;
                    System.out.printf("Các số nhỏ hơn %d: \n", n);
                    for (int i = 1; i < n; i++) {
                        System.out.printf("%d\t", i);
                        sum += i;
                    }
                    System.out.printf("\nTong: %d", sum);
                    break;
                case 3:
                    System.out.printf("Các ước số chẵn của %d: \n", n);
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0 && i % 2 == 0) {
                            System.out.printf("%d\t", i);
                        }
                    }
                    break;
                case 4:
                    int count = 0;
                    System.out.printf("Các ước số lẻ của %d: \n", n);
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            count++;
                            System.out.printf("%d\t", i);
                        }
                    }
                    System.out.printf("\nSo luong uoc le: %d", count);
                    break;
                case 5:
                    int max = 0;
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            if (i > max) max = i;
                        }
                    }
                    System.out.printf("\nƯớc số lẻ lớn nhất: %d", max);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1 - 6");
                    break;
            }
        } while (true);
    }
}
