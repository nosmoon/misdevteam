/***************************************************************************************************
* 파일명 : SSExtn2900DAO.java
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

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * 확장현황-신청현황 을 위한 DAO
 */
public class SSExtn2900DAO {

	public SS_L_KYOBO_EVENTDataSet selectKyoboEventList(SS_L_KYOBO_EVENTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_KYOBO_EVENTDataSet ds = (SS_L_KYOBO_EVENTDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SS_U_KYOBO_EVENTDataSet updateKyoboEventDeli(SS_U_KYOBO_EVENTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_U_KYOBO_EVENTDataSet ds = (SS_U_KYOBO_EVENTDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
