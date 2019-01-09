/***************************************************************************************************
 * ���ϸ� : SE_QTY_1600DAO.java
 * ��� : �μ����� - ������������߼ۺμ���ȸ
 * �ۼ����� : 2009-02-20
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
public class SE_QTY_1600DAO {
	
	public SE_QTY_1600_MDataSet se_qty_1600_m(SE_QTY_1600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1600_MDataSet ds = (SE_QTY_1600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_1610_LDataSet se_qty_1610_l(SE_QTY_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1610_LDataSet ds = (SE_QTY_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
