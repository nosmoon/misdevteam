/***************************************************************************************************
 * 파일명 : TnLnk1000DAO.java
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

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class TnLnk1000DAO {

    public TN_LNK_1000_MDataSet tn_lnk_1000_m(TN_LNK_1000_MDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
        TN_LNK_1000_MDataSet ds = (TN_LNK_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public TN_LNK_1010_LDataSet tn_lnk_1010_l(TN_LNK_1010_LDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
        TN_LNK_1010_LDataSet ds = (TN_LNK_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    
    public TN_LNK_1020_SDataSet tn_lnk_1020_s(TN_LNK_1020_SDM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
    	TN_LNK_1020_SDataSet ds = (TN_LNK_1020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public TN_LNK_1030_ADataSet tn_lnk_1030_a(TN_LNK_1030_ADM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
    	TN_LNK_1030_ADataSet ds = (TN_LNK_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    
    public TN_LNK_1040_ADataSet tn_lnk_1040_a(TN_LNK_1040_ADM dm) throws AppException {
    	DBManager manager = new DBManager("MISTNN");
    	TN_LNK_1040_ADataSet ds = (TN_LNK_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
}
