/***************************************************************************************************
 * ���ϸ� : SE_RCP_2400DAO.java
 * ��� : �Ⱓ����������Ա�����
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
public class SE_RCP_2400DAO {
	
	public SE_RCP_2400_MDataSet se_rcp_2400_m(SE_RCP_2400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2400_MDataSet ds = (SE_RCP_2400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_2410_LDataSet se_rcp_2410_l(SE_RCP_2410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2410_LDataSet ds = (SE_RCP_2410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
