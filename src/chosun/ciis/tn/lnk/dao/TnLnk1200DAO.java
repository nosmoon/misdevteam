/***************************************************************************************************
 * 파일명 : TnLnk1200DAO.java
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

package chosun.ciis.tn.lnk.dao;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class TnLnk1200DAO {
	 
    public TN_LNK_1210_LDataSet tn_lnk_1210_l(TN_LNK_1210_LDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
        TN_LNK_1210_LDataSet ds = (TN_LNK_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public TN_LNK_1220_DDataSet tn_lnk_1220_d(TN_LNK_1220_DDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
    	TN_LNK_1220_DDataSet ds = (TN_LNK_1220_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
     
    public TN_LNK_1250_SDataSet tn_lnk_1250_s(TN_LNK_1250_SDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
        TN_LNK_1250_SDataSet ds = (TN_LNK_1250_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public TN_LNK_1251_LDataSet tn_lnk_1251_l(TN_LNK_1251_LDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
    	TN_LNK_1251_LDataSet ds = (TN_LNK_1251_LDataSet) manager.executeCall(dm);
    	
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }

        return ds;
    }   
    public TN_LNK_1252_ADataSet tn_lnk_1252_a(TN_LNK_1252_ADM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
    	TN_LNK_1252_ADataSet ds = (TN_LNK_1252_ADataSet) manager.executeCall(dm);
    	
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }

        return ds;
    } 
    
	public TN_LNK_1253_ADataSet tn_lnk_1253_a(TN_LNK_1253_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_1253_ADataSet ds = (TN_LNK_1253_ADataSet) manager.executeCall(dm);		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
}
