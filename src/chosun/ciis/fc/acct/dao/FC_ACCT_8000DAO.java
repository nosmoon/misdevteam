package chosun.ciis.fc.acct.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_8000DAO {
	public FC_ACCT_9999_LDataSet getDummyList(FC_ACCT_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_9999_LDataSet ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public FC_ACCT_9011_LDataSet fc_acct_9011_l(FC_ACCT_9011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_9011_LDataSet ds = (FC_ACCT_9011_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	
	public FC_ACCT_9998_LDataSet fc_acct_9998_l(FC_ACCT_9998_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_9998_LDataSet ds = (FC_ACCT_9998_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8000_MDataSet fc_acct_8000_m(FC_ACCT_8000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8000_MDataSet ds = (FC_ACCT_8000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8001_LDataSet fc_acct_8001_l(FC_ACCT_8001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8001_LDataSet ds = (FC_ACCT_8001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8003_IDataSet fc_acct_8003_i(FC_ACCT_8003_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8003_IDataSet ds = (FC_ACCT_8003_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8004_IDataSet fc_acct_8004_i(FC_ACCT_8004_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8004_IDataSet ds = (FC_ACCT_8004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8005_IDataSet fc_acct_8005_i(FC_ACCT_8005_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8005_IDataSet ds = (FC_ACCT_8005_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8010_MDataSet fc_acct_8010_m(FC_ACCT_8010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8010_MDataSet ds = (FC_ACCT_8010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8021_SDataSet fc_acct_8021_s(FC_ACCT_8021_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8021_SDataSet ds = (FC_ACCT_8021_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8030_MDataSet fc_acct_8030_m(FC_ACCT_8030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8030_MDataSet ds = (FC_ACCT_8030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8090_MDataSet fc_acct_8090_m(FC_ACCT_8090_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8090_MDataSet ds = (FC_ACCT_8090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8061_LDataSet fc_acct_8061_l(FC_ACCT_8061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8061_LDataSet ds = (FC_ACCT_8061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8062_LDataSet fc_acct_8062_l(FC_ACCT_8062_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8062_LDataSet ds = (FC_ACCT_8062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8064_LDataSet fc_acct_8064_l(FC_ACCT_8064_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8064_LDataSet ds = (FC_ACCT_8064_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8065_LDataSet fc_acct_8065_l(FC_ACCT_8065_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8065_LDataSet ds = (FC_ACCT_8065_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8066_LDataSet fc_acct_8066_l(FC_ACCT_8066_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8066_LDataSet ds = (FC_ACCT_8066_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8070_MDataSet fc_acct_8070_l(FC_ACCT_8070_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");                                      
		FC_ACCT_8070_MDataSet ds = (FC_ACCT_8070_MDataSet)manager.executeCall(dm);        
                                                                                          
		if(!ds.getErrcode().equals("")) {                                                 
			throw new AppException(ds.getErrcode(), ds.getErrmsg());                      
		}                                                                                 
                                                                                          
		return ds;                                                                        
	}
	public FC_ACCT_8071_LDataSet fc_acct_8071_l(FC_ACCT_8071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");                                      
		FC_ACCT_8071_LDataSet ds = (FC_ACCT_8071_LDataSet)manager.executeCall(dm);        
                                                                                          
		if(!ds.getErrcode().equals("")) {                                                 
			throw new AppException(ds.getErrcode(), ds.getErrmsg());                      
		}                                                                                 
                                                                                          
		return ds;                                                                        
	}
	public FC_ACCT_8072_LDataSet fc_acct_8072_l(FC_ACCT_8072_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8072_LDataSet ds = (FC_ACCT_8072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8073_LDataSet fc_acct_8073_l(FC_ACCT_8073_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8073_LDataSet ds = (FC_ACCT_8073_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8074_LDataSet fc_acct_8074_l(FC_ACCT_8074_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8074_LDataSet ds = (FC_ACCT_8074_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8080_MDataSet fc_acct_8080_l(FC_ACCT_8080_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");                                      
		FC_ACCT_8080_MDataSet ds = (FC_ACCT_8080_MDataSet)manager.executeCall(dm);        
                                                                                          
		if(!ds.getErrcode().equals("")) {                                                 
			throw new AppException(ds.getErrcode(), ds.getErrmsg());                      
		}                                                                                 
                                                                                          
		return ds;                                                                        
	}
	public FC_ACCT_8081_LDataSet fc_acct_8081_l(FC_ACCT_8081_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8081_LDataSet ds = (FC_ACCT_8081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8082_LDataSet fc_acct_8082_l(FC_ACCT_8082_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8082_LDataSet ds = (FC_ACCT_8082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8083_LDataSet fc_acct_8083_l(FC_ACCT_8083_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8083_LDataSet ds = (FC_ACCT_8083_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8084_LDataSet fc_acct_8084_l(FC_ACCT_8084_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8084_LDataSet ds = (FC_ACCT_8084_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8091_LDataSet fc_acct_8091_l(FC_ACCT_8091_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8091_LDataSet ds = (FC_ACCT_8091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8110_MDataSet fc_acct_8110_m(FC_ACCT_8110_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8110_MDataSet ds = (FC_ACCT_8110_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8121_LDataSet fc_acct_8121_l(FC_ACCT_8121_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8121_LDataSet ds = (FC_ACCT_8121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8122_LDataSet fc_acct_8122_l(FC_ACCT_8122_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8122_LDataSet ds = (FC_ACCT_8122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8123_LDataSet fc_acct_8123_l(FC_ACCT_8123_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8123_LDataSet ds = (FC_ACCT_8123_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_ACCT_8124_LDataSet fc_acct_8124_l(FC_ACCT_8124_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8124_LDataSet ds = (FC_ACCT_8124_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8130_MDataSet fc_acct_8130_m(FC_ACCT_8130_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8130_MDataSet ds = (FC_ACCT_8130_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_ACCT_8999_LDataSet fc_acct_8999_l(FC_ACCT_8999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_ACCT_8999_LDataSet ds = (FC_ACCT_8999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}
