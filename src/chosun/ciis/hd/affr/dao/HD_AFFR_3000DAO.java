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

//import javax.ejb.EJBException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;
 
/**
 * 
 */
public class HD_AFFR_3000DAO {

	
	public HD_AFFR_3000_LDataSet hd_affr_3000(HD_AFFR_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3000_LDataSet ds = (HD_AFFR_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_3001_LDataSet hd_affr_3001(HD_AFFR_3001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3001_LDataSet ds = (HD_AFFR_3001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3002_ADataSet hd_affr_3002(HD_AFFR_3002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3002_ADataSet ds = (HD_AFFR_3002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_3100_LDataSet hd_affr_3100(HD_AFFR_3100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3100_LDataSet ds = (HD_AFFR_3100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3101_ADataSet hd_affr_3101(HD_AFFR_3101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3101_ADataSet ds = (HD_AFFR_3101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3102_LDataSet hd_affr_3102(HD_AFFR_3102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3102_LDataSet ds = (HD_AFFR_3102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3200_LDataSet hd_affr_3200(HD_AFFR_3200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3200_LDataSet ds = (HD_AFFR_3200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3201_ADataSet hd_affr_3201(HD_AFFR_3201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3201_ADataSet ds = (HD_AFFR_3201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3202_LDataSet hd_affr_3202(HD_AFFR_3202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3202_LDataSet ds = (HD_AFFR_3202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_3300_LDataSet hd_affr_3300(HD_AFFR_3300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3300_LDataSet ds = (HD_AFFR_3300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3301_ADataSet hd_affr_3301(HD_AFFR_3301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3301_ADataSet ds = (HD_AFFR_3301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3302_LDataSet hd_affr_3302(HD_AFFR_3302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3302_LDataSet ds = (HD_AFFR_3302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_3003_LDataSet hd_affr_3003_l(HD_AFFR_3003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3003_LDataSet ds = (HD_AFFR_3003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_3501_LDataSet hd_affr_3501_l(HD_AFFR_3501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3501_LDataSet ds = (HD_AFFR_3501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_3502_LDataSet hd_affr_3502_l(HD_AFFR_3502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3502_LDataSet ds = (HD_AFFR_3502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_3503_LDataSet hd_affr_3503_l(HD_AFFR_3503_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_3503_LDataSet ds = (HD_AFFR_3503_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
