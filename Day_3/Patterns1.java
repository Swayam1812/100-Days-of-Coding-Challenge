//Nexted Loops Concept: Solid Rectangle
// *****
// *****
// *****
// *****

// Always use outer loop ---> rows
// inner loop    --> columns 

import java.util.*;

public class Patterns1 {
        public static void main(String[] args) {
            int n = 4;
            int m = 5;
            
            //outer loop
            for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
                System.out.println();
        }

    }
}
