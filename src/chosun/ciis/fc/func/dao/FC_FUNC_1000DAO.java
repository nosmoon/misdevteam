package chosun.ciis.fc.func.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

public class FC_FUNC_1000DAO {
	public FC_FUNC_9999_LDataSet getDummyList(FC_FUNC_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_9999_LDataSet ds = (FC_FUNC_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}


	public FC_FUNC_1120_MDataSet fc_func_1120_m(FC_FUNC_1120_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1120_MDataSet ds = (FC_FUNC_1120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1121_LDataSet fc_func_1121_l(FC_FUNC_1121_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1121_LDataSet ds = (FC_FUNC_1121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1122_LDataSet fc_func_1122_l(FC_FUNC_1122_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1122_LDataSet ds = (FC_FUNC_1122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1151_LDataSet fc_func_1151_l(FC_FUNC_1151_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1151_LDataSet ds = (FC_FUNC_1151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1000_MDataSet fc_func_1000_m(FC_FUNC_1000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1000_MDataSet ds = (FC_FUNC_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1001_LDataSet fc_func_1001_l(FC_FUNC_1001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1001_LDataSet ds = (FC_FUNC_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1002_UDataSet fc_func_1002_u(FC_FUNC_1002_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1002_UDataSet ds = (FC_FUNC_1002_UDataSet)manager.executeCall(dm);
System.out.println("update sucess");
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1020_LDataSet fc_func_1020_l(FC_FUNC_1020_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1020_LDataSet ds = (FC_FUNC_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1021_LDataSet fc_func_1021_l(FC_FUNC_1021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1021_LDataSet ds = (FC_FUNC_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1022_IDataSet fc_func_1022_i(FC_FUNC_1022_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1022_IDataSet ds = (FC_FUNC_1022_IDataSet)manager.executeCall(dm);
		System.out.println("Insert success");
		if(!ds.getErrcode().equals("")) {
			System.out.println("Insert error");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1023_DDataSet fc_func_1023_d(FC_FUNC_1023_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1023_DDataSet ds = (FC_FUNC_1023_DDataSet)manager.executeCall(dm);
		System.out.println("delete success");
		if(!ds.getErrcode().equals("")) {
			System.out.println("delete error");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1030_MDataSet fc_func_1030_m(FC_FUNC_1030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1030_MDataSet ds = (FC_FUNC_1030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1031_LDataSet fc_func_1031_l(FC_FUNC_1031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1031_LDataSet ds = (FC_FUNC_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1032_IDataSet fc_func_1032_i(FC_FUNC_1032_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1032_IDataSet ds = (FC_FUNC_1032_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1033_DDataSet fc_func_1033_d(FC_FUNC_1033_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1033_DDataSet ds = (FC_FUNC_1033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1040_LDataSet fc_func_1040_l(FC_FUNC_1040_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1040_LDataSet ds = (FC_FUNC_1040_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1041_LDataSet fc_func_1041_l(FC_FUNC_1041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1041_LDataSet ds = (FC_FUNC_1041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1042_IDataSet fc_func_1042_i(FC_FUNC_1042_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1042_IDataSet ds = (FC_FUNC_1042_IDataSet)manager.executeCall(dm);
System.out.println("Insert succes");
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1043_DDataSet fc_func_1043_d(FC_FUNC_1043_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1043_DDataSet ds = (FC_FUNC_1043_DDataSet)manager.executeCall(dm);
		System.out.println("Delete succes");
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1050_MDataSet fc_func_1050_m(FC_FUNC_1050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1050_MDataSet ds = (FC_FUNC_1050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1051_LDataSet fc_func_1051_l(FC_FUNC_1051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1051_LDataSet ds = (FC_FUNC_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1052_LDataSet fc_func_1052_l(FC_FUNC_1052_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1052_LDataSet ds = (FC_FUNC_1052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1053_IDataSet fc_func_1053_i(FC_FUNC_1053_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1053_IDataSet ds = (FC_FUNC_1053_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1054_DDataSet fc_func_1054_d(FC_FUNC_1054_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1054_DDataSet ds = (FC_FUNC_1054_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1420_MDataSet fc_func_1420_m(FC_FUNC_1420_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1420_MDataSet ds = (FC_FUNC_1420_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1421_LDataSet fc_func_1421_l(FC_FUNC_1421_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1421_LDataSet ds = (FC_FUNC_1421_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1430_LDataSet fc_func_1430_l(FC_FUNC_1430_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1430_LDataSet ds = (FC_FUNC_1430_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1440_MDataSet fc_func_1440_m(FC_FUNC_1440_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1440_MDataSet ds = (FC_FUNC_1440_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1441_LDataSet fc_func_1441_l(FC_FUNC_1441_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1441_LDataSet ds = (FC_FUNC_1441_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1060_MDataSet fc_func_1060_m(FC_FUNC_1060_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1060_MDataSet ds = (FC_FUNC_1060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1061_LDataSet fc_func_1061_l(FC_FUNC_1061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1061_LDataSet ds = (FC_FUNC_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1062_LDataSet fc_func_1062_l(FC_FUNC_1062_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1062_LDataSet ds = (FC_FUNC_1062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1063_LDataSet fc_func_1063_l(FC_FUNC_1063_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1063_LDataSet ds = (FC_FUNC_1063_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1064_IDataSet fc_func_1064_i(FC_FUNC_1064_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1064_IDataSet ds = (FC_FUNC_1064_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1065_DDataSet fc_func_1065_d(FC_FUNC_1065_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1065_DDataSet ds = (FC_FUNC_1065_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1071_LDataSet fc_func_1071_l(FC_FUNC_1071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1071_LDataSet ds = (FC_FUNC_1071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1074_LDataSet fc_func_1074_l(FC_FUNC_1074_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1074_LDataSet ds = (FC_FUNC_1074_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1075_LDataSet fc_func_1075_l(FC_FUNC_1075_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1075_LDataSet ds = (FC_FUNC_1075_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1072_IDataSet fc_func_1072_i(FC_FUNC_1072_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1072_IDataSet ds = (FC_FUNC_1072_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1073_DDataSet fc_func_1073_d(FC_FUNC_1073_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1073_DDataSet ds = (FC_FUNC_1073_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1080_MDataSet fc_func_1080_m(FC_FUNC_1080_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1080_MDataSet ds = (FC_FUNC_1080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1081_LDataSet fc_func_1081_l(FC_FUNC_1081_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1081_LDataSet ds = (FC_FUNC_1081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1082_LDataSet fc_func_1082_l(FC_FUNC_1082_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1082_LDataSet ds = (FC_FUNC_1082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1083_IDataSet fc_func_1083_i(FC_FUNC_1083_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1083_IDataSet ds = (FC_FUNC_1083_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1084_DDataSet fc_func_1084_d(FC_FUNC_1084_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1084_DDataSet ds = (FC_FUNC_1084_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1085_LDataSet fc_func_1085_l(FC_FUNC_1085_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1085_LDataSet ds = (FC_FUNC_1085_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}  	
	public FC_FUNC_1091_LDataSet fc_func_1091_l(FC_FUNC_1091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1091_LDataSet ds = (FC_FUNC_1091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1092_LDataSet fc_func_1092_l(FC_FUNC_1092_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1092_LDataSet ds = (FC_FUNC_1092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1090_MDataSet fc_func_1090_m(FC_FUNC_1090_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1090_MDataSet ds = (FC_FUNC_1090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1093_LDataSet fc_func_1093_l(FC_FUNC_1093_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1093_LDataSet ds = (FC_FUNC_1093_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1094_LDataSet fc_func_1094_l(FC_FUNC_1094_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1094_LDataSet ds = (FC_FUNC_1094_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1097_LDataSet fc_func_1097_l(FC_FUNC_1097_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1097_LDataSet ds = (FC_FUNC_1097_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1095_IDataSet fc_func_1095_i(FC_FUNC_1095_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1095_IDataSet ds = (FC_FUNC_1095_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1096_DDataSet fc_func_1096_d(FC_FUNC_1096_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1096_DDataSet ds = (FC_FUNC_1096_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1130_LDataSet fc_func_1130_l(FC_FUNC_1130_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_FUNC_1130_LDataSet ds = (FC_FUNC_1130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public FC_FUNC_1140_LDataSet fc_func_1140_l(FC_FUNC_1140_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_FUNC_1140_LDataSet ds = (FC_FUNC_1140_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public FC_FUNC_1160_LDataSet fc_func_1160_l(FC_FUNC_1160_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_FUNC_1160_LDataSet ds = (FC_FUNC_1160_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public FC_FUNC_1170_LDataSet fc_func_1170_l(FC_FUNC_1170_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_FUNC_1170_LDataSet ds = (FC_FUNC_1170_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public FC_FUNC_1171_LDataSet fc_func_1171_l(FC_FUNC_1171_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1171_LDataSet ds = (FC_FUNC_1171_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}    
    public FC_FUNC_1361_LDataSet fc_func_1361_l(FC_FUNC_1361_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1361_LDataSet ds = (FC_FUNC_1361_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1100_LDataSet fc_func_1100_l(FC_FUNC_1100_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1100_LDataSet ds = (FC_FUNC_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1103_MDataSet fc_func_1103_m(FC_FUNC_1103_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		System.out.println("DAOstart");
		FC_FUNC_1103_MDataSet ds = (FC_FUNC_1103_MDataSet)manager.executeCall(dm);
		System.out.println("DA------------------");
		if(!ds.getErrcode().equals("")) {
			System.out.println("DAOsucces");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1104_LDataSet fc_func_1104_l(FC_FUNC_1104_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");

		FC_FUNC_1104_LDataSet ds = (FC_FUNC_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("DAOerror");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1101_IDataSet fc_func_1101_i(FC_FUNC_1101_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1101_IDataSet ds = (FC_FUNC_1101_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1102_DDataSet fc_func_1102_d(FC_FUNC_1102_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1102_DDataSet ds = (FC_FUNC_1102_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1110_MDataSet fc_func_1110_m(FC_FUNC_1110_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1110_MDataSet ds = (FC_FUNC_1110_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1111_LDataSet fc_func_1111_l(FC_FUNC_1111_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1111_LDataSet ds = (FC_FUNC_1111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1112_LDataSet fc_func_1112_l(FC_FUNC_1112_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1112_LDataSet ds = (FC_FUNC_1112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1113_LDataSet fc_func_1113_l(FC_FUNC_1113_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1113_LDataSet ds = (FC_FUNC_1113_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1114_LDataSet fc_func_1114_l(FC_FUNC_1114_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1114_LDataSet ds = (FC_FUNC_1114_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1115_IDataSet fc_func_1115_i(FC_FUNC_1115_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1115_IDataSet ds = (FC_FUNC_1115_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}    
    public FC_FUNC_1116_DDataSet fc_func_1116_d(FC_FUNC_1116_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1116_DDataSet ds = (FC_FUNC_1116_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1200_LDataSet fc_func_1200_l(FC_FUNC_1200_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1200_LDataSet ds = (FC_FUNC_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1201_IDataSet fc_func_1201_i(FC_FUNC_1201_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1201_IDataSet ds = (FC_FUNC_1201_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1400_MDataSet fc_func_1400_m(FC_FUNC_1400_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1400_MDataSet ds = (FC_FUNC_1400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1401_LDataSet fc_func_1401_l(FC_FUNC_1401_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1401_LDataSet ds = (FC_FUNC_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1003_LDataSet fc_func_1003_l(FC_FUNC_1003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1003_LDataSet ds = (FC_FUNC_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1180_LDataSet fc_func_1180_l(FC_FUNC_1180_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1180_LDataSet ds = (FC_FUNC_1180_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1181_LDataSet fc_func_1181_l(FC_FUNC_1181_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1181_LDataSet ds = (FC_FUNC_1181_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1183_DDataSet fc_func_1183_d(FC_FUNC_1183_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1183_DDataSet ds = (FC_FUNC_1183_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1184_IDataSet fc_func_1184_i(FC_FUNC_1184_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1184_IDataSet ds = (FC_FUNC_1184_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1190_LDataSet fc_func_1190_l(FC_FUNC_1190_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1190_LDataSet ds = (FC_FUNC_1190_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1191_LDataSet fc_func_1191_l(FC_FUNC_1191_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1191_LDataSet ds = (FC_FUNC_1191_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1192_IDataSet fc_func_1192_i(FC_FUNC_1192_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1192_IDataSet ds = (FC_FUNC_1192_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1193_DDataSet fc_func_1193_d(FC_FUNC_1193_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1193_DDataSet ds = (FC_FUNC_1193_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1210_LDataSet fc_func_1210_l(FC_FUNC_1210_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1210_LDataSet ds = (FC_FUNC_1210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1211_LDataSet fc_func_1211_l(FC_FUNC_1211_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1211_LDataSet ds = (FC_FUNC_1211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1212_IDataSet fc_func_1212_i(FC_FUNC_1212_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1212_IDataSet ds = (FC_FUNC_1212_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1213_DDataSet fc_func_1213_d(FC_FUNC_1213_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1213_DDataSet ds = (FC_FUNC_1213_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1280_MDataSet fc_func_1280_m(FC_FUNC_1280_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1280_MDataSet ds = (FC_FUNC_1280_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1290_MDataSet fc_func_1290_m(FC_FUNC_1290_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1290_MDataSet ds = (FC_FUNC_1290_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
    public FC_FUNC_1410_LDataSet fc_func_1410_l(FC_FUNC_1410_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1410_LDataSet ds = (FC_FUNC_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1411_LDataSet fc_func_1411_l(FC_FUNC_1411_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1411_LDataSet ds = (FC_FUNC_1411_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1412_IDataSet fc_func_1412_i(FC_FUNC_1412_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1412_IDataSet ds = (FC_FUNC_1412_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1413_DDataSet fc_func_1413_d(FC_FUNC_1413_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1413_DDataSet ds = (FC_FUNC_1413_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1450_LDataSet fc_func_1450_l(FC_FUNC_1450_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1450_LDataSet ds = (FC_FUNC_1450_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1451_LDataSet fc_func_1451_l(FC_FUNC_1451_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1451_LDataSet ds = (FC_FUNC_1451_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1452_LDataSet fc_func_1452_l(FC_FUNC_1452_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1452_LDataSet ds = (FC_FUNC_1452_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1453_IDataSet fc_func_1453_i(FC_FUNC_1453_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1453_IDataSet ds = (FC_FUNC_1453_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1454_DDataSet fc_func_1454_d(FC_FUNC_1454_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1454_DDataSet ds = (FC_FUNC_1454_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1455_LDataSet fc_func_1455_l(FC_FUNC_1455_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1455_LDataSet ds = (FC_FUNC_1455_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1010_MDataSet fc_func_1010_m(FC_FUNC_1010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1010_MDataSet ds = (FC_FUNC_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1011_LDataSet fc_func_1011_l(FC_FUNC_1011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1011_LDataSet ds = (FC_FUNC_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1012_LDataSet fc_func_1012_l(FC_FUNC_1012_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1012_LDataSet ds = (FC_FUNC_1012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1013_LDataSet fc_func_1013_l(FC_FUNC_1013_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1013_LDataSet ds = (FC_FUNC_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1014_LDataSet fc_func_1014_l(FC_FUNC_1014_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1014_LDataSet ds = (FC_FUNC_1014_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1015_IDataSet fc_func_1015_i(FC_FUNC_1015_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1015_IDataSet ds = (FC_FUNC_1015_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1370_MDataSet fc_func_1370_m(FC_FUNC_1370_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1370_MDataSet ds = (FC_FUNC_1370_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1380_MDataSet fc_func_1380_m(FC_FUNC_1380_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1380_MDataSet ds = (FC_FUNC_1380_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_FUNC_1390_MDataSet fc_func_1390_m(FC_FUNC_1390_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1390_MDataSet ds = (FC_FUNC_1390_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public FC_FUNC_1230_MDataSet fc_func_1230_m(FC_FUNC_1230_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1230_MDataSet ds = (FC_FUNC_1230_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public FC_FUNC_1240_MDataSet fc_func_1240_m(FC_FUNC_1240_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1240_MDataSet ds = (FC_FUNC_1240_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public FC_FUNC_1250_MDataSet fc_func_1250_m(FC_FUNC_1250_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1250_MDataSet ds = (FC_FUNC_1250_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public FC_FUNC_1260_MDataSet fc_func_1260_m(FC_FUNC_1260_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1260_MDataSet ds = (FC_FUNC_1260_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}  
	public FC_FUNC_1461_LDataSet fc_func_1461_l(FC_FUNC_1461_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1461_LDataSet ds = (FC_FUNC_1461_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1462_LDataSet fc_func_1462_l(FC_FUNC_1462_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1462_LDataSet ds = (FC_FUNC_1462_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1463_IDataSet fc_func_1463_i(FC_FUNC_1463_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1463_IDataSet ds = (FC_FUNC_1463_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1464_DDataSet fc_func_1464_d(FC_FUNC_1464_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1464_DDataSet ds = (FC_FUNC_1464_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_1465_LDataSet fc_func_1465_l(FC_FUNC_1465_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_1465_LDataSet ds = (FC_FUNC_1465_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}
