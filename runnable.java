class A implements runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
for(int j=1;j<=10;j++)
{
int s=i*j;
System.out.println(i+"*"+j+"="+s);
}
}
}
}
class runnable
{
public static void main(String args[])
{
A obj=new A();
Thread X=new Thread(obj);
X.start();
}
}