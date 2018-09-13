import java.util.Scanner;
public class parametermethod {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        subclass subObject= new subclass();
        System.out.println("enter name");
        String hi = input.nextLine();
        subObject.subclassmethod(hi);


    }
}