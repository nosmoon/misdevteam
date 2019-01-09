/**
 * <p>Title: Chcnage Guest Password</p>
 * <p>Description: </p>
 * <p>Copyright: FORCS Copyright (c) 2003</p>
 * <p>Company: FORCS 2004.07.06.</p>
 * @author not attributable
 * @version 1.0
 */

import oz.framework.api.Repository;
import oz.framework.cp.OZCPException;

import org.apache.log4j.*;
import java.io.*;
import java.net.*;
import java.util.*;


public class ChangeGPWD {

    private static boolean http;
    private static String ip, url;
    private static String id, pwd;
    private static int port;

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;

    public static void main(String args[]) throws OZCPException{

        BasicConfigurator.configure();

        inputServerInfo();

        Repository repository = null;

        if(http)
            repository = new Repository(url, id, pwd);
        else
            repository = new Repository(ip, port, id, pwd);

        int ADMIN_ID = 1;
        int GUEST_ID = 2;
        String GUEST_PWD = "guest";

        if(!repository.checkUserPwd(ADMIN_ID, pwd)){
            out.println("ADMIN password is not correct. Please check the password first and try again.");
            System.exit(1);
        }else{
            repository.updateUserPwd(GUEST_ID, GUEST_PWD);
            out.println("Password changed Succssfully.");
        }

    }


    public static void inputServerInfo() throws OZCPException{
        out.println("Input Server Type.");
        out.println(" 1 : TCP Server (Daemon type).");
        out.println(" 2 : HTTP Server (Servlet type).");
        out.print (" ([1] / [2] / [Enter] : TCP Server) : ");
        String type = read("1");

        if ("2".equals(type)) {
            out.print("Input URL. ([Enter] : http://127.0.0.1/oz/server) : " );
            url = read("http://127.0.0.1/oz/server");
        }
        else {
            out.print("Input Server Address. ([Enter] : 127.0.0.1) : " );
            ip = read("127.0.0.1");
            out.print("Input Server Port. ([Enter] : 8003) : " );
            port = Integer.parseInt(read("8003"));
        }
        out.print("Input ID ([Enter] : ) : ");
        id = read("");

        if(!id.equals("admin")){
            out.println("Only ADMIN can change the password.");
            System.exit(1);
        }
        out.print("Input Password ([Enter] : ) : ");
        pwd = read("");
    }


    private static String read(String dflt) {
        String rtn = null;
        try {
            rtn = in.readLine();
        } catch(IOException e) {
            out.println("** Fail to read from user input. The Default Value will be used **");
            e.printStackTrace();
        }

        if (rtn == null || rtn.trim().equals("")) rtn = dflt;

        return rtn;
    }


}