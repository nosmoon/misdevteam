package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr2300DAO {
 
    public SS_SLS_BRMGR_2300_ADataSet initBrmgr2300(SS_SLS_BRMGR_2300_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2300_ADataSet ds = (SS_SLS_BRMGR_2300_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_BRMGR_2310_LDataSet selectBrmgr2310(SS_SLS_BRMGR_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2310_LDataSet ds = (SS_SLS_BRMGR_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
       
    public SS_SLS_BRMGR_2320_UDataSet saveBrmgr2320(SS_SLS_BRMGR_2320_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2320_UDataSet ds = (SS_SLS_BRMGR_2320_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
      
    public SS_SLS_BRMGR_2330_UDataSet createBrmgr2330(SS_SLS_BRMGR_2330_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRMGR_2330_UDataSet ds = (SS_SLS_BRMGR_2330_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }        
}