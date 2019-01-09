package chosun.ciis.mt.knowhow.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.knowhow.dm.*;
import chosun.ciis.mt.knowhow.ds.*;

/**
 * 
 */ 
 
public class MT_KNOWHOW_1000DAO { 
  
	public MT_KNOWHOW_1001_MDataSet mt_knowhow_1001_m(MT_KNOWHOW_1001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1001_MDataSet ds = (MT_KNOWHOW_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_KNOWHOW_1002_LDataSet mt_knowhow_1002_l(MT_KNOWHOW_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1002_LDataSet ds = (MT_KNOWHOW_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_KNOWHOW_1003_LDataSet mt_knowhow_1003_l(MT_KNOWHOW_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1003_LDataSet ds = (MT_KNOWHOW_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_KNOWHOW_1004_ADataSet mt_knowhow_1004_a(MT_KNOWHOW_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1004_ADataSet ds = (MT_KNOWHOW_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_KNOWHOW_1005_ADataSet mt_knowhow_1005_a(MT_KNOWHOW_1005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_KNOWHOW_1005_ADataSet ds = (MT_KNOWHOW_1005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}