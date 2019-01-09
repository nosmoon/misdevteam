package chosun.ciis.mc.budg.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

public class MC_BUDG_4000DAO {
	public MC_BUDG_9999_LDataSet getDummyList(MC_BUDG_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_9999_LDataSet ds = (MC_BUDG_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public MC_BUDG_4030_MDataSet mc_budg_4030_m(MC_BUDG_4030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4030_MDataSet ds = (MC_BUDG_4030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4031_LDataSet mc_budg_4031_l(MC_BUDG_4031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4031_LDataSet ds = (MC_BUDG_4031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4041_LDataSet mc_budg_4041_l(MC_BUDG_4041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4041_LDataSet ds = (MC_BUDG_4041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4042_LDataSet mc_budg_4042_l(MC_BUDG_4042_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4042_LDataSet ds = (MC_BUDG_4042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4071_LDataSet mc_budg_4071_l(MC_BUDG_4071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4071_LDataSet ds = (MC_BUDG_4071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4072_LDataSet mc_budg_4072_l(MC_BUDG_4072_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4072_LDataSet ds = (MC_BUDG_4072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4073_LDataSet mc_budg_4073_l(MC_BUDG_4073_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4073_LDataSet ds = (MC_BUDG_4073_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4074_LDataSet mc_budg_4074_l(MC_BUDG_4074_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4074_LDataSet ds = (MC_BUDG_4074_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4075_LDataSet mc_budg_4075_l(MC_BUDG_4075_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4075_LDataSet ds = (MC_BUDG_4075_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4081_LDataSet mc_budg_4081_l(MC_BUDG_4081_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4081_LDataSet ds = (MC_BUDG_4081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4082_LDataSet mc_budg_4082_l(MC_BUDG_4082_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4082_LDataSet ds = (MC_BUDG_4082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4083_LDataSet mc_budg_4083_l(MC_BUDG_4083_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4083_LDataSet ds = (MC_BUDG_4083_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4061_LDataSet mc_budg_4061_l(MC_BUDG_4061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4061_LDataSet ds = (MC_BUDG_4061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4062_IDataSet mc_budg_4062_i(MC_BUDG_4062_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4062_IDataSet ds = (MC_BUDG_4062_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4063_LDataSet mc_budg_4063_l(MC_BUDG_4063_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4063_LDataSet ds = (MC_BUDG_4063_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4001_LDataSet mc_budg_4001_l(MC_BUDG_4001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4001_LDataSet ds = (MC_BUDG_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4002_EDataSet mc_budg_4002_e(MC_BUDG_4002_EDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4002_EDataSet ds = (MC_BUDG_4002_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4003_LDataSet mc_budg_4003_l(MC_BUDG_4003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4003_LDataSet ds = (MC_BUDG_4003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4004_IDataSet mc_budg_4004_i(MC_BUDG_4004_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4004_IDataSet ds = (MC_BUDG_4004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4005_LDataSet mc_budg_4005_l(MC_BUDG_4005_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4005_LDataSet ds = (MC_BUDG_4005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4006_LDataSet mc_budg_4006_l(MC_BUDG_4006_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4006_LDataSet ds = (MC_BUDG_4006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4020_MDataSet mc_budg_4020_m(MC_BUDG_4020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4020_MDataSet ds = (MC_BUDG_4020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4021_LDataSet mc_budg_4021_l(MC_BUDG_4021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4021_LDataSet ds = (MC_BUDG_4021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4024_LDataSet mc_budg_4024_l(MC_BUDG_4024_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4024_LDataSet ds = (MC_BUDG_4024_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4010_MDataSet mc_budg_4010_m(MC_BUDG_4010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4010_MDataSet ds = (MC_BUDG_4010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4011_LDataSet mc_budg_4011_l(MC_BUDG_4011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4011_LDataSet ds = (MC_BUDG_4011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4012_LDataSet mc_budg_4012_l(MC_BUDG_4012_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4012_LDataSet ds = (MC_BUDG_4012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
		
	public MC_BUDG_4013_IDataSet mc_budg_4013_i(MC_BUDG_4013_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4013_IDataSet ds = (MC_BUDG_4013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4014_IDataSet mc_budg_4014_i(MC_BUDG_4014_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4014_IDataSet ds = (MC_BUDG_4014_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MC_BUDG_4015_LDataSet mc_budg_4015_l(MC_BUDG_4015_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4015_LDataSet ds = (MC_BUDG_4015_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4016_LDataSet mc_budg_4016_l(MC_BUDG_4016_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4016_LDataSet ds = (MC_BUDG_4016_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4017_LDataSet mc_budg_4017_l(MC_BUDG_4017_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4017_LDataSet ds = (MC_BUDG_4017_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4018_DDataSet mc_budg_4018_d(MC_BUDG_4018_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4018_DDataSet ds = (MC_BUDG_4018_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4019_DDataSet mc_budg_4019_d(MC_BUDG_4019_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4019_DDataSet ds = (MC_BUDG_4019_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4050_MDataSet mc_budg_4050_m(MC_BUDG_4050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4050_MDataSet ds = (MC_BUDG_4050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4051_LDataSet mc_budg_4051_l(MC_BUDG_4051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4051_LDataSet ds = (MC_BUDG_4051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4052_LDataSet mc_budg_4052_l(MC_BUDG_4052_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4052_LDataSet ds = (MC_BUDG_4052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4053_LDataSet mc_budg_4053_l(MC_BUDG_4053_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4053_LDataSet ds = (MC_BUDG_4053_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4054_LDataSet mc_budg_4054_l(MC_BUDG_4054_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4054_LDataSet ds = (MC_BUDG_4054_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4055_LDataSet mc_budg_4055_l(MC_BUDG_4055_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4055_LDataSet ds = (MC_BUDG_4055_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4056_LDataSet mc_budg_4056_l(MC_BUDG_4056_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4056_LDataSet ds = (MC_BUDG_4056_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4057_IDataSet mc_budg_4057_i(MC_BUDG_4057_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4057_IDataSet ds = (MC_BUDG_4057_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4058_IDataSet mc_budg_4058_i(MC_BUDG_4058_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4058_IDataSet ds = (MC_BUDG_4058_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_4059_DDataSet mc_budg_4059_d(MC_BUDG_4059_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4059_DDataSet ds = (MC_BUDG_4059_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4100_IDataSet mc_budg_4100_i(MC_BUDG_4100_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4100_IDataSet ds = (MC_BUDG_4100_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4101_IDataSet mc_budg_4101_i(MC_BUDG_4101_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4101_IDataSet ds = (MC_BUDG_4101_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4102_DDataSet mc_budg_4102_d(MC_BUDG_4102_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4102_DDataSet ds = (MC_BUDG_4102_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4103_LDataSet mc_budg_4103_l(MC_BUDG_4103_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4103_LDataSet ds = (MC_BUDG_4103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4104_IDataSet mc_budg_4104_i(MC_BUDG_4104_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4104_IDataSet ds = (MC_BUDG_4104_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4105_LDataSet mc_budg_4105_l(MC_BUDG_4105_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4105_LDataSet ds = (MC_BUDG_4105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4106_LDataSet mc_budg_4106_l(MC_BUDG_4106_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4106_LDataSet ds = (MC_BUDG_4106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4120_IDataSet mc_budg_4120_i(MC_BUDG_4120_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4120_IDataSet ds = (MC_BUDG_4120_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4122_DDataSet mc_budg_4122_d(MC_BUDG_4122_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4122_DDataSet ds = (MC_BUDG_4122_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4123_LDataSet mc_budg_4123_l(MC_BUDG_4123_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4123_LDataSet ds = (MC_BUDG_4123_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4130_LDataSet mc_budg_4130_l(MC_BUDG_4130_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4130_LDataSet ds = (MC_BUDG_4130_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4091_LDataSet mc_budg_4091_l(MC_BUDG_4091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4091_LDataSet ds = (MC_BUDG_4091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_4092_LDataSet mc_budg_4092_l(MC_BUDG_4092_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_4092_LDataSet ds = (MC_BUDG_4092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
