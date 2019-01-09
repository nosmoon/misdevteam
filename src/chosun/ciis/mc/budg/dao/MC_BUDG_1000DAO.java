package chosun.ciis.mc.budg.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

public class MC_BUDG_1000DAO {
	public MC_BUDG_9999_LDataSet getDummyList(MC_BUDG_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_9999_LDataSet ds = (MC_BUDG_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public MC_BUDG_1000_MDataSet mc_budg_1000_m(MC_BUDG_1000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1000_MDataSet ds = (MC_BUDG_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1001_LDataSet mc_budg_1001_l(MC_BUDG_1001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1001_LDataSet ds = (MC_BUDG_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1002_LDataSet mc_budg_1002_l(MC_BUDG_1002_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1002_LDataSet ds = (MC_BUDG_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1003_LDataSet mc_budg_1003_l(MC_BUDG_1003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1003_LDataSet ds = (MC_BUDG_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1004_UDataSet mc_budg_1004_u(MC_BUDG_1004_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1004_UDataSet ds = (MC_BUDG_1004_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1006_LDataSet mc_budg_1006_l(MC_BUDG_1006_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1006_LDataSet ds = (MC_BUDG_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1007_IDataSet mc_budg_1007_i(MC_BUDG_1007_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1007_IDataSet ds = (MC_BUDG_1007_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1008_DDataSet mc_budg_1008_d(MC_BUDG_1008_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1008_DDataSet ds = (MC_BUDG_1008_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1020_MDataSet mc_budg_1020_m(MC_BUDG_1020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1020_MDataSet ds = (MC_BUDG_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1021_LDataSet mc_budg_1021_l(MC_BUDG_1021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1021_LDataSet ds = (MC_BUDG_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1030_LDataSet mc_budg_1030_l(MC_BUDG_1030_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1030_LDataSet ds = (MC_BUDG_1030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1031_IDataSet mc_budg_1031_i(MC_BUDG_1031_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1031_IDataSet ds = (MC_BUDG_1031_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1040_MDataSet mc_budg_1040_m(MC_BUDG_1040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1040_MDataSet ds = (MC_BUDG_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1041_LDataSet mc_budg_1041_l(MC_BUDG_1041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1041_LDataSet ds = (MC_BUDG_1041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1051_LDataSet mc_budg_1051_l(MC_BUDG_1051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1051_LDataSet ds = (MC_BUDG_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1052_LDataSet mc_budg_1052_l(MC_BUDG_1052_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1052_LDataSet ds = (MC_BUDG_1052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1054_LDataSet mc_budg_1054_l(MC_BUDG_1054_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1054_LDataSet ds = (MC_BUDG_1054_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1055_ADataSet mc_budg_1055_a(MC_BUDG_1055_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1055_ADataSet ds = (MC_BUDG_1055_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1061_LDataSet mc_budg_1061_l(MC_BUDG_1061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1061_LDataSet ds = (MC_BUDG_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1062_LDataSet mc_budg_1062_l(MC_BUDG_1062_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1062_LDataSet ds = (MC_BUDG_1062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1063_LDataSet mc_budg_1063_l(MC_BUDG_1063_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1063_LDataSet ds = (MC_BUDG_1063_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1066_ADataSet mc_budg_1066_a(MC_BUDG_1066_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1066_ADataSet ds = (MC_BUDG_1066_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1067_LDataSet mc_budg_1067_l(MC_BUDG_1067_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1067_LDataSet ds = (MC_BUDG_1067_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1069_UDataSet mc_budg_1069_u(MC_BUDG_1069_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1069_UDataSet ds = (MC_BUDG_1069_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1071_LDataSet mc_budg_1071_l(MC_BUDG_1071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1071_LDataSet ds = (MC_BUDG_1071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1081_LDataSet mc_budg_1081_l(MC_BUDG_1081_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1081_LDataSet ds = (MC_BUDG_1081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1082_LDataSet mc_budg_1082_l(MC_BUDG_1082_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1082_LDataSet ds = (MC_BUDG_1082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1083_IDataSet mc_budg_1083_i(MC_BUDG_1083_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1083_IDataSet ds = (MC_BUDG_1083_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1084_DDataSet mc_budg_1084_d(MC_BUDG_1084_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1084_DDataSet ds = (MC_BUDG_1084_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1091_LDataSet mc_budg_1091_l(MC_BUDG_1091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1091_LDataSet ds = (MC_BUDG_1091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1092_ADataSet mc_budg_1092_a(MC_BUDG_1092_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1092_ADataSet ds = (MC_BUDG_1092_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1010_MDataSet mc_budg_1010_m(MC_BUDG_1010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1010_MDataSet ds = (MC_BUDG_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1011_LDataSet mc_budg_1011_l(MC_BUDG_1011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1011_LDataSet ds = (MC_BUDG_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1012_ADataSet mc_budg_1012_a(MC_BUDG_1012_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1012_ADataSet ds = (MC_BUDG_1012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_1013_LDataSet mc_budg_1013_l(MC_BUDG_1013_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_1013_LDataSet ds = (MC_BUDG_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
