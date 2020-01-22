class A extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println("2*"+i+"="+(2*i));
}
}
}
class B extends Thread
{-
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println("3*"+i+"="+(3*i));
}
}
}
class C extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println("4*"+i+"="+(4*i));
}
}
}
public class Prioritytest
{
public static void main(String args[])
{
A x=new A();
B y=new B();
C z=new C();
x.setPriority(Thread.MIN_PRIORITY);
y.setPriority(x.getPriority()+1);
z.setPriority(Thread.MAX_PRIORITY);
x.setName("swasthani");
System.out.println("name of x is:"+x.getName());
x.start();
System.out.println("IS ALIVE:"+x.isAlive());
y.start();
z.start();
x.setName("hjs");
System.out.println("name of x after changing:"+x.getName());
System.out.println("IS ALIVE:"+x.isAlive());
}
}