import java.util.Scanner;
public class series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int q;
        q = in.nextInt();
        int r = q;
        for (q = 0; q < r; q++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = 0;

            {
                int counter = n;
                for (n = 0; n < counter; n++) {
                    sum += Math.pow(2, n);
                    int sum2 = b * sum;
                    int sum3 = a + sum2;
                    System.out.print(sum3 + " ");
                }System.out.println();
            }
        }
    }
}