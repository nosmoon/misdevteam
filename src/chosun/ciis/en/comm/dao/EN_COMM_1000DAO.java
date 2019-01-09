/***************************************************************************************************
 * 파일명 : EN_COMM_1000DAO.java
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

package chosun.ciis.en.comm.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;

/**
 * 
 */
public class EN_COMM_1000DAO {
	
	public EN_COMM_1001_LDataSet en_comm_1001_l(EN_COMM_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1001_LDataSet ds = (EN_COMM_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	  
	public EN_COMM_1002_LDataSet en_comm_1002_l(EN_COMM_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1002_LDataSet ds = (EN_COMM_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1003_LDataSet en_comm_1003_l(EN_COMM_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1003_LDataSet ds = (EN_COMM_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1004_LDataSet en_comm_1004_l(EN_COMM_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1004_LDataSet ds = (EN_COMM_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1005_LDataSet en_comm_1005_l(EN_COMM_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1005_LDataSet ds = (EN_COMM_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1100_LDataSet en_comm_1100_l(EN_COMM_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1100_LDataSet ds = (EN_COMM_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1200_MDataSet en_comm_1200_m(EN_COMM_1200_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1200_MDataSet ds = (EN_COMM_1200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1201_LDataSet en_comm_1201_l(EN_COMM_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1201_LDataSet ds = (EN_COMM_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1202_LDataSet en_comm_1202_l(EN_COMM_1202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1202_LDataSet ds = (EN_COMM_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1301_MDataSet en_comm_1301_m(EN_COMM_1301_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1301_MDataSet ds = (EN_COMM_1301_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1302_LDataSet en_comm_1302_l(EN_COMM_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1302_LDataSet ds = (EN_COMM_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1401_MDataSet en_comm_1401_m(EN_COMM_1401_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1401_MDataSet ds = (EN_COMM_1401_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_COMM_1402_LDataSet en_comm_1402_l(EN_COMM_1402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1402_LDataSet ds = (EN_COMM_1402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
