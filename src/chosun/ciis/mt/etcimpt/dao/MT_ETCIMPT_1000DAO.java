package chosun.ciis.mt.etcimpt.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */ 
 
public class MT_ETCIMPT_1000DAO { 
  
	public MT_ETCIMPT_1000_MDataSet mt_etcimpt_1000_m(MT_ETCIMPT_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1000_MDataSet ds = (MT_ETCIMPT_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_ETCIMPT_1010_LDataSet mt_etcimpt_1010_l(MT_ETCIMPT_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1010_LDataSet ds = (MT_ETCIMPT_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCIMPT_1101_LDataSet mt_etcimpt_1101_l(MT_ETCIMPT_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1101_LDataSet ds = (MT_ETCIMPT_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCIMPT_1110_LDataSet mt_etcimpt_1110_l(MT_ETCIMPT_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1110_LDataSet ds = (MT_ETCIMPT_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCIMPT_1120_ADataSet mt_etcimpt_1120_a(MT_ETCIMPT_1120_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1120_ADataSet ds = (MT_ETCIMPT_1120_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCIMPT_1201_LDataSet mt_etcimpt_1201_l(MT_ETCIMPT_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1201_LDataSet ds = (MT_ETCIMPT_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_ETCIMPT_1205_LDataSet mt_etcimpt_1205_l(MT_ETCIMPT_1205_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1205_LDataSet ds = (MT_ETCIMPT_1205_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_ETCIMPT_1210_LDataSet mt_etcimpt_1210_l(MT_ETCIMPT_1210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1210_LDataSet ds = (MT_ETCIMPT_1210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_ETCIMPT_1221_ADataSet mt_etcimpt_1221_a(MT_ETCIMPT_1221_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1221_ADataSet ds = (MT_ETCIMPT_1221_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_ETCIMPT_1300_LDataSet mt_etcimpt_1300_l(MT_ETCIMPT_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1300_LDataSet ds = (MT_ETCIMPT_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCIMPT_1220_ADataSet mt_etcimpt_1220_a(MT_ETCIMPT_1220_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1220_ADataSet ds = (MT_ETCIMPT_1220_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCIMPT_1230_LDataSet mt_etcimpt_1230_l(MT_ETCIMPT_1230_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCIMPT_1230_LDataSet ds = (MT_ETCIMPT_1230_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}