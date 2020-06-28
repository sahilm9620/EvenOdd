package sahil.mulla.sahil;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number : ");
       int n=s.nextInt();
        int ev=0,od=0;
        if(n%2==0)
        {
          ev=n/2;
          od= n/2;
        }
        else {
            ev=n/2;
            od=ev+1;
        }
        System.out.println(" Sum Of Even Number Is : " + ev*(ev+1)  + " \n Sum Of odd Number Is : " + od*od);

    }
}
