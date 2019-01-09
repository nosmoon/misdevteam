/***************************************************************************************************
 * 파일명 : TnLnk5000DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.tn.lnk.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class TnLnk5000DAO {

	public TN_LNK_5000_MDataSet tn_lnk_5000_m(TN_LNK_5000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5000_MDataSet ds = (TN_LNK_5000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_5010_LDataSet tn_lnk_5010_l(TN_LNK_5010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5010_LDataSet ds = (TN_LNK_5010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_5020_LDataSet tn_lnk_5020_l(TN_LNK_5020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5020_LDataSet ds = (TN_LNK_5020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_5030_LDataSet tn_lnk_5030_l(TN_LNK_5030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5030_LDataSet ds = (TN_LNK_5030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5035_ADataSet tn_lnk_5035_a(TN_LNK_5035_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5035_ADataSet ds = (TN_LNK_5035_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5040_ADataSet tn_lnk_5040_a(TN_LNK_5040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5040_ADataSet ds = (TN_LNK_5040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_5050_ADataSet tn_lnk_5050_a(TN_LNK_5050_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5050_ADataSet ds = (TN_LNK_5050_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5055_ADataSet tn_lnk_5055_a(TN_LNK_5055_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5055_ADataSet ds = (TN_LNK_5055_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5060_ADataSet tn_lnk_5060_a(TN_LNK_5060_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5060_ADataSet ds = (TN_LNK_5060_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_5065_ADataSet tn_lnk_5065_a(TN_LNK_5065_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5065_ADataSet ds = (TN_LNK_5065_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5070_ADataSet tn_lnk_5070_a(TN_LNK_5070_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5070_ADataSet ds = (TN_LNK_5070_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5075_ADataSet tn_lnk_5075_a(TN_LNK_5075_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5075_ADataSet ds = (TN_LNK_5075_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5080_ADataSet tn_lnk_5080_a(TN_LNK_5080_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5080_ADataSet ds = (TN_LNK_5080_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_5085_ADataSet tn_lnk_5085_a(TN_LNK_5085_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5085_ADataSet ds = (TN_LNK_5085_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_5090_ADataSet tn_lnk_5090_a(TN_LNK_5090_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_5090_ADataSet ds = (TN_LNK_5090_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
