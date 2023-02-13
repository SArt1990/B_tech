import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements (enter 'e' for end):");
        ArrayList<Integer> num_arr = new ArrayList<>();
        
        while (true) {
            if (sc.hasNextInt()) {
                num_arr.add(sc.nextInt());
            } else {
                if (!sc.nextLine().equals("e")) {
                    System.out.println("Not right element!");                                                               
                } else {                        
                        break;
                }
            }   
        }
        sc.close();
        System.out.println(num_arr);        
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