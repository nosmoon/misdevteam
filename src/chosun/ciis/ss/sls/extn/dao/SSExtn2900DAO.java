/***************************************************************************************************
* ���ϸ� : SSExtn2900DAO.java
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * Ȯ����Ȳ-��û��Ȳ �� ���� DAO
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
