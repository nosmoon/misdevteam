/***************************************************************************************************
 * ���ϸ� : SE_BOI_2700DAO.java
 * ��� : �Ѵ���������
 * �ۼ����� : 2014-12-02
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
public class SE_BOI_2700DAO {
	
	public SE_BOI_2700_MDataSet se_boi_2700_m(SE_BOI_2700_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2700_MDataSet ds = (SE_BOI_2700_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2710_LDataSet se_boi_2710_l(SE_BOI_2710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2710_LDataSet ds = (SE_BOI_2710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2720_SDataSet se_boi_2720_s(SE_BOI_2720_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2720_SDataSet ds = (SE_BOI_2720_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
