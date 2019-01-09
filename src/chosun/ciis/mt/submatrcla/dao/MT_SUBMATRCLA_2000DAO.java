package chosun.ciis.mt.submatrcla.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 *
 */
public class MT_SUBMATRCLA_2000DAO {

	public MT_SUBMATRCLA_2000_LDataSet mt_submatrcla_2000_l(MT_SUBMATRCLA_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2000_LDataSet ds = (MT_SUBMATRCLA_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_2002_MDataSet mt_submatrcla_2002_m(MT_SUBMATRCLA_2002_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2002_MDataSet ds = (MT_SUBMATRCLA_2002_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_2001_LDataSet mt_submatrcla_2001_l(MT_SUBMATRCLA_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2001_LDataSet ds = (MT_SUBMATRCLA_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_2003_ADataSet mt_submatrcla_2003_a(MT_SUBMATRCLA_2003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2003_ADataSet ds = (MT_SUBMATRCLA_2003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_2004_LDataSet mt_submatrcla_2004_l(MT_SUBMATRCLA_2004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2004_LDataSet ds = (MT_SUBMATRCLA_2004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_2005_ADataSet mt_submatrcla_2005_a(MT_SUBMATRCLA_2005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2005_ADataSet ds = (MT_SUBMATRCLA_2005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_2006_ADataSet mt_submatrcla_2006_a(MT_SUBMATRCLA_2006_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2006_ADataSet ds = (MT_SUBMATRCLA_2006_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_2010_ADataSet mt_submatrcla_2010_a(MT_SUBMATRCLA_2010_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2010_ADataSet ds = (MT_SUBMATRCLA_2010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_2020_UDataSet mt_submatrcla_2020_u(MT_SUBMATRCLA_2020_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_2020_UDataSet ds = (MT_SUBMATRCLA_2020_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}