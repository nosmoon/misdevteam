/***************************************************************************************************
 * ���ϸ� : PSShare1101DAO.java
 * ��� : �������� ���� ó���� ���� DAO
 * �ۼ����� : 2004-02-20
 * �ۼ��� : ����ǥ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ps.pbs.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * ��������-���� ���� DAO
 */
public class PSShare1101DAO {

	/**
	 * �������� ���� ����Ʈ ��ȸ
	 * @param PS_L_TACOM_SCHEDM ��ü
	 * @return PS_L_TACOM_SCHEDataSet ��ü
	 * @author CRM ���Ǳ���
	 */

	public PS_L_TACOM_SCHEDataSet selectTacomScheList(PS_L_TACOM_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		PS_L_TACOM_SCHEDataSet ds = (PS_L_TACOM_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * �������� ���� ������ ��ȸ
	 * @param PS_S_TACOM_SCHEDM
	 * @return PS_S_TACOM_SCHEDataSet
	 * @author CRM ���Ǳ���
	 */

	public PS_S_TACOM_SCHEDataSet selectTacomScheDetail(PS_S_TACOM_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		PS_S_TACOM_SCHEDataSet ds = (PS_S_TACOM_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * �������� ���� ������ ���, ����, ����
	 * @param PS_A_TACOM_SCHEDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 */

	public boolean accessTacomSche(PS_A_TACOM_SCHEDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		PS_A_TACOM_SCHEDataSet ds = (PS_A_TACOM_SCHEDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}