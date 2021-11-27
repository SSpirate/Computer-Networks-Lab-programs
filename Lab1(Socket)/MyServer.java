import java.io.*;
import java.net.*;
public class MyServer {
	public static void main(String[] args){
		try{
		       ServerSocket ss= new ServerSocket(6666);
                                       Socket s =ss.accept();
		       DataInputStream dis = new DataInputStream(s.getInputStream());
		       String str = (String)dis.readUTF();
		       System.out.println("Message from Client = "+str);
		       DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		       if (str.isEmpty())
		       	dout.writeUTF("Hello Client i didn't received any message");
		       else 
			dout.writeUTF("Hello Client I Received Your message");
		       dout.flush();
		       dout.close();
		       ss.close();
                                       }
		  catch(Exception e){System.out.println(e);}
                                  }
}
		        
		       
            			
            			
            			
   
            
                                      