import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên từ 1 đến 12 (tương ứng với tháng): ");
        int thang = sc.nextInt();

        switch (thang) {
            case 1:
                System.out.println("Tháng 1 có 31 ngày.");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày.");
                break;
            case 3:
                System.out.println("Tháng 3 có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng 4 có 30 ngày");
                break;
            case 5:
                System.out.println("Tháng 5 có 31 ngày");
                break;
            case 6:
                System.out.println("Tháng 6 có 30 ngày");
                break;
            case 7:
                System.out.println("Tháng 7 có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng 8 có 31 ngày");
                break;
            case 9:
                System.out.println("Tháng 9 có 30 ngày");
                break;
            case 10:
                System.out.println("Tháng 10 có 31 ngày");
                break;
            case 11:
                System.out.println("Tháng 11 có 30 ngày");
                break;
            case 12:
                System.out.println("Tháng 12 có 31 ngày");
                break;
            default:
                System.out.println("Vui lòng nhập lại");
        }

        sc.close();
    }
}
