import java.io.*;
import java.net.*;
public class ftpserver
{
public static void main(String args[]) throws Exception
{
ServerSocket ss=new ServerSocket(8000); Socket s=ss.accept();
FileInputStream fin= new FileInputStream(args[0]); 
OutputStreamWriter out=new OutputStreamWriter(s.getOutputStream());
int i; 
while(true)

{
i=fin.read();
out.write(i);
out.flush();
 if(i==-1)
break;
}
s.close();
fin.close();
System.out.println("File sent successful");
}
}
