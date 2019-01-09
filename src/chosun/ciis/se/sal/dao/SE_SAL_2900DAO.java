/***************************************************************************************************
* ���ϸ� : SE_SAL_2600DAO.java
* ��� : �Ǹ� - ������� - �ܰǰ�꼭���
* �ۼ����� : 2009-07-20
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_2900DAO {
	
	public SE_SAL_2910_LDataSet se_sal_2910_l(SE_SAL_2910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2910_LDataSet ds = (SE_SAL_2910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
}
