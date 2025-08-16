class   ShortCircuitDemo
{
public static  void main(String  args[])
{
int x=10;
int y=10;
if((++x<10  &&  ++y>15))
{
++x;
}
else
{
++y;
}
System.out.println("Short-circuit  &&");
System.out.println("x= "+x+" y= "+y);

x=10;
y=10;
if((++x<10  ||  ++y>15))
{
++x;
}
else
{
++y;
}
System.out.println("Short-circuit  ||");
System.out.println("x= "+x+" y= "+y);
}
}
