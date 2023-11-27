import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 3 so nguyen:");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int choice;
        int sum = a+b+c;
        do{
            System.out.print("\n**********************CACULATOR**********************\n" +
                    "1. Tổng 3 số nguyên\n" +
                    "2. Trung bình cộng của 3 số nguyên\n" +
                    "3. Số lớn nhất, nhỏ nhất trong 3 số\n" +
                    "4. Thoát\n" +
                    "Lựa chọn của bạn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.printf("Tong 3 so = %d",sum);
                    break;
                case 2:
                    System.out.printf("Trung binh cong 3 so = %.2f",(float)sum/3);
                    break;
                case 3:
                    int max = a;
                    int min = a;
                    if (max < b) max = b;
                    if (max < c) max = c;
                    if (min > b) min = b;
                    if (min > c) min = c;

                    System.out.printf("So lon nhat = %d\nSo nho nhat = %d",max,min);
            }
        }while (true);
    }
}
