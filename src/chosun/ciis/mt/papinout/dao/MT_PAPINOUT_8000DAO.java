package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 *
 */
public class MT_PAPINOUT_8000DAO {

    public MT_PAPINOUT_8001_LDataSet getMt_Papinout_8001(MT_PAPINOUT_8001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8001_LDataSet ds = (MT_PAPINOUT_8001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8002_LDataSet getMt_Papinout_8002(MT_PAPINOUT_8002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8002_LDataSet ds = (MT_PAPINOUT_8002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8003_LDataSet getMt_Papinout_8003(MT_PAPINOUT_8003_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8003_LDataSet ds = (MT_PAPINOUT_8003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8004_LDataSet getMt_Papinout_8004(MT_PAPINOUT_8004_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8004_LDataSet ds = (MT_PAPINOUT_8004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8005_LDataSet getMt_Papinout_8005(MT_PAPINOUT_8005_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8005_LDataSet ds = (MT_PAPINOUT_8005_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8006_LDataSet getMt_Papinout_8006(MT_PAPINOUT_8006_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8006_LDataSet ds = (MT_PAPINOUT_8006_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8007_LDataSet getMt_Papinout_8007(MT_PAPINOUT_8007_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8007_LDataSet ds = (MT_PAPINOUT_8007_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8008_LDataSet getMt_Papinout_8008(MT_PAPINOUT_8008_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8008_LDataSet ds = (MT_PAPINOUT_8008_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8009_LDataSet getMt_Papinout_8009(MT_PAPINOUT_8009_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8009_LDataSet ds = (MT_PAPINOUT_8009_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8010_LDataSet getMt_Papinout_8010(MT_PAPINOUT_8010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8010_LDataSet ds = (MT_PAPINOUT_8010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_8011_LDataSet getMt_Papinout_8011(MT_PAPINOUT_8011_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_8011_LDataSet ds = (MT_PAPINOUT_8011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


}