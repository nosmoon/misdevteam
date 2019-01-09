/***************************************************************************************************
 * ���ϸ� : SE_BOI_2300DAO.java
 * ��� : �ؾ���� - ���������̿�
 * �ۼ����� : 2009-05-27
 * �ۼ��� : ��â��
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
public class SE_BOI_2300DAO {
	
	public SE_BOI_2300_MDataSet se_boi_2300_m(SE_BOI_2300_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2300_MDataSet ds = (SE_BOI_2300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2310_LDataSet se_boi_2310_l(SE_BOI_2310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2310_LDataSet ds = (SE_BOI_2310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2320_LDataSet se_boi_2320_l(SE_BOI_2320_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2320_LDataSet ds = (SE_BOI_2320_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2340_ADataSet se_boi_2340_a(SE_BOI_2340_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2340_ADataSet ds = (SE_BOI_2340_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}
