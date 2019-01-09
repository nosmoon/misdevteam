/***************************************************************************************************
 * 파일명 : SE_COMM_1500DAO.java
* 기능 : 담당평가팝업
 * 작성일자 : 2009-04-08
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.comm.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */
public class SE_COMM_1500DAO {
	
	public SE_COMM_1510_LDataSet se_comm_1510_l(SE_COMM_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_COMM_1510_LDataSet ds = (SE_COMM_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
