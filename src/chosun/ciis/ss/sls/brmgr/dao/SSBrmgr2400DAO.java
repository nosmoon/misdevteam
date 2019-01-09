package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr2400DAO {
 
    public SS_SLS_BRMGR_2400_ADataSet initBrmgr2400(SS_SLS_BRMGR_2400_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2400_ADataSet ds = (SS_SLS_BRMGR_2400_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_BRMGR_2410_LDataSet selectBrmgr2410(SS_SLS_BRMGR_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2410_LDataSet ds = (SS_SLS_BRMGR_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
           
    public SS_SLS_BRMGR_2420_UDataSet saveBrmgr2420(SS_SLS_BRMGR_2420_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2420_UDataSet ds = (SS_SLS_BRMGR_2420_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
         
    public SS_SLS_BRMGR_2430_UDataSet createBrmgr2430(SS_SLS_BRMGR_2430_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2430_UDataSet ds = (SS_SLS_BRMGR_2430_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SS_SLS_BRMGR_2440_LDataSet selectBrmgr2440(SS_SLS_BRMGR_2440_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2440_LDataSet ds = (SS_SLS_BRMGR_2440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}