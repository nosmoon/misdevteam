/***************************************************************************************************
 * ���ϸ� : SE_RCP_2300DAO.java
 * ��� : �Ⱓ�������Ա���Ȳ
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
public class SE_RCP_2300DAO {
	
	public SE_RCP_2310_LDataSet se_rcp_2310_l(SE_RCP_2310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2310_LDataSet ds = (SE_RCP_2310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
