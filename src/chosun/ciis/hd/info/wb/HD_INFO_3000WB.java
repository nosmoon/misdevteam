/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.info.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.edu.dao.HD_EDU_1000DAO;
import chosun.ciis.hd.info.dao.HD_INFO_3000DAO;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2001_ADataSet;
import oracle.sql.*;
import oracle.jdbc.*;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Clob;
import java.sql.CallableStatement;
import java.io.Writer;
import java.io.Reader;
import java.io.CharArrayReader;
import weblogic.jdbc.wrapper.Statement;
/**
 * 
 */

public class HD_INFO_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

   
    public void hd_info_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_3000_LDataSet ds = null;
		HD_INFO_3000_LDM dm = new HD_INFO_3000_LDM();

		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no 		= Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd 		= Util.checkString(req.getParameter("dept_cd"));
		dm.office_clsf 	= Util.checkString(req.getParameter("office_clsf"));

		ds = (HD_INFO_3000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_info_3001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_3001_MDataSet ds = null;
    	HD_INFO_3001_MDM dm = new HD_INFO_3001_MDM();
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	ds = (HD_INFO_3001_MDataSet)manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	
    	req.setAttribute("ds", ds);
    }
    
	public void hd_info_3010_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	long start_tm = System.currentTimeMillis();
    	
    	HD_INFO_3010_SDataSet ds = null;
		HD_INFO_3010_SDM dm = new HD_INFO_3010_SDM();

		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no 		= Util.checkString(req.getParameter("emp_no"));
		dm.info_clsf 	= Util.checkString(req.getParameter("info_clsf"));
		
		dm.print();
		
		ds = (HD_INFO_3010_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_info_3020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
    	HD_INFO_3020_ADataSet ds = null;
		HD_INFO_3020_ADM dm = new HD_INFO_3020_ADM();

		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode 			= Util.checkString(req.getParameter("mode"));
		dm.emp_no 			= Util.checkString(req.getParameter("emp_no"));
		dm.info_clsf 		= Util.checkString(req.getParameter("info_clsf"));
		dm.cont			    = req.getParameter("cont");
		//dm.setCont(StringUtil.replaceToXml(cont));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
		
        dm.print();
        
        
        
        
//        HD_INFO_3000DAO  edudao = new HD_INFO_3000DAO(); 
//		edudao.hd_info_3020_a(dm);
//        //ds = (HD_INFO_3020_ADataSet)manager.executeCall(dm);
//		
	    //DBManager manager = null;
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement opstmt = null;
		
		String query1 = "INSERT INTO TAHDD_PER_INFO (CMPY_CD,EMP_NO,INFO_CLSF,INCMG_PERS_IPADD,INCMG_PERS,INCMG_DT_TM,CHG_PERS,CHG_DT_TM,CONT) VALUES ( ?,?,?,?,?,SYSDATE,?,SYSDATE,empty_clob())";
		String query2 = "select CONT from TAHDD_PER_INFO where cmpy_cd = ? and emp_no = ? and info_clsf = ? for update";
		String query3 = "delete from TAHDD_PER_INFO where cmpy_cd = ? and emp_no = ? and info_clsf = ? ";
		String query4 = "update TAHDD_PER_INFO set cont = empty_clob() where cmpy_cd = ? and emp_no = ? and info_clsf = ? ";
	    try{
	    	/*입력수정시*/
	    	if("I".equals(dm.getMode()) || "U".equals(dm.getMode())){
			    //manager = new DBManager("MISHDL");
				manager.getConnection();
				manager.m_conn.setAutoCommit(false);
			
				/*입력모드*/
		    	if("I".equals(dm.getMode())){					
					opstmt = manager.m_conn.prepareStatement(query1);
					opstmt.setString(1, dm.cmpy_cd);
					opstmt.setString(2, dm.emp_no);
					opstmt.setString(3, dm.info_clsf);
					opstmt.setString(4, dm.incmg_pers_ipadd);
					opstmt.setString(5, dm.incmg_pers);
					opstmt.setString(6, dm.incmg_pers);
					opstmt.executeUpdate();
					opstmt.close();
		    	}
		    	if("U".equals(dm.getMode())){					
					opstmt = manager.m_conn.prepareStatement(query4);
					opstmt.setString(1, dm.cmpy_cd);
					opstmt.setString(2, dm.emp_no);
					opstmt.setString(3, dm.info_clsf);
					opstmt.executeUpdate();
					opstmt.close();
		    	}
		    	/*입력,수정 모드*/
		    	if("I".equals(dm.getMode()) || "U".equals(dm.getMode())){
					opstmt = manager.m_conn.prepareStatement(query2);
					opstmt.setString(1, dm.cmpy_cd);
					opstmt.setString(2, dm.emp_no);
					opstmt.setString(3, dm.info_clsf);
					rs = opstmt.executeQuery();
	
			        if(rs.next()){ 
			        	  //Clob clob= rs.getClob("cont"); //(oracle.sql.CLOB)(rs).getClob(1);
			              CLOB clob=((OracleResultSet)rs).getCLOB("CONT");
			              Writer writer = clob.getCharacterOutputStream();
			        	//  Writer writer = ((weblogic.jdbc.common.OracleClob)clob).getCharacterOutputStream(); 
			              Reader src = new CharArrayReader(dm.cont.toCharArray());
			              char[] buffer = new char[1024];
			              int read = 0;
			              System.out.println("11111111");
			              while ((read = src.read(buffer, 0, 1024)) != -1 ){
			            	  writer.write(buffer,0,read);
			              }
			              src.close();
			              writer.close();	
				    } 
			        rs.close();
		    	}
		        manager.m_conn.commit();
		        manager.m_conn.setAutoCommit(true);
		        opstmt.close();
					
			    
			    
	       		CallableStatement cstmt1 = null;
	           	StringBuffer sql = new StringBuffer();
	           	sql.append(" call MISHDL.SP_HD_INFO_3030_U(? ,? ,?)  ");//특수문자 업데이트
	           	cstmt1 = manager.m_conn.prepareCall(sql.toString());
	           	cstmt1.setString(1, dm.cmpy_cd);
	           	cstmt1.setString(2, dm.emp_no);
	           	cstmt1.setString(3, dm.info_clsf);
	           	cstmt1.executeUpdate();
	           	cstmt1.close();
	    	
	    	}
	    	
	    	/*삭제모드*/
	    	if("D".equals(dm.getMode())){
			    //manager = new DBManager("MISHDL");
				manager.getConnection();
				manager.m_conn.setAutoCommit(false);
				opstmt = manager.m_conn.prepareStatement(query3);
				opstmt.setString(1, dm.cmpy_cd);
				opstmt.setString(2, dm.emp_no);
				opstmt.setString(3, dm.info_clsf);
				opstmt.executeUpdate();
				manager.m_conn.commit();
				manager.m_conn.setAutoCommit(true);
				opstmt.close();
	    	}
	    } catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		manager.disConnection();
		
		
	}
}
