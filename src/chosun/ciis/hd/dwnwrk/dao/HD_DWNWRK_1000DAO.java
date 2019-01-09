/***************************************************************************************************
* 파일명 : HD_DWNWRK_1000DAO.java
* 기능 : 조출근무관리
* 작성일자 : 2009.04.23
* 작성자 : 강영슬
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.hd.dwnwrk.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.ds.*;
 
/**
 * 
 */
public class HD_DWNWRK_1000DAO {
	public HD_DWNWRK_1000_LDataSet hd_dwnwrk_1000_l(HD_DWNWRK_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1000_LDataSet ds = (HD_DWNWRK_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DWNWRK_1001_LDataSet hd_dwnwrk_1001_l(HD_DWNWRK_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1001_LDataSet ds = (HD_DWNWRK_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DWNWRK_1002_ADataSet hd_dwnwrk_1002_a(HD_DWNWRK_1002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1002_ADataSet ds = (HD_DWNWRK_1002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DWNWRK_1100_LDataSet hd_dwnwrk_1100_l(HD_DWNWRK_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1100_LDataSet ds = (HD_DWNWRK_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DWNWRK_1101_LDataSet hd_dwnwrk_1101_l(HD_DWNWRK_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1101_LDataSet ds = (HD_DWNWRK_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DWNWRK_1102_ADataSet hd_dwnwrk_1102_a(HD_DWNWRK_1102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1102_ADataSet ds = (HD_DWNWRK_1102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DWNWRK_1103_LDataSet hd_dwnwrk_1103_l(HD_DWNWRK_1103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1103_LDataSet ds = (HD_DWNWRK_1103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DWNWRK_1104_ADataSet hd_dwnwrk_1104_a(HD_DWNWRK_1104_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1104_ADataSet ds = (HD_DWNWRK_1104_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DWNWRK_1200_LDataSet hd_dwnwrk_1200_l(HD_DWNWRK_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1200_LDataSet ds = (HD_DWNWRK_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DWNWRK_1201_ADataSet hd_dwnwrk_1201_a(HD_DWNWRK_1201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1201_ADataSet ds = (HD_DWNWRK_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DWNWRK_1300_LDataSet hd_dwnwrk_1300_l(HD_DWNWRK_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1300_LDataSet ds = (HD_DWNWRK_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DWNWRK_1301_LDataSet hd_dwnwrk_1301_l(HD_DWNWRK_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1301_LDataSet ds = (HD_DWNWRK_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DWNWRK_1302_ADataSet hd_dwnwrk_1302_a(HD_DWNWRK_1302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1302_ADataSet ds = (HD_DWNWRK_1302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DWNWRK_1303_ADataSet hd_dwnwrk_1303_a(HD_DWNWRK_1303_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1303_ADataSet ds = (HD_DWNWRK_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DWNWRK_1304_DDataSet hd_dwnwrk_1304_d(HD_DWNWRK_1304_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1304_DDataSet ds = (HD_DWNWRK_1304_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DWNWRK_1400_LDataSet hd_dwnwrk_1400_l(HD_DWNWRK_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DWNWRK_1400_LDataSet ds = (HD_DWNWRK_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}

