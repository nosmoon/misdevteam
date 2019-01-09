/***************************************************************************************************
 * ���ϸ� : SE_TRG_2000DAO.java
 * ��� : ����򰡰�� ��ȸ
 * �ۼ����� : 2009-04-06
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.trg.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */
public class SE_TRG_2000DAO {
	
	public SE_TRG_2010_LDataSet se_trg_2010_l(SE_TRG_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_2010_LDataSet ds = (SE_TRG_2010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_TRG_2020_UDataSet se_trg_2020_u(SE_TRG_2020_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_2020_UDataSet ds = (SE_TRG_2020_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
