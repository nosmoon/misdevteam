/***************************************************************************************************
 * 파일명 : SSBrmgr1500DAO.java
 * 기능 : 지국경영-공정위 위약금 현황을 위한 DAO
 * 작성일자 : 2004-02-24
 * 작성자 : 김성규
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-공정위 위약금 현황을 위한 DAO
 */
public class SSBrmgr1500DAO {

    /**
     * 지국경영-공정위 위약금 현황-초기화면(부서조회, 심의 결과 조회, 위약 사유 조회)
     * @param dm SS_L_FCT_FRFT_INITDM 객체
     * @return SS_L_FCT_FRFT_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_FCT_FRFT_INITDataSet selectCodeList(SS_L_FCT_FRFT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_FCT_FRFT_INITDataSet ds = (SS_L_FCT_FRFT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-공정위 위약금 현황-조회 화면
     * @param dm SS_L_FCT_FRFT_LISTDM 객체
     * @return SS_L_FCT_FRFT_LISTDataSet 객체
     * @throws AppException
     */
    public SS_L_FCT_FRFT_LISTDataSet selectCommList(SS_L_FCT_FRFT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_FCT_FRFT_LISTDataSet ds = (SS_L_FCT_FRFT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국경영-공정위 위약금 현황-상세
     * @param dm SS_S_FCT_FRFTDM 객체
     * @return SS_S_FCT_FRFTDataSet 객체
     * @throws AppException
     */
    public SS_S_FCT_FRFTDataSet selectFctFrftDetail(SS_S_FCT_FRFTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_FCT_FRFTDataSet ds = (SS_S_FCT_FRFTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    /**
     * 지국경영-공정위 위약금 현황-입력 수정 삭제 화면
     * @param dm SS_A_FCT_FRFTDM 객체
     * @return SS_A_FCT_FRFTDataSet 객체
     * @throws AppException
     */
    public SS_A_FCT_FRFTDataSet accessFctFrft(SS_A_FCT_FRFTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_FCT_FRFTDataSet ds = (SS_A_FCT_FRFTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


}
