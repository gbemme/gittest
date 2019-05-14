// program to determine oldest and youngest
import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("enter first age");
        int a = input.nextInt();
        System.out.println("enter second age");
        int b = input.nextInt();
        if (a >=b){
            System.out.println("oldest");
        }
        else;{
            System.out.println("newest");
        }
    }
}