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
public class SE_SAL_2700DAO {
	
	public SE_SAL_2700_MDataSet se_sal_2700_m(SE_SAL_2700_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2700_MDataSet ds = (SE_SAL_2700_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public SE_SAL_2710_LDataSet se_sal_2710_l(SE_SAL_2710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2710_LDataSet ds = (SE_SAL_2710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
		
	
	public SE_SAL_2720_ADataSet se_sal_2720_a(SE_SAL_2720_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2720_ADataSet ds = (SE_SAL_2720_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2730_ADataSet se_sal_2730_a(SE_SAL_2730_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2730_ADataSet ds = (SE_SAL_2730_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}
