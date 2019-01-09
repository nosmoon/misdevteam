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
public class HD_AFFR_6000DAO {
	public HD_AFFR_6000_LDataSet hd_affr_6000_l(HD_AFFR_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6000_LDataSet ds = (HD_AFFR_6000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_6011_ADataSet hd_affr_6011_a(HD_AFFR_6011_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6011_ADataSet ds = (HD_AFFR_6011_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_6010_LDataSet hd_affr_6010_l(HD_AFFR_6010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6010_LDataSet ds = (HD_AFFR_6010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_6021_LDataSet hd_affr_6021_l(HD_AFFR_6021_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6021_LDataSet ds = (HD_AFFR_6021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_6022_LDataSet hd_affr_6022_l(HD_AFFR_6022_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6022_LDataSet ds = (HD_AFFR_6022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_6023_LDataSet hd_affr_6023_l(HD_AFFR_6023_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6023_LDataSet ds = (HD_AFFR_6023_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_6024_ADataSet hd_affr_6024_a(HD_AFFR_6024_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6024_ADataSet ds = (HD_AFFR_6024_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_6012_ADataSet hd_affr_6012_a(HD_AFFR_6012_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6012_ADataSet ds = (HD_AFFR_6012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_6013_LDataSet hd_affr_6013_l(HD_AFFR_6013_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6013_LDataSet ds = (HD_AFFR_6013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_6100_LDataSet hd_affr_6100_l(HD_AFFR_6100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6100_LDataSet ds = (HD_AFFR_6100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_6101_ADataSet hd_affr_6101_a(HD_AFFR_6101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_6101_ADataSet ds = (HD_AFFR_6101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

