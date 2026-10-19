import java.util.Scanner;

public class TinhTongMang {

    public static int tinhTong(int[] arr) {
        int tong = 0;
        int i = 0;
        while (i < arr.length) {
            tong += arr[i];
            i++;
        }
        return tong;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so phan tu n: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap a[" + i + "]: ");
                arr[i] = scanner.nextInt();
            }

            int ketQua = tinhTong(arr);
            System.out.println("Tong cac phan tu trong mang la: " + ketQua);
        }
    }
}
