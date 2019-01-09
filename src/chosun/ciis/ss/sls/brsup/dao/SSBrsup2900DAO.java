/***************************************************************************************************
 * 파일명 : SSBrsup2900WB.java
 * 기능 : 센터지원=판촉현황-요원관리-요원별실적관리 위한 DAO
 * 작성일자 : 2016-05-02
 * 작성자 : 장선희
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
 *  센터지원-판촉현황-요원관리-요원별실적관리
 */

public class SSBrsup2900DAO {

    /**
     *  센터지원-판촉현황-요원관리-요원별실적관리-초기화면
     * @param dm SS_SLS_BRSUP_2900_ADM
     * @return SS_SLS_BRSUP_2900_ADataSet
     * @throws AppException
     */

    public SS_SLS_BRSUP_2900_ADataSet initBrsup2900(SS_SLS_BRSUP_2900_ADM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2900_ADataSet ds = (SS_SLS_BRSUP_2900_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     *  센터지원-판촉현황-요원관리-요원별실적관리-리스트
     * @param dm SS_SLS_BRSUP_2910_LDM
     * @return SS_SLS_BRSUP_2910_LDataSet
     * @throws AppException
     */

    public SS_SLS_BRSUP_2910_LDataSet selectBrsup2910(SS_SLS_BRSUP_2910_LDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2910_LDataSet ds = (SS_SLS_BRSUP_2910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     *  센터지원-판촉현황-요원관리-요원별실적관리-리스트-상세(팝업)
     * @param dm SS_SLS_BRSUP_2920_SDM
     * @return SS_SLS_BRSUP_2920_SDataSet
     * @throws AppException
     */

    public SS_SLS_BRSUP_2920_SDataSet selectBrsup2920(SS_SLS_BRSUP_2920_SDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2920_SDataSet ds = (SS_SLS_BRSUP_2920_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }




}