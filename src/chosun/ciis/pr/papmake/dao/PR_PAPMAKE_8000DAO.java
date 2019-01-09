package chosun.ciis.pr.papmake.dao;



import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */ 
 
public class PR_PAPMAKE_8000DAO { 

	
	public PR_PAPMAKE_8000_MDataSet pr_papmake_8000_m(PR_PAPMAKE_8000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8000_MDataSet ds = (PR_PAPMAKE_8000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public PR_PAPMAKE_8011_LDataSet pr_papmake_8011_l(PR_PAPMAKE_8011_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8011_LDataSet ds = (PR_PAPMAKE_8011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_8012_ADataSet pr_papmake_8012_a(PR_PAPMAKE_8012_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8012_ADataSet ds = (PR_PAPMAKE_8012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_8070_MDataSet pr_papmake_8070_m(PR_PAPMAKE_8070_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_8070_MDataSet ds = (PR_PAPMAKE_8070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	

}