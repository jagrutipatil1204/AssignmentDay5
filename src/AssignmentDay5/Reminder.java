package AssignmentDay5;

import java.util.Scanner;

public class Reminder {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a dividend");
  int dividend= reader.nextInt();

        System.out.println("Enter divisor:");
   int divisor =reader.nextInt();

int Quotient = dividend / divisor;
int Remainder = dividend % divisor;

        System.out.println("The Quotient is :" + Quotient);
        System.out.println("The Remainder is :" + Remainder);
    }
}