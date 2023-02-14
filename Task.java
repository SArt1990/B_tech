import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Task {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mass length:");    

        if (sc.hasNextInt()) {
            n = sc.nextInt();
            int[] num_arr = new int[n];
            Random randomGen = new Random();            
            System.out.print("Array: ");

            for (int i = 0; i < n; i++) {
                num_arr[i] = randomGen.nextInt(n);
                System.out.print(num_arr[i] + " ");
            }

            sort(num_arr, num_arr.length);
            System.out.print("\nSort array: ");

            for (int i = 0; i < num_arr.length; i++) {
                System.out.print(num_arr[i] + " ");
            }

        } else {
            System.out.println("No integer");
        }
        
        sc.close();
    }

    public static void sort(int[] num_arr, int length) {
        if (length < 2) {
            return;
        }
        int q = length / 2;
        int[] b = new int[q];
        int[] c = new int[length - q];

        for (int i = 0; i < q; i++) {
            b[i] = num_arr[i];
        }

        for (int i = q; i < length; i++) {
            c[i - q] = num_arr[i];

        }

        sort(b, q);
        sort(c, length - q);

        merge(num_arr, b, c, q, length - q);
        
    }

    public static void merge(int[] num_arr, int[] b, int[] c, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (b[i] <= c[j]) {
                num_arr[k++] = b[i++];
            }
            else {
                num_arr[k++] = c[j++];
            }
        }
        while (i < left) {
            num_arr[k++] = b[i++];
        }
        while (j < right) {
            num_arr[k++] = c[j++];
        }

    }
}