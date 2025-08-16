import  java.util.*;
class  TransposeMatrix
{
public  static  void main(String  args[])
{

int r,c,r1,c1;
Scanner  s=new  Scanner(System.in);
System.out.println("enter no. of  rows of    matrix");
r=s.nextInt();
System.out.println("enter no. of  cols of    matrix");
c=s.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[c][r];
System.out.println("enter elements  of Matrix ");
for(int  i=0;i<r;i++)
{
for(int j=0;j<c;j++)
a[i][j]=s.nextInt();
}
System.out.println("entered   matrix  is ");
for(int  i=0;i<r;i++)
{
for(int j=0;j<c;j++)
System.out.print(a[i][j]+ " ");
System.out.println("");
}
for(int  i=0;i<r;i++)
{
for(int j=0;j<c;j++)
b[j][i]=a[i][j];
}
System.out.println("Transpose  of  given  matrix  is");
for(int  i=0;i<c;i++)
{
for(int j=0;j<r;j++)
System.out.print(b[i][j]+ " ");
System.out.println("");
}
}
}