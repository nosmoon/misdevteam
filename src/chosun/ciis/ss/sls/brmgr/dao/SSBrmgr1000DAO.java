/***************************************************************************************************
 * 파일명 : SSBrmgr1000DAO.java
 * 기능 : 지국경영-지국부수현황 위한 DAO
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
 * 지국경영-지국부수현황 위한 DAO
 */
public class SSBrmgr1000DAO {

    /**
     * 지국경영-지국부수현황 초기화
     * @param dm SS_L_BOSENDPCOND_INITDM 객체
     * @return SS_L_BOSENDPCOND_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_BOSENDPCOND_INITDataSet selectInitList(SS_L_BOSENDPCOND_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOSENDPCOND_INITDataSet ds = (SS_L_BOSENDPCOND_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-지국부수현황 조회
     * @param dm SS_L_BOSENDPCONDDM 객체
     * @return SS_L_BOSENDPCONDDataSet 객체
     * @throws AppException
     */
    public SS_L_BOSENDPCONDDataSet selectBoqtypcondList(SS_L_BOSENDPCONDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOSENDPCONDDataSet ds = (SS_L_BOSENDPCONDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-지국부수현황 엑셀저장
     * @param dm SS_P_BOSENDPCONDDM 객체
     * @return SS_P_BOSENDPCONDDataSet 객체
     * @throws AppException
     */
    public SS_P_BOSENDPCONDDataSet selectBoqtypcondEXCEL(SS_P_BOSENDPCONDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_BOSENDPCONDDataSet ds = (SS_P_BOSENDPCONDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * 지국경영-지국부수현황 상세
     * @param dm SS_P_BOSENDPCONDDM 객체
     * @return SS_P_BOSENDPCONDDataSet 객체
     * @throws AppException
     */
    public SL_I_ABCDataSet selectBoqtypcondDetailList(SL_I_ABCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_I_ABCDataSet ds = (SL_I_ABCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
