package sahil.mulla.sahil;
import java.lang.Math;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        double n = 2000;
        int sumO = 0, sumE = 0;
		// initalize the variable

        for (int i=1;i<=Math.round(n);i++) // this loop is to iterate from 1 to n
        {
            if(i%2==0)
            {
                sumE=sumE+i; // if number is even then add in sumE
            }else
            {
                sumO=sumO+i; // if number is odd then add in sumO
            }
        }
        System.out.println("Sum Of Even Number Is : " + sumE + " \n Sum Of odd Number Is " + sumO);
    }
    }

