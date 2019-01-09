package chosun.ciis.fc.co.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

public class FC_CO_4000DAO {
	public FC_CO_9999_LDataSet getDummyList(FC_CO_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		FC_CO_9999_LDataSet ds = (FC_CO_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
}
