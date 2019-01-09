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

package chosun.ciis.hd.crcl.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.ds.*;

/**
 * 
 */
public class HD_CRCL_1000DAO {
	
	public HD_CRCL_1000_MDataSet hd_crcl_1000_m(HD_CRCL_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1000_MDataSet ds = (HD_CRCL_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1001_LDataSet hd_crcl_1001_l(HD_CRCL_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1001_LDataSet ds = (HD_CRCL_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1002_ADataSet hd_crcl_1002_a(HD_CRCL_1002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1002_ADataSet ds = (HD_CRCL_1002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_CRCL_1100_MDataSet hd_crcl_1100_m(HD_CRCL_1100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1100_MDataSet ds = (HD_CRCL_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1101_LDataSet hd_crcl_1101_l(HD_CRCL_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1101_LDataSet ds = (HD_CRCL_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1102_ADataSet hd_crcl_1102_a(HD_CRCL_1102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1102_ADataSet ds = (HD_CRCL_1102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1103_LDataSet hd_crcl_1103_l(HD_CRCL_1103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1103_LDataSet ds = (HD_CRCL_1103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1200_LDataSet hd_crcl_1200_l(HD_CRCL_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1200_LDataSet ds = (HD_CRCL_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1201_LDataSet hd_crcl_1201_l(HD_CRCL_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1201_LDataSet ds = (HD_CRCL_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1202_ADataSet hd_crcl_1202_a(HD_CRCL_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1202_ADataSet ds = (HD_CRCL_1202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1203_MDataSet hd_crcl_1203_m(HD_CRCL_1203_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1203_MDataSet ds = (HD_CRCL_1203_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_CRCL_1300_LDataSet hd_crcl_1300_l(HD_CRCL_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1300_LDataSet ds = (HD_CRCL_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1301_ADataSet hd_crcl_1301_a(HD_CRCL_1301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1301_ADataSet ds = (HD_CRCL_1301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1302_LDataSet hd_crcl_1302_l(HD_CRCL_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1302_LDataSet ds = (HD_CRCL_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_CRCL_1400_LDataSet hd_crcl_1400_l(HD_CRCL_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CRCL_1400_LDataSet ds = (HD_CRCL_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
