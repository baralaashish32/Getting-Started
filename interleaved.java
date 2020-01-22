class threetable extends Thread
{
public void run()
{
try
{
for(int i=1;i<=10;i++)
{

System.out.println("3*"+i+"="+(3*i));
sleep(20);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}

class fourtable extends Thread
{
public void run()
{
try
{
for(int i=1;i<=10;i++)
{

System.out.println("4*"+i+"="+(4*i));
sleep(20);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}

class twotable extends Thread
{
public void run()
{
try
{
for(int i=1;i<=10;i++)
{

System.out.println("2*"+i+"="+(2*i));
sleep(20);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}

}
} 
public class interleaved
{
public static void main(String args[])
{
threetable t1=new threetable();
fourtable t2=new fourtable();
twotable t3=new twotable();
t1.start();
t2.start();
t3.start();
}
}