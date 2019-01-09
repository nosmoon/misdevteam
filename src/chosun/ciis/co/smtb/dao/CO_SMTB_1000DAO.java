package chosun.ciis.co.smtb.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;

/**
 *
 */
public class CO_SMTB_1000DAO {

	public CO_SMTB_1020_UDataSet co_smtb_1020_u(CO_SMTB_1020_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISCOM");
		CO_SMTB_1020_UDataSet ds = (CO_SMTB_1020_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) 
		{
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}