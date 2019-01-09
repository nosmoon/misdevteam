/***************************************************************************************************
 * ���ϸ� : SE_TRG_1600DAO.java
 * ��� : �����򰡰����ȸ
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
public class SE_TRG_1600DAO {
	
	public SE_TRG_1600_MDataSet se_trg_1600_m(SE_TRG_1600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1600_MDataSet ds = (SE_TRG_1600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1610_LDataSet se_trg_1610_l(SE_TRG_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1610_LDataSet ds = (SE_TRG_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1620_LDataSet se_trg_1620_l(SE_TRG_1620_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1620_LDataSet ds = (SE_TRG_1620_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1630_LDataSet se_trg_1630_l(SE_TRG_1630_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1630_LDataSet ds = (SE_TRG_1630_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1640_LDataSet se_trg_1640_l(SE_TRG_1640_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1640_LDataSet ds = (SE_TRG_1640_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
