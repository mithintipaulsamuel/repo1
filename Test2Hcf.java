//Program to find the highest common factor.
import java.util.Scanner;
class Test2Hcf
 {
   public static void main(String args[])
   {
     int n1,n2,i=2,j=2,hcf=0;
     Scanner s= new Scanner(System.in);
     System.out.print("Enter a number : ");
     n1=s.nextInt();
     System.out.print("Enter a number : ");
     n2=s.nextInt();
     System.out.print("Factors of "+n1+" are :");
     while(j<=n1)
     {
       if(n1%j==0)
         {
           System.out.print(j+" ");
         }
       j++;
     }
     j=2;
     System.out.println(" ");
     System.out.print("Factors of "+n2+" are :");
     while(j<=n2/2)
     {
       if(n2%j==0)
         {
           System.out.print(j+" ");
         }
       j++;
     }
     System.out.println(" ");
     int large=n1>n2?n1:n2;
      System.out.print("Common factors of "+n1+" and "+n2+" are :");
     while(i<=large/2)
     {
       if(n1%i==0&&n2%i==0)
        {
           System.out.print(i+" ");
           hcf=i;
        }
       i++;
     }
      System.out.println(" ");
     System.out.println("Hcf of "+n1+" and "+n2+" is "+hcf);
   }
 }
