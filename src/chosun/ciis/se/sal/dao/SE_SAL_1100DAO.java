/***************************************************************************************************
* ���ϸ� : SE_SAL_1100DAO.java
* ��� : �Ǹ� - ������� - ������ݰ���
 * �ۼ����� : 2009.03.26
 * �ۼ��� :   ������
***************************************************************************************************
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
                                                                 
                                                                                      
public class SE_SAL_1100DAO {
	
	public SE_SAL_1105_LDataSet se_sal_1105_l(SE_SAL_1105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1105_LDataSet ds = (SE_SAL_1105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1110_LDataSet se_sal_1110_l(SE_SAL_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1110_LDataSet ds = (SE_SAL_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1120_ADataSet se_sal_1120_a(SE_SAL_1120_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1120_ADataSet ds = (SE_SAL_1120_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	
}
