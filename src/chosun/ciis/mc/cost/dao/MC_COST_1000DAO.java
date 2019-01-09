package chosun.ciis.mc.cost.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

public class MC_COST_1000DAO {
	public MC_COST_1000_MDataSet mc_cost_1000_m(MC_COST_1000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1000_MDataSet ds = (MC_COST_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1001_LDataSet mc_cost_1001_l(MC_COST_1001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1001_LDataSet ds = (MC_COST_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1002_IDataSet mc_cost_1002_i(MC_COST_1002_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1002_IDataSet ds = (MC_COST_1002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1003_LDataSet mc_cost_1003_l(MC_COST_1003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1003_LDataSet ds = (MC_COST_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1004_DDataSet mc_cost_1004_d(MC_COST_1004_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1004_DDataSet ds = (MC_COST_1004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1010_MDataSet mc_cost_1010_m(MC_COST_1010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1010_MDataSet ds = (MC_COST_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1011_LDataSet mc_cost_1011_l(MC_COST_1011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1011_LDataSet ds = (MC_COST_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1012_UDataSet mc_cost_1012_u(MC_COST_1012_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1012_UDataSet ds = (MC_COST_1012_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1013_LDataSet mc_cost_1013_l(MC_COST_1013_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1013_LDataSet ds = (MC_COST_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1020_MDataSet mc_cost_1020_m(MC_COST_1020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1020_MDataSet ds = (MC_COST_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1021_LDataSet mc_cost_1021_l(MC_COST_1021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1021_LDataSet ds = (MC_COST_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1022_UDataSet mc_cost_1022_u(MC_COST_1022_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1022_UDataSet ds = (MC_COST_1022_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1023_LDataSet mc_cost_1023_l(MC_COST_1023_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1023_LDataSet ds = (MC_COST_1023_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1030_MDataSet mc_cost_1030_m(MC_COST_1030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1030_MDataSet ds = (MC_COST_1030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1031_LDataSet mc_cost_1031_l(MC_COST_1031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1031_LDataSet ds = (MC_COST_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1032_ADataSet mc_cost_1032_a(MC_COST_1032_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1032_ADataSet ds = (MC_COST_1032_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1033_DDataSet mc_cost_1033_d(MC_COST_1033_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1033_DDataSet ds = (MC_COST_1033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1040_MDataSet mc_cost_1040_m(MC_COST_1040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1040_MDataSet ds = (MC_COST_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1041_MDataSet mc_cost_1041_m(MC_COST_1041_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1041_MDataSet ds = (MC_COST_1041_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1042_LDataSet mc_cost_1042_l(MC_COST_1042_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1042_LDataSet ds = (MC_COST_1042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1043_UDataSet mc_cost_1043_u(MC_COST_1043_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1043_UDataSet ds = (MC_COST_1043_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1044_UDataSet mc_cost_1044_u(MC_COST_1044_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1044_UDataSet ds = (MC_COST_1044_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1045_MDataSet mc_cost_1045_m(MC_COST_1045_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1045_MDataSet ds = (MC_COST_1045_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1046_MDataSet mc_cost_1046_m(MC_COST_1046_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1046_MDataSet ds = (MC_COST_1046_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_1047_MDataSet mc_cost_1047_m(MC_COST_1047_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_1047_MDataSet ds = (MC_COST_1047_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_9999_LDataSet getDummyList(MC_COST_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_9999_LDataSet ds = (MC_COST_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
}
