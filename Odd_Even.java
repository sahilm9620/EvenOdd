package sahil.mulla.sahil;

public class Odd_Even {
    public static void main(String[] args) {
        int n=5,ev=0,od=0;
        if(n%2==0)
        {
          ev=n/2;
          od=n/2;

        }
        else {

            ev=n/2;
            od=ev+1;

        }

        System.out.println(" Sum Of Even Number Is : " + ev*(ev+1)  + " \n Sum Of odd Number Is : " + od*od);

    }
}
