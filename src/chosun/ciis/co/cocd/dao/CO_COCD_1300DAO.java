/***************************************************************************************************
 * 파일명 : CO_COCD_1300DAO.java
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
import chosun.ciis.co.cocd.dm.CO_COCD_1300_MDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1310_LDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1320_IDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1330_UDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1340_DDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1350_MDM;
import chosun.ciis.co.cocd.ds.CO_COCD_1300_MDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1310_LDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1320_IDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1330_UDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1340_DDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1350_MDataSet;


/**
 * 
 */
public class CO_COCD_1300DAO {
	
	public CO_COCD_1300_MDataSet co_cocd_1300_m(CO_COCD_1300_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1300_MDataSet ds 	= (CO_COCD_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public CO_COCD_1310_LDataSet co_cocd_1310_l(CO_COCD_1310_LDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1310_LDataSet ds 	= (CO_COCD_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public CO_COCD_1320_IDataSet co_cocd_1320_i(CO_COCD_1320_IDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1320_IDataSet ds 	= (CO_COCD_1320_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public CO_COCD_1330_UDataSet co_cocd_1330_u(CO_COCD_1330_UDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1330_UDataSet ds 	= (CO_COCD_1330_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public CO_COCD_1340_DDataSet co_cocd_1340_d(CO_COCD_1340_DDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1340_DDataSet ds 	= (CO_COCD_1340_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public CO_COCD_1350_MDataSet co_cocd_1350_m(CO_COCD_1350_MDM dm) throws AppException, SQLException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_COCD_1350_MDataSet ds 	= (CO_COCD_1350_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    
}
