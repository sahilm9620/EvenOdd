package sahil.mulla.sahil;
import java.lang.Math;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        double n = 5.6;
        int sumO = 0, sumE = 0;

        for (int i=1;i<=(int)Math.round(n);i++)
        {
            if(i%2==0)
            {
                sumE=sumE+i;
            }else
            {
                sumO=sumO+i;
            }
        }
        System.out.println("Sum Of Even Number Is : " + sumE + " \n Sum Of odd Number Is " + sumO);
    }
    }
