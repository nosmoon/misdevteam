package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 *
 */
public class MT_PAPINOUT_1000DAO {

    public MT_PAPINOUT_1001_LDataSet getMt_Papinout_1001(MT_PAPINOUT_1001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_1001_LDataSet ds = (MT_PAPINOUT_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_1002_LDataSet getMt_Papinout_1002(MT_PAPINOUT_1002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_1002_LDataSet ds = (MT_PAPINOUT_1002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_1003_LDataSet getMt_Papinout_1003(MT_PAPINOUT_1003_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_1003_LDataSet ds = (MT_PAPINOUT_1003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}