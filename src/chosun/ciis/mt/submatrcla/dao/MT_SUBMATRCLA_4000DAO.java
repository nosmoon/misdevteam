package chosun.ciis.mt.submatrcla.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 *
 */
public class MT_SUBMATRCLA_4000DAO {

	public MT_SUBMATRCLA_4201_LDataSet getMt_submatrcla_4201(MT_SUBMATRCLA_4201_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRCLA_4201_LDataSet ds = (MT_SUBMATRCLA_4201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}