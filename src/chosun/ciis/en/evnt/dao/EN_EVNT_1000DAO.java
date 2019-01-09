/***************************************************************************************************
 * 파일명 : EN_EVNT_1000DAO.java
 * 기능 : 행사관리 관련 DAO
 * 작성일자 : 2009.02.01
 * 작성자 : 최승구
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.en.evnt.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.ds.*;

/**
 * 
 */

public class EN_EVNT_1000DAO {
	
	public EN_EVNT_1000_MDataSet en_evnt_1000_m(EN_EVNT_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1000_MDataSet ds = (EN_EVNT_1000_MDataSet)manager.executeCall(dm);
	
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
	
		return ds;
	}
	
	public EN_EVNT_1001_MDataSet en_evnt_1001_m(EN_EVNT_1001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1001_MDataSet ds = (EN_EVNT_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_EVNT_1002_LDataSet en_evnt_1002_l(EN_EVNT_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1002_LDataSet ds = (EN_EVNT_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_EVNT_1003_SDataSet en_evnt_1003_s(EN_EVNT_1003_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1003_SDataSet ds = (EN_EVNT_1003_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_EVNT_1004_ADataSet en_evnt_1004_a(EN_EVNT_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1004_ADataSet ds = (EN_EVNT_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_EVNT_1101_LDataSet en_evnt_1101_l(EN_EVNT_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1101_LDataSet ds = (EN_EVNT_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_EVNT_1102_UDataSet en_evnt_1102_u(EN_EVNT_1102_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1102_UDataSet ds = (EN_EVNT_1102_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_EVNT_1103_UDataSet en_evnt_1103_u(EN_EVNT_1103_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1103_UDataSet ds = (EN_EVNT_1103_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_EVNT_1201_LDataSet en_evnt_1201_l(EN_EVNT_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1201_LDataSet ds = (EN_EVNT_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_EVNT_1202_ADataSet en_evnt_1202_a(EN_EVNT_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1202_ADataSet ds = (EN_EVNT_1202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_EVNT_1203_LDataSet en_evnt_1203_l(EN_EVNT_1203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1203_LDataSet ds = (EN_EVNT_1203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
