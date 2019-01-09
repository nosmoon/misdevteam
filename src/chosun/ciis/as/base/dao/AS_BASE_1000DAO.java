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

package chosun.ciis.as.base.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.base.dm.*;
import chosun.ciis.as.base.ds.*;

/**
 * 
 */
public class AS_BASE_1000DAO {
	
	public AS_BASE_1001_LDataSet as_base_1001_l(AS_BASE_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_BASE_1001_LDataSet ds = (AS_BASE_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		return ds;
	}
	
	public AS_BASE_1002_LDataSet as_base_1002_l(AS_BASE_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_BASE_1002_LDataSet ds = (AS_BASE_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_BASE_1003_ADataSet as_base_1003_a(AS_BASE_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_BASE_1003_ADataSet ds = (AS_BASE_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_BASE_1101_LDataSet as_base_1101_l(AS_BASE_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_BASE_1101_LDataSet ds = (AS_BASE_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_BASE_1101_MDataSet as_base_1101_m(AS_BASE_1101_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_BASE_1101_MDataSet ds = (AS_BASE_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_BASE_1102_LDataSet as_base_1102_l(AS_BASE_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_BASE_1102_LDataSet ds = (AS_BASE_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_BASE_1103_ADataSet as_base_1103_a(AS_BASE_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_BASE_1103_ADataSet ds = (AS_BASE_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}
