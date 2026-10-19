import java.util.Scanner;

public class CongHaiMang {

    public static int[] nhapMang(Scanner scanner, String tenMang) {
        System.out.print("Nhap so phan tu mang " + tenMang + ": ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(tenMang + "[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] tinhTongMang(int[] a, int[] b) {
        int doDai = Math.max(a.length, b.length);
        int[] ketQua = new int[doDai];

        for (int i = 0; i < doDai; i++) {
            int valA = (i < a.length) ? a[i] : 0;
            int valB = (i < b.length) ? b[i] : 0;
            ketQua[i] = valA + valB;
        }

        return ketQua;
    }

    public static void inMang(int[] arr) {
        System.out.print("Mang tong: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] mangA = nhapMang(scanner, "a");
            int[] mangB = nhapMang(scanner, "b");

            int[] mangTong = tinhTongMang(mangA, mangB);
            inMang(mangTong);
        }
    }
}
