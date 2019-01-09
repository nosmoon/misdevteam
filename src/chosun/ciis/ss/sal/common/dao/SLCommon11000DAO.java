/**************************************************************************************************
* 파일명    : 	SLCommon11000DAO.java_모바일용
* 기능      : 우편번호 검색을 위한 DAO_agency와 동일.
* 작성일자  : 2017-02-17
* 작성자    : 장선희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * 판매지국 공통를 위한 Data Access Object
 */
public class SLCommon11000DAO{
	/**
	 * 공통-우편번호검색_구군목록
	 *
	 * @param dm
	 *            CO_L_NEWGUGUNDM
	 * @return CO_L_NEWGUGUNDataSet
	 * @throws AppException
	 */
	public CO_L_NEWGUGUNDataSet mo_selectNewGugunList(CO_L_NEWGUGUNDM dm) throws AppException { //모바일용
		DBManager manager = new DBManager("Oracle");
		CO_L_NEWGUGUNDataSet ds = (CO_L_NEWGUGUNDataSet) manager.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		return ds;
	}


	/**
	 * 공통-우편번호검색
	 *
	 * @param dm
	 *            CO_MO_L_NEW_ADDRDM
	 * @return CO_MO_L_NEW_ADDRDataSet
	 * @throws AppException
	 */
	public CO_MO_L_NEW_ADDRDataSet mo_selectNewAddrList(CO_MO_L_NEW_ADDRDM dm) throws AppException { //모바일용 2017-01-10
		DBManager manager = new DBManager("Oracle");
		CO_MO_L_NEW_ADDRDataSet ds = (CO_MO_L_NEW_ADDRDataSet) manager.executeCall(dm);
/*		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		}
*/
		return ds;
	}
}
