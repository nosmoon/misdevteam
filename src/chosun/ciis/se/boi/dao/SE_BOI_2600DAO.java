/***************************************************************************************************
 * ���ϸ� : SE_BOI_2600DAO.java
 * ��� : �ؾ���� - �������°˻�
 * �ۼ����� : 2009-05-29
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */
public class SE_BOI_2600DAO {
	
	public SE_BOI_2600_MDataSet se_boi_2600_m(SE_BOI_2600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2600_MDataSet ds = (SE_BOI_2600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2610_LDataSet se_boi_2610_l(SE_BOI_2610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2610_LDataSet ds = (SE_BOI_2610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
