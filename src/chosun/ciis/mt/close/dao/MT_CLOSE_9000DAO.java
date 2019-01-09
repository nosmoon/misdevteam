package chosun.ciis.mt.close.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */   
  
public class MT_CLOSE_9000DAO { 
    
	public MT_CLOSE_9001_LDataSet mt_close_9001_l(MT_CLOSE_9001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_9001_LDataSet ds = (MT_CLOSE_9001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_9002_LDataSet mt_close_9002_l(MT_CLOSE_9002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_9002_LDataSet ds = (MT_CLOSE_9002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_9003_ADataSet mt_close_9003_a(MT_CLOSE_9003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_9003_ADataSet ds = (MT_CLOSE_9003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_9004_LDataSet mt_close_9004_l(MT_CLOSE_9004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_9004_LDataSet ds = (MT_CLOSE_9004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_9005_ADataSet mt_close_9005_a(MT_CLOSE_9005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_9005_ADataSet ds = (MT_CLOSE_9005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
