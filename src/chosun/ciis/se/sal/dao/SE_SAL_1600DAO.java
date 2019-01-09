/***************************************************************************************************
* ���ϸ� : SE_SAL_1600DAO.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-14
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_1600_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1610_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1620_UDM;
import chosun.ciis.se.sal.dm.SE_SAL_1630_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1600_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1610_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1620_UDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1630_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
                                                                 
                                                                                      
public class SE_SAL_1600DAO {
	public SE_SAL_1600_MDataSet se_sal_1600_m(SE_SAL_1600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1600_MDataSet ds = (SE_SAL_1600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_SAL_1610_LDataSet se_sal_1610_l(SE_SAL_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1610_LDataSet ds = (SE_SAL_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1620_UDataSet se_sal_1620_u(SE_SAL_1620_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1620_UDataSet ds = (SE_SAL_1620_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1630_ADataSet se_sal_1630_a(SE_SAL_1630_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1630_ADataSet ds = (SE_SAL_1630_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}                                                                               
