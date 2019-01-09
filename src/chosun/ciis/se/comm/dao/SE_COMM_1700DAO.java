/***************************************************************************************************
 * ���ϸ� : SE_COMM_1700DAO.java
* ��� : ��꼭���೻�� �˾�
 * �ۼ����� : 2009-07-22
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
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
