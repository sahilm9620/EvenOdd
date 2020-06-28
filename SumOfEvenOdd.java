package sahil.mulla.sahil;
import java.lang.Math;
import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number :  ");
        int n=s.nextInt();
        int sumO = 0, sumE = 0;

        for (int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sumE=sumE+i;
            }else
            {
                sumO=sumO+i;
            }
        }
        System.out.println(" Sum Of Even Number Is : " + sumE + " \n Sum Of odd Number Is " + sumO);
    }
    }

