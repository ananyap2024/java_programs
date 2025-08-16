import  java.util.*;

class  SumOfdigits
{
public  static  void main(String  args[])
{
Scanner  s=new  Scanner(System.in);
System.out.println("Enter  any  number");
int n=s.nextInt();
int sum=0,rem;
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.print("Sum  of digits  in no  is "+sum);
}
}
