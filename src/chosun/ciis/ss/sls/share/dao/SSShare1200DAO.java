/***************************************************************************************************
 * ���ϸ� : SSShare1200DAO.java
 * ��� : �������� �ǽð��������� ó���� ���� DAO
 * �ۼ����� : 2003-12-18
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
 * ��������-�ǽð��������� ���� DAO
 */
public class SSShare1200DAO {

	/**
	* �������� �ǽð� �������� �ʱ�ȭ��
	* @param SS_L_ANNCBO_INITDM ��ü
	* @return SS_L_ANNCBO_INITDataSet ��ü
	* @throws AppException
	*/

	public SS_L_ANNCBO_INITDataSet selectInitList(SS_L_ANNCBO_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_ANNCBO_INITDataSet ds = (SS_L_ANNCBO_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
	* �������� �ǽð� �������� ����Ʈ ��ȸ
	* @param SS_L_ANNCBODM ��ü
	* @return SS_L_ANNCBODataSet ��ü
	* @throws AppException
	*/

	public SS_L_ANNCBODataSet selectSrchList(SS_L_ANNCBODM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_ANNCBODataSet ds = (SS_L_ANNCBODataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
	 * �������� �ǽð� �������� ���
	 * @param SS_I_ANNCBODM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertAnncbo(SS_I_ANNCBODM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_I_ANNCBODataSet ds = (SS_I_ANNCBODataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
	
	/**
	 * �������� �ǽð� �������� ����
	 * @param SS_U_ANNCBODM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2009.04.16       ver : 1.0
	 */

	public boolean updateAnncbo(SS_U_ANNCBODM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_ANNCBODataSet ds = (SS_U_ANNCBODataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
	
	/**
	 * �������� �ǽð� �������� ����
	 * @param SS_D_ANNCBODM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2009.04.16       ver : 1.0
	 */

	public boolean deleteAnncbo(SS_D_ANNCBODM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_ANNCBODataSet ds = (SS_D_ANNCBODataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
	
	/**
	* �������� �ǽð� �������� ����ȸ
	* @param SS_L_ANNCBODM ��ü
	* @return SS_L_ANNCBODataSet ��ü
	* @throws AppException
	*/

	public SS_S_ANNCBODataSet selectSrchDtls(SS_S_ANNCBODM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_ANNCBODataSet ds = (SS_S_ANNCBODataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
	 * �������� �ǽð� �Ǹű����� ���
	 * @param SS_I_ANNCSLSDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertAnncsls(SS_I_ANNCSLSDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_I_ANNCSLSDataSet ds = (SS_I_ANNCSLSDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}  

}
