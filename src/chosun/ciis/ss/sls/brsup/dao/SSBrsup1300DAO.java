/***************************************************************************************************
* 파일명 : SSBrsup1300DAO.java
* 기능 : 지국지원-상해보험-등록,신규신청,변경신청을 위한 DAO
* 작성일자 : 2004-02-10
* 작성자 : 김대섭
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
 * 지국지원-상해보험-등록,신규신청,변경신청을 위한 DAO
 */

public class SSBrsup1300DAO {
    /**
     * 지국지원-상해보험-등록-목록
     * @param dm SS_L_INSRDM
     * @return SS_L_INSRDataSet
     * @throws AppException
     */
    public SS_L_INSRDataSet selectInsrList(SS_L_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRDataSet ds = (SS_L_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-등록-상세
     * @param dm SS_S_INSRDM
     * @return SS_S_INSRDataSet
     * @throws AppException
     */
    public SS_S_INSRDataSet selectInsrDetail(SS_S_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INSRDataSet ds = (SS_S_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-등록-등록
     * @param dm SS_A_INSRDM
     * @return SS_A_INSRDataSet
     * @throws AppException
     */
    public SS_A_INSRDataSet insertInsr(SS_A_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRDataSet ds = (SS_A_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-등록-수정
     * @param dm SS_A_INSRDM
     * @return SS_A_INSRDataSet
     * @throws AppException
     */
    public SS_A_INSRDataSet updateInsr(SS_A_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRDataSet ds = (SS_A_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-등록-삭제
     * @param dm SS_A_INSRDM
     * @return SS_A_INSRDataSet
     * @throws AppException
     */
    public SS_A_INSRDataSet deleteInsr(SS_A_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRDataSet ds = (SS_A_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-신청-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLC_INITDataSet initInsrAplc(SS_L_INSRAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLC_INITDataSet ds = (SS_L_INSRAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-신청-목록
     * @param dm SS_L_INSRAPLCDM
     * @return SS_L_INSRAPLCDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLCDataSet selectInsrAplcList(SS_L_INSRAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLCDataSet ds = (SS_L_INSRAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-신청-저장(수정)
     * @param dm SS_U_INSRAPLCDM
     * @return SS_U_INSRAPLCDataSet
     * @throws AppException
     */
    public SS_U_INSRAPLCDataSet updateInsrAplc(SS_U_INSRAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_INSRAPLCDataSet ds = (SS_U_INSRAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-신청-상세
     * @param dm SS_S_INSRAPLCDM
     * @return SS_S_INSRAPLCDataSet
     * @throws AppException
     */
    public SS_S_INSRAPLCDataSet selectInsrAplcDetail(SS_S_INSRAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INSRAPLCDataSet ds = (SS_S_INSRAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-변경-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLC_INITDataSet initInsrChg(SS_L_INSRAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLC_INITDataSet ds = (SS_L_INSRAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-변경-목록
     * @param dm SS_L_INSRAPLC_CHGDM
     * @return SS_L_INSRAPLC_CHGDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLC_CHGDataSet selectInsrChgList(SS_L_INSRAPLC_CHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLC_CHGDataSet ds = (SS_L_INSRAPLC_CHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}