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
public class HD_AFFR_7000DAO {
	public HD_AFFR_7000_LDataSet hd_affr_7000_l(HD_AFFR_7000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_7000_LDataSet ds = (HD_AFFR_7000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_7010_LDataSet hd_affr_7010_l(HD_AFFR_7010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_7010_LDataSet ds = (HD_AFFR_7010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_7011_ADataSet hd_affr_7011_a(HD_AFFR_7011_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_7011_ADataSet ds = (HD_AFFR_7011_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_7012_LDataSet hd_affr_7012_l(HD_AFFR_7012_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_7012_LDataSet ds = (HD_AFFR_7012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}