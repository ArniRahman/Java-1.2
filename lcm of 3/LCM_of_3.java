package lcm_of_3;

public class LCM_of_3 {
    
    public static void main(String[] args) {
        int n1,n2,n3,LCM = 0,largest = 0,i;
        n1=15;
        n2=30;
        n3=45;
        i=1;
        
        if(n1>n2 && n1>n3)
        {
            LCM=n1;          
        }
        else if(n2>n1 && n2>n3)
        {
            LCM=n2;
        }
        else if(n3>n2 && n3>n1)
        {
            LCM=n3;
        }   
        largest=LCM;
        
        while(true)
        {
            if(LCM%n1==0 && LCM%n2==0 && LCM%n3==0)
            {
                System.out.print("The LCM of "+n1+" "+n2+" "+n3+" is: ");
                System.out.println(LCM);
                break;
            }    
            LCM= largest * ++i;            
        }                        
    }
}
