package chosun.ciis.fc.func.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

public class FC_FUNC_6000DAO {
	public FC_FUNC_9999_LDataSet getDummyList(FC_FUNC_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_9999_LDataSet ds = (FC_FUNC_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public FC_FUNC_6080_MDataSet fc_func_6080_m(FC_FUNC_6080_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6080_MDataSet ds = (FC_FUNC_6080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6081_LDataSet fc_func_6081_l(FC_FUNC_6081_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6081_LDataSet ds = (FC_FUNC_6081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6082_LDataSet fc_func_6082_l(FC_FUNC_6082_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6082_LDataSet ds = (FC_FUNC_6082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6083_IDataSet fc_func_6083_i(FC_FUNC_6083_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6083_IDataSet ds = (FC_FUNC_6083_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6084_DDataSet fc_func_6084_d(FC_FUNC_6084_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6084_DDataSet ds = (FC_FUNC_6084_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6090_MDataSet fc_func_6090_m(FC_FUNC_6090_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6090_MDataSet ds = (FC_FUNC_6090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6091_LDataSet fc_func_6091_l(FC_FUNC_6091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6091_LDataSet ds = (FC_FUNC_6091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6092_IDataSet fc_func_6092_i(FC_FUNC_6092_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6092_IDataSet ds = (FC_FUNC_6092_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6093_DDataSet fc_func_6093_d(FC_FUNC_6093_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6093_DDataSet ds = (FC_FUNC_6093_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6100_MDataSet fc_func_6100_m(FC_FUNC_6100_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6100_MDataSet ds = (FC_FUNC_6100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6101_LDataSet fc_func_6101_l(FC_FUNC_6101_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6101_LDataSet ds = (FC_FUNC_6101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6111_LDataSet fc_func_6111_l(FC_FUNC_6111_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6111_LDataSet ds = (FC_FUNC_6111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6112_LDataSet fc_func_6112_l(FC_FUNC_6112_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6112_LDataSet ds = (FC_FUNC_6112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6113_IDataSet fc_func_6113_i(FC_FUNC_6113_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6113_IDataSet ds = (FC_FUNC_6113_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6114_DDataSet fc_func_6114_d(FC_FUNC_6114_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6114_DDataSet ds = (FC_FUNC_6114_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6120_MDataSet fc_func_6120_m(FC_FUNC_6120_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6120_MDataSet ds = (FC_FUNC_6120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6121_LDataSet fc_func_6121_l(FC_FUNC_6121_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6121_LDataSet ds = (FC_FUNC_6121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6122_LDataSet fc_func_6122_l(FC_FUNC_6122_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6122_LDataSet ds = (FC_FUNC_6122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6123_IDataSet fc_func_6123_i(FC_FUNC_6123_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6123_IDataSet ds = (FC_FUNC_6123_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6124_DDataSet fc_func_6124_d(FC_FUNC_6124_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6124_DDataSet ds = (FC_FUNC_6124_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6150_MDataSet fc_func_6150_m(FC_FUNC_6150_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6150_MDataSet ds = (FC_FUNC_6150_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6151_LDataSet fc_func_6151_l(FC_FUNC_6151_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6151_LDataSet ds = (FC_FUNC_6151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6160_MDataSet fc_func_6160_m(FC_FUNC_6160_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6160_MDataSet ds = (FC_FUNC_6160_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_FUNC_6161_LDataSet fc_func_6161_l(FC_FUNC_6161_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6161_LDataSet ds = (FC_FUNC_6161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6000_MDataSet fc_func_6000_m(FC_FUNC_6000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6000_MDataSet ds = (FC_FUNC_6000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6001_LDataSet fc_func_6001_l(FC_FUNC_6001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6001_LDataSet ds = (FC_FUNC_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6002_LDataSet fc_func_6002_l(FC_FUNC_6002_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6002_LDataSet ds = (FC_FUNC_6002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6003_LDataSet fc_func_6003_l(FC_FUNC_6003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6003_LDataSet ds = (FC_FUNC_6003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6004_IDataSet fc_func_6004_i(FC_FUNC_6004_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6004_IDataSet ds = (FC_FUNC_6004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6005_DDataSet fc_func_6005_d(FC_FUNC_6005_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6005_DDataSet ds = (FC_FUNC_6005_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6010_LDataSet fc_func_6010_l(FC_FUNC_6010_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6010_LDataSet ds = (FC_FUNC_6010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6011_IDataSet fc_func_6011_i(FC_FUNC_6011_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6011_IDataSet ds = (FC_FUNC_6011_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6012_DDataSet fc_func_6012_d(FC_FUNC_6012_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6012_DDataSet ds = (FC_FUNC_6012_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6020_MDataSet fc_func_6020_m(FC_FUNC_6020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6020_MDataSet ds = (FC_FUNC_6020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6021_LDataSet fc_func_6021_l(FC_FUNC_6021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6021_LDataSet ds = (FC_FUNC_6021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6022_LDataSet fc_func_6022_l(FC_FUNC_6022_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6022_LDataSet ds = (FC_FUNC_6022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6023_IDataSet fc_func_6023_i(FC_FUNC_6023_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6023_IDataSet ds = (FC_FUNC_6023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6024_DDataSet fc_func_6024_d(FC_FUNC_6024_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6024_DDataSet ds = (FC_FUNC_6024_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6030_MDataSet fc_func_6030_m(FC_FUNC_6030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6030_MDataSet ds = (FC_FUNC_6030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6031_LDataSet fc_func_6031_l(FC_FUNC_6031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6031_LDataSet ds = (FC_FUNC_6031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6032_LDataSet fc_func_6032_l(FC_FUNC_6032_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6032_LDataSet ds = (FC_FUNC_6032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6033_IDataSet fc_func_6033_i(FC_FUNC_6033_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6033_IDataSet ds = (FC_FUNC_6033_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6034_DDataSet fc_func_6034_d(FC_FUNC_6034_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6034_DDataSet ds = (FC_FUNC_6034_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6050_LDataSet fc_func_6050_l(FC_FUNC_6050_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6050_LDataSet ds = (FC_FUNC_6050_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6051_MDataSet fc_func_6051_m(FC_FUNC_6051_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6051_MDataSet ds = (FC_FUNC_6051_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6060_MDataSet fc_func_6060_m(FC_FUNC_6060_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6060_MDataSet ds = (FC_FUNC_6060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6061_LDataSet fc_func_6061_l(FC_FUNC_6061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6061_LDataSet ds = (FC_FUNC_6061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6062_LDataSet fc_func_6062_l(FC_FUNC_6062_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6062_LDataSet ds = (FC_FUNC_6062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6063_IDataSet fc_func_6063_i(FC_FUNC_6063_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6063_IDataSet ds = (FC_FUNC_6063_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6064_DDataSet fc_func_6064_d(FC_FUNC_6064_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6064_DDataSet ds = (FC_FUNC_6064_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6070_MDataSet fc_func_6070_m(FC_FUNC_6070_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6070_MDataSet ds = (FC_FUNC_6070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6071_LDataSet fc_func_6071_l(FC_FUNC_6071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6071_LDataSet ds = (FC_FUNC_6071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6072_LDataSet fc_func_6072_l(FC_FUNC_6072_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6072_LDataSet ds = (FC_FUNC_6072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6076_LDataSet fc_func_6076_l(FC_FUNC_6076_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6076_LDataSet ds = (FC_FUNC_6076_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6073_IDataSet fc_func_6073_i(FC_FUNC_6073_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6073_IDataSet ds = (FC_FUNC_6073_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6074_DDataSet fc_func_6074_d(FC_FUNC_6074_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6074_DDataSet ds = (FC_FUNC_6074_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6075_IDataSet fc_func_6075_i(FC_FUNC_6075_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6075_IDataSet ds = (FC_FUNC_6075_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6077_DDataSet fc_func_6077_d(FC_FUNC_6077_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6077_DDataSet ds = (FC_FUNC_6077_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6040_MDataSet fc_func_6040_m(FC_FUNC_6040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6040_MDataSet ds = (FC_FUNC_6040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6041_LDataSet fc_func_6041_l(FC_FUNC_6041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6041_LDataSet ds = (FC_FUNC_6041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6042_LDataSet fc_func_6042_l(FC_FUNC_6042_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6042_LDataSet ds = (FC_FUNC_6042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6043_IDataSet fc_func_6043_i(FC_FUNC_6043_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6043_IDataSet ds = (FC_FUNC_6043_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6044_DDataSet fc_func_6044_d(FC_FUNC_6044_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6044_DDataSet ds = (FC_FUNC_6044_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6500_MDataSet fc_func_6500_m(FC_FUNC_6500_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6500_MDataSet ds = (FC_FUNC_6500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6501_LDataSet fc_func_6501_l(FC_FUNC_6501_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6501_LDataSet ds = (FC_FUNC_6501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6502_LDataSet fc_func_6502_l(FC_FUNC_6502_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6502_LDataSet ds = (FC_FUNC_6502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6503_LDataSet fc_func_6503_l(FC_FUNC_6503_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6503_LDataSet ds = (FC_FUNC_6503_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6504_IDataSet fc_func_6504_i(FC_FUNC_6504_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6504_IDataSet ds = (FC_FUNC_6504_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6505_DDataSet fc_func_6505_d(FC_FUNC_6505_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6505_DDataSet ds = (FC_FUNC_6505_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6510_LDataSet fc_func_6510_l(FC_FUNC_6510_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6510_LDataSet ds = (FC_FUNC_6510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6511_IDataSet fc_func_6511_i(FC_FUNC_6511_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6511_IDataSet ds = (FC_FUNC_6511_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_6512_DDataSet fc_func_6512_d(FC_FUNC_6512_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_6512_DDataSet ds = (FC_FUNC_6512_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
