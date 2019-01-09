package chosun.ciis.mt.submatrcla.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.outsdelmt.dm.MT_OUTSDELMT_3003_LDM;
import chosun.ciis.mt.outsdelmt.ds.MT_OUTSDELMT_3003_LDataSet;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 *
 */
public class MT_SUBMATRCLA_3000DAO {

	public MT_SUBMATRCLA_3100_MDataSet mt_submatrcla_3100_m(MT_SUBMATRCLA_3100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3100_MDataSet ds = (MT_SUBMATRCLA_3100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_SUBMATRCLA_3321_ADataSet mt_submatrcla_3321_a(MT_SUBMATRCLA_3321_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRCLA_3321_ADataSet ds = (MT_SUBMATRCLA_3321_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_SUBMATRCLA_3104_LDataSet getMt_submatrcla_3104(MT_SUBMATRCLA_3104_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRCLA_3104_LDataSet ds = (MT_SUBMATRCLA_3104_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}