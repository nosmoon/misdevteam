/***************************************************************************************************
 * ���ϸ� : SE_RCP_4400DAO.java
 * ��� : ������������(������)���
 * �ۼ����� : 2009-05-18
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */
public class SE_RCP_4400DAO {
	
	public SE_RCP_4400_MDataSet se_rcp_4400_m(SE_RCP_4400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4400_MDataSet ds = (SE_RCP_4400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4410_LDataSet se_rcp_4410_l(SE_RCP_4410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4410_LDataSet ds = (SE_RCP_4410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4420_ADataSet se_rcp_4420_a(SE_RCP_4420_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4420_ADataSet ds = (SE_RCP_4420_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_RCP_4430_ADataSet se_rcp_4430_a(SE_RCP_4430_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4430_ADataSet ds = (SE_RCP_4430_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
