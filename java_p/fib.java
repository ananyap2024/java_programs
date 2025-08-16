class Fib
{
public static void main(String[] args)
{
int k=15,first=0,second=1;
System.out.println("Fibonacci Series till "+k+" terms:");
for(int i=1;i<=k;i++)
{
System.out.print(first +",");
int next=first+second;
first=second;
second=next;
}
}
}