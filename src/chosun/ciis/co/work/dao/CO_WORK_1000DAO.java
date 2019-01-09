/***************************************************************************************************
 * ���ϸ� : CO_WORK_1000DAO.java
* ��� : �����۾�
 * �ۼ����� : 2009-06-04
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.co.work.dao;

import java.sql.SQLException;

import chosun.ciis.co.work.dm.*;
import chosun.ciis.co.work.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class CO_WORK_1000DAO {
	
	public CO_WORK_1000_MDataSet co_work_1000_m(CO_WORK_1000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISSEL");
		CO_WORK_1000_MDataSet ds = (CO_WORK_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
	public CO_WORK_1010_LDataSet co_work_1010_l(CO_WORK_1010_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISSEL");
		CO_WORK_1010_LDataSet ds = (CO_WORK_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
