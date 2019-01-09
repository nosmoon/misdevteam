/**************************************************************************************************
* ���ϸ�    : 	SLCommon11000DAO.java_����Ͽ�
* ���      : �����ȣ �˻��� ���� DAO_agency�� ����.
* �ۼ�����  : 2017-02-17
* �ۼ���    : �弱��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * �Ǹ����� ���븦 ���� Data Access Object
 */
public class SLCommon11000DAO{
	/**
	 * ����-�����ȣ�˻�_�������
	 *
	 * @param dm
	 *            CO_L_NEWGUGUNDM
	 * @return CO_L_NEWGUGUNDataSet
	 * @throws AppException
	 */
	public CO_L_NEWGUGUNDataSet mo_selectNewGugunList(CO_L_NEWGUGUNDM dm) throws AppException { //����Ͽ�
		DBManager manager = new DBManager("Oracle");
		CO_L_NEWGUGUNDataSet ds = (CO_L_NEWGUGUNDataSet) manager.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		return ds;
	}


	/**
	 * ����-�����ȣ�˻�
	 *
	 * @param dm
	 *            CO_MO_L_NEW_ADDRDM
	 * @return CO_MO_L_NEW_ADDRDataSet
	 * @throws AppException
	 */
	public CO_MO_L_NEW_ADDRDataSet mo_selectNewAddrList(CO_MO_L_NEW_ADDRDM dm) throws AppException { //����Ͽ� 2017-01-10
		DBManager manager = new DBManager("Oracle");
		CO_MO_L_NEW_ADDRDataSet ds = (CO_MO_L_NEW_ADDRDataSet) manager.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		return ds;
	}
}
