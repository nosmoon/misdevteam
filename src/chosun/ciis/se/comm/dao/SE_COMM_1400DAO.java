/***************************************************************************************************
 * ���ϸ� : SE_COMM_1000DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.comm.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */
public class SE_COMM_1400DAO {
	
	public SE_COMM_1405_SDataSet se_comm_1405_s(SE_COMM_1405_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_COMM_1405_SDataSet ds = (SE_COMM_1405_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    public SE_COMM_1410_LDataSet se_comm_1410_l(SE_COMM_1410_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_COMM_1410_LDataSet ds = (SE_COMM_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
