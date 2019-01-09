/***************************************************************************************************
 * ���ϸ� : SSBrmgr11800DAO.java_����Ͽ�
 * ��� : �����濵-����Ʈ���Է��� ���� DAO
 * �ۼ����� : 2017-01-13
 * �ۼ��� : �弱��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


/**
 * �����濵-����Ʈ���Է��� ���� DAO
 */
public class SSBrmgr11800DAO {

	/**
	 * ����Ʈ �ּ��ڵ� ����Ʈ
	 *
	 * @param dm
	 *            SL_MO_L_COMM_APT_THRWDM
	 * @return SL_MO_L_COMM_APT_THRWDataSet
	 * @throws AppException
	 */
	public SL_MO_L_COMM_APT_THRWDataSet mo_selectThrwList(SL_MO_L_COMM_APT_THRWDM dm) //����Ͽ�
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_MO_L_COMM_APT_THRWDataSet ds = (SL_MO_L_COMM_APT_THRWDataSet) manager.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		 return ds;
	}

	/**
	 * ����Ʈ �ּ��ڵ忡 ���� ������Ʈ
	 *
	 * @param SL_L_DTLSADDRDM
	 * @return SL_L_DTLSADDRDataSet
	 * @author
	 * @since
	 */
	public SL_L_DTLSADDRDataSet mo_selectDtladdrList(SL_L_DTLSADDRDM dm) //����Ͽ�
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_DTLSADDRDataSet ds = (SL_L_DTLSADDRDataSet) manager
				.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		return ds;
	}

	/**
	 * ����Ʈ ���ī��
	 *
	 * @param dm
	 *            SS_L_APTDLV_LISTDM
	 * @return SS_L_APTDLV_LISTDataSet
	 * @throws AppException
	 */
	public SS_L_APTDLV_LISTDataSet mo_selectAptdlvList(SS_L_APTDLV_LISTDM dm) //����Ͽ�_ciis��
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_APTDLV_LISTDataSet ds = (SS_L_APTDLV_LISTDataSet) manager
				.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
			return ds;
	}


	/**
	 * ����Ʈ���Է���ȸ(����Ʈ���¸���Ʈ or ���Է���ϸ���Ʈ)_����ϸ�����_ciis��
	 *
	 * @param dm
	 *            SS_MO_L_APTINPIVSTDM
	 * @return SS_MO_L_APTINPIVSTDataSet
	 * @throws AppException
	 */
	public SS_MO_L_APTINPIVSTDataSet mo_selectAptrchList(SS_MO_L_APTINPIVSTDM dm) //����Ͽ�
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_MO_L_APTINPIVSTDataSet ds = (SS_MO_L_APTINPIVSTDataSet) manager
				.executeCall(dm);
		/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		 */
		return ds;
	}

	/**
	 *  ����Ʈ�� ����, ���Է����翡 �ʿ��� ��ü����Ʈ_����ϸ�����
	 *
	 * @param dm
	 *            SL_MO_L_INPIVSTINFODM
	 * @return SL_MO_L_INPIVSTINFODataSet
	 * @throws AppException
	 */
	public SL_MO_L_INPIVSTINFODataSet mo_selectAptinfoList(SL_MO_L_INPIVSTINFODM dm) //����Ͽ�
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_MO_L_INPIVSTINFODataSet ds = (SL_MO_L_INPIVSTINFODataSet) manager
				.executeCall(dm);
		/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
		 */
		return ds;
	}

	/**
	 * ����Ʈ������Ȳ(��Ȳ ���,����)
	 *
	 * @param dm
	 *            SL_MO_A_COMM_APT_THRWDM
	 * @return SL_MO_A_COMM_APT_THRWDataSet
	 * @throws AppException
	 */
	public SL_MO_A_COMM_APT_THRWDataSet mo_accessThrw(SL_MO_A_COMM_APT_THRWDM dm) //����Ͽ�
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_MO_A_COMM_APT_THRWDataSet ds = (SL_MO_A_COMM_APT_THRWDataSet) manager
				.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
*/
			return ds;
	}

	/**
	 * ���Ͱ���-���Է�����-��Ȳ�˻�_����Ͽ�
	 *
	 * @param dm
	 *            SS_MO_L_COMM_APT_RESULTDM
	 * @return SS_MO_L_COMM_APT_RESULTDataSet
	 * @throws AppException
	 */
	public SS_MO_L_COMM_APT_RESULTDataSet mo_selectThrwResult(SS_MO_L_COMM_APT_RESULTDM dm) //����Ͽ�
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_MO_L_COMM_APT_RESULTDataSet ds = (SS_MO_L_COMM_APT_RESULTDataSet) manager
				.executeCall(dm);
		/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		 */
		return ds;
	}


}
