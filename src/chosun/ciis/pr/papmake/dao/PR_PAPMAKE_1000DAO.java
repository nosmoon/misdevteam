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
 
public class PR_PAPMAKE_1000DAO { 

	public PR_PAPMAKE_1000_LDataSet pr_papmake_1000_l(PR_PAPMAKE_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1000_LDataSet ds = (PR_PAPMAKE_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_1001_LDataSet pr_papmake_1001_l(PR_PAPMAKE_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1001_LDataSet ds = (PR_PAPMAKE_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1004_ADataSet pr_papmake_1004_a(PR_PAPMAKE_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1004_ADataSet ds = (PR_PAPMAKE_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1005_LDataSet pr_papmake_1005_l(PR_PAPMAKE_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1005_LDataSet ds = (PR_PAPMAKE_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1006_ADataSet pr_papmake_1006_a(PR_PAPMAKE_1006_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1006_ADataSet ds = (PR_PAPMAKE_1006_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1007_LDataSet pr_papmake_1007_l(PR_PAPMAKE_1007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1007_LDataSet ds = (PR_PAPMAKE_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1008_LDataSet pr_papmake_1008_l(PR_PAPMAKE_1008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1008_LDataSet ds = (PR_PAPMAKE_1008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1009_LDataSet pr_papmake_1009_l(PR_PAPMAKE_1009_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1009_LDataSet ds = (PR_PAPMAKE_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	//	제작일지 제작사항 정보 삭제
	public PR_PAPMAKE_1010_DDataSet pr_papmake_1010_d(PR_PAPMAKE_1010_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1010_DDataSet ds = (PR_PAPMAKE_1010_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1011_ADataSet pr_papmake_1011_a(PR_PAPMAKE_1011_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1011_ADataSet ds = (PR_PAPMAKE_1011_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1012_UDataSet pr_papmake_1012_u(PR_PAPMAKE_1012_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1012_UDataSet ds = (PR_PAPMAKE_1012_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1013_LDataSet pr_papmake_1013_l(PR_PAPMAKE_1013_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1013_LDataSet ds = (PR_PAPMAKE_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1014_UDataSet pr_papmake_1014_u(PR_PAPMAKE_1014_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1014_UDataSet ds = (PR_PAPMAKE_1014_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1020_ADataSet pr_papmake_1020_a(PR_PAPMAKE_1020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1020_ADataSet ds = (PR_PAPMAKE_1020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_1021_LDataSet pr_papmake_1021_l(PR_PAPMAKE_1021_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1021_LDataSet ds = (PR_PAPMAKE_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_1030_ADataSet pr_papmake_1030_a(PR_PAPMAKE_1030_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1030_ADataSet ds = (PR_PAPMAKE_1030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PAPMAKE_1031_LDataSet pr_papmake_1031_l(PR_PAPMAKE_1031_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1031_LDataSet ds = (PR_PAPMAKE_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public PR_PAPMAKE_1051_LDataSet pr_papmake_1051_l(PR_PAPMAKE_1051_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1051_LDataSet ds = (PR_PAPMAKE_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1052_LDataSet pr_papmake_1052_l(PR_PAPMAKE_1052_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1052_LDataSet ds = (PR_PAPMAKE_1052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_1053_LDataSet pr_papmake_1053_l(PR_PAPMAKE_1053_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_1053_LDataSet ds = (PR_PAPMAKE_1053_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}