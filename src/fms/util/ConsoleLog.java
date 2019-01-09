package fms.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLog {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd : HH:mm:ss");
	public void tgrLog(String title1, String msg){
		System.out.println("[" + sdf.format(new Date()) + "]" + "["+title1+":"+msg.getBytes().length+"]"+msg);
	}
	
	public void tgrLog(String title1, byte [] msg){
		System.out.println("[" + sdf.format(new Date()) + "]" + "["+title1+":"+msg.length+"]" + new String(msg));
	}
	
	public void msgLog(String msg){
		System.out.println(msg);
	}
}
