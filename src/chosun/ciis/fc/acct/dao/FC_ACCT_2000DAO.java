package chosun.ciis.fc.acct.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_2000DAO {

	public FC_ACCT_9999_LDataSet getDummyList(FC_ACCT_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_9999_LDataSet ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_2030_MDataSet fc_acct_2030_m(FC_ACCT_2030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2030_MDataSet ds = (FC_ACCT_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2031_LDataSet fc_acct_2031_l(FC_ACCT_2031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2031_LDataSet ds = (FC_ACCT_2031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2032_IDataSet fc_acct_2032_i(FC_ACCT_2032_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2032_IDataSet ds = (FC_ACCT_2032_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2033_DDataSet fc_acct_2033_d(FC_ACCT_2033_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		
		FC_ACCT_2033_DDataSet ds = (FC_ACCT_2033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public FC_ACCT_2040_MDataSet fc_acct_2040_m(FC_ACCT_2040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2040_MDataSet ds = (FC_ACCT_2040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2041_LDataSet fc_acct_2041_l(FC_ACCT_2041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2041_LDataSet ds = (FC_ACCT_2041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2045_LDataSet fc_acct_2045_l(FC_ACCT_2045_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2045_LDataSet ds = (FC_ACCT_2045_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2010_MDataSet fc_acct_2010_m(FC_ACCT_2010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2010_MDataSet ds = (FC_ACCT_2010_MDataSet)manager.executeCall(dm);

		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2011_LDataSet fc_acct_2011_l(FC_ACCT_2011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2011_LDataSet ds = (FC_ACCT_2011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2012_IDataSet fc_acct_2012_i(FC_ACCT_2012_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2012_IDataSet ds = (FC_ACCT_2012_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2013_SDataSet fc_acct_2013_s(FC_ACCT_2013_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2013_SDataSet ds = (FC_ACCT_2013_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2014_SDataSet fc_acct_2014_s(FC_ACCT_2014_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2014_SDataSet ds = (FC_ACCT_2014_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2050_MDataSet fc_acct_2050_m(FC_ACCT_2050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2050_MDataSet ds = (FC_ACCT_2050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2060_MDataSet fc_acct_2060_m(FC_ACCT_2060_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2060_MDataSet ds = (FC_ACCT_2060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2070_MDataSet fc_acct_2070_m(FC_ACCT_2070_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2070_MDataSet ds = (FC_ACCT_2070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2080_MDataSet fc_acct_2080_m(FC_ACCT_2080_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2080_MDataSet ds = (FC_ACCT_2080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2090_MDataSet fc_acct_2090_m(FC_ACCT_2090_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2090_MDataSet ds = (FC_ACCT_2090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2101_LDataSet fc_acct_2101_l(FC_ACCT_2101_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2101_LDataSet ds = (FC_ACCT_2101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2081_SDataSet fc_acct_2081_s(FC_ACCT_2081_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2081_SDataSet ds = (FC_ACCT_2081_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2082_SDataSet fc_acct_2082_s(FC_ACCT_2082_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2082_SDataSet ds = (FC_ACCT_2082_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2083_SDataSet fc_acct_2083_s(FC_ACCT_2083_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2083_SDataSet ds = (FC_ACCT_2083_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2110_MDataSet fc_acct_2110_m(FC_ACCT_2110_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2110_MDataSet ds = (FC_ACCT_2110_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2111_LDataSet fc_acct_2111_l(FC_ACCT_2111_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2111_LDataSet ds = (FC_ACCT_2111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2112_LDataSet fc_acct_2112_l(FC_ACCT_2112_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2112_LDataSet ds = (FC_ACCT_2112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public FC_ACCT_2113_ADataSet fc_acct_2113_a(FC_ACCT_2113_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2113_ADataSet ds = (FC_ACCT_2113_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public FC_ACCT_2114_ADataSet fc_acct_2114_a(FC_ACCT_2114_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2114_ADataSet ds = (FC_ACCT_2114_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public FC_ACCT_2115_ADataSet fc_acct_2115_a(FC_ACCT_2115_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2115_ADataSet ds = (FC_ACCT_2115_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		
	
	public FC_ACCT_2116_ADataSet fc_acct_2116_a(FC_ACCT_2116_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2116_ADataSet ds = (FC_ACCT_2116_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		
	
	public FC_ACCT_2120_MDataSet fc_acct_2120_m(FC_ACCT_2120_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2120_MDataSet ds = (FC_ACCT_2120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2121_LDataSet fc_acct_2121_l(FC_ACCT_2121_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2121_LDataSet ds = (FC_ACCT_2121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2122_IDataSet fc_acct_2122_i(FC_ACCT_2122_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2122_IDataSet ds = (FC_ACCT_2122_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2123_UDataSet fc_acct_2123_u(FC_ACCT_2123_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2123_UDataSet ds = (FC_ACCT_2123_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2124_DDataSet fc_acct_2124_d(FC_ACCT_2124_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2124_DDataSet ds = (FC_ACCT_2124_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2125_SDataSet fc_acct_2125_s(FC_ACCT_2125_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2125_SDataSet ds = (FC_ACCT_2125_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2126_SDataSet fc_acct_2126_s(FC_ACCT_2126_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2126_SDataSet ds = (FC_ACCT_2126_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2142_ADataSet fc_acct_2142_a(FC_ACCT_2142_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2142_ADataSet ds = (FC_ACCT_2142_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2143_IDataSet fc_acct_2143_i(FC_ACCT_2143_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2143_IDataSet ds = (FC_ACCT_2143_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2144_LDataSet fc_acct_2144_l(FC_ACCT_2144_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2144_LDataSet ds = (FC_ACCT_2144_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2150_MDataSet fc_acct_2150_m(FC_ACCT_2150_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2150_MDataSet ds = (FC_ACCT_2150_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2160_MDataSet fc_acct_2160_m(FC_ACCT_2160_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2160_MDataSet ds = (FC_ACCT_2160_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2161_LDataSet fc_acct_2161_l(FC_ACCT_2161_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2161_LDataSet ds = (FC_ACCT_2161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2162_LDataSet fc_acct_2162_l(FC_ACCT_2162_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2162_LDataSet ds = (FC_ACCT_2162_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2164_IDataSet fc_acct_2164_i(FC_ACCT_2164_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2164_IDataSet ds = (FC_ACCT_2164_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2165_DDataSet fc_acct_2165_d(FC_ACCT_2165_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2165_DDataSet ds = (FC_ACCT_2165_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2166_IDataSet fc_acct_2166_i(FC_ACCT_2166_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2166_IDataSet ds = (FC_ACCT_2166_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2167_DDataSet fc_acct_2167_d(FC_ACCT_2167_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2167_DDataSet ds = (FC_ACCT_2167_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2168_LDataSet fc_acct_2168_l(FC_ACCT_2168_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2168_LDataSet ds = (FC_ACCT_2168_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2175_ADataSet fc_acct_2175_a(FC_ACCT_2175_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2175_ADataSet ds = (FC_ACCT_2175_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2180_MDataSet fc_acct_2180_m(FC_ACCT_2180_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2180_MDataSet ds = (FC_ACCT_2180_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2182_SDataSet fc_acct_2182_s(FC_ACCT_2182_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2182_SDataSet ds = (FC_ACCT_2182_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2190_MDataSet fc_acct_2190_m(FC_ACCT_2190_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2190_MDataSet ds = (FC_ACCT_2190_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2191_LDataSet fc_acct_2191_l(FC_ACCT_2191_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2191_LDataSet ds = (FC_ACCT_2191_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2193_SDataSet fc_acct_2193_s(FC_ACCT_2193_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2193_SDataSet ds = (FC_ACCT_2193_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2194_SDataSet fc_acct_2194_s(FC_ACCT_2194_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2194_SDataSet ds = (FC_ACCT_2194_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2200_MDataSet fc_acct_2200_m(FC_ACCT_2200_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2200_MDataSet ds = (FC_ACCT_2200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2201_PDataSet fc_acct_2201_p(FC_ACCT_2201_PDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2201_PDataSet ds = (FC_ACCT_2201_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2203_SDataSet fc_acct_2203_s(FC_ACCT_2203_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2203_SDataSet ds = (FC_ACCT_2203_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2210_MDataSet fc_acct_2210_m(FC_ACCT_2210_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2210_MDataSet ds = (FC_ACCT_2210_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2211_LDataSet fc_acct_2211_l(FC_ACCT_2211_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2211_LDataSet ds = (FC_ACCT_2211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2212_IDataSet fc_acct_2212_i(FC_ACCT_2212_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2212_IDataSet ds = (FC_ACCT_2212_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2213_LDataSet fc_acct_2213_l(FC_ACCT_2213_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2213_LDataSet ds = (FC_ACCT_2213_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2220_MDataSet fc_acct_2220_m(FC_ACCT_2220_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2220_MDataSet ds = (FC_ACCT_2220_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2222_SDataSet fc_acct_2222_s(FC_ACCT_2222_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2222_SDataSet ds = (FC_ACCT_2222_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2223_SDataSet fc_acct_2223_s(FC_ACCT_2223_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2223_SDataSet ds = (FC_ACCT_2223_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2230_MDataSet fc_acct_2230_m(FC_ACCT_2230_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2230_MDataSet ds = (FC_ACCT_2230_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2231_LDataSet fc_acct_2231_l(FC_ACCT_2231_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2231_LDataSet ds = (FC_ACCT_2231_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2232_SDataSet fc_acct_2232_s(FC_ACCT_2232_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2232_SDataSet ds = (FC_ACCT_2232_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2241_LDataSet fc_acct_2241_l(FC_ACCT_2241_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2241_LDataSet ds = (FC_ACCT_2241_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public FC_ACCT_2245_MDataSet fc_acct_2245_m(FC_ACCT_2245_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2245_MDataSet ds = (FC_ACCT_2245_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2246_LDataSet fc_acct_2246_l(FC_ACCT_2246_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2246_LDataSet ds = (FC_ACCT_2246_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2247_LDataSet fc_acct_2247_l(FC_ACCT_2247_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2247_LDataSet ds = (FC_ACCT_2247_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2250_MDataSet fc_acct_2250_m(FC_ACCT_2250_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2250_MDataSet ds = (FC_ACCT_2250_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2251_LDataSet fc_acct_2251_l(FC_ACCT_2251_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2251_LDataSet ds = (FC_ACCT_2251_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2253_IDataSet fc_acct_2253_i(FC_ACCT_2253_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2253_IDataSet ds = (FC_ACCT_2253_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2254_UDataSet fc_acct_2254_u(FC_ACCT_2254_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2254_UDataSet ds = (FC_ACCT_2254_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2255_DDataSet fc_acct_2255_d(FC_ACCT_2255_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2255_DDataSet ds = (FC_ACCT_2255_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2260_MDataSet fc_acct_2260_m(FC_ACCT_2260_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2260_MDataSet ds = (FC_ACCT_2260_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;		
	}	
	public FC_ACCT_2261_PDataSet fc_acct_2261_p(FC_ACCT_2261_PDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2261_PDataSet ds = (FC_ACCT_2261_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2263_IDataSet fc_acct_2263_i(FC_ACCT_2263_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2263_IDataSet ds = (FC_ACCT_2263_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2270_MDataSet fc_acct_2270_m(FC_ACCT_2270_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2270_MDataSet ds = (FC_ACCT_2270_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2272_SDataSet fc_acct_2272_s(FC_ACCT_2272_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2272_SDataSet ds = (FC_ACCT_2272_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2280_MDataSet fc_acct_2280_m(FC_ACCT_2280_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2280_MDataSet ds = (FC_ACCT_2280_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2281_LDataSet fc_acct_2281_l(FC_ACCT_2281_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2281_LDataSet ds = (FC_ACCT_2281_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2282_SDataSet fc_acct_2282_s(FC_ACCT_2282_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2282_SDataSet ds = (FC_ACCT_2282_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2283_IDataSet fc_acct_2283_i(FC_ACCT_2283_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2283_IDataSet ds = (FC_ACCT_2283_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2284_DDataSet fc_acct_2284_d(FC_ACCT_2284_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2284_DDataSet ds = (FC_ACCT_2284_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2285_ADataSet fc_acct_2285_a(FC_ACCT_2285_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2285_ADataSet ds = (FC_ACCT_2285_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2290_MDataSet fc_acct_2290_m(FC_ACCT_2290_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2290_MDataSet ds = (FC_ACCT_2290_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2291_SDataSet fc_acct_2291_s(FC_ACCT_2291_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2291_SDataSet ds = (FC_ACCT_2291_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2292_SDataSet fc_acct_2292_s(FC_ACCT_2292_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2292_SDataSet ds = (FC_ACCT_2292_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2293_SDataSet fc_acct_2293_s(FC_ACCT_2293_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2293_SDataSet ds = (FC_ACCT_2293_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	public FC_ACCT_2340_MDataSet fc_acct_2340_m(FC_ACCT_2340_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2340_MDataSet ds = (FC_ACCT_2340_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2341_LDataSet fc_acct_2341_l(FC_ACCT_2341_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");                                      
		FC_ACCT_2341_LDataSet ds = (FC_ACCT_2341_LDataSet)manager.executeCall(dm);        
                                                                                          
		if(!ds.getErrcode().equals("")) {                                                 
			throw new AppException(ds.getErrcode(), ds.getErrmsg());                      
		}                                                                                 
                                                                                          
		return ds;                                                                        
	}           
	public FC_ACCT_2342_LDataSet fc_acct_2342_l(FC_ACCT_2342_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2342_LDataSet ds = (FC_ACCT_2342_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2343_LDataSet fc_acct_2343_l(FC_ACCT_2343_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2343_LDataSet ds = (FC_ACCT_2343_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2345_IDataSet fc_acct_2345_i(FC_ACCT_2345_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2345_IDataSet ds = (FC_ACCT_2345_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2346_DDataSet fc_acct_2346_d(FC_ACCT_2346_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2346_DDataSet ds = (FC_ACCT_2346_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2347_UDataSet fc_acct_2347_u(FC_ACCT_2347_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2347_UDataSet ds = (FC_ACCT_2347_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		
	public FC_ACCT_2350_MDataSet fc_acct_2350_m(FC_ACCT_2350_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2350_MDataSet ds = (FC_ACCT_2350_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2351_LDataSet fc_acct_2351_l(FC_ACCT_2351_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2351_LDataSet ds = (FC_ACCT_2351_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2352_LDataSet fc_acct_2352_l(FC_ACCT_2352_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2352_LDataSet ds = (FC_ACCT_2352_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2353_IDataSet fc_acct_2353_i(FC_ACCT_2353_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2353_IDataSet ds = (FC_ACCT_2353_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2354_LDataSet fc_acct_2354_l(FC_ACCT_2354_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2354_LDataSet ds = (FC_ACCT_2354_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2355_LDataSet fc_acct_2355_l(FC_ACCT_2355_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2355_LDataSet ds = (FC_ACCT_2355_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2361_LDataSet fc_acct_2361_l(FC_ACCT_2361_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2361_LDataSet ds = (FC_ACCT_2361_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}			
	public FC_ACCT_2370_MDataSet fc_acct_2370_m(FC_ACCT_2370_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2370_MDataSet ds = (FC_ACCT_2370_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2371_IDataSet fc_acct_2371_i(FC_ACCT_2371_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2371_IDataSet ds = (FC_ACCT_2371_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2372_LDataSet fc_acct_2372_l(FC_ACCT_2372_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2372_LDataSet ds = (FC_ACCT_2372_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2373_LDataSet fc_acct_2373_l(FC_ACCT_2373_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2373_LDataSet ds = (FC_ACCT_2373_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public FC_ACCT_2374_DDataSet fc_acct_2374_d(FC_ACCT_2374_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2374_DDataSet ds = (FC_ACCT_2374_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2375_LDataSet fc_acct_2375_l(FC_ACCT_2375_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2375_LDataSet ds = (FC_ACCT_2375_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2376_LDataSet fc_acct_2376_l(FC_ACCT_2376_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2376_LDataSet ds = (FC_ACCT_2376_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2380_MDataSet fc_acct_2380_m(FC_ACCT_2380_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2380_MDataSet ds = (FC_ACCT_2380_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2381_LDataSet fc_acct_2381_l(FC_ACCT_2381_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2381_LDataSet ds = (FC_ACCT_2381_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2382_LDataSet fc_acct_2382_l(FC_ACCT_2382_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2382_LDataSet ds = (FC_ACCT_2382_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2410_MDataSet fc_acct_2410_m(FC_ACCT_2410_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2410_MDataSet ds = (FC_ACCT_2410_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2411_LDataSet fc_acct_2411_l(FC_ACCT_2411_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2411_LDataSet ds = (FC_ACCT_2411_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2420_MDataSet fc_acct_2420_m(FC_ACCT_2420_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2420_MDataSet ds = (FC_ACCT_2420_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2421_LDataSet fc_acct_2421_l(FC_ACCT_2421_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2421_LDataSet ds = (FC_ACCT_2421_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2470_MDataSet fc_acct_2470_m(FC_ACCT_2470_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2470_MDataSet ds = (FC_ACCT_2470_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2471_LDataSet fc_acct_2471_l(FC_ACCT_2471_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2471_LDataSet ds = (FC_ACCT_2471_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2472_UDataSet fc_acct_2472_u(FC_ACCT_2472_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2472_UDataSet ds = (FC_ACCT_2472_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2473_SDataSet fc_acct_2473_s(FC_ACCT_2473_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2473_SDataSet ds = (FC_ACCT_2473_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2480_MDataSet fc_acct_2480_m(FC_ACCT_2480_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2480_MDataSet ds = (FC_ACCT_2480_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2481_LDataSet fc_acct_2481_l(FC_ACCT_2481_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2481_LDataSet ds = (FC_ACCT_2481_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2490_MDataSet fc_acct_2490_m(FC_ACCT_2490_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2490_MDataSet ds = (FC_ACCT_2490_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}		

		return ds;
	}	
	public FC_ACCT_2491_LDataSet fc_acct_2491_l(FC_ACCT_2491_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2491_LDataSet ds = (FC_ACCT_2491_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2492_SDataSet fc_acct_2492_s(FC_ACCT_2492_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2492_SDataSet ds = (FC_ACCT_2492_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2500_MDataSet fc_acct_2500_m(FC_ACCT_2500_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2500_MDataSet ds = (FC_ACCT_2500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2501_LDataSet fc_acct_2501_l(FC_ACCT_2501_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2501_LDataSet ds = (FC_ACCT_2501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2510_MDataSet fc_acct_2510_m(FC_ACCT_2510_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2510_MDataSet ds = (FC_ACCT_2510_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2511_LDataSet fc_acct_2511_l(FC_ACCT_2511_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2511_LDataSet ds = (FC_ACCT_2511_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2512_SDataSet fc_acct_2512_s(FC_ACCT_2512_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2512_SDataSet ds = (FC_ACCT_2512_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2520_MDataSet fc_acct_2520_m(FC_ACCT_2520_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2520_MDataSet ds = (FC_ACCT_2520_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2521_LDataSet fc_acct_2521_l(FC_ACCT_2521_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2521_LDataSet ds = (FC_ACCT_2521_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2530_MDataSet fc_acct_2530_m(FC_ACCT_2530_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2530_MDataSet ds = (FC_ACCT_2530_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2531_LDataSet fc_acct_2531_l(FC_ACCT_2531_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2531_LDataSet ds = (FC_ACCT_2531_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2540_LDataSet fc_acct_2540_l(FC_ACCT_2540_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2540_LDataSet ds = (FC_ACCT_2540_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2541_LDataSet fc_acct_2541_l(FC_ACCT_2541_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2541_LDataSet ds = (FC_ACCT_2541_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2542_MDataSet fc_acct_2542_m(FC_ACCT_2542_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2542_MDataSet ds = (FC_ACCT_2542_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2550_MDataSet fc_acct_2550_m(FC_ACCT_2550_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2550_MDataSet ds = (FC_ACCT_2550_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2555_SDataSet fc_acct_2555_s(FC_ACCT_2555_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2555_SDataSet ds = (FC_ACCT_2555_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2570_MDataSet fc_acct_2570_m(FC_ACCT_2570_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2570_MDataSet ds = (FC_ACCT_2570_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2571_LDataSet fc_acct_2571_l(FC_ACCT_2571_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2571_LDataSet ds = (FC_ACCT_2571_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2572_UDataSet fc_acct_2572_u(FC_ACCT_2572_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2572_UDataSet ds = (FC_ACCT_2572_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2573_IDataSet fc_acct_2573_i(FC_ACCT_2573_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2573_IDataSet ds = (FC_ACCT_2573_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2574_DDataSet fc_acct_2574_d(FC_ACCT_2574_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2574_DDataSet ds = (FC_ACCT_2574_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2580_MDataSet fc_acct_2580_m(FC_ACCT_2580_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2580_MDataSet ds = (FC_ACCT_2580_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2581_LDataSet fc_acct_2581_l(FC_ACCT_2581_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2581_LDataSet ds = (FC_ACCT_2581_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2582_SDataSet fc_acct_2582_s(FC_ACCT_2582_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2582_SDataSet ds = (FC_ACCT_2582_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2583_IDataSet fc_acct_2583_i(FC_ACCT_2583_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2583_IDataSet ds = (FC_ACCT_2583_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2584_DDataSet fc_acct_2584_d(FC_ACCT_2584_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2584_DDataSet ds = (FC_ACCT_2584_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2585_ADataSet fc_acct_2585_a(FC_ACCT_2585_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2585_ADataSet ds = (FC_ACCT_2585_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2591_LDataSet fc_acct_2591_l(FC_ACCT_2591_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2591_LDataSet ds = (FC_ACCT_2591_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2840_MDataSet fc_acct_2840_m(FC_ACCT_2840_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2840_MDataSet ds = (FC_ACCT_2840_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_2841_LDataSet fc_acct_2841_l(FC_ACCT_2841_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2841_LDataSet ds = (FC_ACCT_2841_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_2842_ADataSet fc_acct_2842_a(FC_ACCT_2842_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2842_ADataSet ds = (FC_ACCT_2842_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_2873_SDataSet fc_acct_2873_s(FC_ACCT_2873_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2873_SDataSet ds = (FC_ACCT_2873_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2920_MDataSet fc_acct_2920_m(FC_ACCT_2920_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2920_MDataSet ds = (FC_ACCT_2920_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_2921_LDataSet fc_acct_2921_l(FC_ACCT_2921_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2921_LDataSet ds = (FC_ACCT_2921_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

   public FC_ACCT_2130_MDataSet fc_acct_2130_m(FC_ACCT_2130_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2130_MDataSet ds = (FC_ACCT_2130_MDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }

    public FC_ACCT_2131_LDataSet fc_acct_2131_l(FC_ACCT_2131_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2131_LDataSet ds = (FC_ACCT_2131_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }

    public FC_ACCT_2132_IDataSet fc_acct_2132_i(FC_ACCT_2132_IDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2132_IDataSet ds = (FC_ACCT_2132_IDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }

    public FC_ACCT_2133_UDataSet fc_acct_2133_u(FC_ACCT_2133_UDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2133_UDataSet ds = (FC_ACCT_2133_UDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }

    public FC_ACCT_2134_DDataSet fc_acct_2134_d(FC_ACCT_2134_DDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2134_DDataSet ds = (FC_ACCT_2134_DDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }
    
    public FC_ACCT_2135_SDataSet fc_acct_2135_s(FC_ACCT_2135_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2135_SDataSet ds = (FC_ACCT_2135_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public FC_ACCT_2170_MDataSet fc_acct_2170_m(FC_ACCT_2170_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2170_MDataSet ds = (FC_ACCT_2170_MDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
        return ds;
	}

    public FC_ACCT_2171_LDataSet fc_acct_2171_l(FC_ACCT_2171_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2171_LDataSet ds = (FC_ACCT_2171_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
        return ds;
	}
	public FC_ACCT_2172_ADataSet fc_acct_2172_a(FC_ACCT_2172_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2172_ADataSet ds = (FC_ACCT_2172_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2173_UDataSet fc_acct_2173_u(FC_ACCT_2173_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2173_UDataSet ds = (FC_ACCT_2173_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
    public FC_ACCT_2310_LDataSet fc_acct_2310_l(FC_ACCT_2310_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2310_LDataSet ds = (FC_ACCT_2310_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
	}

	public FC_ACCT_2430_MDataSet fc_acct_2430_m(FC_ACCT_2430_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2430_MDataSet ds = (FC_ACCT_2430_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public FC_ACCT_2431_LDataSet fc_acct_2431_l(FC_ACCT_2431_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2431_LDataSet ds = (FC_ACCT_2431_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
	}
	public FC_ACCT_2441_LDataSet fc_acct_2441_l(FC_ACCT_2441_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2441_LDataSet ds = (FC_ACCT_2441_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_ACCT_2440_MDataSet fc_acct_2440_m(FC_ACCT_2440_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2440_MDataSet ds = (FC_ACCT_2440_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public FC_ACCT_2560_MDataSet fc_acct_2560_m(FC_ACCT_2560_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2560_MDataSet ds = (FC_ACCT_2560_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}    
	public FC_ACCT_2561_LDataSet fc_acct_2561_l(FC_ACCT_2561_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2561_LDataSet ds = (FC_ACCT_2561_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}    
	public FC_ACCT_2562_SDataSet fc_acct_2562_s(FC_ACCT_2562_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2562_SDataSet ds = (FC_ACCT_2562_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    public FC_ACCT_2851_LDataSet fc_acct_2851_l(FC_ACCT_2851_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2851_LDataSet ds = (FC_ACCT_2851_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public FC_ACCT_2852_UDataSet fc_acct_2852_u(FC_ACCT_2852_UDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2852_UDataSet ds = (FC_ACCT_2852_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public FC_ACCT_2860_MDataSet fc_acct_2860_m(FC_ACCT_2860_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2860_MDataSet ds = (FC_ACCT_2860_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public FC_ACCT_2861_LDataSet fc_acct_2861_l(FC_ACCT_2861_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2861_LDataSet ds = (FC_ACCT_2861_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public FC_ACCT_2450_MDataSet fc_acct_2450_m(FC_ACCT_2450_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2450_MDataSet ds = (FC_ACCT_2450_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_2451_LDataSet fc_acct_2451_l(FC_ACCT_2451_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2451_LDataSet ds = (FC_ACCT_2451_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public FC_ACCT_2460_LDataSet fc_acct_2460_l(FC_ACCT_2460_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2460_LDataSet ds = (FC_ACCT_2460_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
	}
    
	public FC_ACCT_2461_IDataSet fc_acct_2461_i(FC_ACCT_2461_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2461_IDataSet ds = (FC_ACCT_2461_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    public FC_ACCT_2900_LDataSet fc_acct_2900_l(FC_ACCT_2900_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2900_LDataSet ds = (FC_ACCT_2900_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }
    public FC_ACCT_2901_LDataSet fc_acct_2901_l(FC_ACCT_2901_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2901_LDataSet ds = (FC_ACCT_2901_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }

    public FC_ACCT_2902_UDataSet fc_acct_2902_u(FC_ACCT_2902_UDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2902_UDataSet ds = (FC_ACCT_2902_UDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }

    public FC_ACCT_2903_DDataSet fc_acct_2903_d(FC_ACCT_2903_DDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2903_DDataSet ds = (FC_ACCT_2903_DDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }
	public FC_ACCT_2904_LDataSet fc_acct_2904_l(FC_ACCT_2904_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2904_LDataSet ds = (FC_ACCT_2904_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2905_LDataSet fc_acct_2905_l(FC_ACCT_2905_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2905_LDataSet ds = (FC_ACCT_2905_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2906_LDataSet fc_acct_2906_l(FC_ACCT_2906_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2906_LDataSet ds = (FC_ACCT_2906_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2907_IDataSet fc_acct_2907_i(FC_ACCT_2907_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2907_IDataSet ds = (FC_ACCT_2907_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2908_DDataSet fc_acct_2908_d(FC_ACCT_2908_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2908_DDataSet ds = (FC_ACCT_2908_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
    public FC_ACCT_2910_MDataSet fc_acct_2910_m(FC_ACCT_2910_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2910_MDataSet ds = (FC_ACCT_2910_MDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }

    public FC_ACCT_2940_MDataSet fc_acct_2940_m(FC_ACCT_2940_MDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2940_MDataSet ds = (FC_ACCT_2940_MDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }
	public FC_ACCT_2942_SDataSet fc_acct_2942_s(FC_ACCT_2942_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2942_SDataSet ds = (FC_ACCT_2942_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}    
	public FC_ACCT_2931_LDataSet fc_acct_2931_l(FC_ACCT_2931_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2931_LDataSet ds = (FC_ACCT_2931_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2932_LDataSet fc_acct_2932_l(FC_ACCT_2932_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2932_LDataSet ds = (FC_ACCT_2932_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2933_LDataSet fc_acct_2933_l(FC_ACCT_2933_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2933_LDataSet ds = (FC_ACCT_2933_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2934_IDataSet fc_acct_2934_i(FC_ACCT_2934_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2934_IDataSet ds = (FC_ACCT_2934_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2935_DDataSet fc_acct_2935_d(FC_ACCT_2935_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2935_DDataSet ds = (FC_ACCT_2935_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
    public FC_ACCT_2950_LDataSet fc_acct_2950_l(FC_ACCT_2950_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2950_LDataSet ds = (FC_ACCT_2950_LDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }
    public FC_ACCT_2951_UDataSet fc_acct_2951_u(FC_ACCT_2951_UDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2951_UDataSet ds = (FC_ACCT_2951_UDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }
    public FC_ACCT_2952_DDataSet fc_acct_2952_d(FC_ACCT_2952_DDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISFNC");
        FC_ACCT_2952_DDataSet ds = (FC_ACCT_2952_DDataSet)manager.executeCall(dm);

        if(!ds.getErrcode().equals("")) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }

        return ds;
    }
	public FC_ACCT_2970_MDataSet fc_acct_2970_m(FC_ACCT_2970_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2970_MDataSet ds = (FC_ACCT_2970_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}    
	public FC_ACCT_2971_LDataSet fc_acct_2971_l(FC_ACCT_2971_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2971_LDataSet ds = (FC_ACCT_2971_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public FC_ACCT_2300_MDataSet fc_acct_2300_m(FC_ACCT_2300_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2300_MDataSet ds = (FC_ACCT_2300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2301_LDataSet fc_acct_2301_l(FC_ACCT_2301_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2301_LDataSet ds = (FC_ACCT_2301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2303_IDataSet fc_acct_2303_i(FC_ACCT_2303_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2303_IDataSet ds = (FC_ACCT_2303_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2304_DDataSet fc_acct_2304_d(FC_ACCT_2304_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2304_DDataSet ds = (FC_ACCT_2304_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2305_LDataSet fc_acct_2305_l(FC_ACCT_2305_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2305_LDataSet ds = (FC_ACCT_2305_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2151_LDataSet fc_acct_2151_l(FC_ACCT_2151_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2151_LDataSet ds = (FC_ACCT_2151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2152_IDataSet fc_acct_2152_i(FC_ACCT_2152_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2152_IDataSet ds = (FC_ACCT_2152_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2153_DDataSet fc_acct_2153_d(FC_ACCT_2153_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2153_DDataSet ds = (FC_ACCT_2153_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2960_MDataSet fc_acct_2960_m(FC_ACCT_2960_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2960_MDataSet ds = (FC_ACCT_2960_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2961_LDataSet fc_acct_2961_l(FC_ACCT_2961_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2961_LDataSet ds = (FC_ACCT_2961_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2963_IDataSet fc_acct_2963_i(FC_ACCT_2963_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2963_IDataSet ds = (FC_ACCT_2963_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2964_DDataSet fc_acct_2964_d(FC_ACCT_2964_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2964_DDataSet ds = (FC_ACCT_2964_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2020_MDataSet fc_acct_2020_m(FC_ACCT_2020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2020_MDataSet ds = (FC_ACCT_2020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2021_LDataSet fc_acct_2021_l(FC_ACCT_2021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2021_LDataSet ds = (FC_ACCT_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2022_LDataSet fc_acct_2022_l(FC_ACCT_2022_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2022_LDataSet ds = (FC_ACCT_2022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2023_IDataSet fc_acct_2023_i(FC_ACCT_2023_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2023_IDataSet ds = (FC_ACCT_2023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2024_UDataSet fc_acct_2024_u(FC_ACCT_2024_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2024_UDataSet ds = (FC_ACCT_2024_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2025_DDataSet fc_acct_2025_d(FC_ACCT_2025_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2025_DDataSet ds = (FC_ACCT_2025_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2026_LDataSet fc_acct_2026_l(FC_ACCT_2026_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2026_LDataSet ds = (FC_ACCT_2026_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2053_SDataSet fc_acct_2053_s(FC_ACCT_2053_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2053_SDataSet ds = (FC_ACCT_2053_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2054_SDataSet fc_acct_2054_s(FC_ACCT_2054_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2054_SDataSet ds = (FC_ACCT_2054_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2055_SDataSet fc_acct_2055_s(FC_ACCT_2055_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2055_SDataSet ds = (FC_ACCT_2055_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2063_SDataSet fc_acct_2063_s(FC_ACCT_2063_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2063_SDataSet ds = (FC_ACCT_2063_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2072_SDataSet fc_acct_2072_s(FC_ACCT_2072_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2072_SDataSet ds = (FC_ACCT_2072_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2915_SDataSet fc_acct_2915_s(FC_ACCT_2915_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2915_SDataSet ds = (FC_ACCT_2915_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_2015_LDataSet fc_acct_2015_l(FC_ACCT_2015_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2015_LDataSet ds = (FC_ACCT_2015_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2128_SDataSet fc_acct_2128_s(FC_ACCT_2128_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2128_SDataSet ds = (FC_ACCT_2128_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2016_SDataSet fc_acct_2016_s(FC_ACCT_2016_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2016_SDataSet ds = (FC_ACCT_2016_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2017_SDataSet fc_acct_2017_s(FC_ACCT_2017_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2017_SDataSet ds = (FC_ACCT_2017_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2600_MDataSet fc_acct_2600_m(FC_ACCT_2600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2600_MDataSet ds = (FC_ACCT_2600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2601_LDataSet fc_acct_2601_l(FC_ACCT_2601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2601_LDataSet ds = (FC_ACCT_2601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2603_LDataSet fc_acct_2603_l(FC_ACCT_2603_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2603_LDataSet ds = (FC_ACCT_2603_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2610_MDataSet fc_acct_2610_m(FC_ACCT_2610_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2610_MDataSet ds = (FC_ACCT_2610_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2611_LDataSet fc_acct_2611_l(FC_ACCT_2611_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2611_LDataSet ds = (FC_ACCT_2611_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2612_UDataSet fc_acct_2612_u(FC_ACCT_2612_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2612_UDataSet ds = (FC_ACCT_2612_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2614_LDataSet fc_acct_2614_l(FC_ACCT_2614_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2614_LDataSet ds = (FC_ACCT_2614_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2620_MDataSet fc_acct_2620_m(FC_ACCT_2620_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2620_MDataSet ds = (FC_ACCT_2620_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2621_LDataSet fc_acct_2621_l(FC_ACCT_2621_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2621_LDataSet ds = (FC_ACCT_2621_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2622_UDataSet fc_acct_2622_u(FC_ACCT_2622_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2622_UDataSet ds = (FC_ACCT_2622_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2630_MDataSet fc_acct_2630_m(FC_ACCT_2630_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2630_MDataSet ds = (FC_ACCT_2630_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2631_LDataSet fc_acct_2631_l(FC_ACCT_2631_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2631_LDataSet ds = (FC_ACCT_2631_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2632_UDataSet fc_acct_2632_u(FC_ACCT_2632_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2632_UDataSet ds = (FC_ACCT_2632_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2633_UDataSet fc_acct_2633_u(FC_ACCT_2633_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2633_UDataSet ds = (FC_ACCT_2633_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2640_MDataSet fc_acct_2640_m(FC_ACCT_2640_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2640_MDataSet ds = (FC_ACCT_2640_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2641_LDataSet fc_acct_2641_l(FC_ACCT_2641_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2641_LDataSet ds = (FC_ACCT_2641_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2642_UDataSet fc_acct_2642_u(FC_ACCT_2642_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2642_UDataSet ds = (FC_ACCT_2642_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2651_LDataSet fc_acct_2651_l(FC_ACCT_2651_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2651_LDataSet ds = (FC_ACCT_2651_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2652_ADataSet fc_acct_2652_a(FC_ACCT_2652_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2652_ADataSet ds = (FC_ACCT_2652_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_2700_LDataSet fc_acct_2700_l(FC_ACCT_2700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_2700_LDataSet ds = (FC_ACCT_2700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
