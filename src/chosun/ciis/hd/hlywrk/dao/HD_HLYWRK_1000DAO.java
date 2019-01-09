/***************************************************************************************************
 * 파일명 : HD_HLYWRK_1000DAO.java
 * 기능 : 휴일근무관리
 * 작성일자 : 2009.04.20
 * 작성자 : 강영슬
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.hd.hlywrk.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.ds.*;
 
/**
 * 
 */
public class HD_HLYWRK_1000DAO {
	public HD_HLYWRK_1000_LDataSet hd_hlywrk_1000_l(HD_HLYWRK_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1000_LDataSet ds = (HD_HLYWRK_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1000_LDataSet hd_hlywrk_1000_344_l(HD_HLYWRK_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1000_LDataSet ds = (HD_HLYWRK_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1001_LDataSet hd_hlywrk_1001_l(HD_HLYWRK_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1001_LDataSet ds = (HD_HLYWRK_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1001_344_LDataSet hd_hlywrk_1001_344_l(HD_HLYWRK_1001_344_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1001_344_LDataSet ds = (HD_HLYWRK_1001_344_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1002_ADataSet hd_hlywrk_1002_a(HD_HLYWRK_1002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1002_ADataSet ds = (HD_HLYWRK_1002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1002_344_ADataSet hd_hlywrk_1002_344_a(HD_HLYWRK_1002_344_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1002_344_ADataSet ds = (HD_HLYWRK_1002_344_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1100_LDataSet hd_hlywrk_1100_l(HD_HLYWRK_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1100_LDataSet ds = (HD_HLYWRK_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1101_LDataSet hd_hlywrk_1101_l(HD_HLYWRK_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1101_LDataSet ds = (HD_HLYWRK_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1102_ADataSet hd_hlywrk_1102_a(HD_HLYWRK_1102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1102_ADataSet ds = (HD_HLYWRK_1102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1103_LDataSet hd_hlywrk_1103_l(HD_HLYWRK_1103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1103_LDataSet ds = (HD_HLYWRK_1103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1104_ADataSet hd_hlywrk_1104_a(HD_HLYWRK_1104_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1104_ADataSet ds = (HD_HLYWRK_1104_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1105_LDataSet hd_hlywrk_1105_l(HD_HLYWRK_1105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1105_LDataSet ds = (HD_HLYWRK_1105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1200_LDataSet hd_hlywrk_1200_l(HD_HLYWRK_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1200_LDataSet ds = (HD_HLYWRK_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1201_ADataSet hd_hlywrk_1201_a(HD_HLYWRK_1201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1201_ADataSet ds = (HD_HLYWRK_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1202_ADataSet hd_hlywrk_1202_a(HD_HLYWRK_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1202_ADataSet ds = (HD_HLYWRK_1202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1300_LDataSet hd_hlywrk_1300_l(HD_HLYWRK_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1300_LDataSet ds = (HD_HLYWRK_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1301_LDataSet hd_hlywrk_1301_l(HD_HLYWRK_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1301_LDataSet ds = (HD_HLYWRK_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_HLYWRK_1302_ADataSet hd_hlywrk_1302_a(HD_HLYWRK_1302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1302_ADataSet ds = (HD_HLYWRK_1302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1303_ADataSet hd_hlywrk_1303_a(HD_HLYWRK_1303_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1303_ADataSet ds = (HD_HLYWRK_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1304_LDataSet hd_hlywrk_1304_l(HD_HLYWRK_1304_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1304_LDataSet ds = (HD_HLYWRK_1304_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_HLYWRK_1304_344_LDataSet hd_hlywrk_1304_344_l(HD_HLYWRK_1304_344_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_HLYWRK_1304_344_LDataSet ds = (HD_HLYWRK_1304_344_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}

