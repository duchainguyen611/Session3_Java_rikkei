import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap ban phim so n (1<=n<=9): ");
//        int n = scanner.nextInt();
//        for(int i=1;i<=9;i++){
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }

        for(int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){
                System.out.printf("%d * %d = %d\n",i,j,j*i);
            }

        }
    }
}
