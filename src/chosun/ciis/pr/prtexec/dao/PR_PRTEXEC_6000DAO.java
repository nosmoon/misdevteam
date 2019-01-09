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
 
public class PR_PRTEXEC_6000DAO { 

	
	public PR_PRTEXEC_6000_LDataSet pr_prtexec_6000_l(PR_PRTEXEC_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_6000_LDataSet ds = (PR_PRTEXEC_6000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PRTEXEC_6010_MDataSet pr_prtexec_6010_m(PR_PRTEXEC_6010_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_6010_MDataSet ds = (PR_PRTEXEC_6010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PRTEXEC_6020_ADataSet pr_prtexec_6020_a(PR_PRTEXEC_6020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_6020_ADataSet ds = (PR_PRTEXEC_6020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}