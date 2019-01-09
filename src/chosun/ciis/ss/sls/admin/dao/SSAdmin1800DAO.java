/***************************************************************************************************
* 파일명 : SSAdmin1600EJB.java
* 기능 : 관리자-담당별 우편번호 변경처리를 위한 DAO
* 작성일자 : 2009-04-28
* 작성자 : 권정윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dao;

import java.io.IOException;

import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

import somo.framework.db.*;
import somo.framework.expt.*;

/**
 * 관리자-담당별 우편번호 변경처리를 위한 DAO
 */

public class SSAdmin1800DAO {
    
    public SS_A_SQL_EXECUTE_WRKDataSet executeSQLwrk(SS_A_SQL_EXECUTE_WRKDM dm) throws AppException {
    	System.out.println("DAO dm.getDb_nm():"+dm.getDb_nm());
    	
    	DBManager manager = new DBManager("Oracle");
    	
    	SS_A_SQL_EXECUTE_WRKDataSet ds = (SS_A_SQL_EXECUTE_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        System.out.println("ds load end");
        String dt = ds.getSql_dt();
        String seq = ds.getSql_seq();
        String dml_flag = dm.getDml_flag();
   
    	String db_nm = dm.getDb_nm();
    	String chk = null;
    	if(db_nm.equals("SL")){
    		manager = new DBManager("Oracle");
    		chk = "1";
    	}else if(db_nm.equals("BI")){
    		manager = new DBManager("Billing");
    		chk = "2";
    	}else if(db_nm.equals("SO")){
    		manager = new DBManager("Member");
    		chk = "3";
    	}else if(db_nm.equals("DW")){
    		manager = new DBManager("Crmdw");
    		chk = "4";
    	}
    	System.out.println("chk:"+chk);
        
        
        System.out.println("ds.getSql_dt():"+dt);
        System.out.println("ds.getSql_seq():"+seq);
        System.out.println("dm.getDml_flag():"+dml_flag);
        System.out.println("dm.getDb_nm():"+db_nm);
        
        executeSQL(db_nm, dml_flag, dt, seq);
        return ds;
    }
    
    public void executeSQL(String db_nm, String dml_flag, String dt, String seq) throws AppException {
    	String execString = null;
    	
    	//String execString = "sh /webstore/pub/ciis/batch/SQL_EXECUTE.sql" + 
        //" " + dml_flag + " " + dt + " " + seq + " &";
    	if(db_nm.equals("SL")){
    		execString = "sh /webstore/pub/ciis/batch/SQL_EXECUTE.sql" + 
            " " + dml_flag + " " + dt + " " + seq + " &";
    	}else if(db_nm.equals("BI")){
    		execString = "sh /webstore/pub/ciis/batch/SQL_EXECUTE_BI.sql" + 
            " " + dml_flag + " " + dt + " " + seq + " &";
    	}else if(db_nm.equals("SO")){
    		execString = "sh /webstore/pub/ciis/batch/SQL_EXECUTE_SO.sql" + 
            " " + dml_flag + " " + dt + " " + seq + " &";
    	}else if(db_nm.equals("DW")){
    		execString = "sh /webstore/pub/ciis/batch/SQL_EXECUTE_DW.sql" + 
            " " + dml_flag + " " + dt + " " + seq + " &";
    	}
		System.out.println(execString);
		Runtime run = Runtime.getRuntime();
		try {
			run.exec(execString);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
    }

    public SS_L_SQL_EXECUTE_LISTDataSet executeSQLList(SS_L_SQL_EXECUTE_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SQL_EXECUTE_LISTDataSet ds = (SS_L_SQL_EXECUTE_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_SQL_EXECUTE_DWLOADDataSet executeSQLDwload(SS_L_SQL_EXECUTE_DWLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SQL_EXECUTE_DWLOADDataSet ds = (SS_L_SQL_EXECUTE_DWLOADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_SQL_EXECUTE_SAMPLEDataSet executeSQLSample(SS_L_SQL_EXECUTE_SAMPLEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SQL_EXECUTE_SAMPLEDataSet ds = (SS_L_SQL_EXECUTE_SAMPLEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_SQL_EXECUTE_QUERYLISTDataSet selectSQLquerylist(SS_L_SQL_EXECUTE_QUERYLISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SQL_EXECUTE_QUERYLISTDataSet ds = (SS_L_SQL_EXECUTE_QUERYLISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_S_SQL_EXECUTE_QUERYLISTDataSet detailSQLquerylist(SS_S_SQL_EXECUTE_QUERYLISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_SQL_EXECUTE_QUERYLISTDataSet ds = (SS_S_SQL_EXECUTE_QUERYLISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_SQL_EXECUTE_QUERYLISTDataSet insertSQLquerylist(SS_A_SQL_EXECUTE_QUERYLISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_SQL_EXECUTE_QUERYLISTDataSet ds = (SS_A_SQL_EXECUTE_QUERYLISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_SQL_EXECUTE_TABLELISTDataSet executeSQLTablelist(SS_A_SQL_EXECUTE_TABLELISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_SQL_EXECUTE_TABLELISTDataSet ds = (SS_A_SQL_EXECUTE_TABLELISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_SQL_EXECUTE_COLUMNLISTDataSet executeSQLColumnlist(SS_A_SQL_EXECUTE_COLUMNLISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_SQL_EXECUTE_COLUMNLISTDataSet ds = (SS_A_SQL_EXECUTE_COLUMNLISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}