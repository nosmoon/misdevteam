package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

public class SSBrmgr2800DAO 
{
	public SS_SLS_BRMGR_2850_MDataSet ss_sls_brmgr_2850_m(SS_SLS_BRMGR_2850_MDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_SLS_BRMGR_2850_MDataSet ds = (SS_SLS_BRMGR_2850_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public SS_SLS_BRMGR_2851_LDataSet ss_sls_brmgr_2851_l(SS_SLS_BRMGR_2851_LDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
		SS_SLS_BRMGR_2851_LDataSet ds = (SS_SLS_BRMGR_2851_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
	public SS_SLS_BRMGR_2852_SDataSet ss_sls_brmgr_2852_s(SS_SLS_BRMGR_2852_SDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_SLS_BRMGR_2852_SDataSet ds = (SS_SLS_BRMGR_2852_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}