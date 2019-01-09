/***************************************************************************************************
* 파일명 : SSBrsup2800DAO.java
* 기능 : 센터지원-판촉현황-요원관리-13개월실적
* 작성일자 : 2016-05-03
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국지원-빌링-가상계좌통계
 */

public class SSBrsup2800DAO {
    
    /**
     * 지국지원-빌링-가상계좌통계-초기화면   
     */
    public SS_SLS_BRSUP_2800_ADataSet initBrsup2800(SS_SLS_BRSUP_2800_ADM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2800_ADataSet ds = (SS_SLS_BRSUP_2800_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    
    public SS_SLS_BRSUP_2810_LDataSet searchBrsup2810(SS_SLS_BRSUP_2810_LDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2810_LDataSet ds = (SS_SLS_BRSUP_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
}