package chosun.ciis.mc.budg.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

public class MC_BUDG_3000DAO {
	public MC_BUDG_9999_LDataSet getDummyList(MC_BUDG_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_9999_LDataSet ds = (MC_BUDG_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public MC_BUDG_3004_MDataSet mc_budg_3004_m(MC_BUDG_3004_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_3004_MDataSet ds = (MC_BUDG_3004_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_3005_LDataSet mc_budg_3005_l(MC_BUDG_3005_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_3005_LDataSet ds = (MC_BUDG_3005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
