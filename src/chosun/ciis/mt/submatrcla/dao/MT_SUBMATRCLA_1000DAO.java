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
public class MT_SUBMATRCLA_1000DAO {

    public MT_SUBMATRCLA_1100_LDataSet getMt_Submatrin_1100(MT_SUBMATRCLA_1100_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISCOM");
//        System.out.println(manager.m_dbPool);
        System.out.println("submatrcla..Step.");
        MT_SUBMATRCLA_1100_LDataSet ds = (MT_SUBMATRCLA_1100_LDataSet) manager.executeCall(dm);
        System.out.println("submatrcla22..Step.");
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRCLA_1101_LDataSet mt_submatrcla_1101_l(MT_SUBMATRCLA_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1101_LDataSet ds = (MT_SUBMATRCLA_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_1110_LDataSet mt_submatrcla_1110_l(MT_SUBMATRCLA_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1110_LDataSet ds = (MT_SUBMATRCLA_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_1111_UDataSet mt_submatrcla_1111_u(MT_SUBMATRCLA_1111_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1111_UDataSet ds = (MT_SUBMATRCLA_1111_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_1120_LDataSet mt_submatrcla_1120_l(MT_SUBMATRCLA_1120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1120_LDataSet ds = (MT_SUBMATRCLA_1120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_1130_ADataSet mt_submatrcla_1130_a(MT_SUBMATRCLA_1130_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1130_ADataSet ds = (MT_SUBMATRCLA_1130_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_1140_LDataSet mt_submatrcla_1140_l(MT_SUBMATRCLA_1140_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1140_LDataSet ds = (MT_SUBMATRCLA_1140_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_1141_LDataSet mt_submatrcla_1141_l(MT_SUBMATRCLA_1141_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1141_LDataSet ds = (MT_SUBMATRCLA_1141_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_1142_LDataSet mt_submatrcla_1142_l(MT_SUBMATRCLA_1142_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1142_LDataSet ds = (MT_SUBMATRCLA_1142_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_1150_LDataSet mt_submatrcla_1150_l(MT_SUBMATRCLA_1150_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1150_LDataSet ds = (MT_SUBMATRCLA_1150_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_1160_LDataSet mt_submatrcla_1160_l(MT_SUBMATRCLA_1160_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1160_LDataSet ds = (MT_SUBMATRCLA_1160_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_1310_LDataSet mt_submatrcla_1310_l(MT_SUBMATRCLA_1310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_1310_LDataSet ds = (MT_SUBMATRCLA_1310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}