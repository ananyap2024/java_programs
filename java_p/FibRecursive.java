import  java.util.*;
class  FibRecursive
{
public  static  void main(String  args[])
{
Scanner  s=new Scanner(System.in);
System.out.println("enter  n=?");
int  n=s. nextInt();
int  f=fibonacci(n);
System.out.println(f);
}
public  static  int fibonacci(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacci(n - 1) + fibonacci(n - 2);
}
}
