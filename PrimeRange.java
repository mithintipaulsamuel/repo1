import java.util.Scanner;
class PrimeRange
{
public static void main(String args[])
{
int n=1000,count=0;
/*Scanner s=new Scanner(System.in);
System.out.println("Enter any number : ");
n=s.nextInt();*/
while(n>=1)
{
if(n==1)
{
continue;
}
else
{
int i=1;
while(i<=n/2)
{
if(n%i==0)
count++;
i++;
}
if(count==0)
{
System.out.println(n+" is a prime number");
}
else
{
System.out.println(n+" is not a prime number");
}
n--;
}
}
}
}