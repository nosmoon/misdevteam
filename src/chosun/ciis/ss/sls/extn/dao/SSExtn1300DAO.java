/***************************************************************************************************
* 파일명 : SSExtn1300DAO.java
* 기능 : 사원확장 수당,송금을 위한 DAO
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
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
 * 확장현황-사원수당 을 위한 DAO
 */

public class SSExtn1300DAO {
    /**
     * 확장현황-사원확장-수당관리-초기화면
     * @param dm SS_L_EMPCAMPNODM
     * @return SS_L_EMPCAMPNODataSet
     * @throws AppException
     */
    public SS_L_EMPCAMPNODataSet empAlonInit(SS_L_EMPCAMPNODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-수당관리-목록
     * @param dm SS_L_RDR_EXTN_EMPALONDM
     * @return SS_L_RDR_EXTN_EMPALONDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPALONDataSet selectEmpAlonList(SS_L_RDR_EXTN_EMPALONDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPALONDataSet ds = (SS_L_RDR_EXTN_EMPALONDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-수당관리-상세목록
     * @param dm SS_L_RDR_EXTN_EMPALONDDM
     * @return SS_L_RDR_EXTN_EMPALONDDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPALONDDataSet selectEmpAlonDetailList(SS_L_RDR_EXTN_EMPALONDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPALONDDataSet ds = (SS_L_RDR_EXTN_EMPALONDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-수당관리-저장
     * @param dm SS_U_RDR_EXTN_EMPALONDM
     * @return SS_U_RDR_EXTN_EMPALONDataSet
     * @throws AppException
     */
    public SS_U_RDR_EXTN_EMPALONDataSet updateEmpAlon(SS_U_RDR_EXTN_EMPALONDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_EXTN_EMPALONDataSet ds = (SS_U_RDR_EXTN_EMPALONDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-송금관리-초기화면
     * @param dm SS_L_EMPCAMPNODM
     * @return SS_L_EMPCAMPNODataSet
     * @throws AppException
     */
    public SS_L_EMPCAMPNODataSet empRmttInit(SS_L_EMPCAMPNODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-송금관리-목록
     * @param dm SS_L_RDR_EXTN_EMPRMTTDM
     * @return SS_L_RDR_EXTN_EMPRMTTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPRMTTDataSet selectEmpRmttList(SS_L_RDR_EXTN_EMPRMTTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPRMTTDataSet ds = (SS_L_RDR_EXTN_EMPRMTTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-사원확장-송금 인쇄
     * @param dm SS_L_RDR_EXTN_EMPRMTT_PRINTDM
     * @return SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet printEmpAlonList(SS_L_RDR_EXTN_EMPRMTT_PRINTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet ds = (SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}