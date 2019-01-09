/***************************************************************************************************
 * 파일명 : CO_COCD_1200DAO.java
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
import chosun.ciis.co.cocd.dm.CO_COCD_1200_MDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1210_LDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1250_MDM;
import chosun.ciis.co.cocd.ds.CO_COCD_1200_MDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1210_LDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1250_MDataSet;


/**
 * 
 */
public class CO_COCD_1200DAO {
	
	public CO_COCD_1200_MDataSet co_cocd_1200_m(CO_COCD_1200_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1200_MDataSet ds 	= (CO_COCD_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public CO_COCD_1210_LDataSet co_cocd_1210_l(CO_COCD_1210_LDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1210_LDataSet ds 	= (CO_COCD_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public CO_COCD_1250_MDataSet co_cocd_1250_m(CO_COCD_1250_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1250_MDataSet ds 	= (CO_COCD_1250_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    
}
