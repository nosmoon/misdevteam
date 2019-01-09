/***************************************************************************************************
 * 파일명 : EN_RCPM_1000DAO.java
 * 기능 : 입금표관리 관련 DAO
 * 작성일자 : 2009.02.11 
 * 작성자 : 최승구
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.en.rcpm.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.en.rcpm.dm.*;
import chosun.ciis.en.rcpm.ds.*;

/**
 * 
 */

public class EN_RCPM_1000DAO {
	
	public EN_RCPM_1001_MDataSet en_rcpm_1001_m(EN_RCPM_1001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_RCPM_1001_MDataSet ds = (EN_RCPM_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_RCPM_1002_LDataSet en_rcpm_1002_l(EN_RCPM_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_RCPM_1002_LDataSet ds = (EN_RCPM_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_RCPM_1003_SDataSet en_rcpm_1003_s(EN_RCPM_1003_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_RCPM_1003_SDataSet ds = (EN_RCPM_1003_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_RCPM_1004_IDataSet en_rcpm_1004_i(EN_RCPM_1004_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_RCPM_1004_IDataSet ds = (EN_RCPM_1004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_RCPM_1005_UDataSet en_rcpm_1005_u(EN_RCPM_1005_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_RCPM_1005_UDataSet ds = (EN_RCPM_1005_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
