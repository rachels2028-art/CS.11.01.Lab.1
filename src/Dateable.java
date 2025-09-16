import java.util.Scanner;

public class Dateable {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //char c = ‘A’;  Int n = 14;
        System.out.print("Enter your age");
        int yourage = sc.nextInt();
        int age = 7+ (yourage/2);
        System.out.println( yourage + "-year olds should date somebody that is at least " + age);

    }
}
