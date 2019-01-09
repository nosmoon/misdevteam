/***************************************************************************************************
* 파일명 : SSBrsup2600DAO.java
* 기능 : 지국지원-빌링_자동이체-이체신청개선 위한 DAO
* 작성일자 : 2009-05-20
* 작성자 : 김용욱
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
 * 지국지원-빌링_자동이체-이체신청개선 위한 DAO
 */

public class SSBrsup2600DAO {
    
    /**
     * 지국지원-빌링_자동이체-이체신청개선-목록조회화면
     * @param dm SS_L_SHFTAPLCDM
     * @return SS_L_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLCDataSet listSearchTransfer(SS_L_SHFTAPLCDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLCDataSet ds = (SS_L_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국지원-빌링_자동이체-이체신청개선-상세화면
     * @param dm SS_S_SHFTAPLCDM
     * @return SS_S_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_S_SHFTAPLCDataSet detailSearchTransfer(SS_S_SHFTAPLCDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_SHFTAPLCDataSet ds = (SS_S_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국지원-빌링_자동이체-이체신청개선-업로드
     * @param dm SS_S_SHFTAPLCDM
     * @return SS_S_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLC_UPLOADDataSet uploadSearchTransfer(SS_L_SHFTAPLC_UPLOADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLC_UPLOADDataSet ds = (SS_L_SHFTAPLC_UPLOADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}