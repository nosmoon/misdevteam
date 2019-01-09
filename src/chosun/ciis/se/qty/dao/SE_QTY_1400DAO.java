/***************************************************************************************************
 * 파일명 : SE_QTY_1400DAO.java
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

package chosun.ciis.se.qty.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */
public class SE_QTY_1400DAO {
	
	public SE_QTY_1400_MDataSet se_qty_1400_m(SE_QTY_1400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1400_MDataSet ds = (SE_QTY_1400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_1410_LDataSet se_qty_1410_l(SE_QTY_1410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1410_LDataSet ds = (SE_QTY_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
