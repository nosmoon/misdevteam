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
public class TnLnk6000DAO {

	public TN_LNK_6000_MDataSet tn_lnk_6000_m(TN_LNK_6000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6000_MDataSet ds = (TN_LNK_6000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6010_LDataSet tn_lnk_6010_l(TN_LNK_6010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6010_LDataSet ds = (TN_LNK_6010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6020_LDataSet tn_lnk_6020_l(TN_LNK_6020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6020_LDataSet ds = (TN_LNK_6020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6030_LDataSet tn_lnk_6030_l(TN_LNK_6030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6030_LDataSet ds = (TN_LNK_6030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6035_ADataSet tn_lnk_6035_a(TN_LNK_6035_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6035_ADataSet ds = (TN_LNK_6035_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6040_ADataSet tn_lnk_6040_a(TN_LNK_6040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6040_ADataSet ds = (TN_LNK_6040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6050_ADataSet tn_lnk_6050_a(TN_LNK_6050_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6050_ADataSet ds = (TN_LNK_6050_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6052_ADataSet tn_lnk_6052_a(TN_LNK_6052_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6052_ADataSet ds = (TN_LNK_6052_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6055_ADataSet tn_lnk_6055_a(TN_LNK_6055_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6055_ADataSet ds = (TN_LNK_6055_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6057_ADataSet tn_lnk_6057_a(TN_LNK_6057_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6057_ADataSet ds = (TN_LNK_6057_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6060_ADataSet tn_lnk_6060_a(TN_LNK_6060_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6060_ADataSet ds = (TN_LNK_6060_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6065_ADataSet tn_lnk_6065_a(TN_LNK_6065_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6065_ADataSet ds = (TN_LNK_6065_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6070_ADataSet tn_lnk_6070_a(TN_LNK_6070_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6070_ADataSet ds = (TN_LNK_6070_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6072_ADataSet tn_lnk_6072_a(TN_LNK_6072_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6072_ADataSet ds = (TN_LNK_6072_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6075_ADataSet tn_lnk_6075_a(TN_LNK_6075_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6075_ADataSet ds = (TN_LNK_6075_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6077_ADataSet tn_lnk_6077_a(TN_LNK_6077_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6077_ADataSet ds = (TN_LNK_6077_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6080_ADataSet tn_lnk_6080_a(TN_LNK_6080_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6080_ADataSet ds = (TN_LNK_6080_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6081_ADataSet tn_lnk_6081_a(TN_LNK_6081_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6081_ADataSet ds = (TN_LNK_6081_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_6085_ADataSet tn_lnk_6085_a(TN_LNK_6085_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6085_ADataSet ds = (TN_LNK_6085_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6087_ADataSet tn_lnk_6087_a(TN_LNK_6087_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6087_ADataSet ds = (TN_LNK_6087_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6090_ADataSet tn_lnk_6090_a(TN_LNK_6090_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6090_ADataSet ds = (TN_LNK_6090_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6095_ADataSet tn_lnk_6095_a(TN_LNK_6095_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6095_ADataSet ds = (TN_LNK_6095_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6096_ADataSet tn_lnk_6096_a(TN_LNK_6096_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6096_ADataSet ds = (TN_LNK_6096_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_6097_ADataSet tn_lnk_6097_a(TN_LNK_6097_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_6097_ADataSet ds = (TN_LNK_6097_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
