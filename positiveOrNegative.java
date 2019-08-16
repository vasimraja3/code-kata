import java.util.Scanner;

public class Positive_Negative
{
    public static void main(String[] args) {
    int n;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number :");
        n=input.nextInt();
    if(n>0)
    {System.out.println("Entered number is positive : "+n);}
    if(n<0)
    {System.out.println("Entered number is negative :"+n);}
    if(n==0)
    {System.out.println("Entered number is zero :"+n);}
    
    }


}