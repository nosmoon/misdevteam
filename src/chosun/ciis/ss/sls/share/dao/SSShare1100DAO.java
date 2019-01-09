/***************************************************************************************************
 * ���ϸ� : SSShare1100DAO.java
 * ��� : �������� Ÿ��߼ۺμ� ó���� ���� DAO
 * �ۼ����� : 2003-11-30
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * ��������-Ÿ��߼ۺμ� ���� DAO
 */
public class SSShare1100DAO {

	/**
	 * �������� Ÿ��߼ۺμ� ����Ʈ ��ȸ
	 * @param SS_L_OTHQTYDM ��ü
	 * @return SS_L_OTHQTYDataSet ��ü
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
