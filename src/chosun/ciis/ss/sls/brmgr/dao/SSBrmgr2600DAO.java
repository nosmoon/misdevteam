package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr2600DAO {
 
    public SS_SLS_BRMGR_2600_ADataSet initBrmgr2600(SS_SLS_BRMGR_2600_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2600_ADataSet ds = (SS_SLS_BRMGR_2600_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_BRMGR_2610_LDataSet selectBrmgr2610(SS_SLS_BRMGR_2610_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2610_LDataSet ds = (SS_SLS_BRMGR_2610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public SS_SLS_BRMGR_2620_UDataSet saveBrmgr2620(SS_SLS_BRMGR_2620_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2620_UDataSet ds = (SS_SLS_BRMGR_2620_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}