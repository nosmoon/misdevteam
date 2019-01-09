/***************************************************************************************************
 * 파일명 : SSAdmin1600WB.java
 * 기능 : 우편번호 관리를 위한 Worker Bean
 * 작성일자 : 2009-04-27
 * 작성자 :  권정윤
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.wb;

import javax.servlet.http.*;

import somo.framework.expt.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.dao.*;

/**
 * 관리자-지국월마감을 위한 WB
 */

public class SSAdmin1800WB {

	public void executeSQLwrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_A_SQL_EXECUTE_WRKDataSet ds = null;
		String sql_nm = Util.checkString(req.getParameter("sql_nm"));
		String sql_text = Util.checkString(req.getParameter("sql_text"));
		String dml_flag = Util.checkString(req.getParameter("dml_flag"));
		String db_nm = Util.checkString(req.getParameter("db_flag"));
		String uid = Util.getSessionParameterValue(req, "uid", true);
		String ipaddr = req.getRemoteAddr();

		String sql_text2 = sql_text.replaceAll("S#ELECT", "SELECT");
		sql_text2 = sql_text2.replaceAll("F#ROM", "FROM");
		sql_text2 = sql_text2.replaceAll("W#HERE", "WHERE");
		sql_text2 = sql_text2.replaceAll("U#PDATE", "UPDATE");
		sql_text2 = sql_text2.replaceAll("S#ET", "SET");
		sql_text2 = sql_text2.replaceAll("I#NSERT", "INSERT");
		sql_text2 = sql_text2.replaceAll("I#NTO", "INTO");
		sql_text2 = sql_text2.replaceAll("V#ALUES", "VALUES");
		sql_text2 = sql_text2.replaceAll("D#ELETE", "DELETE");
		sql_text2 = sql_text2.replaceAll("O#RDER", "ORDER");
		sql_text2 = sql_text2.replaceAll("G#ROUP", "GROUP");
		sql_text2 = sql_text2.replaceAll("H#AVING", "HAVING");
		sql_text2 = sql_text2.replaceAll("/#", "/");
        
        SS_A_SQL_EXECUTE_WRKDM dm = new SS_A_SQL_EXECUTE_WRKDM();
        dm.setProgram_id("10");
        dm.setAccflag("I");
        dm.setSql_nm(sql_nm);
        dm.setSql_text(sql_text2);
        dm.setDml_flag(dml_flag);
        dm.setDb_nm(db_nm);
        dm.setIncmgpers(uid);
        dm.setIpaddr(ipaddr);
        
        dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();
		// DAO 객체의 dwloadInfoexg 호출
        
		ds = dao.executeSQLwrk(dm);
        req.setAttribute("ds", ds);
	}
	
	public void executeSQLList(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_SQL_EXECUTE_LISTDataSet ds = null;
        // Request Parameter Processing
    	
    	String uid = Util.getSessionParameterValue(req, "uid", true);

        // DM Setting
    	SS_L_SQL_EXECUTE_LISTDM dm = new SS_L_SQL_EXECUTE_LISTDM();
        
        dm.setIncmgpers(uid);
       
        dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.executeSQLList(dm);
        req.setAttribute("ds", ds);
    }
	
	public void executeSQLDwload(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_SQL_EXECUTE_DWLOADDataSet ds = null;
        // Request Parameter Processing
    	
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	String execute_dt = Util.checkString(req.getParameter("execute_dt"));
		String sql_seq = Util.checkString(req.getParameter("sql_seq"));
		String ipaddr = req.getRemoteAddr();

        // DM Setting
    	SS_L_SQL_EXECUTE_DWLOADDM dm = new SS_L_SQL_EXECUTE_DWLOADDM();
        
    	dm.setExecute_dt(execute_dt);
    	dm.setSql_seq(sql_seq);
        dm.setIncmgpers(uid);
        dm.setIpaddr(ipaddr);
       
        dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.executeSQLDwload(dm);
        req.setAttribute("ds", ds);
    }
	
	public void executeSQLSample(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_SQL_EXECUTE_SAMPLEDataSet ds = null;
        // Request Parameter Processing
    
    	String execute_dt = Util.checkString(req.getParameter("execute_dt"));
		String sql_seq = Util.checkString(req.getParameter("sql_seq"));

        // DM Setting
		SS_L_SQL_EXECUTE_SAMPLEDM dm = new SS_L_SQL_EXECUTE_SAMPLEDM();
        
    	dm.setExecute_dt(execute_dt);
    	dm.setSql_seq(sql_seq);
       
        dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.executeSQLSample(dm);
        req.setAttribute("ds", ds);
    }	
	
	public void selectSQLquerylist(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_L_SQL_EXECUTE_QUERYLISTDataSet ds = null;
        // Request Parameter Processing
    
		String uid = Util.getSessionParameterValue(req, "uid", true);

        // DM Setting
		SS_L_SQL_EXECUTE_QUERYLISTDM dm = new SS_L_SQL_EXECUTE_QUERYLISTDM();
        
    	dm.setIncmgpers(uid);
    	
        dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.selectSQLquerylist(dm);
        req.setAttribute("ds", ds);
    }
	
	public void detailSQLquerylist(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_S_SQL_EXECUTE_QUERYLISTDataSet ds = null;
        // Request Parameter Processing
    
		String uid = Util.getSessionParameterValue(req, "uid", true);
		String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
		SS_S_SQL_EXECUTE_QUERYLISTDM dm = new SS_S_SQL_EXECUTE_QUERYLISTDM();
        
    	dm.setIncmgpers(uid);
    	dm.setSeq(seq);
    	
        dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.detailSQLquerylist(dm);
        req.setAttribute("ds", ds);
    }
	
	public void insertSQLquerylist(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_A_SQL_EXECUTE_QUERYLISTDataSet ds = null;
        // Request Parameter Processing
    
		String uid = Util.getSessionParameterValue(req, "uid", true);
		String seq = Util.checkString(req.getParameter("seq"));
		String sql_nm = Util.checkString(req.getParameter("sql_nm"));
		String sql_text = Util.checkString(req.getParameter("sql_text"));
		String flag = Util.checkString(req.getParameter("flag"));
		String db_cd = Util.checkString(req.getParameter("db_cd"));

        // DM Setting
		SS_A_SQL_EXECUTE_QUERYLISTDM dm = new SS_A_SQL_EXECUTE_QUERYLISTDM();
        
    	dm.setIncmgpers(uid);
    	dm.setSeq(seq);
    	dm.setSql_nm(sql_nm);
    	dm.setSql_text(sql_text);
    	dm.setFlag(flag);
    	dm.setDb_nm(db_cd);
    	
        dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.insertSQLquerylist(dm);
        req.setAttribute("ds", ds);
    }
	
	public void executeSQLTablelist(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_A_SQL_EXECUTE_TABLELISTDataSet ds = null;
		
		String db_cd = Util.checkString(req.getParameter("db_cd"));
        // DM Setting
		SS_A_SQL_EXECUTE_TABLELISTDM dm = new SS_A_SQL_EXECUTE_TABLELISTDM();
		
		dm.setDb_cd(db_cd);
		dm.print();
        
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.executeSQLTablelist(dm);
        req.setAttribute("ds", ds);
    }
	
	public void executeSQLColumnlist(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_A_SQL_EXECUTE_COLUMNLISTDataSet ds = null;
		
		String db_cd = Util.checkString(req.getParameter("db_cd"));
		String table_name = Util.checkString(req.getParameter("table_name"));
		
        // DM Setting
		SS_A_SQL_EXECUTE_COLUMNLISTDM dm = new SS_A_SQL_EXECUTE_COLUMNLISTDM();
		
		dm.setDb_cd(db_cd);
		dm.setTable_nm(table_name);
		dm.print();
        
		dm.print();
        SSAdmin1800DAO dao = new SSAdmin1800DAO();

        ds = dao.executeSQLColumnlist(dm);
        req.setAttribute("ds", ds);
    }
	
	

/*
	public void executeSQLwrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_A_SQL_EXECUTE_WRKDataSet ds = null;
		String uid = Util.getSessionParameterValue(req, "uid", true);
		String path=req.getRealPath("/aplc_upload/");    //업로드되는 위치 지정
        int sizeLimit = 2*1024*1024;                    //파일용량제한
        
        java.io.FileReader fr = null;
        String frdStr = "";  
        
        try{
        	com.oreilly.servlet.MultipartRequest multi = new com.oreilly.servlet.MultipartRequest(req, path, sizeLimit, "8859_1", new com.oreilly.servlet.multipart.DefaultFileRenamePolicy());
	        java.util.Enumeration formNames = multi.getFileNames();       //파일정보 저장
	        String fname1 = "";
	        
	        if(formNames.hasMoreElements()) {
	    	    String formName1 = (String)formNames.nextElement();
	    	    fname1 = multi.getFilesystemName(formName1);
	        }
	        
	        java.io.File file = new java.io.File(path + "/" + fname1);
	        
	        fr = new java.io.FileReader(file);
        	char[] arr = new char[102400];
        	
        	int len = -1;
        	StringBuffer sb = new StringBuffer();
        	
        	while((len = fr.read(arr)) > 0 ){
        		sb.append(new String(arr,0,len));        		
        	}
        	fr.close();
        	frdStr = sb.toString();
        	
        	System.out.println("=====sql : "+frdStr);
        	
        	SS_A_SQL_EXECUTE_WRKDM dm = new SS_A_SQL_EXECUTE_WRKDM();
            dm.setAccflag("I");
            dm.setSql_nm(fname1);
            dm.setSql_text(frdStr);
            dm.setIncmgpers(uid);
            
            dm.print();
            
            SSAdmin1800DAO dao = new SSAdmin1800DAO();
    		// DAO 객체의 dwloadInfoexg 호출
    		ds = dao.executeSQLwrk(dm);
    		req.setAttribute("ds", ds);
            
        } catch(Exception e) {
        	
        }
	}
*/
}



