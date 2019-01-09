/***************************************************************************************************
 * ���ϸ� : SE_RCP_2200DAO.java
 * ��� : ���������Ա���Ȳ
 * �ۼ����� : 2009-04-22
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
public class SE_RCP_2200DAO {
	
	public SE_RCP_2200_MDataSet se_rcp_2200_m(SE_RCP_2200_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2200_MDataSet ds = (SE_RCP_2200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_2210_LDataSet se_rcp_2210_l(SE_RCP_2210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2210_LDataSet ds = (SE_RCP_2210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
