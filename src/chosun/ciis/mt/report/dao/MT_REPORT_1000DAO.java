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

package chosun.ciis.mt.report.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.report.dm.*;
import chosun.ciis.mt.report.ds.*;

/**
 * 
 */ 
public class MT_REPORT_1000DAO {
	public MT_REPORT_1105_PDataSet mt_report_1105_p(MT_REPORT_1105_PDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_REPORT_1105_PDataSet ds = (MT_REPORT_1105_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
 
