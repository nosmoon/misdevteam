/***************************************************************************************************
 * 파일명 : CO_COCD_1600DAO.java
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

package chosun.ciis.co.cocd.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;



/**
 * 
 */
public class CO_COCD_1600DAO {
	
	public CO_COCD_1600_MDataSet co_cocd_1600_m(CO_COCD_1600_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1600_MDataSet ds 	= (CO_COCD_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_COCD_1610_LDataSet co_cocd_1610_l(CO_COCD_1610_LDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1610_LDataSet ds 	= (CO_COCD_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_COCD_1620_ADataSet co_cocd_1620_a(CO_COCD_1620_ADM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1620_ADataSet ds 	= (CO_COCD_1620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_COCD_1640_LDataSet co_cocd_1640_l(CO_COCD_1640_LDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1640_LDataSet ds 	= (CO_COCD_1640_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_COCD_1650_ADataSet co_cocd_1650_a(CO_COCD_1650_ADM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1650_ADataSet ds 	= (CO_COCD_1650_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    
}
