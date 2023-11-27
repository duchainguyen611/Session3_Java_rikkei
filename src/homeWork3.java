import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("******************************Breakfast Menu*************************\n" +
                    "1. Phở tôm hùm\n" +
                    "2. Phở bò Kobe\n" +
                    "3. Phở gà Việt Nam\n" +
                    "4. Xôi trứng thịt\n" +
                    "5. Bánh mỳ trứng\n" +
                    "6. Mỳ tôm không người lái\n" +
                    "7. Thoát");
            System.out.println("Nhap lua chon cua ban:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn món Phở tôm hùm, vui lòng đợi trong giây lát");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn món Phở bò Kobe, vui lòng đợi trong giây lát");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn món Phở gà Việt Nam, vui lòng đợi trong giây lát");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn món Xôi trứng thịt, vui lòng đợi trong giây lát");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn món Bánh mỳ trứng, vui lòng đợi trong giây lát");
                    break;
                case 6:
                    System.out.println("Bạn vừa chọn món Mỳ tôm không người lái, vui lòng đợi trong giây lát");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1 - 7");
                    break;
            }
        }while (choice < 1 || choice > 7);
    }
}
