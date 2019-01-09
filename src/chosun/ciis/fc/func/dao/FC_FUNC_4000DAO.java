package chosun.ciis.fc.func.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

public class FC_FUNC_4000DAO {
	public FC_FUNC_9999_LDataSet getDummyList(FC_FUNC_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_9999_LDataSet ds = (FC_FUNC_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_FUNC_4000_MDataSet fc_func_4000_m(FC_FUNC_4000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4000_MDataSet ds = (FC_FUNC_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4001_LDataSet fc_func_4001_l(FC_FUNC_4001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4001_LDataSet ds = (FC_FUNC_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4002_IDataSet fc_func_4002_i(FC_FUNC_4002_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4002_IDataSet ds = (FC_FUNC_4002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4003_IDataSet fc_func_4003_i(FC_FUNC_4003_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4003_IDataSet ds = (FC_FUNC_4003_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4004_ADataSet fc_func_4004_a(FC_FUNC_4004_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4004_ADataSet ds = (FC_FUNC_4004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4021_LDataSet fc_func_4021_l(FC_FUNC_4021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4021_LDataSet ds = (FC_FUNC_4021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4022_LDataSet fc_func_4022_l(FC_FUNC_4022_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4022_LDataSet ds = (FC_FUNC_4022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4023_LDataSet fc_func_4023_l(FC_FUNC_4023_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4023_LDataSet ds = (FC_FUNC_4023_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4024_IDataSet fc_func_4024_i(FC_FUNC_4024_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4024_IDataSet ds = (FC_FUNC_4024_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4025_DDataSet fc_func_4025_d(FC_FUNC_4025_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4025_DDataSet ds = (FC_FUNC_4025_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4040_MDataSet fc_func_4040_m(FC_FUNC_4040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4040_MDataSet ds = (FC_FUNC_4040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4041_LDataSet fc_func_4041_l(FC_FUNC_4041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4041_LDataSet ds = (FC_FUNC_4041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4042_LDataSet fc_func_4042_l(FC_FUNC_4042_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4042_LDataSet ds = (FC_FUNC_4042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4050_MDataSet fc_func_4050_m(FC_FUNC_4050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4050_MDataSet ds = (FC_FUNC_4050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4051_LDataSet fc_func_4051_l(FC_FUNC_4051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4051_LDataSet ds = (FC_FUNC_4051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4052_LDataSet fc_func_4052_l(FC_FUNC_4052_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4052_LDataSet ds = (FC_FUNC_4052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4060_MDataSet fc_func_4060_m(FC_FUNC_4060_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4060_MDataSet ds = (FC_FUNC_4060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4032_LDataSet fc_func_4032_l(FC_FUNC_4032_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4032_LDataSet ds = (FC_FUNC_4032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4034_LDataSet fc_func_4034_l(FC_FUNC_4034_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4034_LDataSet ds = (FC_FUNC_4034_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4035_IDataSet fc_func_4035_i(FC_FUNC_4035_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4035_IDataSet ds = (FC_FUNC_4035_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4036_DDataSet fc_func_4036_d(FC_FUNC_4036_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4036_DDataSet ds = (FC_FUNC_4036_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4030_MDataSet fc_func_4030_m(FC_FUNC_4030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4030_MDataSet ds = (FC_FUNC_4030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4011_LDataSet fc_func_4011_l(FC_FUNC_4011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4011_LDataSet ds = (FC_FUNC_4011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4012_LDataSet fc_func_4012_l(FC_FUNC_4012_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4012_LDataSet ds = (FC_FUNC_4012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4015_EDataSet fc_func_4015_e(FC_FUNC_4015_EDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4015_EDataSet ds = (FC_FUNC_4015_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4014_DDataSet fc_func_4014_d(FC_FUNC_4014_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4014_DDataSet ds = (FC_FUNC_4014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4013_IDataSet fc_func_4013_i(FC_FUNC_4013_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4013_IDataSet ds = (FC_FUNC_4013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_4010_MDataSet fc_func_4010_m(FC_FUNC_4010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_4010_MDataSet ds = (FC_FUNC_4010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
