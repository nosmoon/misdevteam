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

package chosun.ciis.hd.prz.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.ds.*;
 
/**
 * 
 */
public class HD_PRZ_1000DAO { 
	
	public HD_PRZ_1000_LDataSet getHd_PRZ_1000(HD_PRZ_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1000_LDataSet ds = (HD_PRZ_1000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1001_LDataSet getHd_PRZ_1001(HD_PRZ_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1001_LDataSet ds = (HD_PRZ_1001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1002_LDataSet getHd_PRZ_1002(HD_PRZ_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1002_LDataSet ds = (HD_PRZ_1002_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1003_ADataSet getHd_PRZ_1003(HD_PRZ_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1003_ADataSet ds = (HD_PRZ_1003_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1004_ADataSet getHd_PRZ_1004(HD_PRZ_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1004_ADataSet ds = (HD_PRZ_1004_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1100_LDataSet getHd_PRZ_1100(HD_PRZ_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1100_LDataSet ds = (HD_PRZ_1100_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1101_LDataSet getHd_PRZ_1101(HD_PRZ_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1101_LDataSet ds = (HD_PRZ_1101_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1103_ADataSet getHd_PRZ_1103(HD_PRZ_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1103_ADataSet ds = (HD_PRZ_1103_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_PRZ_1104_LDataSet hd_prz_1104_l(HD_PRZ_1104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1104_LDataSet ds = (HD_PRZ_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_PRZ_1200_LDataSet getHd_PRZ_1200(HD_PRZ_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1200_LDataSet ds = (HD_PRZ_1200_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1201_LDataSet getHd_PRZ_1201(HD_PRZ_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1201_LDataSet ds = (HD_PRZ_1201_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}		

	public HD_PRZ_1202_ADataSet getHd_PRZ_1202(HD_PRZ_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1202_ADataSet ds = (HD_PRZ_1202_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_PRZ_1400_LDataSet getHd_PRZ_1400(HD_PRZ_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1400_LDataSet ds = (HD_PRZ_1400_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1401_LDataSet getHd_PRZ_1401(HD_PRZ_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1401_LDataSet ds = (HD_PRZ_1401_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}		

	public HD_PRZ_1402_ADataSet getHd_PRZ_1402(HD_PRZ_1402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1402_ADataSet ds = (HD_PRZ_1402_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}



	public HD_PRZ_1300_LDataSet getHd_PRZ_1300(HD_PRZ_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1300_LDataSet ds = (HD_PRZ_1300_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_PRZ_1301_LDataSet getHd_PRZ_1301(HD_PRZ_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1301_LDataSet ds = (HD_PRZ_1301_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

}

