import java.util.Scanner;

public class multiples {


    public static void main(String[] args) {Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i=1;i<11;i++){
            System.out.printf("%d x %d = ",N,i);
            System.out.println(N*i);
        }

    }
}


