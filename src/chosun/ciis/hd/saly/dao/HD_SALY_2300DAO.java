/***************************************************************************************************
 * ���ϸ� : PilotDAO.java
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

package chosun.ciis.hd.saly.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;
 
/**
 * 
 */
public class HD_SALY_2300DAO {
	
	public HD_SALY_2300_LDataSet hd_saly_2300_l(HD_SALY_2300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2300_LDataSet ds = (HD_SALY_2300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

