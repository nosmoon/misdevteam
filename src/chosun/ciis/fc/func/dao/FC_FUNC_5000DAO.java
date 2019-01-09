package chosun.ciis.fc.func.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

public class FC_FUNC_5000DAO {
	public FC_FUNC_9999_LDataSet getDummyList(FC_FUNC_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_9999_LDataSet ds = (FC_FUNC_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public FC_FUNC_5000_MDataSet fc_func_5000_m(FC_FUNC_5000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5000_MDataSet ds = (FC_FUNC_5000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_5001_LDataSet fc_func_5001_l(FC_FUNC_5001_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5001_LDataSet ds = (FC_FUNC_5001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_5002_IDataSet fc_func_5002_i(FC_FUNC_5002_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5002_IDataSet ds = (FC_FUNC_5002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_5010_MDataSet fc_func_5010_m(FC_FUNC_5010_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5010_MDataSet ds = (FC_FUNC_5010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_5011_LDataSet fc_func_5011_l(FC_FUNC_5011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5011_LDataSet ds = (FC_FUNC_5011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_5012_IDataSet fc_func_5012_i(FC_FUNC_5012_IDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5012_IDataSet ds = (FC_FUNC_5012_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_5013_DDataSet fc_func_5013_d(FC_FUNC_5013_DDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5013_DDataSet ds = (FC_FUNC_5013_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public FC_FUNC_5021_LDataSet fc_func_5021_l(FC_FUNC_5021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_FUNC_5021_LDataSet ds = (FC_FUNC_5021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
