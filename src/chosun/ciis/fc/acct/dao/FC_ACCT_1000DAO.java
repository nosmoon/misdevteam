package chosun.ciis.fc.acct.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import java.sql.SQLException;

import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;
  
public class FC_ACCT_1000DAO {
	public FC_ACCT_9999_LDataSet getDummyList(FC_ACCT_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_9999_LDataSet ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_1011_LDataSet fc_acct_1011_l(FC_ACCT_1011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1011_LDataSet ds = (FC_ACCT_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1012_ADataSet fc_acct_1012_a(FC_ACCT_1012_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1012_ADataSet ds = (FC_ACCT_1012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1031_LDataSet fc_acct_1031_l(FC_ACCT_1031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1031_LDataSet ds = (FC_ACCT_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1032_LDataSet fc_acct_1032_l(FC_ACCT_1032_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1032_LDataSet ds = (FC_ACCT_1032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1033_SDataSet fc_acct_1033_s(FC_ACCT_1033_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1033_SDataSet ds = (FC_ACCT_1033_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1040_MDataSet fc_acct_1040_m(FC_ACCT_1040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1040_MDataSet ds = (FC_ACCT_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1041_LDataSet fc_acct_1041_l(FC_ACCT_1041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1041_LDataSet ds = (FC_ACCT_1041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1042_ADataSet fc_acct_1042_a(FC_ACCT_1042_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1042_ADataSet ds = (FC_ACCT_1042_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1043_LDataSet fc_acct_1043_l(FC_ACCT_1043_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1043_LDataSet ds = (FC_ACCT_1043_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1044_DDataSet fc_acct_1044_d(FC_ACCT_1044_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1044_DDataSet ds = (FC_ACCT_1044_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1045_IDataSet fc_acct_1045_i(FC_ACCT_1045_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1045_IDataSet ds = (FC_ACCT_1045_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1046_LDataSet fc_acct_1046_l(FC_ACCT_1046_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1046_LDataSet ds = (FC_ACCT_1046_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1047_LDataSet fc_acct_1047_l(FC_ACCT_1047_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1047_LDataSet ds = (FC_ACCT_1047_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1048_UDataSet fc_acct_1048_u(FC_ACCT_1048_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1048_UDataSet ds = (FC_ACCT_1048_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1049_LDataSet fc_acct_1049_l(FC_ACCT_1049_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1049_LDataSet ds = (FC_ACCT_1049_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1050_MDataSet fc_acct_1050_m(FC_ACCT_1050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1050_MDataSet ds = (FC_ACCT_1050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1051_LDataSet fc_acct_1051_l(FC_ACCT_1051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1051_LDataSet ds = (FC_ACCT_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1052_ADataSet fc_acct_1052_a(FC_ACCT_1052_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1052_ADataSet ds = (FC_ACCT_1052_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1053_SDataSet fc_acct_1053_s(FC_ACCT_1053_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1053_SDataSet ds = (FC_ACCT_1053_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1060_MDataSet fc_acct_1060_m(FC_ACCT_1060_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1060_MDataSet ds = (FC_ACCT_1060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1061_LDataSet fc_acct_1061_l(FC_ACCT_1061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1061_LDataSet ds = (FC_ACCT_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1062_ADataSet fc_acct_1062_a(FC_ACCT_1062_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1062_ADataSet ds = (FC_ACCT_1062_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_1071_LDataSet fc_acct_1071_l(FC_ACCT_1071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1071_LDataSet ds = (FC_ACCT_1071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_1081_LDataSet fc_acct_1081_l(FC_ACCT_1081_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1081_LDataSet ds = (FC_ACCT_1081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1090_MDataSet fc_acct_1090_m(FC_ACCT_1090_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1090_MDataSet ds = (FC_ACCT_1090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1091_LDataSet fc_acct_1091_l(FC_ACCT_1091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1091_LDataSet ds = (FC_ACCT_1091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1092_DDataSet fc_acct_1092_d(FC_ACCT_1092_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1092_DDataSet ds = (FC_ACCT_1092_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1093_IDataSet fc_acct_1093_i(FC_ACCT_1093_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1093_IDataSet ds = (FC_ACCT_1093_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1100_MDataSet fc_acct_1100_m(FC_ACCT_1100_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1100_MDataSet ds = (FC_ACCT_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1101_LDataSet fc_acct_1101_l(FC_ACCT_1101_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1101_LDataSet ds = (FC_ACCT_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1111_LDataSet fc_acct_1111_l(FC_ACCT_1111_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1111_LDataSet ds = (FC_ACCT_1111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1112_LDataSet fc_acct_1112_l(FC_ACCT_1112_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1112_LDataSet ds = (FC_ACCT_1112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1113_DDataSet fc_acct_1113_d(FC_ACCT_1113_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1113_DDataSet ds = (FC_ACCT_1113_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1114_IDataSet fc_acct_1114_i(FC_ACCT_1114_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1114_IDataSet ds = (FC_ACCT_1114_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1115_LDataSet fc_acct_1115_l(FC_ACCT_1115_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1115_LDataSet ds = (FC_ACCT_1115_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1116_LDataSet fc_acct_1116_l(FC_ACCT_1116_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1116_LDataSet ds = (FC_ACCT_1116_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1120_MDataSet fc_acct_1120_m(FC_ACCT_1120_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1120_MDataSet ds = (FC_ACCT_1120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1121_LDataSet fc_acct_1121_l(FC_ACCT_1121_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1121_LDataSet ds = (FC_ACCT_1121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1122_IDataSet fc_acct_1122_i(FC_ACCT_1122_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1122_IDataSet ds = (FC_ACCT_1122_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1123_DDataSet fc_acct_1123_d(FC_ACCT_1123_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1123_DDataSet ds = (FC_ACCT_1123_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_ACCT_1181_LDataSet fc_acct_1181_l(FC_ACCT_1181_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_1181_LDataSet ds = (FC_ACCT_1181_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public FC_ACCT_1180_MDataSet fc_acct_1180_m(FC_ACCT_1180_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_1180_MDataSet ds = (FC_ACCT_1180_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public FC_ACCT_1201_LDataSet fc_acct_1201_l(FC_ACCT_1201_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1201_LDataSet ds = (FC_ACCT_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}    
	public FC_ACCT_1202_IDataSet fc_acct_1202_i(FC_ACCT_1202_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1202_IDataSet ds = (FC_ACCT_1202_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_1210_MDataSet fc_acct_1210_M(FC_ACCT_1210_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1210_MDataSet ds = (FC_ACCT_1210_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1211_LDataSet fc_acct_1211_l(FC_ACCT_1211_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1211_LDataSet ds = (FC_ACCT_1211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1212_SDataSet fc_acct_1212_s(FC_ACCT_1212_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1212_SDataSet ds = (FC_ACCT_1212_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1213_IDataSet fc_acct_1213_i(FC_ACCT_1213_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1213_IDataSet ds = (FC_ACCT_1213_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1214_DDataSet fc_acct_1214_d(FC_ACCT_1214_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1214_DDataSet ds = (FC_ACCT_1214_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}   
	public FC_ACCT_1190_MDataSet fc_acct_1190_m(FC_ACCT_1190_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1190_MDataSet ds = (FC_ACCT_1190_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1020_MDataSet fc_acct_1020_m(FC_ACCT_1020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1020_MDataSet ds = (FC_ACCT_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1021_SDataSet fc_acct_1021_s(FC_ACCT_1021_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1021_SDataSet ds = (FC_ACCT_1021_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1022_LDataSet fc_acct_1022_l(FC_ACCT_1022_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1022_LDataSet ds = (FC_ACCT_1022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1023_UDataSet fc_acct_1023_u(FC_ACCT_1023_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1023_UDataSet ds = (FC_ACCT_1023_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1024_SDataSet fc_acct_1024_s(FC_ACCT_1024_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1024_SDataSet ds = (FC_ACCT_1024_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1025_UDataSet fc_acct_1025_u(FC_ACCT_1025_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1025_UDataSet ds = (FC_ACCT_1025_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1026_UDataSet fc_acct_1026_u(FC_ACCT_1026_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1026_UDataSet ds = (FC_ACCT_1026_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_1027_ADataSet fc_acct_1027_a(FC_ACCT_1027_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_1027_ADataSet ds = (FC_ACCT_1027_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
