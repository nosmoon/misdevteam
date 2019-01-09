/***************************************************************************************************
* 파일명 : SSExtn2400DAO.java
* 기능 : 확장현황-기타확장관련작업을 위한 DAO
* 작성일자 : 2012-02-20
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
 * 확장현황-신청현황 을 위한 DAO
 */
public class SSExtn2400DAO {
    
    /**
     * 확장현황-신청현황 확장신청 목록
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
	public SL_L_CAMPEXTN_UNIDataSet selectCampExtnUniList(SL_L_CAMPEXTN_UNIDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SL_L_CAMPEXTN_UNIDataSet ds = (SL_L_CAMPEXTN_UNIDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
