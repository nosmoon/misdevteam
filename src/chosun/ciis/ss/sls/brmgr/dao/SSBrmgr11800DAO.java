/***************************************************************************************************
 * 파일명 : SSBrmgr11800DAO.java_모바일용
 * 기능 : 지국경영-아파트투입률을 위한 DAO
 * 작성일자 : 2017-01-13
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


/**
 * 지국경영-아파트투입률을 위한 DAO
 */
public class SSBrmgr11800DAO {

	/**
	 * 아파트 주소코드 리스트
	 *
	 * @param dm
	 *            SL_MO_L_COMM_APT_THRWDM
	 * @return SL_MO_L_COMM_APT_THRWDataSet
	 * @throws AppException
	 */
	public SL_MO_L_COMM_APT_THRWDataSet mo_selectThrwList(SL_MO_L_COMM_APT_THRWDM dm) //모바일용
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
	 * 아파트 주소코드에 따른 동리스트
	 *
	 * @param SL_L_DTLSADDRDM
	 * @return SL_L_DTLSADDRDataSet
	 * @author
	 * @since
	 */
	public SL_L_DTLSADDRDataSet mo_selectDtladdrList(SL_L_DTLSADDRDM dm) //모바일용
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
	 * 아파트 배달카드
	 *
	 * @param dm
	 *            SS_L_APTDLV_LISTDM
	 * @return SS_L_APTDLV_LISTDataSet
	 * @throws AppException
	 */
	public SS_L_APTDLV_LISTDataSet mo_selectAptdlvList(SS_L_APTDLV_LISTDM dm) //모바일용_ciis용
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
	 * 아파트투입률조회(아파트형태리스트 or 투입률등록리스트)_모바일만존재_ciis용
	 *
	 * @param dm
	 *            SS_MO_L_APTINPIVSTDM
	 * @return SS_MO_L_APTINPIVSTDataSet
	 * @throws AppException
	 */
	public SS_MO_L_APTINPIVSTDataSet mo_selectAptrchList(SS_MO_L_APTINPIVSTDM dm) //모바일용
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
	 *  아파트의 정보, 투입률조사에 필요한 매체리스트_모바일만존재
	 *
	 * @param dm
	 *            SL_MO_L_INPIVSTINFODM
	 * @return SL_MO_L_INPIVSTINFODataSet
	 * @throws AppException
	 */
	public SL_MO_L_INPIVSTINFODataSet mo_selectAptinfoList(SL_MO_L_INPIVSTINFODM dm) //모바일용
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
	 * 아파트투입현황(현황 등록,수정)
	 *
	 * @param dm
	 *            SL_MO_A_COMM_APT_THRWDM
	 * @return SL_MO_A_COMM_APT_THRWDataSet
	 * @throws AppException
	 */
	public SL_MO_A_COMM_APT_THRWDataSet mo_accessThrw(SL_MO_A_COMM_APT_THRWDM dm) //모바일용
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
	 * 센터관리-투입률조사-현황검색_모바일용
	 *
	 * @param dm
	 *            SS_MO_L_COMM_APT_RESULTDM
	 * @return SS_MO_L_COMM_APT_RESULTDataSet
	 * @throws AppException
	 */
	public SS_MO_L_COMM_APT_RESULTDataSet mo_selectThrwResult(SS_MO_L_COMM_APT_RESULTDM dm) //모바일용
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
