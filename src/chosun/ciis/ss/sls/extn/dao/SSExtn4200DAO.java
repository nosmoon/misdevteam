/***************************************************************************************************
 * 파일명 : SSExtn4200DAO.java
 * 기능 : 확장조건별 독자 조회
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
public class SSExtn4200DAO {

    /**
     * 초기화면
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_4200_ADataSet initExtn4200(SS_SLS_EXTN_4200_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4200_ADataSet ds = (SS_SLS_EXTN_4200_ADataSet) manager.executeCall(dm);
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
    public SS_SLS_EXTN_4210_LDataSet selectExtn4210(SS_SLS_EXTN_4210_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4210_LDataSet ds = (SS_SLS_EXTN_4210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
