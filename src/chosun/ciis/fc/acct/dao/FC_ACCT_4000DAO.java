package chosun.ciis.fc.acct.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_4000DAO {
	public FC_ACCT_9999_LDataSet getDummyList(FC_ACCT_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_9999_LDataSet ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_ACCT_4000_MDataSet fc_acct_4000_m(FC_ACCT_4000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4000_MDataSet ds = (FC_ACCT_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_4001_LDataSet fc_acct_4001_l(FC_ACCT_4001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4001_LDataSet ds = (FC_ACCT_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4002_LDataSet fc_acct_4002_l(FC_ACCT_4002_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4002_LDataSet ds = (FC_ACCT_4002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4004_DDataSet fc_acct_4004_d(FC_ACCT_4004_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4004_DDataSet ds = (FC_ACCT_4004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4005_IDataSet fc_acct_4005_i(FC_ACCT_4005_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4005_IDataSet ds = (FC_ACCT_4005_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4006_LDataSet fc_acct_4006_l(FC_ACCT_4006_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4006_LDataSet ds = (FC_ACCT_4006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_4010_LDataSet fc_acct_4010_l(FC_ACCT_4010_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4010_LDataSet ds = (FC_ACCT_4010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_4011_IDataSet fc_acct_4011_i(FC_ACCT_4011_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4011_IDataSet ds = (FC_ACCT_4011_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4012_DDataSet fc_acct_4012_d(FC_ACCT_4012_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4012_DDataSet ds = (FC_ACCT_4012_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_4020_MDataSet fc_acct_4020_m(FC_ACCT_4020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4020_MDataSet ds = (FC_ACCT_4020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4021_LDataSet fc_acct_4021_l(FC_ACCT_4021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4021_LDataSet ds = (FC_ACCT_4021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4022_DDataSet fc_acct_4022_d(FC_ACCT_4022_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4022_DDataSet ds = (FC_ACCT_4022_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4023_IDataSet fc_acct_4023_i(FC_ACCT_4023_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4023_IDataSet ds = (FC_ACCT_4023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4027_MDataSet fc_acct_4027_m(FC_ACCT_4027_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4027_MDataSet ds = (FC_ACCT_4027_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4028_IDataSet fc_acct_4028_i(FC_ACCT_4028_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4028_IDataSet ds = (FC_ACCT_4028_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_4029_DDataSet fc_acct_4029_d(FC_ACCT_4029_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4029_DDataSet ds = (FC_ACCT_4029_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
   public FC_ACCT_4030_MDataSet fc_acct_4030_m(FC_ACCT_4030_MDM dm) throws AppException, SQLException {
       DBManager manager = new DBManager("MISFNC");
       FC_ACCT_4030_MDataSet ds = (FC_ACCT_4030_MDataSet)manager.executeCall(dm);

       if(!ds.getErrcode().equals("")) {
           throw new AppException(ds.getErrcode(), ds.getErrmsg());
       }

       return ds;
   }
   public FC_ACCT_4040_MDataSet fc_acct_4040_m(FC_ACCT_4040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4040_MDataSet ds = (FC_ACCT_4040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
  public FC_ACCT_4041_PDataSet fc_acct_4041_p(FC_ACCT_4041_PDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4041_PDataSet ds = (FC_ACCT_4041_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
   public FC_ACCT_4044_PDataSet fc_acct_4044_p(FC_ACCT_4044_PDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_4044_PDataSet ds = (FC_ACCT_4044_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
