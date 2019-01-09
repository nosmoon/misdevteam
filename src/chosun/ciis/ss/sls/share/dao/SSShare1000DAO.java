/***************************************************************************************************
 * ���ϸ� : SSShare1000DAO.java
 * ��� : �������� ���� ó���� ���� DAO
 * �ۼ����� : 2003-10-30
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
 * ��������-���� ���� DAO
 */
public class SSShare1000DAO {

	/**
	 * �������� ���� �ʱ�ȭ
	 * @param CO_L_SCHE_INITDM ��ü
	 * @return CO_L_SCHE_INITDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */
	public CO_L_SCHE_INITDataSet selectInitList(CO_L_SCHE_INITDM dm) throws AppException{
		 DBManager manager = new DBManager("Oracle");
		 CO_L_SCHE_INITDataSet ds = (CO_L_SCHE_INITDataSet)manager.executeCall(dm);
		 if(!"".equals(ds.errcode)){
				throw new AppException(ds.errcode, ds.errmsg);
		 }
		 return ds;
	}

	/**
	 * �������� ���� ����Ʈ ��ȸ
	 * @param CO_L_SCHEDM ��ü
	 * @return CO_L_SCHEDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public CO_L_SCHEDataSet selectTacomScheList(CO_L_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_SCHEDataSet ds = (CO_L_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * �������� ���� ������ ��ȸ
	 * @param CO_S_SCHEDM
	 * @return �������� ���� ������ DataSet
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public CO_S_SCHEDataSet selectTacomScheDetail(CO_S_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_S_SCHEDataSet ds = (CO_S_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * �������� ���� ������ ���, ����, ����
	 * @param CO_A_SCHEDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean accessTacomSche(CO_A_SCHEDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		CO_A_SCHEDataSet ds = (CO_A_SCHEDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}