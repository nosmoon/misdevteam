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

public class MT_COMMATR_3000DAO {
	public MT_COMMATR_3000_LDataSet mt_commatr_3000_l(MT_COMMATR_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3000_LDataSet ds = (MT_COMMATR_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3001_ADataSet mt_commatr_3001_a(MT_COMMATR_3001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3001_ADataSet ds = (MT_COMMATR_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3002_LDataSet mt_commatr_3002_l(MT_COMMATR_3002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3002_LDataSet ds = (MT_COMMATR_3002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3003_ADataSet mt_commatr_3003_a(MT_COMMATR_3003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3003_ADataSet ds = (MT_COMMATR_3003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3004_ADataSet mt_commatr_3004_a(MT_COMMATR_3004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3004_ADataSet ds = (MT_COMMATR_3004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3005_ADataSet mt_commatr_3005_a(MT_COMMATR_3005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3005_ADataSet ds = (MT_COMMATR_3005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3006_LDataSet mt_commatr_3006_l(MT_COMMATR_3006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3006_LDataSet ds = (MT_COMMATR_3006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3007_LDataSet mt_commatr_3007_l(MT_COMMATR_3007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3007_LDataSet ds = (MT_COMMATR_3007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3010_LDataSet mt_commatr_3010_l(MT_COMMATR_3010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3010_LDataSet ds = (MT_COMMATR_3010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3100_LDataSet mt_commatr_3100_l(MT_COMMATR_3100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3100_LDataSet ds = (MT_COMMATR_3100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3200_LDataSet mt_commatr_3200_l(MT_COMMATR_3200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3200_LDataSet ds = (MT_COMMATR_3200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3210_ADataSet mt_commatr_3210_a(MT_COMMATR_3210_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3210_ADataSet ds = (MT_COMMATR_3210_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3300_LDataSet mt_commatr_3300_l(MT_COMMATR_3300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3300_LDataSet ds = (MT_COMMATR_3300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3310_ADataSet mt_commatr_3310_a(MT_COMMATR_3310_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3310_ADataSet ds = (MT_COMMATR_3310_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3400_LDataSet mt_commatr_3400_l(MT_COMMATR_3400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3400_LDataSet ds = (MT_COMMATR_3400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_3410_ADataSet mt_commatr_3410_a(MT_COMMATR_3410_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_3410_ADataSet ds = (MT_COMMATR_3410_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}