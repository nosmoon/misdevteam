package chosun.ciis.mt.etccar.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

public class MT_ETCCAR_5000DAO {
	
	public MT_ETCCAR_5100_LDataSet mt_etccar_5100_l(MT_ETCCAR_5100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5100_LDataSet ds = (MT_ETCCAR_5100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCCAR_5200_LDataSet mt_etccar_5200_l(MT_ETCCAR_5200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5200_LDataSet ds = (MT_ETCCAR_5200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCCAR_5300_LDataSet mt_etccar_5300_l(MT_ETCCAR_5300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5300_LDataSet ds = (MT_ETCCAR_5300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCCAR_5400_LDataSet mt_etccar_5400_l(MT_ETCCAR_5400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5400_LDataSet ds = (MT_ETCCAR_5400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCCAR_5410_MDataSet mt_etccar_5410_m(MT_ETCCAR_5410_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5410_MDataSet ds = (MT_ETCCAR_5410_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCCAR_5420_ADataSet mt_etccar_5420_a(MT_ETCCAR_5420_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5420_ADataSet ds = (MT_ETCCAR_5420_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_ETCCAR_5500_LDataSet mt_etccar_5500_l(MT_ETCCAR_5500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_5500_LDataSet ds = (MT_ETCCAR_5500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}