/***************************************************************************************************
* ���ϸ� : SE_QTY_2800DAO.java
* ��� : �μ����� - �߼ۺμ� - �������ں�����μ�
* �ۼ����� : 2009-03-11
* �ۼ��� : �����
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
public class SE_QTY_2800DAO {
	
	public SE_QTY_2800_MDataSet se_qty_2800_m(SE_QTY_2800_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2800_MDataSet ds = (SE_QTY_2800_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2810_LDataSet se_qty_2810_l(SE_QTY_2810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2810_LDataSet ds = (SE_QTY_2810_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
