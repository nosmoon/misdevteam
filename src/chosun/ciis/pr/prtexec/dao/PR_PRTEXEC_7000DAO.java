package chosun.ciis.pr.prtexec.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */ 
 
public class PR_PRTEXEC_7000DAO { 

	
	public PR_PRTEXEC_7000_LDataSet pr_prtexec_7000_l(PR_PRTEXEC_7000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_7000_LDataSet ds = (PR_PRTEXEC_7000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PRTEXEC_7001_LDataSet pr_prtexec_7001_l(PR_PRTEXEC_7001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_7001_LDataSet ds = (PR_PRTEXEC_7001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PRTEXEC_7010_ADataSet pr_prtexec_7010_a(PR_PRTEXEC_7010_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_7010_ADataSet ds = (PR_PRTEXEC_7010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}