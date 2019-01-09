/***************************************************************************************************
* ���ϸ� : MT_PAPORD_2000DAO
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-07
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.mt.papord.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

public class MT_PAPORD_2000DAO {
	/**
	 * �����纰 �⺻���ֺ��� ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_2001_LDataSet mt_papord_2001_l(MT_PAPORD_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_2001_LDataSet ds = (MT_PAPORD_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �����纰 �⺻���ֺ��� ����, ����, ����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_2002_ADataSet mt_papord_2002_a(MT_PAPORD_2002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_2002_ADataSet ds = (MT_PAPORD_2002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}