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

package chosun.ciis.as.mach.dao;

import java.sql.*;

import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.mach.dm.*;
import chosun.ciis.as.mach.ds.*;

/**
 * 
 */
public class AS_MACH_1000DAO {
	
	public AS_MACH_1000_MDataSet as_mach_1000_m(AS_MACH_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1000_MDataSet ds = (AS_MACH_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_MACH_1005_LDataSet as_mach_1005_l(AS_MACH_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1005_LDataSet ds = (AS_MACH_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_MACH_1010_LDataSet as_mach_1010_l(AS_MACH_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1010_LDataSet ds = (AS_MACH_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_MACH_1015_SDataSet as_mach_1015_s(AS_MACH_1015_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1015_SDataSet ds = (AS_MACH_1015_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_MACH_1020_ADataSet as_mach_1020_a(AS_MACH_1020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1020_ADataSet ds = (AS_MACH_1020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_MACH_1040_ADataSet as_mach_1040_a(AS_MACH_1040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1040_ADataSet ds = (AS_MACH_1040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_MACH_1030_LDataSet as_mach_1030_l(AS_MACH_1030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1030_LDataSet ds = (AS_MACH_1030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_MACH_1100_MDataSet as_mach_1100_m(AS_MACH_1100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1100_MDataSet ds = (AS_MACH_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_MACH_1110_LDataSet as_mach_1110_l(AS_MACH_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1110_LDataSet ds = (AS_MACH_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_MACH_1120_ADataSet as_mach_1120_a(AS_MACH_1120_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_MACH_1120_ADataSet ds = (AS_MACH_1120_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
