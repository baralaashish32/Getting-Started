import java.io.*;
public class CopyBytes
{
public static void main(String args[])throws IOException,FileNotFoundException
{
FileInputStream in=null;
FileOutputStream out=null;
try
{
in= new FileInputStream("a.txt"); 
out= new FileOutputStream("b.txt");
int c;
while((c=in.read())!=-1)

out.write(c);
System.out.println("contents of file a.txt are copied to b.txt using byte oriented i/o");
}
finally
{
if(in!=null)in.close();
if(out!=null)out.close();
}
}
}



