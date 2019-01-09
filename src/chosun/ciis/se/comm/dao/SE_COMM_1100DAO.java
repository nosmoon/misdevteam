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
public class SE_COMM_1100DAO {
	
	public SE_COMM_1100_MDataSet se_comm_1100_m(SE_COMM_1100_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_COMM_1100_MDataSet ds = (SE_COMM_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_COMM_1105_SDataSet se_comm_1105_s(SE_COMM_1105_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_COMM_1105_SDataSet ds = (SE_COMM_1105_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    public SE_COMM_1110_LDataSet se_comm_1110_l(SE_COMM_1110_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_COMM_1110_LDataSet ds = (SE_COMM_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_COMM_1120_LDataSet se_comm_1120_l(SE_COMM_1120_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_COMM_1120_LDataSet ds = (SE_COMM_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
