package chosun.ciis.fc.acct.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_6000DAO {
	public FC_ACCT_9999_LDataSet getDummyList(FC_ACCT_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_9999_LDataSet ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_6000_MDataSet fc_acct_6000_m(FC_ACCT_6000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6000_MDataSet ds = (FC_ACCT_6000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_6001_LDataSet fc_acct_6001_l(FC_ACCT_6001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6001_LDataSet ds = (FC_ACCT_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6002_IDataSet fc_acct_6002_i(FC_ACCT_6002_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6002_IDataSet ds = (FC_ACCT_6002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6003_UDataSet fc_acct_6003_u(FC_ACCT_6003_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6003_UDataSet ds = (FC_ACCT_6003_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6004_DDataSet fc_acct_6004_d(FC_ACCT_6004_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6004_DDataSet ds = (FC_ACCT_6004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
   public FC_ACCT_6010_MDataSet fc_acct_6010_m(FC_ACCT_6010_MDM dm) throws AppException, SQLException {
       DBManager manager = new DBManager("MISFNC");
       FC_ACCT_6010_MDataSet ds = (FC_ACCT_6010_MDataSet)manager.executeCall(dm);

       if(!ds.getErrcode().equals("")) {
           throw new AppException(ds.getErrcode(), ds.getErrmsg());
       }

       return ds;
   }

   public FC_ACCT_6011_LDataSet fc_acct_6011_l(FC_ACCT_6011_LDM dm) throws AppException, SQLException {
       DBManager manager = new DBManager("MISFNC");
       FC_ACCT_6011_LDataSet ds = (FC_ACCT_6011_LDataSet)manager.executeCall(dm);

       if(!ds.getErrcode().equals("")) {
           throw new AppException(ds.getErrcode(), ds.getErrmsg());
       }

       return ds;
   }
   public FC_ACCT_6012_ADataSet fc_acct_6012_a(FC_ACCT_6012_ADM dm) throws AppException, SQLException {
       DBManager manager = new DBManager("MISFNC");
       FC_ACCT_6012_ADataSet ds = (FC_ACCT_6012_ADataSet)manager.executeCall(dm);

       if(!ds.getErrcode().equals("")) {
           throw new AppException(ds.getErrcode(), ds.getErrmsg());
       }

       return ds;
   }

   public FC_ACCT_6013_ADataSet fc_acct_6013_a(FC_ACCT_6013_ADM dm) throws AppException, SQLException {
       DBManager manager = new DBManager("MISFNC");
       FC_ACCT_6013_ADataSet ds = (FC_ACCT_6013_ADataSet)manager.executeCall(dm);

       if(!ds.getErrcode().equals("")) {
           throw new AppException(ds.getErrcode(), ds.getErrmsg());
       }

       return ds;
   }

   public FC_ACCT_6014_UDataSet fc_acct_6014_u(FC_ACCT_6014_UDM dm) throws AppException, SQLException {
       DBManager manager = new DBManager("MISFNC");
       FC_ACCT_6014_UDataSet ds = (FC_ACCT_6014_UDataSet)manager.executeCall(dm);

       if(!ds.getErrcode().equals("")) {
           throw new AppException(ds.getErrcode(), ds.getErrmsg());
       }

       return ds;
   }
	public FC_ACCT_6015_EDataSet fc_acct_6015_e(FC_ACCT_6015_EDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6015_EDataSet ds = (FC_ACCT_6015_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}   
	public FC_ACCT_6020_MDataSet fc_acct_6020_m(FC_ACCT_6020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6020_MDataSet ds = (FC_ACCT_6020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public FC_ACCT_6021_LDataSet fc_acct_6021_l(FC_ACCT_6021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6021_LDataSet ds = (FC_ACCT_6021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6022_LDataSet fc_acct_6022_l(FC_ACCT_6022_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6022_LDataSet ds = (FC_ACCT_6022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6023_EDataSet fc_acct_6023_e(FC_ACCT_6023_EDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6023_EDataSet ds = (FC_ACCT_6023_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6024_EDataSet fc_acct_6024_e(FC_ACCT_6024_EDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6024_EDataSet ds = (FC_ACCT_6024_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}			
	public FC_ACCT_6025_UDataSet fc_acct_6025_u(FC_ACCT_6025_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6025_UDataSet ds = (FC_ACCT_6025_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6026_ADataSet fc_acct_6026_a(FC_ACCT_6026_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6026_ADataSet ds = (FC_ACCT_6026_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6027_UDataSet fc_acct_6027_u(FC_ACCT_6027_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6027_UDataSet ds = (FC_ACCT_6027_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6030_MDataSet fc_acct_6030_m(FC_ACCT_6030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6030_MDataSet ds = (FC_ACCT_6030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6031_IDataSet fc_acct_6031_i(FC_ACCT_6031_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6031_IDataSet ds = (FC_ACCT_6031_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6032_LDataSet fc_acct_6032_l(FC_ACCT_6032_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6032_LDataSet ds = (FC_ACCT_6032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6033_LDataSet fc_acct_6033_l(FC_ACCT_6033_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6033_LDataSet ds = (FC_ACCT_6033_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6034_LDataSet fc_acct_6034_l(FC_ACCT_6034_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6034_LDataSet ds = (FC_ACCT_6034_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6035_SDataSet fc_acct_6035_s(FC_ACCT_6035_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6035_SDataSet ds = (FC_ACCT_6035_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6036_UDataSet fc_acct_6036_U(FC_ACCT_6036_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6036_UDataSet ds = (FC_ACCT_6036_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6037_UDataSet fc_acct_6037_U(FC_ACCT_6037_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6037_UDataSet ds = (FC_ACCT_6037_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6038_UDataSet fc_acct_6038_U(FC_ACCT_6038_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6038_UDataSet ds = (FC_ACCT_6038_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_6040_MDataSet fc_acct_6040_m(FC_ACCT_6040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6040_MDataSet ds = (FC_ACCT_6040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6090_MDataSet fc_acct_6090_m(FC_ACCT_6090_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6090_MDataSet ds = (FC_ACCT_6090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6091_LDataSet fc_acct_6091_l(FC_ACCT_6091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6091_LDataSet ds = (FC_ACCT_6091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6092_LDataSet fc_acct_6092_l(FC_ACCT_6092_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6092_LDataSet ds = (FC_ACCT_6092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6111_ADataSet fc_acct_6111_a(FC_ACCT_6111_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6111_ADataSet ds = (FC_ACCT_6111_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6120_MDataSet fc_acct_6120_m(FC_ACCT_6120_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6120_MDataSet ds = (FC_ACCT_6120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_6121_LDataSet fc_acct_6121_l(FC_ACCT_6121_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6121_LDataSet ds = (FC_ACCT_6121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_6130_MDataSet fc_acct_6130_m(FC_ACCT_6130_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6130_MDataSet ds = (FC_ACCT_6130_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6131_LDataSet fc_acct_6131_l(FC_ACCT_6131_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6131_LDataSet ds = (FC_ACCT_6131_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6132_IDataSet fc_acct_6132_i(FC_ACCT_6132_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6132_IDataSet ds = (FC_ACCT_6132_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6133_UDataSet fc_acct_6133_u(FC_ACCT_6133_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6133_UDataSet ds = (FC_ACCT_6133_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6134_UDataSet fc_acct_6134_u(FC_ACCT_6134_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6134_UDataSet ds = (FC_ACCT_6134_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6136_SDataSet fc_acct_6136_s(FC_ACCT_6136_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6136_SDataSet ds = (FC_ACCT_6136_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6138_SDataSet fc_acct_6138_s(FC_ACCT_6138_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6138_SDataSet ds = (FC_ACCT_6138_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6150_MDataSet fc_acct_6150_m(FC_ACCT_6150_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6150_MDataSet ds = (FC_ACCT_6150_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_6151_LDataSet fc_acct_6151_l(FC_ACCT_6151_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6151_LDataSet ds = (FC_ACCT_6151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6152_LDataSet fc_acct_6152_l(FC_ACCT_6152_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6152_LDataSet ds = (FC_ACCT_6152_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6160_MDataSet fc_acct_6160_m(FC_ACCT_6160_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6160_MDataSet ds = (FC_ACCT_6160_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_6161_LDataSet fc_acct_6161_l(FC_ACCT_6161_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6161_LDataSet ds = (FC_ACCT_6161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_6162_LDataSet fc_acct_6162_l(FC_ACCT_6162_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_6162_LDataSet ds = (FC_ACCT_6162_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
}
