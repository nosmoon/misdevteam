/***************************************************************************************************
 * ���ϸ� : SE_TRG_1900DAO.java
 * ��� : �ν�Ȯ����
 * �ۼ����� : 2009-04-010
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
public class SE_TRG_1900DAO {
	
	public SE_TRG_1900_MDataSet se_trg_1900_m(SE_TRG_1900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1900_MDataSet ds = (SE_TRG_1900_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1910_LDataSet se_trg_1910_l(SE_TRG_1910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1910_LDataSet ds = (SE_TRG_1910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_TRG_1915_SDataSet se_trg_1915_s(SE_TRG_1915_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1915_SDataSet ds = (SE_TRG_1915_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1920_ADataSet se_trg_1920_a(SE_TRG_1920_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1920_ADataSet ds = (SE_TRG_1920_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
