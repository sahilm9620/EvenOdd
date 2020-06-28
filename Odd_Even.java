package sahil.mulla.sahil;

public class Odd_Even {
    public static void main(String[] args) {
        int n=5,ev=0,od=0;
		// there is formula for finding sum of first n odd number and even number
		// for even = n*(n+1)  for odd=n*n
		// so our first task is to find out how many even and odd numbers are there in between 1 to n 
        if(n%2==0)
        {
          ev=n/2;
          od=n/2;   // if n is even then there is n/2 even numbers and n/2 odd numbers 

        }
        else {

            ev=n/2;     // if n is odd then there is n/2 even number and n/2 + 1 odd number 
            od=ev+1;

        }

        // hence we find out the number of odd number and even number between 1 to n so we have to just use that formula 
        System.out.println(" Sum Of Even Number Is : " + ev*(ev+1)  + " \n Sum Of odd Number Is : " + od*od);

    }
}
