/***************************************************************************************************
* 파일명 : MT_SUBMATRSTOK_1000DAO
* 기능 :  분공장 자재일보
* 작성일자 : 2013-04-29
* 작성자 : 김성미
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.submatrstok.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.submatrstok.dm.*;
import chosun.ciis.mt.submatrstok.ds.*;

public class MT_SUBMATRSTOK_1000DAO {
	//
	public MT_SUBMATRSTOK_1000_MDataSet mt_submatrstok_1000_m(MT_SUBMATRSTOK_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_SUBMATRSTOK_1000_MDataSet ds = (MT_SUBMATRSTOK_1000_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}


}