import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap cac so nguyen:");
        String result = "";
        int n;
        do {
            n = Integer.parseInt(scanner.nextLine());
            if (n % 3 == 0) result += " " + n + " ";
        } while (n != 0);
        System.out.println("Cac so chia het cho 3 la: "+result);
    }
}
