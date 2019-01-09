package chosun.ciis.mt.submatrin.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 *
 */
public class MT_SUBMATRIN_1000DAO {

    public MT_SUBMATRIN_1101_LDataSet getMt_Submatrin_1101(MT_SUBMATRIN_1101_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        System.out.println("getMt_Submatrin_1101..Step.");
        MT_SUBMATRIN_1101_LDataSet ds = (MT_SUBMATRIN_1101_LDataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1101_2..Step. >>>>>>******>>>> " + ds.errcode);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRIN_1102_LDataSet getMt_Submatrin_1102(MT_SUBMATRIN_1102_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1102_LDataSet ds = (MT_SUBMATRIN_1102_LDataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1102_2..Step.");
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRIN_1114_LDataSet getMt_Submatrin_1114(MT_SUBMATRIN_1114_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1114_LDataSet ds = (MT_SUBMATRIN_1114_LDataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1114_..Step.");
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRIN_1103_LDataSet getMt_Submatrin_1103(MT_SUBMATRIN_1103_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        System.out.println("getMt_Submatrin_1103..Step.");
        MT_SUBMATRIN_1103_LDataSet ds = (MT_SUBMATRIN_1103_LDataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1103..Step.");
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1104_LDataSet getMt_Submatrin_1104(MT_SUBMATRIN_1104_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        System.out.println("getMt_Submatrin_1104..Step.");
        MT_SUBMATRIN_1104_LDataSet ds = (MT_SUBMATRIN_1104_LDataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1104..Step.");


        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRIN_1105_LDataSet getMt_Submatrin_1105(MT_SUBMATRIN_1105_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1105_LDataSet ds = (MT_SUBMATRIN_1105_LDataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1105..Step.");

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRIN_1106_ADataSet getMt_Submatrin_1106(MT_SUBMATRIN_1106_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1106_ADataSet ds = (MT_SUBMATRIN_1106_ADataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1106..Step.");

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1110_MDataSet getMt_Submatrin_1110(MT_SUBMATRIN_1110_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1110_MDataSet ds = (MT_SUBMATRIN_1110_MDataSet) manager.executeCall(dm);
        System.out.println("getMt_Submatrin_1110..Step.");

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1116_ADataSet getMt_Submatrin_1116(MT_SUBMATRIN_1116_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        MT_SUBMATRIN_1116_ADataSet ds = (MT_SUBMATRIN_1116_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1117_LDataSet getMt_Submatrin_1117(MT_SUBMATRIN_1117_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        MT_SUBMATRIN_1117_LDataSet ds = (MT_SUBMATRIN_1117_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1118_LDataSet getMt_Submatrin_1118(MT_SUBMATRIN_1118_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        MT_SUBMATRIN_1118_LDataSet ds = (MT_SUBMATRIN_1118_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1119_ADataSet getMt_Submatrin_1119(MT_SUBMATRIN_1119_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        MT_SUBMATRIN_1119_ADataSet ds = (MT_SUBMATRIN_1119_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1120_LDataSet getMt_Submatrin_1120(MT_SUBMATRIN_1120_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        MT_SUBMATRIN_1120_LDataSet ds = (MT_SUBMATRIN_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1201_LDataSet getMt_Submatrin_1201(MT_SUBMATRIN_1201_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        MT_SUBMATRIN_1201_LDataSet ds = (MT_SUBMATRIN_1201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1202_LDataSet getMt_Submatrin_1202(MT_SUBMATRIN_1202_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_SUBMATRIN_1202_LDataSet ds = (MT_SUBMATRIN_1202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public MT_SUBMATRIN_1203_LDataSet getMt_Submatrin_1203(MT_SUBMATRIN_1203_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
//        System.out.println(manager.m_dbPool);
        MT_SUBMATRIN_1203_LDataSet ds = (MT_SUBMATRIN_1203_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

public MT_SUBMATRIN_1204_LDataSet getMt_Submatrin_1204(MT_SUBMATRIN_1204_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");
        MT_SUBMATRIN_1204_LDataSet ds = (MT_SUBMATRIN_1204_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

   
    public MT_SUBMATRIN_1301_LDataSet getMt_Submatrin_1301(MT_SUBMATRIN_1301_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1301_LDataSet ds = (MT_SUBMATRIN_1301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRIN_1303_LDataSet getMt_Submatrin_1303(MT_SUBMATRIN_1303_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1303_LDataSet ds = (MT_SUBMATRIN_1303_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1304_LDataSet getMt_Submatrin_1304(MT_SUBMATRIN_1304_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1304_LDataSet ds = (MT_SUBMATRIN_1304_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public MT_SUBMATRIN_1305_LDataSet getMt_Submatrin_1305(MT_SUBMATRIN_1305_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1305_LDataSet ds = (MT_SUBMATRIN_1305_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_SUBMATRIN_1400_LDataSet getMt_Submatrin_1400(MT_SUBMATRIN_1400_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_SUBMATRIN_1400_LDataSet ds = (MT_SUBMATRIN_1400_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}