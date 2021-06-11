
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int n,t1,t2,tn,sum,i;
        t1=0;
        t2=1;
        sum=0;
        n=10;
        System.out.print("The first " +n+ " fibonacci numbers are: ");
        
        for(i=0;i<n;i++)
        {
            System.out.print(t1+" ");
            sum=t1+t2;
            t1=t2;
            t2=sum;        
        }
        System.out.println("");
    }
    
}
