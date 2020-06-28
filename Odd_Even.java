package sahil.mulla.sahil;

public class Odd_Even {
    public static void main(String[] args) {
        double n=2000;
        int ev=0,od=0;
        int n1= (int) Math.round(n);
        if(n1%2==0)
        {
          ev=n1/2;
          od= n1/2;

        }
        else {

            ev=n1/2;
            od=ev+1;

        }

        System.out.println(" Sum Of Even Number Is : " + ev*(ev+1)  + " \n Sum Of odd Number Is : " + od*od);

    }
}
