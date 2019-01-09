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

package chosun.ciis.as.lear.dao;

import java.sql.*;

import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */
public class AS_LEAR_1000DAO {
	
	public AS_LEAR_1001_MDataSet as_lear_1001_m(AS_LEAR_1001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1001_MDataSet ds = (AS_LEAR_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1002_LDataSet as_lear_1002_l(AS_LEAR_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1002_LDataSet ds = (AS_LEAR_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1003_LDataSet as_lear_1003_l(AS_LEAR_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1003_LDataSet ds = (AS_LEAR_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1004_LDataSet as_lear_1004_l(AS_LEAR_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1004_LDataSet ds = (AS_LEAR_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1201_LDataSet as_lear_1201_l(AS_LEAR_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1201_LDataSet ds = (AS_LEAR_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1202_MDataSet as_lear_1202_m(AS_LEAR_1202_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1202_MDataSet ds = (AS_LEAR_1202_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1301_LDataSet as_lear_1301_l(AS_LEAR_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1301_LDataSet ds = (AS_LEAR_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1302_MDataSet as_lear_1302_m(AS_LEAR_1302_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1302_MDataSet ds = (AS_LEAR_1302_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAR_1401_LDataSet as_lear_1401_l(AS_LEAR_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1401_LDataSet ds = (AS_LEAR_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAR_1501_LDataSet as_lear_1501_l(AS_LEAR_1501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAR_1501_LDataSet ds = (AS_LEAR_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}
