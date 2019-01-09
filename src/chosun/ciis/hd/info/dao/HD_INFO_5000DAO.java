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

package chosun.ciis.hd.info.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */
public class HD_INFO_5000DAO {
	public HD_INFO_5210_LDataSet hd_info_5210_l(HD_INFO_5210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5210_LDataSet ds = (HD_INFO_5210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_5211_LDataSet hd_info_5211_l(HD_INFO_5211_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5211_LDataSet ds = (HD_INFO_5211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5212_LDataSet hd_info_5212_l(HD_INFO_5212_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5212_LDataSet ds = (HD_INFO_5212_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5213_ADataSet hd_info_5213_a(HD_INFO_5213_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5213_ADataSet ds = (HD_INFO_5213_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5220_LDataSet hd_info_5220_l(HD_INFO_5220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5220_LDataSet ds = (HD_INFO_5220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5221_LDataSet hd_info_5221_l(HD_INFO_5221_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5221_LDataSet ds = (HD_INFO_5221_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5222_ADataSet hd_info_5222_a(HD_INFO_5222_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5222_ADataSet ds = (HD_INFO_5222_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_5230_LDataSet hd_info_5230_l(HD_INFO_5230_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5230_LDataSet ds = (HD_INFO_5230_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5231_LDataSet hd_info_5231_l(HD_INFO_5231_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5231_LDataSet ds = (HD_INFO_5231_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5232_ADataSet hd_info_5232_a(HD_INFO_5232_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5232_ADataSet ds = (HD_INFO_5232_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5240_LDataSet hd_info_5240_l(HD_INFO_5240_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5240_LDataSet ds = (HD_INFO_5240_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5241_LDataSet hd_info_5241_l(HD_INFO_5241_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5241_LDataSet ds = (HD_INFO_5241_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5242_LDataSet hd_info_5242_l(HD_INFO_5242_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5242_LDataSet ds = (HD_INFO_5242_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5243_ADataSet hd_info_5243_a(HD_INFO_5243_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5243_ADataSet ds = (HD_INFO_5243_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5250_LDataSet hd_info_5250_l(HD_INFO_5250_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5250_LDataSet ds = (HD_INFO_5250_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5251_LDataSet hd_info_5251_l(HD_INFO_5251_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5251_LDataSet ds = (HD_INFO_5251_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5252_LDataSet hd_info_5252_l(HD_INFO_5252_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5252_LDataSet ds = (HD_INFO_5252_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5253_ADataSet hd_info_5253_a(HD_INFO_5253_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5253_ADataSet ds = (HD_INFO_5253_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5260_LDataSet hd_info_5260_l(HD_INFO_5260_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5260_LDataSet ds = (HD_INFO_5260_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5261_LDataSet hd_info_5261_l(HD_INFO_5261_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5261_LDataSet ds = (HD_INFO_5261_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5262_LDataSet hd_info_5262_l(HD_INFO_5262_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5262_LDataSet ds = (HD_INFO_5262_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5263_ADataSet hd_info_5263_a(HD_INFO_5263_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5263_ADataSet ds = (HD_INFO_5263_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5300_LDataSet hd_info_5300_l(HD_INFO_5300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5300_LDataSet ds = (HD_INFO_5300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5301_LDataSet hd_info_5301_l(HD_INFO_5301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5301_LDataSet ds = (HD_INFO_5301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5302_ADataSet hd_info_5302_a(HD_INFO_5302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5302_ADataSet ds = (HD_INFO_5302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5101_LDataSet hd_info_5101_l(HD_INFO_5101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5101_LDataSet ds = (HD_INFO_5101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_5100_ADataSet hd_info_5100_a(HD_INFO_5100_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_5100_ADataSet ds = (HD_INFO_5100_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_7000_LDataSet hd_info_7000_l(HD_INFO_7000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7000_LDataSet ds = (HD_INFO_7000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_7001_ADataSet hd_info_7001_a(HD_INFO_7001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7001_ADataSet ds = (HD_INFO_7001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_7002_LDataSet hd_info_7002_l(HD_INFO_7002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7002_LDataSet ds = (HD_INFO_7002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_7010_LDataSet hd_info_7010_l(HD_INFO_7010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7010_LDataSet ds = (HD_INFO_7010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_7012_MDataSet hd_info_7012_m(HD_INFO_7012_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7012_MDataSet ds = (HD_INFO_7012_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
//	public HD_INFO_7101_MDataSet hd_info_7101_m(HD_INFO_7101_MDM dm) throws AppException {
//		DBManager manager = new DBManager("MISHDL");
//		HD_INFO_7101_MDataSet ds = (HD_INFO_7101_MDataSet)manager.executeCall(dm);
//
//		if(!ds.getErrcode().equals("")) {
//			throw new AppException(ds.getErrcode(), ds.getErrmsg());
//		}
//
//		return ds;
//	}
	
}