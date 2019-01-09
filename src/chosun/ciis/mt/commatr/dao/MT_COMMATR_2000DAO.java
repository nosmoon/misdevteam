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
 
public class MT_COMMATR_2000DAO { 
    /**
     *  TAB 1 자재내역 등록  
     * @param dm
     * @return
     * @throws AppException
     */




	public MT_COMMATR_2100_LDataSet mt_commatr_2100_l(MT_COMMATR_2100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2100_LDataSet ds = (MT_COMMATR_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_2110_ADataSet mt_commatr_2110_a(MT_COMMATR_2110_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2110_ADataSet ds = (MT_COMMATR_2110_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_2200_LDataSet mt_commatr_2200_l(MT_COMMATR_2200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2200_LDataSet ds = (MT_COMMATR_2200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_2210_LDataSet mt_commatr_2210_l(MT_COMMATR_2210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2210_LDataSet ds = (MT_COMMATR_2210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_2220_LDataSet mt_commatr_2220_l(MT_COMMATR_2220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_2220_LDataSet ds = (MT_COMMATR_2220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}