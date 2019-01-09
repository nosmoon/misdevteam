/***************************************************************************************************
 * 파일명 : TnLnk2000DAO.java
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
public class TnLnk2000DAO {
	
	public TN_LNK_2000_MDataSet tn_lnk_2000_m(TN_LNK_2000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2000_MDataSet ds = (TN_LNK_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2010_LDataSet tn_lnk_2010_l(TN_LNK_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2010_LDataSet ds = (TN_LNK_2010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2020_LDataSet tn_lnk_2020_l(TN_LNK_2020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2020_LDataSet ds = (TN_LNK_2020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_2030_LDataSet tn_lnk_2030_l(TN_LNK_2030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2030_LDataSet ds = (TN_LNK_2030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2033_ADataSet tn_lnk_2033_a(TN_LNK_2033_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2033_ADataSet ds = (TN_LNK_2033_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2035_ADataSet tn_lnk_2035_a(TN_LNK_2035_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2035_ADataSet ds = (TN_LNK_2035_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2040_ADataSet tn_lnk_2040_a(TN_LNK_2040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2040_ADataSet ds = (TN_LNK_2040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_2051_LDataSet tn_lnk_2051_l(TN_LNK_2051_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2051_LDataSet ds = (TN_LNK_2051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_2052_ADataSet tn_lnk_2052_a(TN_LNK_2052_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2052_ADataSet ds = (TN_LNK_2052_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2065_ADataSet tn_lnk_2065_a(TN_LNK_2065_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2065_ADataSet ds = (TN_LNK_2065_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2067_ADataSet tn_lnk_2067_a(TN_LNK_2067_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2067_ADataSet ds = (TN_LNK_2067_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2070_ADataSet tn_lnk_2070_a(TN_LNK_2070_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2070_ADataSet ds = (TN_LNK_2070_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_2071_ADataSet tn_lnk_2071_a(TN_LNK_2071_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2071_ADataSet ds = (TN_LNK_2071_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_2100_LDataSet tn_lnk_2100_l(TN_LNK_2100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2100_LDataSet ds = (TN_LNK_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_2110_SDataSet tn_lnk_2110_s(TN_LNK_2110_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_2110_SDataSet ds = (TN_LNK_2110_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
