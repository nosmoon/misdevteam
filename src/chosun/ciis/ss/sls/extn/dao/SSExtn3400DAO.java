/***************************************************************************************************
 * 파일명 : SSExtn3200DAO.java
 * 기능 : 미수개월수별 조회
 * 작성일자 : 2015-11-09
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
public class SSExtn3400DAO {

    /**
     * 초기화면
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_3400_ADataSet initExtn3400(SS_SLS_EXTN_3400_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3400_ADataSet ds = (SS_SLS_EXTN_3400_ADataSet) manager.executeCall(dm);
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
    public SS_SLS_EXTN_3410_LDataSet selectExtn3410(SS_SLS_EXTN_3410_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3410_LDataSet ds = (SS_SLS_EXTN_3410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
