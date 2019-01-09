/***************************************************************************************************
* 파일명 : SSExtn2800DAO.java
* 기능 : 사원구독을 위한 DAO
* 작성일자 : 2013-06-27
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * 확장현황-사원구독 을 위한 DAO
 */
public class SSExtn2800DAO {
    /**
     * 확장현황-사원구독 초기화면
     * @param dm SS_L_RDR_XTN_INITDM
     * @return SS_L_RDR_XTN_INITDataSet
     * @throws AppException
     */
	public SSExtn2800DAO() {
	}

	
	/**
	 * 지역독자관리(조회)
	 * 
	 * @param SS_L_TEAM_SRCH_INITDM
	 * @return SS_L_TEAM_SRCH_INITDataSet
	 * @throws AppException
	 */
	public SS_L_TEAM_SRCH_INITDataSet selectInitList(SS_L_TEAM_SRCH_INITDM dm)
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_TEAM_SRCH_INITDataSet ds = (SS_L_TEAM_SRCH_INITDataSet) manager
				.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		} else {
			return ds;
		}
	}
	
	
	/**
	 * 지역독자관리(조회)
	 * 
	 * @param SS_L_RDR_RDRAREADM
	 * @return SS_L_RDR_RDRAREADataSet
	 * @throws AppException
	 */
	public SS_L_RDR_RDRAREADataSet selectRdrareaList(SS_L_RDR_RDRAREADM dm)
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_RDR_RDRAREADataSet ds = (SS_L_RDR_RDRAREADataSet) manager
				.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		} else {
			return ds;
		}
	}

	/**
	 * 지역독자관리(상세보기)
	 * 
	 * @param SS_S_RDR_RDRAREADM
	 * @return SS_S_RDR_RDRAREADataSet
	 * @throws AppException
	 */
	public SS_S_RDR_RDRAREADataSet selectRdrareaDetail(SS_S_RDR_RDRAREADM dm)
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_RDR_RDRAREADataSet ds = (SS_S_RDR_RDRAREADataSet) manager
				.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		} else {
			return ds;
		}
	}
    

}
