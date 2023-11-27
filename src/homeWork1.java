public class homeWork1 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Cac so chan tu 1 den 10 la: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.printf("%d\t",i);
            }
        }
        System.out.printf("\nTong cac so do la: %d",sum);
    }
}
