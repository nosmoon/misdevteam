/***************************************************************************************************
 * 파일명 : SSBrmgr1700DAO.java
 * 기능 : 지국경영-관할지국조정을 위한 DAO
 * 작성일자 : 2004-03-12
 * 작성자 : 고윤홍
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

/**
 * 지국경영-관할지국조정을 위한 DAO
 */
public class SSBrmgr1700DAO {

    /**
     * 지국경영-관할지국조정-초기화면
     * @param dm SS_L_RDR_MOVMWORK_INITDM 객체
     * @return SS_L_RDR_MOVMWORK_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_RDR_MOVMWORK_INITDataSet initRdrMovm(SS_L_RDR_MOVMWORK_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_MOVMWORK_INITDataSet ds = (SS_L_RDR_MOVMWORK_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-관할지국조정-목록
     * @param dm SS_L_RDR_MOVMWORKDM 객체
     * @return SS_L_RDR_MOVMWORKDataSet 객체
     * @throws AppException
     */
    public SS_L_RDR_MOVMWORKDataSet selectRdrMovmList(SS_L_RDR_MOVMWORKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_MOVMWORKDataSet ds = (SS_L_RDR_MOVMWORKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-관할지국조정-상세
     * @param dm SS_S_RDR_MOVMWORKDM 객체
     * @return SS_S_RDR_MOVMWORKDataSet 객체
     * @throws AppException
     */
    public SS_S_RDR_MOVMWORKDataSet selectRdrMovmDetail(SS_S_RDR_MOVMWORKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_MOVMWORKDataSet ds = (SS_S_RDR_MOVMWORKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-관할지국조정-담당확인
     * @param dm SS_U_RDR_MOVMWORKDM 객체
     * @return SS_U_RDR_MOVMWORKDataSet 객체
     * @throws AppException
     */
    public SS_U_RDR_MOVMWORKDataSet updateRdrMovm(SS_U_RDR_MOVMWORKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_MOVMWORKDataSet ds = (SS_U_RDR_MOVMWORKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}