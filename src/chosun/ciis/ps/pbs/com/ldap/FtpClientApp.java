package chosun.ciis.ps.pbs.com.ldap;

import java.io.*;
import sun.net.TelnetOutputStream;
import sun.net.ftp.FtpClient;

public class FtpClientApp  {

	public boolean FtpClientApp (String fileName) {

		boolean result = false;
		FtpClient fc;

		String hostname = COLdapSend.getProp ("OLAP_IP");
		String username = COLdapSend.getProp ("OLAP_ID");
		String password = COLdapSend.getProp ("OLAP_PW");

		String filename = COLdapSend.getProp ("OLAP_FILE");
		String directory = COLdapSend.getProp ("OLAP_PATH");
		String filePath = COLdapSend.getProp ("CLASS_PATH") + "com/ldap/OLAP/";

		try {
			if (fileName != null && !fileName.trim().equals("")) {
				int lastSlash = fileName.lastIndexOf('/');
				filename = fileName.substring(lastSlash+1);
				directory = fileName.substring(0, lastSlash);
			}
			else {
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[FtpClientApp] ArrayIndexOutOfBoundsException : " + e.toString());
		}
		catch (Exception e) {
			System.out.println("[FtpClientApp] Exception : " + e.toString());
		}

		try {
			//FTP 접속한다.
			fc = new FtpClient(hostname);
			fc.login(username, password);

			//Binary 모드로 변경한다.
			fc.binary();

			//디렉토리 이동한다.
			fc.cd(directory);

			//파일을 쓴다.
			FileInputStream from = new FileInputStream(filePath+filename);
			TelnetOutputStream to = fc.put(filename);
			byte[] buffer = new byte[4096];
			int bytes_read;

			while ((bytes_read = from.read(buffer)) != -1)
				to.write(buffer, 0, bytes_read);

			from.close();
			to.close();

			//FTP 접속을 닫는다.
			fc.closeServer();
			result = true;
		}
		catch (IOException e) {
			System.out.println("[FtpClientApp] IOException : " + e.toString());
		}
		catch (Exception e) {
			System.out.println("[FtpClientApp] Exception : " + e.toString());
		}

		return result;
	}
}
