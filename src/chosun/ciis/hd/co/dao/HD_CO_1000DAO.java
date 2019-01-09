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

package chosun.ciis.hd.co.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.co.dm.*;
import chosun.ciis.hd.co.ds.*;

/** 
 * 
 */
public class HD_CO_1000DAO {

	public HD_CO_1000_SDataSet hd_co_1000_s(HD_CO_1000_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CO_1000_SDataSet ds = (HD_CO_1000_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_CO_1001_SDataSet hd_co_1001_s(HD_CO_1001_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CO_1001_SDataSet ds = (HD_CO_1001_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_CO_1003_UDataSet hd_co_1003_u(HD_CO_1003_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CO_1003_UDataSet ds = (HD_CO_1003_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
