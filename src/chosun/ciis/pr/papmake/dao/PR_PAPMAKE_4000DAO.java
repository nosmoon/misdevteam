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
 
public class PR_PAPMAKE_4000DAO { 

	public PR_PAPMAKE_4000_LDataSet pr_papmake_4000_l(PR_PAPMAKE_4000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4000_LDataSet ds = (PR_PAPMAKE_4000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_4010_LDataSet pr_papmake_4010_l(PR_PAPMAKE_4010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4010_LDataSet ds = (PR_PAPMAKE_4010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_4020_ADataSet pr_papmake_4020_a(PR_PAPMAKE_4020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4020_ADataSet ds = (PR_PAPMAKE_4020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_4030_LDataSet pr_papmake_4030_l(PR_PAPMAKE_4030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4030_LDataSet ds = (PR_PAPMAKE_4030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_4040_MDataSet pr_papmake_4040_m(PR_PAPMAKE_4040_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4040_MDataSet ds = (PR_PAPMAKE_4040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_4050_DDataSet pr_papmake_4050_d(PR_PAPMAKE_4050_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_4050_DDataSet ds = (PR_PAPMAKE_4050_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}