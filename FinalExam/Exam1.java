
package FinalExam;
import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Scanner sc = new Scanner(System.in);
     
        
        int i,n=0,op;
        do{
        System.out.println("\n==== Menu ======");
        System.out.println("1. Input ");
        System.out.println("2. Output");
        System.out.println("Press -1 to Exit..");
        System.out.print("Pls Choose Option = "); op  = sc.nextInt();
        boolean check = false;
        switch(op)
        {
              
            case 1->{
                if(check==false)
                {
                    System.out.print("Enter the numbers:  "); n = sc.nextInt();
                
                    for ( i = 0; i < n; i++) {
                     numbers[i] = sc.nextInt();
                     check=!check;
                }
                if(check==true)
                {
                    int add;
                    System.out.print("How Many number do you want to ad = "); add = sc.nextInt();
                    for(i=n;i<(n+add);i++)
                    {
                        System.out.println("Input Number = "); numbers[i] = sc.nextInt();
                    
                    }
                    check=!check;
                }
                }
            }
            case 2 ->{
                   for ( i = 0; i < n; i++) {
                   if(i==0)
                   {
                       System.out.print("[");
                   
                   }
                   System.out.print(numbers[i]+",");
                   if(i==n-1)
                   {
                     System.out.print("]");
                   }
                 }

            }
             case 3 -> {
                 
        
        }
        }
   }while(op!=-1);

  
}
}




    

