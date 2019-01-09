/***************************************************************************************************
 * 파일명 : SSExtn3900DAO.java
 * 기능 : 연락처이상 독자 조회
 * 작성일자 : 2015-11-10
 * 작성자 : 심정보
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * DAO
 */
public class SSExtn3900DAO {

    /**
     * 초기화면
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_3900_ADataSet initExtn3900(SS_SLS_EXTN_3900_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3900_ADataSet ds = (SS_SLS_EXTN_3900_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 목록
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_3910_LDataSet selectExtn3910(SS_SLS_EXTN_3910_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3910_LDataSet ds = (SS_SLS_EXTN_3910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
