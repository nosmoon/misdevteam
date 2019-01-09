package chosun.ciis.mc.co.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.ds.*;

public class MC_CO_2000DAO {
	public MC_CO_9999_LDataSet getDummyList(MC_CO_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_9999_LDataSet ds = (MC_CO_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public MC_CO_2071_LDataSet mc_co_2071_l(MC_CO_2071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_2071_LDataSet ds = (MC_CO_2071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_2072_LDataSet mc_co_2072_l(MC_CO_2072_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_2072_LDataSet ds = (MC_CO_2072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
