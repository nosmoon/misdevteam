package chosun.ciis.co.base.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import somo.framework.expt.AppException;

public class SMSSender {
	
	private Connection getConnection() throws Exception{
		
//개발서버에서 사용 : 219.152.29.241
//로컬에서 사용 : 192.9.3.241
		//String ip = "219.152.29.241";
		//String ip = "192.9.3.241";
		String ip = "218.152.29.241";
		
		String url     = "jdbc:jtds:sqlserver://"+ip+":1433/BS_Nosun;tds=8.0"; 
		String driver  = "net.sourceforge.jtds.jdbc.Driver";
		String user    = "sms01";
		String pwd     = "pwsms01";
		System.out.println("getConnection("+url+","+user+","+pwd+")");
		Class.forName(driver); 
		System.out.println("driver::"+driver);
		return DriverManager.getConnection(url, user, pwd);
	}
	
	public void send_one(String sm_rvmbno, String sm_sdmbno, String sm_msg, String sm_code2) throws AppException{
		Connection con = null;
		try{
			con = getConnection();
			System.out.println("getConnection sucess");
			con.setAutoCommit(false);
			
			StringBuffer sqlIns = new StringBuffer();
			sqlIns.append(" INSERT INTO SMS ( ");
			sqlIns.append("		Sm_InDate	");
			sqlIns.append("	   ,Sm_RvMbNo	");
			sqlIns.append("    ,Sm_SdMbNo	");
			sqlIns.append("    ,Sm_Msg		");
			sqlIns.append("    ,Sm_Code2	");
			sqlIns.append(" )  VALUES (     ");
			sqlIns.append("     getdate()	");
			sqlIns.append("    ,?			");
			sqlIns.append("    ,?			");
			sqlIns.append("    ,?			");
			sqlIns.append("	   ,?			");
			sqlIns.append(" )				");
			System.out.println("sqlIns::"+sqlIns.toString());
			PreparedStatement pstmt_ins = con.prepareStatement(sqlIns.toString());
			//System.out.println(pstmt_ins);
			pstmt_ins.clearParameters();
			int indx = 0;
			pstmt_ins.setString(++indx, StringUtil.strip(sm_rvmbno, "-"));
			pstmt_ins.setString(++indx, StringUtil.strip(sm_sdmbno, "-"));
			pstmt_ins.setString(++indx, sm_msg);
			pstmt_ins.setString(++indx, sm_code2);
			System.out.println(sm_msg);
			pstmt_ins.executeUpdate();
			System.out.println("sms end");
			pstmt_ins.close();
			con.commit();
			
		}catch(Exception e){
			System.out.println("sms Exception::"+e);
			try{
				if(con != null) con.rollback();
			}catch(Exception ignore){}
			throw new AppException(e.getLocalizedMessage());
			
		}finally{
			try{
				if(con != null) con.close(); 
			}catch(Exception ignore){}
		}
	}
	public void send(String sm_rvmbno, String[] sm_sdmbno, String sm_msg, String sm_code2) throws AppException{
		System.out.println("send go!!!!");
		Connection con = null;
		try{
			con = getConnection();
			System.out.println("getConnection sucess");
			con.setAutoCommit(false);
			
			StringBuffer sqlIns = new StringBuffer();
			sqlIns.append(" INSERT INTO SMS ( ");
			sqlIns.append("		Sm_InDate	");
			sqlIns.append("	   ,Sm_RvMbNo	");
			sqlIns.append("    ,Sm_SdMbNo	");
			sqlIns.append("    ,Sm_Msg		");
			sqlIns.append("    ,Sm_Code2	");
			sqlIns.append(" )  VALUES (     ");
			sqlIns.append("     getdate()	");
			sqlIns.append("    ,?			");
			sqlIns.append("    ,?			");
			sqlIns.append("    ,?			");
			sqlIns.append("	   ,?			");
			sqlIns.append(" )				");
			System.out.println("sqlIns::"+sqlIns.toString());
			PreparedStatement pstmt_ins = con.prepareStatement(sqlIns.toString());
			System.out.println(pstmt_ins);
			for(int i=0; i<sm_sdmbno.length; i++){
				System.out.println("for go!!");
				pstmt_ins.clearParameters();
				int indx = 0;
				pstmt_ins.setString(++indx, StringUtil.strip(sm_rvmbno, "-"));
				System.out.println("sm_sdmbno"+i+"::"+sm_sdmbno[i]);
				pstmt_ins.setString(++indx, StringUtil.strip(sm_sdmbno[i], "-"));
				pstmt_ins.setString(++indx, sm_msg);
				pstmt_ins.setString(++indx, sm_code2);
				System.out.println(sm_msg);
				pstmt_ins.executeUpdate();
				System.out.println("sms end");
			}
			System.out.println("close");
			pstmt_ins.close();
			con.commit();
			
		}catch(Exception e){
			System.out.println("sms Exception");
			try{
				if(con != null) con.rollback();
			}catch(Exception ignore){}
			throw new AppException(e.getLocalizedMessage());
			
		}finally{
			try{
				if(con != null) con.close(); 
			}catch(Exception ignore){}
		}
	}	
}
