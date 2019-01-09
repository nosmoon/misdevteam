/***************************************************************************************************
 * ���ϸ� : SE_RCP_2000DAO.java
 * ��� : �Ա���Ȳ
 * �ۼ����� : 2009-04-15
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
public class SE_RCP_2000DAO {
	
	public SE_RCP_2000_MDataSet se_rcp_2000_m(SE_RCP_2000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2000_MDataSet ds = (SE_RCP_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_2010_LDataSet se_rcp_2010_l(SE_RCP_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2010_LDataSet ds = (SE_RCP_2010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}
