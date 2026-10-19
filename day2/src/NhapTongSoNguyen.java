import java.util.Scanner;

public class NhapTongSoNguyen {

    private static final int GIOI_HAN = 50;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tong = 0;

            do {
                System.out.print("Nhap mot so nguyen: ");
                int soNhap = scanner.nextInt();
                tong += soNhap;
            } while (tong <= GIOI_HAN);

            System.out.println("Tong cac so da nhap la: " + tong);
            System.out.println("Tong da lon hon 50. Ket thuc chuong trinh!");
        }
    }
}
