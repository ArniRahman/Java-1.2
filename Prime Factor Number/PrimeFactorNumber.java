package primefactornum;

public class PrimeFactorNum {

    public static void main(String[] args) {
        int num,i;
        num=550;
        System.out.print("Prime factors of  "+num+" are: ");
        
        for(i=2;num!=1;)
        {
            if(num % i==0)
            {
                num=num/i;
                System.out.print(i+" ");
            }
            else
                i++;
            
        }
        System.out.println("");
    }
}
    
    

