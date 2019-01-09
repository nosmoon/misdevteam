/***************************************************************************************************
 * 파일명 : SE_QTY_1600DAO.java
 * 기능 : 부수관리 - 전월대비유가발송부수조회
 * 작성일자 : 2009-02-20
 * 작성자 : 배창희
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
public class SE_QTY_1600DAO {
	
	public SE_QTY_1600_MDataSet se_qty_1600_m(SE_QTY_1600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1600_MDataSet ds = (SE_QTY_1600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_1610_LDataSet se_qty_1610_l(SE_QTY_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1610_LDataSet ds = (SE_QTY_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
