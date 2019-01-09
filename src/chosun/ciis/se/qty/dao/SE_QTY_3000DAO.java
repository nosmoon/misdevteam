/***************************************************************************************************
* ���ϸ� : SE_QTY_3000DAO.java
* ��� : �μ����� - �߼ۺμ� - ���Ϲ߼ۺμ� ������ȸ
* �ۼ����� : 2009-03-09
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
public class SE_QTY_3000DAO {
	
	public SE_QTY_3000_MDataSet se_qty_3000_m(SE_QTY_3000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_3000_MDataSet ds = (SE_QTY_3000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_3010_LDataSet se_qty_3010_l(SE_QTY_3010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_3010_LDataSet ds = (SE_QTY_3010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_3020_LDataSet se_qty_3020_l(SE_QTY_3020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_3020_LDataSet ds = (SE_QTY_3020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
