import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){         // Loop for rows
            for(int j = i; j < n; j++){      // Print spaces
                System.out.print("  ");      // two spaces for alignment
            }
            for(int k = 1; k <= i; k++){     // Print stars
                System.out.print("* ");
            }
            System.out.println();            // Move to next row
        }
    }
}