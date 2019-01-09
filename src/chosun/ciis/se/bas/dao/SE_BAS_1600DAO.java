/***************************************************************************************************
* ���ϸ� : SE_BAS_1600DAO.java
 * ��� : �Ǹ� - �������� - �ҳ����Է�����
 * �ۼ����� : 2009-07-17
 * �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */
public class SE_BAS_1600DAO {
	
	public SE_BAS_1600_MDataSet se_bas_1600_m(SE_BAS_1600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BAS_1600_MDataSet ds = (SE_BAS_1600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BAS_1610_LDataSet se_bas_1610_l(SE_BAS_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BAS_1610_LDataSet ds = (SE_BAS_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BAS_1620_UDataSet se_bas_1620_u(SE_BAS_1620_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BAS_1620_UDataSet ds = (SE_BAS_1620_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
