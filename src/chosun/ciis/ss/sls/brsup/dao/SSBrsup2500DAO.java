/***************************************************************************************************
* 파일명 : SSBrsup2500DAO.java
* 기능 : 통합정보지원시스템-판촉물재고관리 위한 DAO
* 작성일자 : 2004-04-28
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
 * 통합정보지원시스템-판촉물재고관리 위한 DAO
 */

public class SSBrsup2500DAO {
    /**
     * 통합정보지원시스템-판촉물재고관리-초기화면
     * @param dm SS_L_BNSITEMINOUT_INITDM
     * @return SS_L_BNSITEMINOUT_INITDataSet
     * @throws AppException
     */
    public SS_L_BNSITEMINOUT_INITDataSet initSalespromotion(SS_L_BNSITEMINOUT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BNSITEMINOUT_INITDataSet ds = (SS_L_BNSITEMINOUT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업
     * @param dm SS_L_POPINBNSITEMINOUT_INITDM
     * @return SS_L_POPINBNSITEMINOUT_INITDataSet
     * @throws AppException
     */
    public SS_L_POPINBNSITEMINOUT_INITDataSet popInInitSalespromotion(SS_L_POPINBNSITEMINOUT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_POPINBNSITEMINOUT_INITDataSet ds = (SS_L_POPINBNSITEMINOUT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 통합정보지원시스템-판촉물재고현황-조회화면-출고추가 팝업
     * @param dm SS_L_POPOUTBNSITEM_INITDM
     * @return SS_L_POPOUTBNSITEM_INITDataSet
     * @throws AppException
     */
    public SS_L_POPOUTBNSITEM_INITDataSet popOutInitSalespromotion(SS_L_POPOUTBNSITEM_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_POPOUTBNSITEM_INITDataSet ds = (SS_L_POPOUTBNSITEM_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국지원-판촉현황-판촉물재고현황 통합출고등록 팝업
     * @param dm SS_I_BNSITEMTOTALOUT_INITDM
     * @return SS_I_BNSITEMTOTALOUT_INITDataSet
     * @throws AppException
     */
    public SS_I_BNSITEMTOTALOUT_INITDataSet popTotalOutInitSalespromotion(SS_I_BNSITEMTOTALOUT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_BNSITEMTOTALOUT_INITDataSet ds = (SS_I_BNSITEMTOTALOUT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업-등록
     * @param dm SS_I_POPINBNSITEMINOUTDM
     * @return SS_I_POPINBNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_I_POPINBNSITEMINOUTDataSet popInInsertSalespromotion(SS_I_POPINBNSITEMINOUTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_POPINBNSITEMINOUTDataSet ds = (SS_I_POPINBNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국지원-판촉현황-판촉물재고현황 출고추가 물품신규등록   
     * @param dm SS_I_POPOUTBNSITEMDM
     * @return SS_I_POPOUTBNSITEMDataSet
     * @throws AppException
     */
    public SS_I_POPOUTBNSITEMDataSet popOutInsertSalespromotion(SS_I_POPOUTBNSITEMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_POPOUTBNSITEMDataSet ds = (SS_I_POPOUTBNSITEMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국지원-판촉현황-판촉물재고현황 추후배분 건에 대한 사후 정산
     * @param dm SS_I_POPAFTERBNSITEMDM
     * @return SS_I_POPAFTERBNSITEMDataSet
     * @throws AppException
     */
    public SS_I_POPAFTERBNSITEMDataSet popAfterInsertSalespromotion(SS_I_POPAFTERBNSITEMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_POPAFTERBNSITEMDataSet ds = (SS_I_POPAFTERBNSITEMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국지원-판촉현황-판촉물재고현황 추후배분 건에 대한 사후 정산
     * @param dm SS_I_BNSITEMTOTALOUTDM
     * @return SS_I_BNSITEMTOTALOUTDataSet
     * @throws AppException
     */
    public SS_I_BNSITEMTOTALOUTDataSet popTotalOutInsertSalespromotion(SS_I_BNSITEMTOTALOUTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_BNSITEMTOTALOUTDataSet ds = (SS_I_BNSITEMTOTALOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 통합정보지원시스템-판촉물재고관리-목록조회화면
     * @param dm SS_L_TASLM_BNSITEMINOUTDM
     * @return SS_L_TASLM_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_L_TASLM_BNSITEMINOUTDataSet listSalespromotion(SS_L_TASLM_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_TASLM_BNSITEMINOUTDataSet ds = (SS_L_TASLM_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 통합정보지원시스템-판촉물재고관리-상세화면
     * @param dm  SS_S_TASLM_BNSITEMINOUTDM
     * @return  SS_S_TASLM_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_S_TASLM_BNSITEMINOUTDataSet detailSalespromotion(SS_S_TASLM_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_TASLM_BNSITEMINOUTDataSet ds = (SS_S_TASLM_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 통합정보지원시스템-판촉물재고관리-상세조회화면
     * @param dm SS_S_DETASLM_BNSITEMINOUTDM
     * @return SS_S_DETASLM_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_S_DETASLM_BNSITEMINOUTDataSet detailSearchSalespromotion(SS_S_DETASLM_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_DETASLM_BNSITEMINOUTDataSet ds = (SS_S_DETASLM_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 통합정보지원시스템-판촉물재고관리-상세조회화면-삭제
     * @param dm SS_D_BNSITEMINOUTDM
     * @return SS_D_BNSITEMINOUTDataSet
     * @throws AppException
     */
    public SS_D_BNSITEMINOUTDataSet detailDeleteSalespromotion(SS_D_BNSITEMINOUTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_D_BNSITEMINOUTDataSet ds = (SS_D_BNSITEMINOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}