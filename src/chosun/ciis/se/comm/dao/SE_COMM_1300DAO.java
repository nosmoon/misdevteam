/***************************************************************************************************
 * 파일명 : SE_COMM_1000DAO.java
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

package chosun.ciis.se.comm.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */
public class SE_COMM_1300DAO {
	
	public SE_COMM_1305_SDataSet se_comm_1305_s(SE_COMM_1305_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_COMM_1305_SDataSet ds = (SE_COMM_1305_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    public SE_COMM_1310_LDataSet se_comm_1310_l(SE_COMM_1310_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_COMM_1310_LDataSet ds = (SE_COMM_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
