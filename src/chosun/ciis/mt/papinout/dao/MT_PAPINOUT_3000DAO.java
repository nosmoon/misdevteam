package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 *
 */
public class MT_PAPINOUT_3000DAO {

    public MT_PAPINOUT_3001_LDataSet getMt_Papinout_3001(MT_PAPINOUT_3001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3001_LDataSet ds = (MT_PAPINOUT_3001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3002_LDataSet getMt_Papinout_3002(MT_PAPINOUT_3002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3002_LDataSet ds = (MT_PAPINOUT_3002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3003_LDataSet getMt_Papinout_3003(MT_PAPINOUT_3003_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3003_LDataSet ds = (MT_PAPINOUT_3003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3004_DDataSet getMt_Papinout_3004(MT_PAPINOUT_3004_DDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3004_DDataSet ds = (MT_PAPINOUT_3004_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3005_IDataSet getMt_Papinout_3005(MT_PAPINOUT_3005_IDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3005_IDataSet ds = (MT_PAPINOUT_3005_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3006_LDataSet getMt_Papinout_3006(MT_PAPINOUT_3006_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3006_LDataSet ds = (MT_PAPINOUT_3006_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3007_UDataSet getMt_Papinout_3007(MT_PAPINOUT_3007_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3007_UDataSet ds = (MT_PAPINOUT_3007_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3008_LDataSet getMt_Papinout_3008(MT_PAPINOUT_3008_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3008_LDataSet ds = (MT_PAPINOUT_3008_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3010_LDataSet getMt_Papinout_3010(MT_PAPINOUT_3010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3010_LDataSet ds = (MT_PAPINOUT_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3012_UDataSet getMt_Papinout_3012(MT_PAPINOUT_3012_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3012_UDataSet ds = (MT_PAPINOUT_3012_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3013_UDataSet getMt_Papinout_3013(MT_PAPINOUT_3013_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3013_UDataSet ds = (MT_PAPINOUT_3013_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3014_UDataSet getMt_Papinout_3014(MT_PAPINOUT_3014_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3014_UDataSet ds = (MT_PAPINOUT_3014_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3017_LDataSet getMt_Papinout_3017(MT_PAPINOUT_3017_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3017_LDataSet ds = (MT_PAPINOUT_3017_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3018_LDataSet getMt_Papinout_3018(MT_PAPINOUT_3018_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3018_LDataSet ds = (MT_PAPINOUT_3018_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3100_LDataSet getMt_Papinout_3100(MT_PAPINOUT_3100_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3100_LDataSet ds = (MT_PAPINOUT_3100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3101_LDataSet getMt_Papinout_3101(MT_PAPINOUT_3101_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3101_LDataSet ds = (MT_PAPINOUT_3101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3102_IDataSet getMt_Papinout_3102(MT_PAPINOUT_3102_IDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3102_IDataSet ds = (MT_PAPINOUT_3102_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_3103_DDataSet getMt_Papinout_3103(MT_PAPINOUT_3103_DDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_3103_DDataSet ds = (MT_PAPINOUT_3103_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}