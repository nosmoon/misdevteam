package chosun.ciis.mc.cost.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

public class MC_COST_2000DAO {
	public MC_COST_2000_MDataSet mc_cost_2000_m(MC_COST_2000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2000_MDataSet ds = (MC_COST_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2001_LDataSet mc_cost_2001_l(MC_COST_2001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2001_LDataSet ds = (MC_COST_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2002_IDataSet mc_cost_2002_i(MC_COST_2002_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2002_IDataSet ds = (MC_COST_2002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2003_LDataSet mc_cost_2003_l(MC_COST_2003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2003_LDataSet ds = (MC_COST_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2004_DDataSet mc_cost_2004_d(MC_COST_2004_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2004_DDataSet ds = (MC_COST_2004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2010_MDataSet mc_cost_2010_m(MC_COST_2010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2010_MDataSet ds = (MC_COST_2010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2011_MDataSet mc_cost_2011_m(MC_COST_2011_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2011_MDataSet ds = (MC_COST_2011_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2012_LDataSet mc_cost_2012_l(MC_COST_2012_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2012_LDataSet ds = (MC_COST_2012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2013_LDataSet mc_cost_2013_l(MC_COST_2013_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2013_LDataSet ds = (MC_COST_2013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2014_DDataSet mc_cost_2014_d(MC_COST_2014_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2014_DDataSet ds = (MC_COST_2014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2015_IDataSet mc_cost_2015_i(MC_COST_2015_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2015_IDataSet ds = (MC_COST_2015_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2016_LDataSet mc_cost_2016_l(MC_COST_2016_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2016_LDataSet ds = (MC_COST_2016_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2017_LDataSet mc_cost_2017_l(MC_COST_2017_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2017_LDataSet ds = (MC_COST_2017_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2020_MDataSet mc_cost_2020_m(MC_COST_2020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2020_MDataSet ds = (MC_COST_2020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2021_LDataSet mc_cost_2021_l(MC_COST_2021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2021_LDataSet ds = (MC_COST_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2022_IDataSet mc_cost_2022_i(MC_COST_2022_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2022_IDataSet ds = (MC_COST_2022_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2023_LDataSet mc_cost_2023_l(MC_COST_2023_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2023_LDataSet ds = (MC_COST_2023_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2030_MDataSet mc_cost_2030_m(MC_COST_2030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2030_MDataSet ds = (MC_COST_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2031_IDataSet mc_cost_2031_i(MC_COST_2031_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2031_IDataSet ds = (MC_COST_2031_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2032_DDataSet mc_cost_2032_d(MC_COST_2032_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2032_DDataSet ds = (MC_COST_2032_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2033_DDataSet mc_cost_2033_d(MC_COST_2033_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2033_DDataSet ds = (MC_COST_2033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2034_LDataSet mc_cost_2034_l(MC_COST_2034_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2034_LDataSet ds = (MC_COST_2034_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2035_IDataSet mc_cost_2035_i(MC_COST_2035_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2035_IDataSet ds = (MC_COST_2035_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2036_LDataSet mc_cost_2036_l(MC_COST_2036_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2036_LDataSet ds = (MC_COST_2036_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2040_MDataSet mc_cost_2040_m(MC_COST_2040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2040_MDataSet ds = (MC_COST_2040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2041_LDataSet mc_cost_2041_l(MC_COST_2041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2041_LDataSet ds = (MC_COST_2041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2042_LDataSet mc_cost_2042_l(MC_COST_2042_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2042_LDataSet ds = (MC_COST_2042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2043_DDataSet mc_cost_2043_d(MC_COST_2043_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2043_DDataSet ds = (MC_COST_2043_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2044_DDataSet mc_cost_2044_d(MC_COST_2044_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2044_DDataSet ds = (MC_COST_2044_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2045_DDataSet mc_cost_2045_d(MC_COST_2045_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2045_DDataSet ds = (MC_COST_2045_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2046_IDataSet mc_cost_2046_i(MC_COST_2046_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2046_IDataSet ds = (MC_COST_2046_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2047_IDataSet mc_cost_2047_i(MC_COST_2047_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2047_IDataSet ds = (MC_COST_2047_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2050_MDataSet mc_cost_2050_m(MC_COST_2050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2050_MDataSet ds = (MC_COST_2050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2051_LDataSet mc_cost_2051_l(MC_COST_2051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2051_LDataSet ds = (MC_COST_2051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2052_LDataSet mc_cost_2052_l(MC_COST_2052_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2052_LDataSet ds = (MC_COST_2052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2053_UDataSet mc_cost_2053_u(MC_COST_2053_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2053_UDataSet ds = (MC_COST_2053_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2054_IDataSet mc_cost_2054_i(MC_COST_2054_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2054_IDataSet ds = (MC_COST_2054_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_COST_2055_DDataSet mc_cost_2055_d(MC_COST_2055_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_COST_2055_DDataSet ds = (MC_COST_2055_DDataSet)manager.executeCall(dm);

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
