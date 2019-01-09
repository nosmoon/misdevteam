package chosun.ciis.pr.papmake.dao;



import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */ 
 
public class PR_PAPMAKE_7000DAO { 

	
	
	public PR_PAPMAKE_7010_MDataSet pr_papmake_6000_l(PR_PAPMAKE_7010_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7010_MDataSet ds = (PR_PAPMAKE_7010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_7011_LDataSet pr_papmake_7011_l(PR_PAPMAKE_7011_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7011_LDataSet ds = (PR_PAPMAKE_7011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_7012_ADataSet pr_papmake_7012_a(PR_PAPMAKE_7012_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7012_ADataSet ds = (PR_PAPMAKE_7012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_7021_LDataSet pr_papmake_7021_l(PR_PAPMAKE_7021_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7021_LDataSet ds = (PR_PAPMAKE_7021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_7022_ADataSet pr_papmake_7022_a(PR_PAPMAKE_7022_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7022_ADataSet ds = (PR_PAPMAKE_7022_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	} 
	public PR_PAPMAKE_7100_LDataSet pr_papmake_7100_l(PR_PAPMAKE_7100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7100_LDataSet ds = (PR_PAPMAKE_7100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_7101_LDataSet pr_papmake_7101_l(PR_PAPMAKE_7101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_7101_LDataSet ds = (PR_PAPMAKE_7101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}