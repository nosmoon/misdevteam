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

package chosun.ciis.hd.corr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.ds.*;
 
/**
 * 
 */
public class HD_CORR_1000DAO {
 
	
	public HD_CORR_1000_LDataSet hd_corr_1000_l(HD_CORR_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1000_LDataSet ds = (HD_CORR_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1010_LDataSet hd_corr_1010_l(HD_CORR_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1010_LDataSet ds = (HD_CORR_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_CORR_1011_LDataSet hd_corr_1011_l(HD_CORR_1011_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1011_LDataSet ds = (HD_CORR_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1012_ADataSet hd_corr_1012_a(HD_CORR_1012_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1012_ADataSet ds = (HD_CORR_1012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		
	public HD_CORR_1013_ADataSet hd_corr_1013_a(HD_CORR_1013_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1013_ADataSet ds = (HD_CORR_1013_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1020_LDataSet hd_corr_1020_l(HD_CORR_1020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1020_LDataSet ds = (HD_CORR_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_CORR_1100_LDataSet hd_corr_1100_l(HD_CORR_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1100_LDataSet ds = (HD_CORR_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1101_LDataSet hd_corr_1101_l(HD_CORR_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1101_LDataSet ds = (HD_CORR_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1102_LDataSet hd_corr_1102_l(HD_CORR_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1102_LDataSet ds = (HD_CORR_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_CORR_1103_ADataSet hd_corr_1103_a(HD_CORR_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1103_ADataSet ds = (HD_CORR_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1200_LDataSet hd_corr_1200_l(HD_CORR_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1200_LDataSet ds = (HD_CORR_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1201_LDataSet hd_corr_1201_l(HD_CORR_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1201_LDataSet ds = (HD_CORR_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1300_LDataSet hd_corr_1300_l(HD_CORR_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1300_LDataSet ds = (HD_CORR_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_CORR_1301_LDataSet hd_corr_1301_l(HD_CORR_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1301_LDataSet ds = (HD_CORR_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1400_LDataSet hd_corr_1400_l(HD_CORR_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1400_LDataSet ds = (HD_CORR_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_CORR_1401_LDataSet hd_corr_1401_l(HD_CORR_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CORR_1401_LDataSet ds = (HD_CORR_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}
