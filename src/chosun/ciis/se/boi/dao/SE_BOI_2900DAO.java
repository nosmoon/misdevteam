/***************************************************************************************************
 * ���ϸ� : SE_BOI_2900DAO.java
 * ��� : ��������뺸
 * �ۼ����� : 2016-11-02
 * �ۼ��� : ������
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */
public class SE_BOI_2900DAO {
	
	public SE_BOI_2900_MDataSet se_boi_2900_m(SE_BOI_2900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2900_MDataSet ds = (SE_BOI_2900_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2910_LDataSet se_boi_2910_l(SE_BOI_2910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2910_LDataSet ds = (SE_BOI_2910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2920_SDataSet se_boi_2920_s(SE_BOI_2920_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2920_SDataSet ds = (SE_BOI_2920_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
