package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 *
 */
public class MT_PAPINOUT_6000DAO {

	public MT_PAPINOUT_6101_LDataSet getMt_Papinout_6101(MT_PAPINOUT_6101_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6101_LDataSet ds = (MT_PAPINOUT_6101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public MT_PAPINOUT_6102_LDataSet getMt_Papinout_6102(MT_PAPINOUT_6102_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6102_LDataSet ds = (MT_PAPINOUT_6102_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_PAPINOUT_6103_LDataSet getMt_Papinout_6103(MT_PAPINOUT_6103_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6103_LDataSet ds = (MT_PAPINOUT_6103_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_PAPINOUT_6104_IDataSet getMt_Papinout_6104(MT_PAPINOUT_6104_IDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6104_IDataSet ds = (MT_PAPINOUT_6104_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_PAPINOUT_6105_DDataSet getMt_Papinout_6105(MT_PAPINOUT_6105_DDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6105_DDataSet ds = (MT_PAPINOUT_6105_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_PAPINOUT_6106_LDataSet getMt_Papinout_6106(MT_PAPINOUT_6106_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6106_LDataSet ds = (MT_PAPINOUT_6106_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_PAPINOUT_6107_ADataSet getMt_Papinout_6107(MT_PAPINOUT_6107_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6107_ADataSet ds = (MT_PAPINOUT_6107_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_6201_LDataSet getMt_Papinout_6201(MT_PAPINOUT_6201_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6201_LDataSet ds = (MT_PAPINOUT_6201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_6202_LDataSet getMt_Papinout_6202(MT_PAPINOUT_6202_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_6202_LDataSet ds = (MT_PAPINOUT_6202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}