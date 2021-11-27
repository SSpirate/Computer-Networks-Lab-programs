import java.io.*;
import java.net.*;
public class MyClient {
	public static void main(String[] args) {
		try{
		     Socket s = new Socket("localhost",6666);
	                     DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		     dout.writeUTF("Hello Server");
		     DataInputStream dis = new DataInputStream(s.getInputStream());
		     String tr = (String)dis.readUTF();
		     System.out.println("Message From Server = "+tr);
                                     s.close();
		     dout.flush();
		     dout.close();
		     
                                     }
                                catch(Exception e){System.out.println(e);}
									   }
}