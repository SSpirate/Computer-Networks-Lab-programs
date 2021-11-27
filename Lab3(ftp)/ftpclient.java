import java.io.*;
 import java.net.*;
public class ftpclient
{
public static void main(String args[]) throws Exception
{
Socket s=new Socket(InetAddress.getLocalHost(),8000); FileOutputStream fout= new FileOutputStream(args[0]); InputStreamReader sin=new InputStreamReader(s.getInputStream()); 
int i;
while(true)
{
i=sin.read(); if(i==-1|| i==63)
break;
fout.write(i);
}
s.close();
fout.close();
System.out.println("File received successful");
}
}
