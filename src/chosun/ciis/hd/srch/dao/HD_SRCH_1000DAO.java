/***************************************************************************************************
 * 파일명 : PilotDAO.java
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

package chosun.ciis.hd.srch.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;
 
/**
 * 
 */
public class HD_SRCH_1000DAO {
	
	public HD_SRCH_1000_LDataSet hd_srch_1000_l(HD_SRCH_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1000_LDataSet ds = (HD_SRCH_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1010_LDataSet hd_srch_1010_l(HD_SRCH_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1010_LDataSet ds = (HD_SRCH_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1020_LDataSet hd_srch_1020_l(HD_SRCH_1020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1020_LDataSet ds = (HD_SRCH_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	
	public HD_SRCH_1030_LDataSet hd_srch_1030_l(HD_SRCH_1030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1030_LDataSet ds = (HD_SRCH_1030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1100_LDataSet hd_srch_1100_l(HD_SRCH_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1100_LDataSet ds = (HD_SRCH_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1101_LDataSet hd_srch_1101_l(HD_SRCH_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1101_LDataSet ds = (HD_SRCH_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1200_LDataSet hd_srch_1200_l(HD_SRCH_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1200_LDataSet ds = (HD_SRCH_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1300_LDataSet hd_srch_1300_l(HD_SRCH_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1300_LDataSet ds = (HD_SRCH_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1400_LDataSet hd_srch_1400_l(HD_SRCH_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1400_LDataSet ds = (HD_SRCH_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1500_LDataSet hd_srch_1500_l(HD_SRCH_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1500_LDataSet ds = (HD_SRCH_1500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1600_LDataSet hd_srch_1600_l(HD_SRCH_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1600_LDataSet ds = (HD_SRCH_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1601_LDataSet hd_srch_1601_l(HD_SRCH_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1601_LDataSet ds = (HD_SRCH_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1700_LDataSet hd_srch_1700_l(HD_SRCH_1700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1700_LDataSet ds = (HD_SRCH_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_1800_LDataSet hd_srch_1800_l(HD_SRCH_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_1800_LDataSet ds = (HD_SRCH_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SRCH_3000_LDataSet hd_srch_3000_l(HD_SRCH_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SRCH_3000_LDataSet ds = (HD_SRCH_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

