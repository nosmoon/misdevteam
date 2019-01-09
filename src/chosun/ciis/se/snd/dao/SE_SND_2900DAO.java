/***************************************************************************************************
* ���ϸ� : SE_SND_2900DAO.java
* ��� : �߼۰���-Ư�Ǻμ��߼۰���
* �ۼ����� : 2009-03-13
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_2900DAO {
	
	public SE_SND_2900_MDataSet se_snd_2900_m(SE_SND_2900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SND_2900_MDataSet ds = (SE_SND_2900_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SND_2910_LDataSet se_snd_2910_l(SE_SND_2910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SND_2910_LDataSet ds = (SE_SND_2910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SND_2920_UDataSet se_snd_2920_u(SE_SND_2920_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SND_2920_UDataSet ds = (SE_SND_2920_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
