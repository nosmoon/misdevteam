/***************************************************************************************************
* ���ϸ� : SE_SAL_2600DAO.java
* ��� : �Ǹ� - ������� - �ܰǰ�꼭���
* �ۼ����� : 2009-07-20
* �ۼ��� : ��â��
***************************************************************************************************/
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
public class SE_SAL_2800DAO {
	
	public SE_SAL_2800_LDataSet se_sal_2800_l(SE_SAL_2800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2800_LDataSet ds = (SE_SAL_2800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public SE_SAL_2810_LDataSet se_sal_2810_l(SE_SAL_2810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2810_LDataSet ds = (SE_SAL_2810_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public SE_SAL_2815_LDataSet se_sal_2815_l(SE_SAL_2815_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2815_LDataSet ds = (SE_SAL_2815_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}		
	public SE_SAL_2820_ADataSet se_sal_2820_a(SE_SAL_2820_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2820_ADataSet ds = (SE_SAL_2820_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}		
}
