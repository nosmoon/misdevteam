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
import chosun.ciis.co.cocd.dm.CO_COCD_2000_MDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2000_MDataSet;
import chosun.ciis.co.cocd.dm.CO_COCD_2010_SDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2010_SDataSet;
import chosun.ciis.co.cocd.dm.CO_COCD_2020_SDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2020_SDataSet;
import chosun.ciis.co.cocd.dm.CO_COCD_2030_SDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2030_SDataSet;

/**
 * 
 */
public class CO_COCD_2000DAO {
	
	public CO_COCD_2000_MDataSet co_cocd_2000_m(CO_COCD_2000_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_2000_MDataSet ds 	= (CO_COCD_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_COCD_2010_SDataSet co_cocd_2010_s(CO_COCD_2010_SDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_2010_SDataSet ds 	= (CO_COCD_2010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_COCD_2020_SDataSet co_cocd_2020_s(CO_COCD_2020_SDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_2020_SDataSet ds 	= (CO_COCD_2020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public CO_COCD_2030_SDataSet co_cocd_2030_s(CO_COCD_2030_SDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM"); 
        CO_COCD_2030_SDataSet ds 	= (CO_COCD_2030_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
