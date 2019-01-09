package chosun.ciis.co.base.util;

import java.io.*; 
import java.net.*; 
import java.util.StringTokenizer; 
import java.util.NoSuchElementException; 
import java.util.Vector; 

public class FtpUtil {
	public FtpUtil(){
		
	}
	
	/** 
	FTP 서비스 관련 기능을 수행하는 클래스 
	*/ 
	/** 서버 IP */ 
	private String server = ""; 
	/** 사용자 IP */ 
	private String user = ""; 
	/** 처리결과를 저장하는 문자열 */ 
	private String reply = ""; 
	/** FTP 서버와 연결을 위한 Socket */ 
	private Socket socket; 
	/** FTP 서버로 명령을 전송하기 위한 Stream */ 
	private BufferedReader in; 
	/** FTP 서버로부터 결과를 받기 위한 Stream */ 
	private BufferedWriter out; 
	/** FTP 서버 포트 번호 */ 
	private int port = 21; 
	/** FTP 서버 데이터 전송 모드 */ 
	private boolean passive = true; 
	/** 
	FTP 서버와의 연결여부를 반환한다. 
	*/ 
	public boolean isConnect() { 
		if (out == null) 
			return false; 
		else 
			return true; 
	}
	
	public void ftpConnect(String server, String user, String password) throws Exception { 
		this.server = server; 
		this.user = user; 
		socket = new Socket(server, port); 
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); 
		getRespond(); 
		ftpLogin(user, password); // check if login success 
	}
	
	public String getReply() { 
		return reply; 
	} 
	
	public void close() throws IOException { 
		ftpCommand("QUIT"); 
		if (!reply.substring(0, 3).equals("221")) { 
			throw new IOException(); 
		} 
		in.close(); 
		out.close(); 
		socket.close(); 
		in = null; 
		out = null; 
		socket = null; 
		this.server = ""; 
		user = ""; 
	} 
	
	// ftp.getFile(vtReadFile.elementAt(i).toString(), destFilename, 0, true); 
	public String getFile(String ftpfile, String localfile, long restart, boolean transferMode) throws Exception {
		InputStreamReader isr		= null;
		BufferedReader br			= null;
		String buff		= "";
		try { 
			if (out == null) { 
				return buff; 
			} 
			if (transferMode == true) { 
				ftpCommand("TYPE A"); //ASCII 
			} else { 
				ftpCommand("TYPE I"); 
			} 
			Socket sock = null; 
			if (restart > 0) 
				sock = getDataSocket(new String[] {"REST " + restart, "RETR " + ftpfile}); 
			else 
				sock = getDataSocket(new String[] {"RETR " + ftpfile}); 
			
			if (sock == null) { 
				throw new IOException(); // transfer incomplete 
			} 
			// Read bytes from server and write to file. 
			//BufferedInputStream reader = new BufferedInputStream(sock.getInputStream()); 
			
			
			//InputStream is 	= fc.get(filename);
			isr				= new InputStreamReader(sock.getInputStream());
			br				= new BufferedReader(isr);
	        
			
			int i			= 0;
			while(true) {
				if (i > 0){
					buff += br.readLine();
					if (br.readLine() == null){
						break;
					}
				}
				i++;
	        	
				System.out.println(buff);
			}
	        
			//RandomAccessFile fout = new RandomAccessFile(localfile, "rw"); 
			//fout.seek(restart); 
			//readData(reader, fout); 
			//reader.close(); 
			//fout.close(); 
			//sock.close(); 
			//getRespond(); 
	   
			if (!reply.substring(0, 3).equals("226") && reply.substring(0, 3).equals("125")){ 
	   //if(!reply.substring(0, 3).equals("226")) 
				throw new IOException(); //transfer incomplete 
			} 
			return buff;
		} catch (Exception e) { 
			throw e; 
		} 
	} 
	
	private void readData(BufferedInputStream reader, RandomAccessFile out) throws IOException { 
		int offset; 
		byte[] data = new byte[1024]; 
		while ( (offset = reader.read(data)) != -1) { 
			out.write(data, 0, offset); 
		} 
		reader.close(); 
		out.close(); 
	} 
	
	public void putFile(String ftpfile, String localfile, boolean transferMode) throws Exception { 
		if (out == null) { 
			return; 
		} 
		if (transferMode == true) { 
			ftpCommand("TYPE A"); 
		} else { 
			ftpCommand("TYPE I"); 
		} 
		try { 
			Socket sock = getDataSocket(new String[] {"STOR " + ftpfile}); 
			// Read bytes from server and write to file. 
			BufferedOutputStream writer = new BufferedOutputStream(sock.getOutputStream()); 
			RandomAccessFile fin = new RandomAccessFile(localfile, "r"); 
			//fout.seek(restart); 
			outData(writer, fin); 
			writer.close(); 
			fin.close(); 
			sock.close(); 
			getRespond(); 
			
			if (!reply.substring(0, 3).equals("226")) { 
				throw new IOException(); // transfer incomplete 
			} 
		} catch (Exception e) { 
			throw e; 
		} 
	} 
	
	private void outData(BufferedOutputStream writer, RandomAccessFile in) throws IOException { 
		int offset; 
		byte[] data = new byte[1024]; 
		
		while ( (offset = in.read(data, 0, 1024)) != -1) { 
			//System.out.println(offset); 
			//System.out.println(data.toString()); 
			//writer.write(data); 
			//data = new byte[1024]; 
			writer.write(data, 0, offset); 
		} 
	} 
	
	private Socket getDataSocket(String[] commands) throws Exception { 
		Socket sock = null; 
		ServerSocket ssock = null; 
		
		try { 
			// Establish data conncetion using passive or active mode. 
			if (passive) 
				sock = getPassiveDataSocket(); 
			else 
				ssock = getActiveDataSocket(); 
			// Send ftp commands 
			for (int i = 0; i < commands.length; i++) { 
				ftpCommand(commands[i]); 
			} 
			System.out.println(reply);
			if (! (reply.substring(0, 3).equals("150") || reply.substring(0, 3).equals("125"))) { 
				if (sock != null) 
					sock.close(); 
				throw new IOException(); // command failed 
			} 
			// Get Socket object for active mode. 
			if (!passive) { 
				sock = ssock.accept(); 
			} 
			if (! (reply.substring(0, 3).equals("150") || reply.substring(0, 3).equals("125"))) { 
				sock.close(); 
				throw new IOException(); // command failed 
			} 
		} catch (Exception e) { 
			throw e; 
		} 
		return sock; 
	} 
	
	private Socket getPassiveDataSocket() throws Exception { 
		int count = 1; 
		do { 
			ftpCommand("PASV"); 
			count++; 
			if (count == 4) { 
				throw new Exception("서버 접속에 실패했습니다."); 
			} 
		} 
		while (!reply.substring(0, 3).equals("227")); 
		System.out.println(">" + reply); 
		// array that holds the outputed address and port number. 
		String[] address = new String[6]; 
		// put the 'reply' to the array 'address' 
		StringTokenizer t = new StringTokenizer(reply, ","); 
		for (int i = 0; i < 6; i++) { 
			address[i] = t.nextToken(); 
		} 
		// Get port number. 
		// Erase all other characters except the port number 
		// which is at the beginning of the string 
		String last_port = ""; 
		int NUM = 3; 
		if (address[5].length() < 3) { 
			NUM = address[5].length(); 
		} 
		
		for (int i = 0; i < NUM; i++) { 
			if (Character.isDigit(address[5].charAt(i))) { 
				last_port = last_port + address[5].charAt(i); 
			} 
		} 
		// assign last port number to address[5] 
		address[5] = last_port; 
		// Get the port number 
		// Left shift the first number by 8 
		int NEW_PORT = (Integer.parseInt(address[4]) << 8) + Integer.parseInt(address[5]); 
		System.out.println(">" + NEW_PORT); 
		// Create a new socket object 
		Socket sock = new Socket(this.server, NEW_PORT); 
		return sock; 
	} 
	
	private ServerSocket getActiveDataSocket() throws IOException { 
		int[] port_numbers = new int[6]; // Array that contains 
		// Get ip address of local machine. ip address and port numbers 
		String local_address = socket.getLocalAddress().getHostAddress(); 
		// Assign the ip address of local machine to the array. 
		StringTokenizer st = new StringTokenizer(local_address, "."); 
		for (int i = 0; i < 4; i++) { 
			port_numbers[i] = Integer.parseInt(st.nextToken()); 
		} 
		ServerSocket ssocket = new ServerSocket(0); // ServerSocket to listen to a random free port number 
		int local_port = ssocket.getLocalPort(); // The port number it is listenning to 
		// Assign port numbers the array 
		port_numbers[4] = ( (local_port & 0xff00) >> 8); 
		port_numbers[5] = (local_port & 0x00ff); 
		// Send "PORT" command to server 
		String port_command = "PORT "; 
		for (int i = 0; i < port_numbers.length; i++) { 
			port_command = port_command.concat(String.valueOf(port_numbers[i])); 
			if (i < port_numbers.length - 1) { 
				port_command = port_command.concat(","); 
			} 
		} 
		ftpCommand(port_command); 
		return ssocket; 
	} 
	
	private void ftpLogin(String user, String password) throws IOException { 
		ftpCommand("USER " + user); // send user name 
		ftpCommand("PASS " + password); // send password 
		if (!reply.substring(0, 3).equals("230")) { 
			close(); 
			throw new IOException("ftp login 오류"); 
		} 
	} 
	
	public void setCurrentDirectory(String dir) throws IOException { 
		if (out == null) 
			return; 
		ftpCommand("CWD " + dir); 
		if (!reply.substring(0, 3).equals("250")) { 
			throw new IOException(); 
		} 
	} 
	
	public Vector getDirectoryContent() throws Exception { 
		try { 
			if (out == null) 
				return null; 
			Socket sock = getDataSocket(new String[] {"LIST"}); 
			BufferedReader listen = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
			// Read bytes from server. 
			Vector returnValue = new Vector(); 
			String line; 
			while ( (line = listen.readLine()) != null) { 
				returnValue.add(line); 
			} 
			listen.close(); 
			sock.close(); 
			getRespond(); 
			if (!reply.substring(0, 3).equals("226")) { 
				throw new IOException("List 오류"); 
			} 
			return returnValue; 
		} catch (Exception e) { 
			throw e; 
		} 
	} 

	private void ftpCommand(String command) throws IOException { 
		if (out == null) 
			return; 
		//System.out.println("send string-->"+command); 
		out.write(command + "rn"); 
		out.flush(); 
		getRespond(); 
	} 
	
	private void getRespond() throws IOException { 
		String line = ""; 
		String replymessage = ""; 
		do { 
			line = in.readLine(); 
			//if(line == null || line.length() == 0) break; 
			if (!checkReply(line)) 
				break; 
			replymessage = replymessage.concat(line).concat("n");
			System.out.println(replymessage);
		} 
		while (true); 
		//System.out.println("getRespond()------>"+line); 
		this.reply = line; 
	} 
	
	private boolean checkReply(String str) { 
		if (str.length() > 3 && 
				str.charAt(3) == ' ' && 
				Character.isDigit(str.charAt(0)) && 
				Character.isDigit(str.charAt(1)) && 
				Character.isDigit(str.charAt(2))) { 
			return false; 
		} else { 
			return true; 
		} 
	} 
}

