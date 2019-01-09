/***************************************************************************************************
 * 파일명   : SSReader1600DAO.java
 * 기능     : 독자현황-독자등급부여를 위한 DAO
 * 작성일자 : 2004-04-22
 * 작성자   : 김대섭
 **************************************************************************************************/
 /**************************************************************************************************
  * 수정내역 : 독자인증신청현황 추가 및 기존코드 코멘트 처리
  * 수정자 : 김대섭
  * 수정일자 : 2005-05-04
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-독자등급부여를 위한 DAO
 */
public class SSReader1600DAO {

    /**
     * 독자등급관리-등급신청내역 검색
     * @param CO_L_RDRCRTS_GRAD_APLCDM
     * @return CO_L_RDRCRTS_GRAD_APLCDataSet
     */
    public CO_L_RDRCRTS_GRAD_APLCDataSet selectGradAplcList(CO_L_RDRCRTS_GRAD_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자등급관리-등급신청내역 등록
     * @param CO_U_RDRCRTS_GRAD_GRNTDM
     * @return CO_U_RDRCRTS_GRAD_GRNTDataSet
     */
    public CO_U_RDRCRTS_GRAD_GRNTDataSet updateGradAplcGrnt(CO_U_RDRCRTS_GRAD_GRNTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_U_RDRCRTS_GRAD_GRNTDataSet ds = (CO_U_RDRCRTS_GRAD_GRNTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자등급관리-독자비교대상 검색
     * @param CO_L_RDRCRTS_APLC_CMPRDM
     * @return CO_L_RDRCRTS_APLC_CMPRDataSet
     */
    public CO_L_RDRCRTS_APLC_CMPRDataSet selectAplcCmprList(CO_L_RDRCRTS_APLC_CMPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_RDRCRTS_APLC_CMPRDataSet ds = (CO_L_RDRCRTS_APLC_CMPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

/* 2005-05-04 김대섭 추가 */
    /**
     * 독자인증신청-초기화면
     * @param SS_L_RDRCRTS_INITDM
     * @return SS_L_RDRCRTS_INITDataSet
     */
    public SS_L_RDRCRTS_INITDataSet initRdrCrts(SS_L_RDRCRTS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDRCRTS_INITDataSet ds = (SS_L_RDRCRTS_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자인증신청-목록
     * @param SS_L_RDRCRTSDM
     * @return SS_L_RDRCRTSDataSet
     */
    public SS_L_RDRCRTSDataSet selectRdrCrtsList(SS_L_RDRCRTSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDRCRTSDataSet ds = (SS_L_RDRCRTSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
