class MyThread extends Thread
{
public void run()
{
for(int i=5;i<=5;i++)
System.out.println("Child Thread" +i);
}
}

class ThreadDemo
{
public static void main(String args[])
{
MyThread=new MyThread();
t.start();
for(int i=5;i<=5;i++)
System.out.println("Main Thread" + i);
}
}