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

package chosun.ciis.hd.affr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;
 
/**
 * 
 */
public class HD_AFFR_5000DAO {

	public HD_AFFR_4400_LDataSet hd_affr_4400_l(HD_AFFR_4400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4400_LDataSet ds = (HD_AFFR_4400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_AFFR_4000_LDataSet hd_affr_4000_l(HD_AFFR_4000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4000_LDataSet ds = (HD_AFFR_4000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4001_LDataSet hd_affr_4001_l(HD_AFFR_4001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4001_LDataSet ds = (HD_AFFR_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4002_ADataSet hd_affr_4002_a(HD_AFFR_4002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4002_ADataSet ds = (HD_AFFR_4002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4100_LDataSet hd_affr_4100_l(HD_AFFR_4100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4100_LDataSet ds = (HD_AFFR_4100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4101_ADataSet hd_affr_4101_a(HD_AFFR_4101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4101_ADataSet ds = (HD_AFFR_4101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4102_LDataSet hd_affr_4102_l(HD_AFFR_4102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4102_LDataSet ds = (HD_AFFR_4102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4103_LDataSet hd_affr_4103_l(HD_AFFR_4103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4103_LDataSet ds = (HD_AFFR_4103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4104_LDataSet hd_affr_4104_l(HD_AFFR_4104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4104_LDataSet ds = (HD_AFFR_4104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4200_LDataSet hd_affr_4200_l(HD_AFFR_4200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4200_LDataSet ds = (HD_AFFR_4200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4201_ADataSet hd_affr_4201_a(HD_AFFR_4201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4201_ADataSet ds = (HD_AFFR_4201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_5000_LDataSet hd_affr_5000_l(HD_AFFR_5000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_5000_LDataSet ds = (HD_AFFR_5000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_AFFR_5010_LDataSet hd_affr_5010_l(HD_AFFR_5010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_5010_LDataSet ds = (HD_AFFR_5010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_5011_ADataSet hd_affr_5011_a(HD_AFFR_5011_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_5011_ADataSet ds = (HD_AFFR_5011_ADataSet)manager.executeCall(dm);
	
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_5012_LDataSet hd_affr_5012_l(HD_AFFR_5012_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_5012_LDataSet ds = (HD_AFFR_5012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_5020_LDataSet hd_affr_5020_l(HD_AFFR_5020_LDM dm) throws AppException {
		
		
		DBManager manager = new DBManager("MISHDL");
		
		dm.print();
		HD_AFFR_5020_LDataSet ds = (HD_AFFR_5020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4300_LDataSet hd_affr_4300_l(HD_AFFR_4300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4300_LDataSet ds = (HD_AFFR_4300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4301_LDataSet hd_affr_4301_l(HD_AFFR_4301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4301_LDataSet ds = (HD_AFFR_4301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_4302_ADataSet hd_affr_4302_a(HD_AFFR_4302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_4302_ADataSet ds = (HD_AFFR_4302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

