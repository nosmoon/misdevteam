package chosun.ciis.pr.sendmg.dao;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import java.util.ArrayList;

import oracle.jdbc.OracleResultSet;
import java.sql.ResultSet;

import oracle.sql.BLOB;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.co.decid.ds.CO_DECID_2000_IDataSet;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */ 
 
public class PR_SENDMG_1000DAO { 

	
	public PR_SENDMG_1000_LDataSet pr_sendmg_1000_l(PR_SENDMG_1000_LDM dm) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
        
		PR_SENDMG_1000_LDataSet ds = (PR_SENDMG_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public ArrayList pr_sendmg_1020_bs(PR_SENDMG_1020_LDM dm) throws AppException {
		DBManager manager_bs	= new DBManager("MISBS");
		ResultSet rs			= null;
        Statement stmt			= null;
        ArrayList list			= new ArrayList();
        
		try {
			manager_bs.getConnection();
            
            // 발송데이터 구하기
           	stmt = manager_bs.m_conn.createStatement();
           
           	String sql =	" SELECT AA.JBINCODE " +
           			" , ( " +
			"	SELECT LEFT(REPLACE(CONVERT(VARCHAR, MIN(JBBALCHA), 108), ':',''), 4) FROM JIGUKBAE AAA " +
			"	WHERE AAA.JBBHDATE = '" + dm.getIssu_dt() + "' " +
			"	AND JBBALCHA IS NOT NULL " +
			"	AND AAA.JBINCODE = AA.JBINCODE " +
			" ) AS JBBALCHA " +
			" ,( " +
			"	SELECT TOP 1 BBB.NONAME FROM JIGUKBAE AAA " +
			"	LEFT OUTER JOIN NOSUN BBB ON AAA.JBNCODE = BBB.nocode " +
			"	WHERE AAA.JBBHDATE = '" + dm.getIssu_dt() + "' " +
			"	AND JBBALCHA IS NOT NULL " +
			"	AND AAA.JBINCODE = AA.JBINCODE " +
			"	ORDER BY JBBALCHA " +
			" ) AS JBBALCHA_JBCODE " +
			" , ( " +
			"	SELECT LEFT(REPLACE(CONVERT(VARCHAR, MAX(JBDOTIME), 108), ':',''), 4) FROM JIGUKBAE AAA " +
			"	WHERE AAA.JBBHDATE = '" + dm.getIssu_dt() + "' " +
			"	AND JBDOTIME IS NOT NULL " +
			"	AND AAA.JBINCODE = AA.JBINCODE " +
			" ) AS JBDOTIME " +
			" , ( " +
			"	SELECT TOP 1 BBB.NONAME FROM JIGUKBAE AAA " +
			"	LEFT OUTER JOIN NOSUN BBB ON AAA.JBNCODE = BBB.nocode " +
			"	WHERE AAA.JBBHDATE = '" + dm.getIssu_dt() + "' " +
			"	AND JBDOTIME IS NOT NULL " +
			"	AND AAA.JBINCODE = AA.JBINCODE " +
			"	ORDER BY JBDOTIME DESC " +
			" ) AS JBDOTIME_JBCODE " +
			" FROM ( " +
			"	SELECT DISTINCT JBINCODE, JBBHDATE FROM JIGUKBAE" +
			" 	WHERE JBBHDATE = '" + dm.getIssu_dt() + "' " +
			" ) AA " +
			" WHERE AA.JBBHDATE = '" + dm.getIssu_dt() + "' " +
			" AND AA.JBINCODE NOT IN ('60','72') " +
			" ORDER BY AA.JBINCODE ";

           	System.out.println(sql);
            rs = (ResultSet)stmt.executeQuery(sql);
            
            System.out.println("loop START!!");
            while(rs.next()) {
            	PR_SENDMG_1020_LCURLIST4Record rec = new PR_SENDMG_1020_LCURLIST4Record();
            	
            	rec.jbincode		= Util.checkString(rs.getString("JBINCODE"));
            	rec.jbbalcha		= Util.checkString(rs.getString("JBBALCHA"));
            	rec.jbbalcha_jbcode	= Util.checkString(rs.getString("JBBALCHA_JBCODE"));
            	rec.jbdotime		= Util.checkString(rs.getString("JBDOTIME"));
            	rec.jbdotime_jbcode	= Util.checkString(rs.getString("JBDOTIME_JBCODE"));

            	list.add(rec);
            }
		} catch (Exception e) {
        	try{
        		if (rs != null){
        			rs.close();
        		}
        		if (stmt!= null){
        			stmt.close();
        		}
        		if (manager_bs.m_conn != null){
        			manager_bs.m_conn.close();
        		}
     	   	}catch(SQLException se){
     	   		throw new SysException(se);
     	   	}
     	   manager_bs.disConnection();
     	   	throw new SysException(e);
        }
		return list;
	}
	
	public PR_SENDMG_1001_LDataSet pr_sendmg_1001_l(PR_SENDMG_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_SENDMG_1001_LDataSet ds = (PR_SENDMG_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_SENDMG_1010_ADataSet pr_sendmg_1010_a(PR_SENDMG_1010_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_SENDMG_1010_ADataSet ds = (PR_SENDMG_1010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_SENDMG_1020_LDataSet pr_sendmg_1020_l(PR_SENDMG_1020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_SENDMG_1020_LDataSet ds = (PR_SENDMG_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_SENDMG_1021_LDataSet pr_sendmg_1021_l(PR_SENDMG_1021_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_SENDMG_1021_LDataSet ds = (PR_SENDMG_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_SENDMG_1030_ADataSet pr_sendmg_1030_a(PR_SENDMG_1030_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_SENDMG_1030_ADataSet ds = (PR_SENDMG_1030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_SENDMG_1039_LDataSet pr_sendmg_1039_l(PR_SENDMG_1039_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISBS");
		
        String tempSeq		= "";
        String stroccr_dt	= "";
        String strseq		= "";
        ResultSet rs		= null;
        Statement stmt		= null;
        
        PR_SENDMG_1039_LDataSet ds = new PR_SENDMG_1039_LDataSet();
		
        try {        	
            manager.getConnection();
            // 발송데이터 구하기
           	stmt = manager.m_conn.createStatement();
           
           	String sql =	" SELECT cprdate " +
               		", cdmedia " +
               		", cpansu " + 
               		", cdcntry " + 
               		", iseqno " + 
               		", ifdno " +
               		", cnmedia " + 
               		", cncntry " + 
               		", iprpage " + 
               		", cprout " + 
               		", cprfin " +
               		", lhdbusu " +
               		", laddbusu " +
               		", lprbusu " +
               		", lbabusu " +
               		", laddo " +
               		", lmins " +
               		", cdfact " +
               		", ctrans " +
               		", inpause " +
               		", crpause " +
               		", inabn " +
               		", crabn " +
               		", cpabn " +
               		", idanres1 " +
               		", ijungres1 " +
               		", idanres2 " +
               		", ijungres2 " +
               		", cdummy " +
               		"  FROM PRESULT " +
	               	" WHERE cprdate     = '" + dm.getPr_dt() + "' " +
	               	" ORDER BY cdmedia, cpansu, cdcntry ";

               	System.out.println(sql);
            rs = (ResultSet)stmt.executeQuery(sql);
            
            System.out.println("loop START!!");
            while(rs.next()) {
            	PR_SENDMG_1039_LCURLISTRecord rec = new PR_SENDMG_1039_LCURLISTRecord();
            	
            	rec.cprdate		= Util.checkString(rs.getString("cprdate"));
            	rec.cdmedia		= Util.checkString(rs.getString("cdmedia"));
            	rec.cpansu		= Util.checkString(rs.getString("cpansu"));
            	rec.cdcntry		= Util.checkString(rs.getString("cdcntry"));
            	rec.iseqno		= Util.checkString(rs.getString("iseqno"));
            	rec.ifdno		= Util.checkString(rs.getString("ifdno"));
            	rec.cnmedia		= Util.checkString(rs.getString("cnmedia"));
            	rec.cncntry		= Util.checkString(rs.getString("cncntry"));
            	rec.iprpage		= Util.checkString(rs.getString("iprpage"));
            	rec.cprout		= Util.checkString(rs.getString("cprout"));
            	rec.cprfin		= Util.checkString(rs.getString("cprfin"));
            	rec.lhdbusu		= Util.checkString(rs.getString("lhdbusu"));
            	rec.laddbusu	= Util.checkString(rs.getString("laddbusu"));
            	rec.lprbusu		= Util.checkString(rs.getString("lprbusu"));
            	rec.lbabusu		= Util.checkString(rs.getString("lbabusu"));
            	rec.laddo		= Util.checkString(rs.getString("laddo"));
            	rec.lmins		= Util.checkString(rs.getString("lmins"));
            	rec.cdfact		= Util.checkString(rs.getString("cdfact"));
            	rec.ctrans		= Util.checkString(rs.getString("ctrans"));
            	rec.inpause		= Util.checkString(rs.getString("inpause"));
            	rec.crpause		= Util.checkString(rs.getString("crpause"));
            	rec.inabn		= Util.checkString(rs.getString("inabn"));
            	rec.crabn		= Util.checkString(rs.getString("crabn"));
            	rec.cpabn		= Util.checkString(rs.getString("cpabn"));
            	rec.idanres1	= Util.checkString(rs.getString("idanres1"));
            	rec.ijungres1	= Util.checkString(rs.getString("ijungres1"));
            	rec.idanres2	= Util.checkString(rs.getString("idanres2"));
            	rec.ijungres2	= Util.checkString(rs.getString("ijungres2"));
            	rec.cdummy		= Util.checkString(rs.getString("cdummy"));
            	
               	
               	
           		ds.curlist.add(rec);
            }
            System.out.println("loop end!!");
            
            rs.close();
           	stmt.close();
            manager.disConnection();
            return ds;
            
        } catch (Exception e) {
        	e.printStackTrace();
        	try{
        		if (rs != null){
        			rs.close();
        		}
        		if (stmt!= null){
        			stmt.close();
        		}
        		if (manager.m_conn != null){
     		   		manager.m_conn.close();
        		}
     	   	}catch(SQLException se){
     	   		throw new SysException(se);
     	   	}
     	   	manager.disConnection();
     	   	throw new SysException(e);
        }
	}

	public PR_SENDMG_1040_ADataSet pr_sendmg_1040_a(PR_SENDMG_1040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_SENDMG_1040_ADataSet ds = (PR_SENDMG_1040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_SENDMG_1050_ADataSet pr_sendmg_1050_a(PR_SENDMG_1050_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_SENDMG_1050_ADataSet ds = (PR_SENDMG_1050_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}