/***************************************************************************************************
 * ���ϸ� : SE_RCP_4100DAO.java
 * ��� : ���������Ա�����Ȳ
 * �ۼ����� : 2009-05-11
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
public class SE_RCP_4100DAO {
	
	public SE_RCP_4100_MDataSet se_rcp_4100_m(SE_RCP_4100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4100_MDataSet ds = (SE_RCP_4100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4110_LDataSet se_rcp_4110_l(SE_RCP_4110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4110_LDataSet ds = (SE_RCP_4110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_RCP_4120_LDataSet se_rcp_4120_l(SE_RCP_4120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4120_LDataSet ds = (SE_RCP_4120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4121_LDataSet se_rcp_4121_l(SE_RCP_4121_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4121_LDataSet ds = (SE_RCP_4121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
