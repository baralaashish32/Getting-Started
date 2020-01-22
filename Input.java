import java.io.*;
import java.util.*;
class Input
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your details:name,rollno,dept");
String name=sc.next();
int rollno=sc.nextInt();
String dept=sc.next();
System.out.println("name="+name+"rollno="+rollno+"dept="+dept);
}
}