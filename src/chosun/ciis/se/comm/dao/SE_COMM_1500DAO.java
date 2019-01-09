/***************************************************************************************************
 * ���ϸ� : SE_COMM_1500DAO.java
* ��� : ������˾�
 * �ۼ����� : 2009-04-08
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
