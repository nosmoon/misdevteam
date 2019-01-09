/***************************************************************************************************
 * ���ϸ� : SE_BOI_2100DAO.java
 * ��� : �ؾ���� - Ÿ���������������μ��ΰ�
 * �ۼ����� : 2009-05-25
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */
public class SE_BOI_2100DAO {
	
	public SE_BOI_2100_MDataSet se_boi_2100_m(SE_BOI_2100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2100_MDataSet ds = (SE_BOI_2100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2110_LDataSet se_boi_2110_l(SE_BOI_2110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2110_LDataSet ds = (SE_BOI_2110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2120_LDataSet se_boi_2120_l(SE_BOI_2120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2120_LDataSet ds = (SE_BOI_2120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2130_LDataSet se_boi_2130_l(SE_BOI_2130_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2130_LDataSet ds = (SE_BOI_2130_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2140_ADataSet se_boi_2140_a(SE_BOI_2140_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2140_ADataSet ds = (SE_BOI_2140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2150_ADataSet se_boi_2150_a(SE_BOI_2150_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2150_ADataSet ds = (SE_BOI_2150_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
