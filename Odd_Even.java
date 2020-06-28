package sahil.mulla.sahil;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        // there is formula for finding sum of first n odd number and even number
        // for even = n*(n+1)  for odd=n*n
        // so our first task is to find out how many even and odd numbers are there in between 1 to n
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = 0;
        try {
           n = s.nextInt();
        } catch (Exception e) {
            System.out.println("Only Integer Can Classify As Even Or Odd");
        }


        int ev = 0, od = 0;
        if (n >= 0) {
            if (n % 2 == 0) {
                ev = n / 2;   // if n is even then there is n/2 even numbers and n/2 odd numbers
                od = n / 2;
            } else {
                ev = n / 2;
                od = ev + 1; // if n is odd then there is n/2 even number and n/2 + 1 odd number
            }
            // hence we find out the number of odd number and even number between 1 to n so we have to just use that formula
            System.out.println(" Sum Of Even Number Is : " + ev * (ev + 1) + " \n Sum Of odd Number Is : " + od * od);

        }else {
            System.out.println("enter positive number");
        }
    }
}
