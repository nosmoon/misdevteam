/***************************************************************************************************
 * ���ϸ� : SE_BOI_2000DAO.java
 * ��� : �ؾ���� - Ÿ�����μ��ΰ�
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
public class SE_BOI_2000DAO {
	
	public SE_BOI_2000_MDataSet se_boi_2000_m(SE_BOI_2000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2000_MDataSet ds = (SE_BOI_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2010_LDataSet se_boi_2010_l(SE_BOI_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2010_LDataSet ds = (SE_BOI_2010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2020_LDataSet se_boi_2020_l(SE_BOI_2020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2020_LDataSet ds = (SE_BOI_2020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2030_LDataSet se_boi_2030_l(SE_BOI_2030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2030_LDataSet ds = (SE_BOI_2030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2040_ADataSet se_boi_2040_a(SE_BOI_2040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2040_ADataSet ds = (SE_BOI_2040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2050_ADataSet se_boi_2050_a(SE_BOI_2050_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2050_ADataSet ds = (SE_BOI_2050_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
