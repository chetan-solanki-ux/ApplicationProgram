import java.net.*;
import java.io.*;

class Server
{
    public static void main(String Arg[]) throws Exception 
    {
        System.out.println("Server Application is running...!");
        ServerSocket ssobj=new ServerSocket(2100);
        System.out.println("server is Running At port no :2100");

        Socket s= ssobj.accept();
        System.out.println("Server and client is connection is Sucesssful");

    PrintStream ps=new PrintStream(s.getOutputStream());

        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Chat messager is start");
        String str1,str2;
    while((str1=br1.readLine())!=null)
    {
System.out.println("Client says :"+str1);
System.out.println("Ënter the message for client:");
str2=br2.readLine();
ps.println("Server says:"+str2);

    }
    System.out.println("Thanku for using chat messages...");
    }
}