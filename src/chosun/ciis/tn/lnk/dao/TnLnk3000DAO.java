/***************************************************************************************************
 * 파일명 : TnLnk3000DAO.java
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
public class TnLnk3000DAO {
	public TN_LNK_3000_MDataSet tn_lnk_3000_m(TN_LNK_3000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3000_MDataSet ds = (TN_LNK_3000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public TN_LNK_3010_LDataSet tn_lnk_3010_l(TN_LNK_3010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3010_LDataSet ds = (TN_LNK_3010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public TN_LNK_3020_LDataSet tn_lnk_3020_l(TN_LNK_3020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3020_LDataSet ds = (TN_LNK_3020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_3030_LDataSet tn_lnk_3030_l(TN_LNK_3030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3030_LDataSet ds = (TN_LNK_3030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_3035_ADataSet tn_lnk_3035_a(TN_LNK_3035_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3035_ADataSet ds = (TN_LNK_3035_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_3040_ADataSet tn_lnk_3040_a(TN_LNK_3040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3040_ADataSet ds = (TN_LNK_3040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_3051_LDataSet tn_lnk_3051_l(TN_LNK_3051_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3051_LDataSet ds = (TN_LNK_3051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_LNK_3052_ADataSet tn_lnk_3052_a(TN_LNK_3052_ADM dm) throws AppException {		
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3052_ADataSet ds = (TN_LNK_3052_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public TN_LNK_3065_ADataSet tn_lnk_3065_a(TN_LNK_3065_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3065_ADataSet ds = (TN_LNK_3065_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public TN_LNK_3066_ADataSet tn_lnk_3066_a(TN_LNK_3066_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3066_ADataSet ds = (TN_LNK_3066_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public TN_LNK_3070_ADataSet tn_lnk_3070_a(TN_LNK_3070_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_3070_ADataSet ds = (TN_LNK_3070_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
