/***************************************************************************************************
 * 파일명 : SSExtn3200DAO.java
 * 기능 : 확장조건관리 DAO
 * 작성일자 : 2015-03-13
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
 * 확장조건관리 DAO
 */
public class SSExtn3200DAO {

    /**
     * 확장조건관리-초기화면
     * @param dm SS_L_EXCD_INITDM
     * @return SS_L_EXCD_INITDataSet
     * @throws AppException
     */
    public SS_L_EXCD_INITDataSet selectExtnCondInit(SS_L_EXCD_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXCD_INITDataSet ds = (SS_L_EXCD_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장조건관리-목록
     * @param dm SS_L_EXCDDM
     * @return SS_L_EXCDDataSet
     * @throws AppException
     */
    public SS_L_EXCDDataSet selectExtnCondList(SS_L_EXCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXCDDataSet ds = (SS_L_EXCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장조건관리-승인
     * @param dm SS_L_EXCDDM
     * @return SS_L_EXCDDataSet
     * @throws AppException
     */
    public SS_U_EXCD_APPRDataSet apprExtnCond(SS_U_EXCD_APPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXCD_APPRDataSet ds = (SS_U_EXCD_APPRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_U_EXCD_APPRREJDataSet apprRejExtnCond(SS_U_EXCD_APPRREJDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXCD_APPRREJDataSet ds = (SS_U_EXCD_APPRREJDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_U_EXCD_DELDataSet delExtnCond(SS_U_EXCD_DELDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXCD_DELDataSet ds = (SS_U_EXCD_DELDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
