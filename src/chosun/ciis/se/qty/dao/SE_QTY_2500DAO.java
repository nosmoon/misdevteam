/***************************************************************************************************
* 파일명 : SE_QTY_2500DAO.java
* 기능 : 부수관리 - 발송부수 - 노선별발송부수현황
* 작성일자 : 2009-03-06
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
public class SE_QTY_2500DAO {
	
	public SE_QTY_2500_MDataSet se_qty_2500_m(SE_QTY_2500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2500_MDataSet ds = (SE_QTY_2500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2510_LDataSet se_qty_2510_l(SE_QTY_2510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2510_LDataSet ds = (SE_QTY_2510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2520_LDataSet se_qty_2520_l(SE_QTY_2520_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2520_LDataSet ds = (SE_QTY_2520_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
