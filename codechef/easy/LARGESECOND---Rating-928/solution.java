import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int max=0;
            int lmax=0;
            for(int x:a)
            {
                if(x>max)
                {
                    lmax=max;
                    max=x;
                }
                if(x<max && x>lmax)
                {
                    lmax=x;
                }
                
            }
            System.out.println(max+lmax);
            
            
           
        }
    }
}
