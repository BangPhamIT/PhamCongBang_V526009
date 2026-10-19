import java.util.Scanner;

public class TimPhanTuLonNhat {

    public static int timMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
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

            int giaTriLonNhat = timMax(arr);
            System.out.println("Phan tu lon nhat la: " + giaTriLonNhat);
        }
    }
}
