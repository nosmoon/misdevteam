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
public class TnLnk4000DAO {
	

	public TN_LNK_4010_LDataSet tn_lnk_4010_l(TN_LNK_4010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_4010_LDataSet ds = (TN_LNK_4010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public TN_LNK_4020_ADataSet tn_lnk_4020_a(TN_LNK_4020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_4020_ADataSet ds = (TN_LNK_4020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_LNK_4110_LDataSet tn_lnk_4110_l(TN_LNK_4110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_4110_LDataSet ds = (TN_LNK_4110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public TN_LNK_4120_LDataSet tn_lnk_4120_l(TN_LNK_4120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_LNK_4120_LDataSet ds = (TN_LNK_4120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
}
