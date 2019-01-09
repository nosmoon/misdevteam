/***************************************************************************************************
 * ���ϸ� : SE_QTY_2600DAO.java
 * ��� : �μ����ù���
 * �ۼ����� : 2009-06-01
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.qty.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */
public class SE_QTY_2600DAO {
	
	public SE_QTY_2600_MDataSet se_qty_2600_m(SE_QTY_2600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2600_MDataSet ds = (SE_QTY_2600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
