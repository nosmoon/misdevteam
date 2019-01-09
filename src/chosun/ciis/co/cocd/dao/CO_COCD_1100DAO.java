/***************************************************************************************************
 * 파일명 : CO_COCD_1100DAO.java
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

import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class CO_COCD_1100DAO {
	
	public CO_COCD_1100_MDataSet co_cocd_1100_m(CO_COCD_1100_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1100_MDataSet ds 	= (CO_COCD_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public CO_COCD_1110_LDataSet co_cocd_1110_l(CO_COCD_1110_LDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1110_LDataSet ds 	= (CO_COCD_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	public CO_COCD_1120_LDataSet co_cocd_1120_l(CO_COCD_1120_LDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1120_LDataSet ds 	= (CO_COCD_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
}
