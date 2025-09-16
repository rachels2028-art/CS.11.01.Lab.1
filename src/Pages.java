import java.util.Scanner;

public class Pages {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //char c = ‘A’;  Int n = 14;
        System.out.print("Enter your age: ");
        int myAge = sc.nextInt();
        int age1 = 100-myAge ;
        System.out.println( myAge + "-year olds should read at least "
                + age1 + " before giving up the book");

    }
}
