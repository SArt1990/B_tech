import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
}