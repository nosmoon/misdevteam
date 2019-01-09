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

package chosun.ciis.as.asrd.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.ds.*;

/**
 * 
 */
public class AS_ASRD_1000DAO {
	
	
	public AS_ASRD_1301_MDataSet as_asrd_1301_m(AS_ASRD_1301_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1301_MDataSet ds = (AS_ASRD_1301_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASRD_1302_LDataSet as_asrd_1302_l(AS_ASRD_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1302_LDataSet ds = (AS_ASRD_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASRD_1401_LDataSet as_asrd_1401_l(AS_ASRD_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1401_LDataSet ds = (AS_ASRD_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASRD_1402_LDataSet as_asrd_1402_l(AS_ASRD_1402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1402_LDataSet ds = (AS_ASRD_1402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASRD_1501_MDataSet as_asrd_1501_m(AS_ASRD_1501_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1501_MDataSet ds = (AS_ASRD_1501_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASRD_1600_LDataSet as_asrd_1600_l(AS_ASRD_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1600_LDataSet ds = (AS_ASRD_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASRD_1700_LDataSet as_asrd_1700_l(AS_ASRD_1700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1700_LDataSet ds = (AS_ASRD_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASRD_1800_LDataSet as_asrd_1800_l(AS_ASRD_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1800_LDataSet ds = (AS_ASRD_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASRD_1901_LDataSet as_asrd_1901_l(AS_ASRD_1901_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASRD_1901_LDataSet ds = (AS_ASRD_1901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
