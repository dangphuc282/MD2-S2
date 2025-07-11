import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = -1;

        do {
            System.out.print("Nhập tuổi của bạn: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                }
            } else {
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                scanner.next();
            }
        } while (age <= 0);

        System.out.println("Tuổi của bạn là " + age + "!");
        scanner.close();
    }
}
