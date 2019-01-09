package fms.comm_module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import fms.common.Property;

public class JAVA_Socket implements BaseAction {
	private Socket s;
	private BufferedReader br;
	private PrintWriter pw;
	
	public int close() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int connect(String ip, int port) {
		int ret=-1;
		
		try {
			s = new Socket(ip,port);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			s.setSoTimeout(3*60*1000);
			ret=1;
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return ret;
	}

	public byte[] recvData() {
		String r = null;
		try {
			r = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(r==null)r="¼ö½Å¾ÈµÊ";
		return (r+"\r\n").getBytes();
	}

	public boolean sendData(String data) {
		pw.write(data);
		pw.flush();
		
		return true;
	}

}
