package chosun.ciis.fc.func.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

public class FC_FUNC_2000DAO {
	public FC_FUNC_9999_LDataSet getDummyList(FC_FUNC_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_9999_LDataSet ds = (FC_FUNC_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public FC_FUNC_2000_MDataSet fc_func_2000_m(FC_FUNC_2000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2000_MDataSet ds = (FC_FUNC_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2001_LDataSet fc_func_2001_l(FC_FUNC_2001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2001_LDataSet ds = (FC_FUNC_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2002_IDataSet fc_func_2002_i(FC_FUNC_2002_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2002_IDataSet ds = (FC_FUNC_2002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2010_MDataSet fc_func_2010_m(FC_FUNC_2010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2010_MDataSet ds = (FC_FUNC_2010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2011_LDataSet fc_func_2011_l(FC_FUNC_2011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2011_LDataSet ds = (FC_FUNC_2011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2012_LDataSet fc_func_2012_l(FC_FUNC_2012_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2012_LDataSet ds = (FC_FUNC_2012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2013_IDataSet fc_func_2013_i(FC_FUNC_2013_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2013_IDataSet ds = (FC_FUNC_2013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2014_DDataSet fc_func_2014_d(FC_FUNC_2014_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2014_DDataSet ds = (FC_FUNC_2014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2020_MDataSet fc_func_2020_m(FC_FUNC_2020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2020_MDataSet ds = (FC_FUNC_2020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2021_LDataSet fc_func_2021_l(FC_FUNC_2021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2021_LDataSet ds = (FC_FUNC_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2022_LDataSet fc_func_2022_l(FC_FUNC_2022_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2022_LDataSet ds = (FC_FUNC_2022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2024_DDataSet fc_func_2024_d(FC_FUNC_2024_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2024_DDataSet ds = (FC_FUNC_2024_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2023_IDataSet fc_func_2023_i(FC_FUNC_2023_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2023_IDataSet ds = (FC_FUNC_2023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2030_MDataSet fc_func_2030_m(FC_FUNC_2030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2030_MDataSet ds = (FC_FUNC_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2031_LDataSet fc_func_2031_l(FC_FUNC_2031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2031_LDataSet ds = (FC_FUNC_2031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2050_MDataSet fc_func_2050_m(FC_FUNC_2050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2050_MDataSet ds = (FC_FUNC_2050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_2051_LDataSet fc_func_2051_l(FC_FUNC_2051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_2051_LDataSet ds = (FC_FUNC_2051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
