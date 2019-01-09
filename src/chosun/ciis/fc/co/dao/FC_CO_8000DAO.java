package chosun.ciis.fc.co.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

public class FC_CO_8000DAO {
	public FC_CO_9999_LDataSet getDummyList(FC_CO_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_9999_LDataSet ds = (FC_CO_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_CO_9011_LDataSet fc_acct_9011_l(FC_CO_9011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_9011_LDataSet ds = (FC_CO_9011_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_CO_8000_SDataSet fc_co_8000_s(FC_CO_8000_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8000_SDataSet ds = (FC_CO_8000_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8001_SDataSet fc_co_8001_s(FC_CO_8001_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8001_SDataSet ds = (FC_CO_8001_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8002_SDataSet fc_co_8002_s(FC_CO_8002_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8002_SDataSet ds = (FC_CO_8002_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_8003_SDataSet fc_co_8003_s(FC_CO_8003_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8003_SDataSet ds = (FC_CO_8003_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8010_MDataSet fc_co_8010_m(FC_CO_8010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8010_MDataSet ds = (FC_CO_8010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8011_LDataSet fc_co_8011_l(FC_CO_8011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8011_LDataSet ds = (FC_CO_8011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8020_SDataSet fc_co_8020_s(FC_CO_8020_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8020_SDataSet ds = (FC_CO_8020_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_8030_SDataSet fc_co_8030_s(FC_CO_8030_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8030_SDataSet ds = (FC_CO_8030_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_8040_SDataSet fc_co_8040_s(FC_CO_8040_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8040_SDataSet ds = (FC_CO_8040_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8050_ADataSet fc_co_8050_a(FC_CO_8050_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8050_ADataSet ds = (FC_CO_8050_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_8060_SDataSet fc_co_8060_s(FC_CO_8060_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8060_SDataSet ds = (FC_CO_8060_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8070_SDataSet fc_co_8070_s(FC_CO_8070_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8070_SDataSet ds = (FC_CO_8070_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8080_SDataSet fc_co_8080_s(FC_CO_8080_SDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8080_SDataSet ds = (FC_CO_8080_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_8120_LDataSet fc_co_8120_l(FC_CO_8120_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_8120_LDataSet ds = (FC_CO_8120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
