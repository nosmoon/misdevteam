package chosun.ciis.mt.commatr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */ 
 
public class MT_COMMATR_4000DAO {
	
	public MT_COMMATR_4000_LDataSet mt_commatr_4000(MT_COMMATR_4000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4000_LDataSet ds = (MT_COMMATR_4000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_4001_LDataSet mt_commatr_4001(MT_COMMATR_4001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4001_LDataSet ds = (MT_COMMATR_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_COMMATR_4002_LDataSet mt_commatr_4002(MT_COMMATR_4002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4002_LDataSet ds = (MT_COMMATR_4002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_4003_ADataSet mt_commatr_4003(MT_COMMATR_4003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_4003_ADataSet ds = (MT_COMMATR_4003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}