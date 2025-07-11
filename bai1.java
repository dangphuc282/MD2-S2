import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        // kiem tra chan le
        if (n == 0) {
            System.out.println("Số này không chẵn không lẻ.");
        } else if (n % 2 == 0) {
            System.out.println("Số " + n + " là số chẵn");
        } else {
            System.out.println("Số " + n + " là số lẻ");
        }

        sc.close();
    }
}