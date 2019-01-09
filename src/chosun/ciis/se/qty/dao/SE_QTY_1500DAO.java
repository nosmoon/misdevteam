/***************************************************************************************************
 * ���ϸ� : SE_QTY_1500DAO.java
 * ��� : �μ����� - �����μ�����ڷ�
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
public class SE_QTY_1500DAO {
	
	public SE_QTY_1500_MDataSet se_qty_1500_m(SE_QTY_1500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1500_MDataSet ds = (SE_QTY_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_1510_LDataSet se_qty_1510_l(SE_QTY_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1510_LDataSet ds = (SE_QTY_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
