/***************************************************************************************************
 * 파일명 : SE_QTY_2600DAO.java
 * 기능 : 부수관련발행
 * 작성일자 : 2009-06-01
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
public class SE_QTY_2600DAO {
	
	public SE_QTY_2600_MDataSet se_qty_2600_m(SE_QTY_2600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2600_MDataSet ds = (SE_QTY_2600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
