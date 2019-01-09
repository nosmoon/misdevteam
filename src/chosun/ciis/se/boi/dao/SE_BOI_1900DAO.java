/***************************************************************************************************
 * ���ϸ� : SE_BOI_1900DAO.java
 * ��� : �ؾ���� - �����������μ��ΰ�
 * �ۼ����� : 2009-05-22
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
public class SE_BOI_1900DAO {
	
	public SE_BOI_1900_MDataSet se_boi_1900_m(SE_BOI_1900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1900_MDataSet ds = (SE_BOI_1900_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1910_LDataSet se_boi_1910_l(SE_BOI_1910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1910_LDataSet ds = (SE_BOI_1910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1920_LDataSet se_boi_1920_l(SE_BOI_1920_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1920_LDataSet ds = (SE_BOI_1920_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1930_LDataSet se_boi_1930_l(SE_BOI_1930_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1930_LDataSet ds = (SE_BOI_1930_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1940_ADataSet se_boi_1940_a(SE_BOI_1940_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1940_ADataSet ds = (SE_BOI_1940_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
