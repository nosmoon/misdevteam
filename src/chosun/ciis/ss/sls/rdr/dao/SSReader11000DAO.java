/***************************************************************************************************
 * 파일명 : SSReader11000DAO.java_모바일용
 * 기능 : 독자정보를 위한 DAO
 * 작성일자 : 2016-12-07
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-독자정보를 위한 DAO
 */
public class SSReader11000DAO {
    /**
     * 독자현황-독자정보-독자검색 목록
     * @param dm SS_MO_L_RDR_SRCHDM 객체
     * @return SS_MO_L_RDR_SRCHDataSet 객체
     * @throws AppException
     */
    public SS_MO_L_RDR_SRCHDataSet mo_selectRdrSrchList(SS_MO_L_RDR_SRCHDM dm) throws AppException {  //모바일용
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_RDR_SRCHDataSet ds = (SS_MO_L_RDR_SRCHDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }
}