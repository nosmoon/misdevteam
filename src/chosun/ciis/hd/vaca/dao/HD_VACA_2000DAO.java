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

package chosun.ciis.hd.vaca.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;
 
/**
 * 
 */
public class HD_VACA_2000DAO {
 
	public HD_VACA_2000_LDataSet hd_vaca_2000_l(HD_VACA_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2000_LDataSet ds = (HD_VACA_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_2001_MDataSet hd_vaca_2001_m(HD_VACA_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2001_MDataSet ds = (HD_VACA_2001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_2100_ADataSet hd_vaca_2100_a(HD_VACA_2100_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2100_ADataSet ds = (HD_VACA_2100_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_2210_LDataSet hd_vaca_2210_l(HD_VACA_2210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2210_LDataSet ds = (HD_VACA_2210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_2220_LDataSet hd_vaca_2220_l(HD_VACA_2220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2220_LDataSet ds = (HD_VACA_2220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_VACA_2300_LDataSet hd_vaca_2300_l(HD_VACA_2300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2300_LDataSet ds = (HD_VACA_2300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_2302_LDataSet hd_vaca_2302_l(HD_VACA_2302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_2302_LDataSet ds = (HD_VACA_2302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
