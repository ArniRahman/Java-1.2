package perfectnumber;

public class PerfectNumber {

    public static void main(String args[]) {
        int n,num,total,i,j;
        n=4;
        num=2;
        total=0;
        System.out.print("First "+n+" perfect numbers are: ");
        
        for(i=0;i<n;)
        {
            for(j=1;j<num;j++)
            {
                if(num%j==0)
                    total=total+j;
            }
        
        if(total==num)
        {
            System.out.print(num+" ");
            i++;
        }
        total=0;
        num++;
        }
        System.out.println("");
    }
}

