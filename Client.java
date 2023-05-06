import java.net.*;
import java.io.*;

class Client
{
    public static void main(String Arg[]) throws Exception 
    {
        System.out.println("Client Application is running...!");
        System.out.println("Client is Wating for connection");
        Socket s=new Socket("localhost",2100);

        PrintStream ps=new PrintStream(s.getOutputStream());

        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Chat messager is start");
        String str1,str2;
        while(!(str1=br2.readLine()).equals("end"))
        {
                ps.println(str1);
                System.out.println("Enter the Message for Server:");
                str2=br1.readLine();
                System.out.println("server says :"+str2);
        }
    }
}