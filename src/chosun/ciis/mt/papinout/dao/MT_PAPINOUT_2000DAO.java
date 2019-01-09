package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 *
 */
public class MT_PAPINOUT_2000DAO {

    public MT_PAPINOUT_2100_LDataSet getMt_Papinout_2100(MT_PAPINOUT_2100_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2100_LDataSet ds = (MT_PAPINOUT_2100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2200_LDataSet getMt_Papinout_2200(MT_PAPINOUT_2200_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2200_LDataSet ds = (MT_PAPINOUT_2200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2201_ADataSet getMt_Papinout_2201(MT_PAPINOUT_2201_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2201_ADataSet ds = (MT_PAPINOUT_2201_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2202_ADataSet getMt_Papinout_2202(MT_PAPINOUT_2202_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2202_ADataSet ds = (MT_PAPINOUT_2202_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2203_ADataSet getMt_Papinout_2203(MT_PAPINOUT_2203_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2203_ADataSet ds = (MT_PAPINOUT_2203_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2204_ADataSet getMt_Papinout_2204(MT_PAPINOUT_2204_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2204_ADataSet ds = (MT_PAPINOUT_2204_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2205_LDataSet getMt_Papinout_2205(MT_PAPINOUT_2205_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2205_LDataSet ds = (MT_PAPINOUT_2205_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2206_LDataSet getMt_Papinout_2206(MT_PAPINOUT_2206_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2206_LDataSet ds = (MT_PAPINOUT_2206_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2207_LDataSet getMt_Papinout_2207(MT_PAPINOUT_2207_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2207_LDataSet ds = (MT_PAPINOUT_2207_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2208_LDataSet getMt_Papinout_2208(MT_PAPINOUT_2208_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2208_LDataSet ds = (MT_PAPINOUT_2208_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2209_LDataSet getMt_Papinout_2209(MT_PAPINOUT_2209_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2209_LDataSet ds = (MT_PAPINOUT_2209_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2210_LDataSet getMt_Papinout_2210(MT_PAPINOUT_2210_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2210_LDataSet ds = (MT_PAPINOUT_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2211_LDataSet getMt_Papinout_2211(MT_PAPINOUT_2211_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2211_LDataSet ds = (MT_PAPINOUT_2211_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2212_ADataSet getMt_Papinout_2212(MT_PAPINOUT_2212_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2212_ADataSet ds = (MT_PAPINOUT_2212_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2213_ADataSet getMt_Papinout_2213(MT_PAPINOUT_2213_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2213_ADataSet ds = (MT_PAPINOUT_2213_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2214_LDataSet getMt_Papinout_2214(MT_PAPINOUT_2214_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2214_LDataSet ds = (MT_PAPINOUT_2214_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2216_LDataSet getMt_Papinout_2216(MT_PAPINOUT_2216_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2216_LDataSet ds = (MT_PAPINOUT_2216_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2217_MDataSet getMt_Papinout_2217(MT_PAPINOUT_2217_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2217_MDataSet ds = (MT_PAPINOUT_2217_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2218_LDataSet getMt_Papinout_2218(MT_PAPINOUT_2218_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2218_LDataSet ds = (MT_PAPINOUT_2218_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_PAPINOUT_2219_LDataSet getMt_Papinout_2219(MT_PAPINOUT_2219_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2219_LDataSet ds = (MT_PAPINOUT_2219_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2220_LDataSet getMt_Papinout_2220(MT_PAPINOUT_2220_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2220_LDataSet ds = (MT_PAPINOUT_2220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2223_LDataSet getMt_Papinout_2223(MT_PAPINOUT_2223_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2223_LDataSet ds = (MT_PAPINOUT_2223_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2224_LDataSet getMt_Papinout_2224(MT_PAPINOUT_2224_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2224_LDataSet ds = (MT_PAPINOUT_2224_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2300_LDataSet getMt_Papinout_2300(MT_PAPINOUT_2300_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2300_LDataSet ds = (MT_PAPINOUT_2300_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2301_LDataSet getMt_Papinout_2301(MT_PAPINOUT_2301_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2301_LDataSet ds = (MT_PAPINOUT_2301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2302_ADataSet getMt_Papinout_2302(MT_PAPINOUT_2302_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2302_ADataSet ds = (MT_PAPINOUT_2302_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2303_ADataSet getMt_Papinout_2303(MT_PAPINOUT_2303_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2303_ADataSet ds = (MT_PAPINOUT_2303_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2400_LDataSet getMt_Papinout_2400(MT_PAPINOUT_2400_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2400_LDataSet ds = (MT_PAPINOUT_2400_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2401_LDataSet getMt_Papinout_2401(MT_PAPINOUT_2401_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2401_LDataSet ds = (MT_PAPINOUT_2401_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2402_LDataSet getMt_Papinout_2402(MT_PAPINOUT_2402_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2402_LDataSet ds = (MT_PAPINOUT_2402_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2500_LDataSet getMt_Papinout_2500(MT_PAPINOUT_2500_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2500_LDataSet ds = (MT_PAPINOUT_2500_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2501_LDataSet getMt_Papinout_2501(MT_PAPINOUT_2501_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2501_LDataSet ds = (MT_PAPINOUT_2501_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2502_IDataSet getMt_Papinout_2502(MT_PAPINOUT_2502_IDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2502_IDataSet ds = (MT_PAPINOUT_2502_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2503_DDataSet getMt_Papinout_2503(MT_PAPINOUT_2503_DDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2503_DDataSet ds = (MT_PAPINOUT_2503_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2600_LDataSet getMt_Papinout_2600(MT_PAPINOUT_2600_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2600_LDataSet ds = (MT_PAPINOUT_2600_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2601_LDataSet getMt_Papinout_2601(MT_PAPINOUT_2601_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2601_LDataSet ds = (MT_PAPINOUT_2601_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2700_LDataSet getMt_Papinout_2700(MT_PAPINOUT_2700_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2700_LDataSet ds = (MT_PAPINOUT_2700_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2701_LDataSet getMt_Papinout_2701(MT_PAPINOUT_2701_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2701_LDataSet ds = (MT_PAPINOUT_2701_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2702_LDataSet getMt_Papinout_2702(MT_PAPINOUT_2702_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2702_LDataSet ds = (MT_PAPINOUT_2702_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2703_ADataSet getMt_Papinout_2703(MT_PAPINOUT_2703_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2703_ADataSet ds = (MT_PAPINOUT_2703_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_PAPINOUT_2704_DDataSet getMt_Papinout_2704(MT_PAPINOUT_2704_DDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_PAPINOUT_2704_DDataSet ds = (MT_PAPINOUT_2704_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}