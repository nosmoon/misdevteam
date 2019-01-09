/***************************************************************************************************
* 파일명 : SE_QTY_3100DAO.java
* 기능 : 부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-11
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.qty.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */
public class SE_QTY_3100DAO {
	
	public SE_QTY_3100_MDataSet se_qty_3100_m(SE_QTY_3100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_3100_MDataSet ds = (SE_QTY_3100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_3110_LDataSet se_qty_3110_l(SE_QTY_3110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_3110_LDataSet ds = (SE_QTY_3110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_3120_LDataSet se_qty_3120_l(SE_QTY_3120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_3120_LDataSet ds = (SE_QTY_3120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
