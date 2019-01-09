package chosun.ciis.mc.budg.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

public class MC_BUDG_2000DAO {
	public MC_BUDG_9999_LDataSet getDummyList(MC_BUDG_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_9999_LDataSet ds = (MC_BUDG_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public MC_BUDG_2010_MDataSet mc_budg_2010_m(MC_BUDG_2010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2010_MDataSet ds = (MC_BUDG_2010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2011_LDataSet mc_budg_2011_l(MC_BUDG_2011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2011_LDataSet ds = (MC_BUDG_2011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2020_MDataSet mc_budg_2020_m(MC_BUDG_2020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2020_MDataSet ds = (MC_BUDG_2020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2021_LDataSet mc_budg_2021_l(MC_BUDG_2021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2021_LDataSet ds = (MC_BUDG_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2022_DDataSet mc_budg_2022_d(MC_BUDG_2022_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2022_DDataSet ds = (MC_BUDG_2022_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2030_MDataSet mc_budg_2030_m(MC_BUDG_2030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2030_MDataSet ds = (MC_BUDG_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2031_LDataSet mc_budg_2031_l(MC_BUDG_2031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2031_LDataSet ds = (MC_BUDG_2031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2070_MDataSet mc_budg_2070_m(MC_BUDG_2070_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2070_MDataSet ds = (MC_BUDG_2070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2071_LDataSet mc_budg_2071_l(MC_BUDG_2071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2071_LDataSet ds = (MC_BUDG_2071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2072_LDataSet mc_budg_2072_l(MC_BUDG_2072_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2072_LDataSet ds = (MC_BUDG_2072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2073_LDataSet mc_budg_2073_l(MC_BUDG_2073_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2073_LDataSet ds = (MC_BUDG_2073_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2076_IDataSet mc_budg_2076_i(MC_BUDG_2076_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2076_IDataSet ds = (MC_BUDG_2076_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2077_DDataSet mc_budg_2077_d(MC_BUDG_2077_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2077_DDataSet ds = (MC_BUDG_2077_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2080_MDataSet mc_budg_2080_m(MC_BUDG_2080_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2080_MDataSet ds = (MC_BUDG_2080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2081_LDataSet mc_budg_2081_l(MC_BUDG_2081_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2081_LDataSet ds = (MC_BUDG_2081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2082_LDataSet mc_budg_2082_l(MC_BUDG_2082_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2082_LDataSet ds = (MC_BUDG_2082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2083_IDataSet mc_budg_2083_i(MC_BUDG_2083_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2083_IDataSet ds = (MC_BUDG_2083_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2084_DDataSet mc_budg_2084_d(MC_BUDG_2084_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2084_DDataSet ds = (MC_BUDG_2084_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2090_MDataSet mc_budg_2090_m(MC_BUDG_2090_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2090_MDataSet ds = (MC_BUDG_2090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2091_LDataSet mc_budg_2091_l(MC_BUDG_2091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2091_LDataSet ds = (MC_BUDG_2091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2092_LDataSet mc_budg_2092_l(MC_BUDG_2092_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2092_LDataSet ds = (MC_BUDG_2092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2093_LDataSet mc_budg_2093_l(MC_BUDG_2093_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2093_LDataSet ds = (MC_BUDG_2093_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2094_LDataSet mc_budg_2094_l(MC_BUDG_2094_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2094_LDataSet ds = (MC_BUDG_2094_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2095_IDataSet mc_budg_2095_i(MC_BUDG_2095_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2095_IDataSet ds = (MC_BUDG_2095_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2096_UDataSet mc_budg_2096_u(MC_BUDG_2096_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2096_UDataSet ds = (MC_BUDG_2096_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2097_DDataSet mc_budg_2097_d(MC_BUDG_2097_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2097_DDataSet ds = (MC_BUDG_2097_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2100_MDataSet mc_budg_2100_m(MC_BUDG_2100_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2100_MDataSet ds = (MC_BUDG_2100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2101_LDataSet mc_budg_2101_l(MC_BUDG_2101_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2101_LDataSet ds = (MC_BUDG_2101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2102_IDataSet mc_budg_2102_i(MC_BUDG_2102_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2102_IDataSet ds = (MC_BUDG_2102_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2103_MDataSet mc_budg_2103_m(MC_BUDG_2103_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2103_MDataSet ds = (MC_BUDG_2103_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2104_MDataSet mc_budg_2104_m(MC_BUDG_2104_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2104_MDataSet ds = (MC_BUDG_2104_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2105_LDataSet mc_budg_2105_l(MC_BUDG_2105_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2105_LDataSet ds = (MC_BUDG_2105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2106_LDataSet mc_budg_2106_l(MC_BUDG_2106_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2106_LDataSet ds = (MC_BUDG_2106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_BUDG_2107_DDataSet mc_budg_2107_d(MC_BUDG_2107_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2107_DDataSet ds = (MC_BUDG_2107_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2111_LDataSet mc_budg_2111_l(MC_BUDG_2111_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2111_LDataSet ds = (MC_BUDG_2111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2112_LDataSet mc_budg_2112_l(MC_BUDG_2112_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2112_LDataSet ds = (MC_BUDG_2112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_BUDG_2113_IDataSet mc_budg_2113_i(MC_BUDG_2113_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2113_IDataSet ds = (MC_BUDG_2113_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2114_DDataSet mc_budg_2114_d(MC_BUDG_2114_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2114_DDataSet ds = (MC_BUDG_2114_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2115_LDataSet mc_budg_2115_l(MC_BUDG_2115_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2115_LDataSet ds = (MC_BUDG_2115_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2116_LDataSet mc_budg_2116_l(MC_BUDG_2116_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2116_LDataSet ds = (MC_BUDG_2116_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2117_LDataSet mc_budg_2117_l(MC_BUDG_2117_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2117_LDataSet ds = (MC_BUDG_2117_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2118_LDataSet mc_budg_2118_l(MC_BUDG_2118_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2118_LDataSet ds = (MC_BUDG_2118_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_BUDG_2121_SDataSet mc_budg_2121_s(MC_BUDG_2121_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2121_SDataSet ds = (MC_BUDG_2121_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2122_LDataSet mc_budg_2122_l(MC_BUDG_2122_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2122_LDataSet ds = (MC_BUDG_2122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2123_ADataSet mc_budg_2123_a(MC_BUDG_2123_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2123_ADataSet ds = (MC_BUDG_2123_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2124_SDataSet mc_budg_2124_s(MC_BUDG_2124_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2124_SDataSet ds = (MC_BUDG_2124_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2125_DDataSet mc_budg_2125_d(MC_BUDG_2125_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2125_DDataSet ds = (MC_BUDG_2125_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2126_LDataSet mc_budg_2126_l(MC_BUDG_2126_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2126_LDataSet ds = (MC_BUDG_2126_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2127_LDataSet mc_budg_2127_l(MC_BUDG_2127_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2127_LDataSet ds = (MC_BUDG_2127_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MC_BUDG_2240_MDataSet mc_budg_2240_m(MC_BUDG_2240_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2240_MDataSet ds = (MC_BUDG_2240_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2241_LDataSet mc_budg_2241_l(MC_BUDG_2241_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2241_LDataSet ds = (MC_BUDG_2241_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2242_LDataSet mc_budg_2242_l(MC_BUDG_2242_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2242_LDataSet ds = (MC_BUDG_2242_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2243_UDataSet mc_budg_2243_u(MC_BUDG_2243_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2243_UDataSet ds = (MC_BUDG_2243_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2251_LDataSet mc_budg_2251_l(MC_BUDG_2251_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2251_LDataSet ds = (MC_BUDG_2251_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2252_UDataSet mc_budg_2252_u(MC_BUDG_2252_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2252_UDataSet ds = (MC_BUDG_2252_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2253_UDataSet mc_budg_2253_u(MC_BUDG_2253_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2253_UDataSet ds = (MC_BUDG_2253_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2254_IDataSet mc_budg_2254_i(MC_BUDG_2254_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2254_IDataSet ds = (MC_BUDG_2254_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2255_IDataSet mc_budg_2255_i(MC_BUDG_2255_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2255_IDataSet ds = (MC_BUDG_2255_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2256_IDataSet mc_budg_2256_i(MC_BUDG_2256_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2256_IDataSet ds = (MC_BUDG_2256_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2257_DDataSet mc_budg_2257_d(MC_BUDG_2257_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2257_DDataSet ds = (MC_BUDG_2257_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2258_ADataSet mc_budg_2258_a(MC_BUDG_2258_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2258_ADataSet ds = (MC_BUDG_2258_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2281_LDataSet mc_budg_2281_l(MC_BUDG_2281_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2281_LDataSet ds = (MC_BUDG_2281_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2162_LDataSet mc_budg_2162_l(MC_BUDG_2162_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2162_LDataSet ds = (MC_BUDG_2162_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2061_LDataSet mc_budg_2061_l(MC_BUDG_2061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2061_LDataSet ds = (MC_BUDG_2061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_2128_LDataSet mc_budg_2128_l(MC_BUDG_2128_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_2128_LDataSet ds = (MC_BUDG_2128_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
