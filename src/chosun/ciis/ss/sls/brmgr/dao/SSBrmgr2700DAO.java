package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr2700DAO {
 
    public SS_SLS_BRMGR_2700_ADataSet initBrmgr2700(SS_SLS_BRMGR_2700_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2700_ADataSet ds = (SS_SLS_BRMGR_2700_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_BRMGR_2710_LDataSet selectBrmgr2710(SS_SLS_BRMGR_2710_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2710_LDataSet ds = (SS_SLS_BRMGR_2710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
           
    public SS_SLS_BRMGR_2720_SDataSet selectBrmgr2720(SS_SLS_BRMGR_2720_SDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2720_SDataSet ds = (SS_SLS_BRMGR_2720_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
        
    public SS_SLS_BRMGR_2730_UDataSet updateBrmgr2730(SS_SLS_BRMGR_2730_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2730_UDataSet ds = (SS_SLS_BRMGR_2730_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
/*  
    public SS_SLS_BRMGR_2440_LDataSet selectBrmgr2440(SS_SLS_BRMGR_2440_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2440_LDataSet ds = (SS_SLS_BRMGR_2440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/    
}