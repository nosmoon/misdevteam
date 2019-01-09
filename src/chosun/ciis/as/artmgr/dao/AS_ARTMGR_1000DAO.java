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

package chosun.ciis.as.artmgr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.artmgr.dm.*;
import chosun.ciis.as.artmgr.ds.*;

/**
 * 
 */
public class AS_ARTMGR_1000DAO {
	public AS_ARTMGR_1001_MDataSet as_artmgr_1001_m(AS_ARTMGR_1001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ARTMGR_1001_MDataSet ds = (AS_ARTMGR_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ARTMGR_1002_LDataSet as_artmgr_1002_l(AS_ARTMGR_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ARTMGR_1002_LDataSet ds = (AS_ARTMGR_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ARTMGR_1003_ADataSet as_artmgr_1003_a(AS_ARTMGR_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ARTMGR_1003_ADataSet ds = (AS_ARTMGR_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ARTMGR_1004_LDataSet as_artmgr_1004_l(AS_ARTMGR_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ARTMGR_1004_LDataSet ds = (AS_ARTMGR_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ARTMGR_1005_LDataSet as_artmgr_1005_l(AS_ARTMGR_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ARTMGR_1005_LDataSet ds = (AS_ARTMGR_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
