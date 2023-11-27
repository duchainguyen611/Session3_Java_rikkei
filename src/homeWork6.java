import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 2 so nguyen:");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int choice;
        do {
            System.out.print("\n**********************CACULATOR**********************\n" +
                    "1. Tổng 2 số\n" +
                    "2. Hiệu 2 số\n" +
                    "3. Tích 2 số\n" +
                    "4. Thương 2 số\n" +
                    "5. Số dư trong phép chia 2 số\n" +
                    "6. Ước chung lớn nhất\n" +
                    "7. Bội chung nhỏ nhất\n" +
                    "8. Thoát\n" +
                    "Lựa chọn của bạn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.printf("%d + %d = %d", a, b, a + b);
                    break;
                case 2:
                    System.out.printf("%d - %d = %d", a, b, a - b);
                    break;
                case 3:
                    System.out.printf("%d * %d = %d", a, b, a * b);
                    break;
                case 4:
                    if (b == 0) System.out.print("So bi chia phai khac 0");
                    else System.out.printf("%d / %d = %.2f", a, b, (float) a / b);
                    break;
                case 5:
                    if (b == 0) System.out.print("So bi chia phai khac 0");
                    else System.out.printf("so du trong phep chua 2 so %d va %d la %d", a, b, a % b);
                    break;
                case 6:
                    int num1 = a;
                    int num2 = b;
                    while (num1 != num2) {
                        if (num1 > num2) {
                            num1 -= num2;
                        } else {
                            num2 -= num1;
                        }
                    }
                    System.out.printf("UCLN la %d", num1);
                    break;
                case 7:
                    int num3 = a;
                    int num4 = b;
                    while (num3 != num4) {
                        if (num3 > num4) {
                            num3 -= num4;
                        } else {
                            num4 -= num3;
                        }
                    } System.out.printf("BCNN la %d", (a*b)/num3);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1 - 8");
                    break;
            }
        } while (true);
    }
}
