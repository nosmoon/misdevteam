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
  
public class MT_CLOSE_5000DAO { 
    
	public MT_CLOSE_5001_LDataSet mt_close_5001_l(MT_CLOSE_5001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5001_LDataSet ds = (MT_CLOSE_5001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5002_ADataSet mt_close_5002_a(MT_CLOSE_5002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5002_ADataSet ds = (MT_CLOSE_5002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5003_ADataSet mt_close_5003_a(MT_CLOSE_5003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5003_ADataSet ds = (MT_CLOSE_5003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5004_ADataSet mt_close_5004_a(MT_CLOSE_5004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5004_ADataSet ds = (MT_CLOSE_5004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5005_ADataSet mt_close_5005_a(MT_CLOSE_5005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5005_ADataSet ds = (MT_CLOSE_5005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5006_LDataSet mt_close_5006_l(MT_CLOSE_5006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5006_LDataSet ds = (MT_CLOSE_5006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5007_LDataSet mt_close_5007_l(MT_CLOSE_5007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5007_LDataSet ds = (MT_CLOSE_5007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5008_ADataSet mt_close_5008_a(MT_CLOSE_5008_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5008_ADataSet ds = (MT_CLOSE_5008_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5009_ADataSet mt_close_5009_a(MT_CLOSE_5009_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5009_ADataSet ds = (MT_CLOSE_5009_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_5011_LDataSet mt_close_5011_l(MT_CLOSE_5011_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_5011_LDataSet ds = (MT_CLOSE_5011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
