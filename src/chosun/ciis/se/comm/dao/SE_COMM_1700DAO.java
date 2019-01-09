/***************************************************************************************************
 * 파일명 : SE_COMM_1700DAO.java
* 기능 : 계산서발행내역 팝업
 * 작성일자 : 2009-07-22
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
public class SE_COMM_1700DAO {
	
	public SE_COMM_1710_LDataSet se_comm_1710_l(SE_COMM_1710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_COMM_1710_LDataSet ds = (SE_COMM_1710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
