/***************************************************************************************************
 * ���ϸ� : SE_QTY_2000DAO.java
 * ��� : �μ�����
 * �ۼ����� : ���Ϻ����μ� ��������
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
public class SE_QTY_2000DAO {
	
	public SE_QTY_2000_MDataSet se_qty_2000_m(SE_QTY_2000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2000_MDataSet ds = (SE_QTY_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public SE_QTY_2010_LDataSet se_qty_2010_l(SE_QTY_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2010_LDataSet ds = (SE_QTY_2010_LDataSet)manager.executeCall(dm);
	
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
	
		return ds;
	}


    
}
