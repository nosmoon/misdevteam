package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr2500DAO {
 
    public SS_SLS_BRMGR_2500_ADataSet initBrmgr2500(SS_SLS_BRMGR_2500_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2500_ADataSet ds = (SS_SLS_BRMGR_2500_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_BRMGR_2510_LDataSet selectBrmgr2510(SS_SLS_BRMGR_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2510_LDataSet ds = (SS_SLS_BRMGR_2510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}