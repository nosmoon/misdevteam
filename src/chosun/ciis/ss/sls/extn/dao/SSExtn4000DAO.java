/***************************************************************************************************
 * 파일명 : SSExtn4000DAO.java
 * 기능 : 다부수 입력 독자 조회
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
public class SSExtn4000DAO {

    /**
     * 초기화면
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_4000_ADataSet initExtn4000(SS_SLS_EXTN_4000_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4000_ADataSet ds = (SS_SLS_EXTN_4000_ADataSet) manager.executeCall(dm);
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
    public SS_SLS_EXTN_4010_LDataSet selectExtn4010(SS_SLS_EXTN_4010_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4010_LDataSet ds = (SS_SLS_EXTN_4010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
