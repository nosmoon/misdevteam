/***************************************************************************************************
 * 파일명 : EN_INNEXP_3000DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.en.innexp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */
public class EN_INNEXP_3000DAO {
	
	public EN_INNEXP_3001_LDataSet en_innexp_3001_l(EN_INNEXP_3001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3001_LDataSet ds = (EN_INNEXP_3001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3002_LDataSet en_innexp_3002_l(EN_INNEXP_3002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3002_LDataSet ds = (EN_INNEXP_3002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_INNEXP_3003_LDataSet en_innexp_3003_l(EN_INNEXP_3003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3003_LDataSet ds = (EN_INNEXP_3003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3004_LDataSet en_innexp_3004_l(EN_INNEXP_3004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3004_LDataSet ds = (EN_INNEXP_3004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3101_LDataSet en_innexp_3101_l(EN_INNEXP_3101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3101_LDataSet ds = (EN_INNEXP_3101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3102_LDataSet en_innexp_3102_l(EN_INNEXP_3102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3102_LDataSet ds = (EN_INNEXP_3102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3103_LDataSet en_innexp_3103_l(EN_INNEXP_3103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3103_LDataSet ds = (EN_INNEXP_3103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3104_LDataSet en_innexp_3104_l(EN_INNEXP_3104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3104_LDataSet ds = (EN_INNEXP_3104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3105_LDataSet en_innexp_3105_l(EN_INNEXP_3105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3105_LDataSet ds = (EN_INNEXP_3105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3201_LDataSet en_innexp_3201_l(EN_INNEXP_3201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3201_LDataSet ds = (EN_INNEXP_3201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3202_LDataSet en_innexp_3202_l(EN_INNEXP_3202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3202_LDataSet ds = (EN_INNEXP_3202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_3203_LDataSet en_innexp_3203_l(EN_INNEXP_3203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3203_LDataSet ds = (EN_INNEXP_3203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
