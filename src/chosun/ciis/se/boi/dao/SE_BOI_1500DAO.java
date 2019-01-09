/***************************************************************************************************
 * ���ϸ� : SE_BOI_1500DAO.java
 * ��� : �������� - �����ּҰ��ù���
 * �ۼ����� : 2009-03-27
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
public class SE_BOI_1500DAO {
	
	public SE_BOI_1500_MDataSet se_boi_1500_m(SE_BOI_1500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1500_MDataSet ds = (SE_BOI_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
