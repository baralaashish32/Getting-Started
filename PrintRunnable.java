class threetable implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{

System.out.println("3*"+i+"="+(3*i));

}
}
}
class fourtable implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{

System.out.println("4*"+i+"="+(4*i));

}
}
}
class twotable implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{

System.out.println("2*"+i+"="+(2*i));

}
}
}
public class PrintRunnable
{
public static void main(String args[])
{
threetable t1=new threetable();
Thread t11=new Thread(t1);
t11.start();
fourtable t2=new fourtable();
Thread t22=new Thread (t2);
t22.start();
twotable t3=new twotable();
Thread t33=new Thread(t3);
t33.start();
}
}