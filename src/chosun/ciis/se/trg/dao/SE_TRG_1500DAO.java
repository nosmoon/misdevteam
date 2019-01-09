/***************************************************************************************************
 * ���ϸ� : SE_TRG_1500DAO.java
 * ��� : �����򰡰������
 * �ۼ����� : 2009-04-03
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
public class SE_TRG_1500DAO {
	
	public SE_TRG_1500_MDataSet se_trg_1500_m(SE_TRG_1500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1500_MDataSet ds = (SE_TRG_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1510_LDataSet se_trg_1510_l(SE_TRG_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1510_LDataSet ds = (SE_TRG_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1520_ADataSet se_trg_1520_a(SE_TRG_1520_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1520_ADataSet ds = (SE_TRG_1520_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1540_ADataSet se_trg_1540_a(SE_TRG_1540_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1540_ADataSet ds = (SE_TRG_1540_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1550_ADataSet se_trg_1550_a(SE_TRG_1550_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1550_ADataSet ds = (SE_TRG_1550_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1560_ADataSet se_trg_1560_a(SE_TRG_1560_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1560_ADataSet ds = (SE_TRG_1560_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}
