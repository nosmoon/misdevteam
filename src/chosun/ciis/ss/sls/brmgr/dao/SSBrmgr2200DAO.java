package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr2200DAO {
 
    public SS_SLS_BRMGR_2200_ADataSet initBrmgr2200(SS_SLS_BRMGR_2200_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2200_ADataSet ds = (SS_SLS_BRMGR_2200_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_BRMGR_2210_LDataSet selectBrmgr2210(SS_SLS_BRMGR_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2210_LDataSet ds = (SS_SLS_BRMGR_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_BRMGR_2220_UDataSet saveBrmgr2220(SS_SLS_BRMGR_2220_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2220_UDataSet ds = (SS_SLS_BRMGR_2220_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_BRMGR_2230_UDataSet createBrmgr2230(SS_SLS_BRMGR_2230_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2230_UDataSet ds = (SS_SLS_BRMGR_2230_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}