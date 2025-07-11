import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên bất kỳ: ");
        int n = sc.nextInt();

        if (n < 0) {
            n = -n;
        }
        int tong = 0;
        while (n > 0) {
            int chuSo = n % 10;
            tong = tong + chuSo;
            n = n / 10;
        }

        System.out.println("Tổng các chữ số là: " + tong);

        sc.close();
    }
}
