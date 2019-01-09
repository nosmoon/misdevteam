/***************************************************************************************************
 * 파일명 : SE_COMM_1600DAO.java
* 기능 : 예수전표조회 팝업
 * 작성일자 : 2009-04-29
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
public class SE_COMM_1600DAO {
	
	public SE_COMM_1610_LDataSet se_comm_1610_l(SE_COMM_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_COMM_1610_LDataSet ds = (SE_COMM_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
