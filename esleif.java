import java.util.Scanner;
public class esleif {
    public static void main(String args[]){
        int a;
        Scanner age = new Scanner(System.in);
        a = age.nextInt();
        if (a<15)
        System.out.println("too young");
        else if(
                a<16
                )System.out.println("Still you are young");
        else if (a>19)
            System.out.println("you are old enough");
    }
}
