import java.util.Scanner;
public class average {
    public static void main(String args[]){
        int marks;
        int total=0;
        int counter=0;
        int average;
        Scanner input = new Scanner(System.in);
        while(counter<10){
            marks=input.nextInt();
            total=total+marks;
        counter++;
        }
        System.out.println("total score is"+total);
        System.out.println("Average is"+total/(counter+1));
    }
}
