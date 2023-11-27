import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        int i,j;
//        for (i=0,j=10;i<j;i++,j--){
//        }
//        System.out.print("Diem trung binh trong khoang 0 - 10 la :"+i);

//        int sum = 0;
//        System.out.print("Cac so chia het cho 3 va 5 tu 1 den 100 la:");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                sum += i;
//                System.out.printf("%d\t",i);
//            }
//        }
//        System.out.printf("\nTong cac so do la: %d",sum);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap cac so nguyen:");
//        int number = 1;
//        int sum = 0;
//        while (number != 0) {
//            number = Integer.parseInt(scanner.nextLine());
//            if (number % 2 == 0) sum += number;
//        }
//        System.out.print("Tong cac so chan la:"+sum);

        Scanner scanner = new Scanner(System.in);
        int choice;
        int n = 0;
        do {
            System.out.println("\n******************************Menu*************************\n" +
                    "1. Nhap vao 1 so nguyen\n" +
                    "2. In ra cac so chan tu 1 - m va tinh tong\n" +
                    "3. Kiem tra n co phai so nguyen to khong\n" +
                    "4. Kiem tra n co phai so hoan hao khong\n" +
                    "5. Thoát");
            System.out.print("Nhap lua chon cua ban:");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    do{
                        System.out.print("Moi nhap so nguyen:");
                        n = Integer.parseInt(scanner.nextLine());
                        if (n<=1) System.out.println("n phai lon hon 1");
                    }while (n<=1);
                    break;
                case 2:
                    int sum = 0;
                    System.out.print("Cac so chan tu 1 - n la:");
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            sum += i;
                            System.out.printf("%d\t", i);
                        }
                    }
                    System.out.printf("\nTong la: %d", sum);
                    break;
                case 3:
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            isPrime = false;
                            break;
                        }
                    };
                    if (isPrime) System.out.printf("%d la so nguyen to", n);
                    else System.out.printf("%d khong la so nguyen to", n);
                    break;
                case 4:
                    int sumSHH = 0;
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0) {
                            sumSHH += i;
                        }
                    }
                    if (n == sumSHH) System.out.printf("%d la so hoan hao", n);
                    else System.out.printf("%d la khong la so hoan hao", n);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1 - 5");
                    break;
            }
        } while (true);
    }
}
