/***************************************************************************************************
 * 파일명 : SSReader1000DAO.java
 * 기능 : 독자정보를 위한 DAO
 * 작성일자 : 2003-12-26
 * 작성자 : 김대섭
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
public class SSReader1000DAO {
    /**
     * 독자현황-독자정보-독자검색 목록
     * @param dm SS_L_RDR_SRCHDM 객체
     * @return SS_L_RDR_SRCHDataSet 객체
     * @throws AppException
     */
    public SS_L_RDR_SRCHDataSet selectRdrSrchList(SS_L_RDR_SRCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_SRCHDataSet ds = (SS_L_RDR_SRCHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    // 독자이력은 지국독자화면으로 대체
}