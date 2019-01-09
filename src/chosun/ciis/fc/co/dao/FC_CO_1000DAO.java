package chosun.ciis.fc.co.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

public class FC_CO_1000DAO {
	public FC_CO_9999_LDataSet getDummyList(FC_CO_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_9999_LDataSet ds = (FC_CO_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_CO_1001_LDataSet fc_co_1001_l(FC_CO_1001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1001_LDataSet ds = (FC_CO_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_1002_LDataSet fc_co_1002_l(FC_CO_1002_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1002_LDataSet ds = (FC_CO_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_1003_LDataSet fc_co_1003_l(FC_CO_1003_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1003_LDataSet ds = (FC_CO_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_1010_MDataSet fc_co_1010_m(FC_CO_1010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1010_MDataSet ds = (FC_CO_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1011_LDataSet fc_co_1011_l(FC_CO_1011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1011_LDataSet ds = (FC_CO_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public FC_CO_1020_MDataSet fc_co_1020_m(FC_CO_1020_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1020_MDataSet ds = (FC_CO_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1021_LDataSet fc_co_1021_l(FC_CO_1021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1021_LDataSet ds = (FC_CO_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1030_MDataSet fc_co_1030_m(FC_CO_1030_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1030_MDataSet ds = (FC_CO_1030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1031_LDataSet fc_co_1031_l(FC_CO_1031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1031_LDataSet ds = (FC_CO_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1040_MDataSet fc_co_1040_m(FC_CO_1040_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1040_MDataSet ds = (FC_CO_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1041_LDataSet fc_co_1041_l(FC_CO_1041_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1041_LDataSet ds = (FC_CO_1041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1050_MDataSet fc_co_1050_m(FC_CO_1050_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1050_MDataSet ds = (FC_CO_1050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1051_LDataSet fc_co_1051_l(FC_CO_1051_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1051_LDataSet ds = (FC_CO_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1060_MDataSet fc_co_1060_m(FC_CO_1060_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1060_MDataSet ds = (FC_CO_1060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1061_LDataSet fc_co_1061_l(FC_CO_1061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1061_LDataSet ds = (FC_CO_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_CO_1101_LDataSet fc_co_1101_l(FC_CO_1101_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_1101_LDataSet ds = (FC_CO_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
