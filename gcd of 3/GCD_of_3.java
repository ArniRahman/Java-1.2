package gcd_of_3;

public class GCD_of_3 {

    public static void main(String[] args) {
        int n1,n2,n3,smallest = 0,i,GCD = 0;
        n1=42;
        n2=66;
        n3=54;
        
        if(n1<n2 && n1<n3)
            smallest=n1;
        else if(n2<n1 && n2<n3)
            smallest=n2;
        else if(n3<n1 && n3<n2)
            smallest=n3;
        for(i=smallest;i>0;i--)
        {
            if(n1%i==0 && n2%i==0 && n3%i==0)
            {
                GCD=i;
                break;
            }
        }
        System.out.println("The GCD of "+n1+" "+n2+" "+n3+" is: "+GCD);
    }  
}
