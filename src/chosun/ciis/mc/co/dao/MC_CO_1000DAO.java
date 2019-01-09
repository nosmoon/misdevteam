package chosun.ciis.mc.co.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.ds.*;

public class MC_CO_1000DAO {
	public MC_CO_9999_LDataSet getDummyList(MC_CO_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_9999_LDataSet ds = (MC_CO_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public MC_CO_1001_LDataSet mc_co_1001_l(MC_CO_1001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1001_LDataSet ds = (MC_CO_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1002_LDataSet mc_co_1002_l(MC_CO_1002_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1002_LDataSet ds = (MC_CO_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1003_LDataSet mc_co_1003_l(MC_CO_1003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1003_LDataSet ds = (MC_CO_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1004_LDataSet mc_co_1004_l(MC_CO_1004_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1004_LDataSet ds = (MC_CO_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1005_LDataSet mc_co_1005_l(MC_CO_1005_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1005_LDataSet ds = (MC_CO_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1006_LDataSet mc_co_1006_l(MC_CO_1006_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1006_LDataSet ds = (MC_CO_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_CO_1007_LDataSet mc_co_1007_l(MC_CO_1007_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1007_LDataSet ds = (MC_CO_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_CO_1008_LDataSet mc_co_1008_l(MC_CO_1008_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1008_LDataSet ds = (MC_CO_1008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_CO_1009_LDataSet mc_co_1009_l(MC_CO_1009_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1009_LDataSet ds = (MC_CO_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1010IDataSet mc_co_1010i(MC_CO_1010IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1010IDataSet ds = (MC_CO_1010IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1011_LDataSet mc_co_1011_l(MC_CO_1011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1011_LDataSet ds = (MC_CO_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1012_LDataSet mc_co_1012_l(MC_CO_1012_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1012_LDataSet ds = (MC_CO_1012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1013_LDataSet mc_co_1013_l(MC_CO_1013_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1013_LDataSet ds = (MC_CO_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_CO_1014_LDataSet mc_co_1014_l(MC_CO_1014_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1014_LDataSet ds = (MC_CO_1014_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_CO_1030_LDataSet mc_co_1030_l(MC_CO_1030_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_CO_1030_LDataSet ds = (MC_CO_1030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
