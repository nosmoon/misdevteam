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

package chosun.ciis.as.redm.dao;

import java.sql.*;

import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */
public class AS_REDM_1000DAO {
	
	public AS_REDM_1000_LDataSet as_redm_1000_l(AS_REDM_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1000_LDataSet ds = (AS_REDM_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1001_MDataSet as_redm_1001_m(AS_REDM_1001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1001_MDataSet ds = (AS_REDM_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_REDM_1003_ADataSet as_redm_1003_a(AS_REDM_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1003_ADataSet ds = (AS_REDM_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_REDM_1201_LDataSet as_redm_1201_l(AS_REDM_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1201_LDataSet ds = (AS_REDM_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1202_UDataSet as_redm_1202_u(AS_REDM_1202_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1202_UDataSet ds = (AS_REDM_1202_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1301_MDataSet as_redm_1301_m(AS_REDM_1301_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1301_MDataSet ds = (AS_REDM_1301_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1302_LDataSet as_redm_1302_l(AS_REDM_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1302_LDataSet ds = (AS_REDM_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1303_MDataSet as_redm_1303_m(AS_REDM_1303_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1303_MDataSet ds = (AS_REDM_1303_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1304_ADataSet as_redm_1304_a(AS_REDM_1304_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1304_ADataSet ds = (AS_REDM_1304_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1305_MDataSet as_redm_1305_m(AS_REDM_1305_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1305_MDataSet ds = (AS_REDM_1305_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_REDM_1401_MDataSet as_redm_1401_m(AS_REDM_1401_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1401_MDataSet ds = (AS_REDM_1401_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_REDM_1004_LDataSet as_redm_1004_l(AS_REDM_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1004_LDataSet ds = (AS_REDM_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}


	public AS_REDM_1002_ADataSet as_redm_1002_a(AS_REDM_1002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_REDM_1002_ADataSet ds = (AS_REDM_1002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}


}
