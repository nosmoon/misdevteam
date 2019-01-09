/***************************************************************************************************
 * 파일명 : SSShare1100DAO.java
 * 기능 : 정보공유 타사발송부수 처리를 위한 DAO
 * 작성일자 : 2003-11-30
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-타사발송부수 위한 DAO
 */
public class SSShare1100DAO {

	/**
	 * 정보공유 타사발송부수 리스트 조회
	 * @param SS_L_OTHQTYDM 객체
	 * @return SS_L_OTHQTYDataSet 객체
	 */

	public SS_L_OTHQTYDataSet selectOthqtyList(SS_L_OTHQTYDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_OTHQTYDataSet ds = (SS_L_OTHQTYDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

}
