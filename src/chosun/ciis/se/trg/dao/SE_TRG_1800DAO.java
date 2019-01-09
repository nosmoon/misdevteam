/***************************************************************************************************
 * ���ϸ� : SE_TRG_1800DAO.java
 * ��� : ����򰡴���ڼ���
 * �ۼ����� : 2009-04-06
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.trg.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */
public class SE_TRG_1800DAO {
	
	public SE_TRG_1810_LDataSet se_trg_1810_l(SE_TRG_1810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1810_LDataSet ds = (SE_TRG_1810_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1820_ADataSet se_trg_1820_a(SE_TRG_1820_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1820_ADataSet ds = (SE_TRG_1820_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
