/***************************************************************************************************
* 파일명 : SSExtn1200DAO.java
* 기능 : 사원확장을 위한 DAO
* 작성일자 : 2003-11-20
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
 * 확장현황-사원확장 을 위한 DAO
 */

public class SSExtn1200DAO {
    /**
     * 확장현황-사원확장-대회관리-초기화면
     * @param dm SS_L_RDR_XTN_EMPCAMP_INITDM
     * @return SS_L_RDR_XTN_EMPCAMP_INITDataSet
     * @throws AppException
     */
    public SS_L_RDR_XTN_EMPCAMP_INITDataSet empCampInit(SS_L_RDR_XTN_EMPCAMP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_XTN_EMPCAMP_INITDataSet ds = (SS_L_RDR_XTN_EMPCAMP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-목록
     * @param dm SS_L_RDR_EXTN_EMPCAMPDM
     * @return  SS_L_RDR_EXTN_EMPCAMPDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPCAMPDataSet selectEmpCampList(SS_L_RDR_EXTN_EMPCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPCAMPDataSet ds = (SS_L_RDR_EXTN_EMPCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-상세
     * @param dm SS_S_RDR_EXTN_EMPCAMPDM
     * @return SS_S_RDR_EXTN_EMPCAMPDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_EMPCAMPDataSet selectEmpCampDetail(SS_S_RDR_EXTN_EMPCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_EMPCAMPDataSet ds = (SS_S_RDR_EXTN_EMPCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-저장(등록)
     * @param dm SS_A_RDR_EXTN_EMPCAMPDM
     * @return SS_A_RDR_EXTN_EMPCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCAMPDataSet insertEmpCamp(SS_A_RDR_EXTN_EMPCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCAMPDataSet ds = (SS_A_RDR_EXTN_EMPCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-저장(수정)
     * @param dm SS_A_RDR_EXTN_EMPCAMPDM
     * @return SS_A_RDR_EXTN_EMPCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCAMPDataSet updateEmpCamp(SS_A_RDR_EXTN_EMPCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCAMPDataSet ds = (SS_A_RDR_EXTN_EMPCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-삭제
     * @param dm SS_A_RDR_EXTN_EMPCAMPDM
     * @return SS_A_RDR_EXTN_EMPCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCAMPDataSet deleteEmpCamp(SS_A_RDR_EXTN_EMPCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCAMPDataSet ds = (SS_A_RDR_EXTN_EMPCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-마감
     * @param dm SS_A_RDR_EXTN_EMPCAMP_CLOSEDM
     * @return SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet closeEmpCamp(SS_A_RDR_EXTN_EMPCAMP_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet ds = (SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-마감취소
     * @param dm SS_A_RDR_EXTN_EMPCAMP_CLOSEDM
     * @return SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet closeCancelEmpCamp(SS_A_RDR_EXTN_EMPCAMP_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet ds = (SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-비용-목록
     * @param dm SS_L_RDR_EXTN_EMPCLOSDM
     * @return SS_L_RDR_EXTN_EMPCLOSDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPCLOSDataSet selectEmpCampCostList(SS_L_RDR_EXTN_EMPCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPCLOSDataSet ds = (SS_L_RDR_EXTN_EMPCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-비용-상세
     * @param dm SS_S_RDR_EXTN_EMPCLOSDM
     * @return SS_S_RDR_EXTN_EMPCLOSDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_EMPCLOSDataSet selectEmpCampCostDetail(SS_S_RDR_EXTN_EMPCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_EMPCLOSDataSet ds = (SS_S_RDR_EXTN_EMPCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-비용-저장(등록)
     * @param dm SS_A_RDR_EXTN_EMPCLOSDM
     * @return SS_A_RDR_EXTN_EMPCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCLOSDataSet insertEmpCampCost(SS_A_RDR_EXTN_EMPCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCLOSDataSet ds = (SS_A_RDR_EXTN_EMPCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-비용-저장(수정)
     * @param dm SS_A_RDR_EXTN_EMPCLOSDM
     * @return SS_A_RDR_EXTN_EMPCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCLOSDataSet updateEmpCampCost(SS_A_RDR_EXTN_EMPCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCLOSDataSet ds = (SS_A_RDR_EXTN_EMPCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-비용-삭제
     * @param dm SS_A_RDR_EXTN_EMPCLOSDM
     * @return SS_A_RDR_EXTN_EMPCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCLOSDataSet deleteEmpCampCost(SS_A_RDR_EXTN_EMPCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCLOSDataSet ds = (SS_A_RDR_EXTN_EMPCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-비용-마감
     * @param dm SS_A_RDR_EXTN_EMPCLOS_CLOSEDM
     * @return SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet closeEmpCampCost(SS_A_RDR_EXTN_EMPCLOS_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet ds = (SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-대회관리-비용-마감취소
     * @param dm SS_A_RDR_EXTN_EMPCLOS_CLOSEDM
     * @return SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet closeCancelEmpCampCost(SS_A_RDR_EXTN_EMPCLOS_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet ds = (SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-비용관리-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet empCostInit(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-비용관리-목록
     * @param dm SS_L_RDR_EXTN_EMPCOSTDM
     * @return SS_L_RDR_EXTN_EMPCOSTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPCOSTDataSet selectEmpCostList(SS_L_RDR_EXTN_EMPCOSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPCOSTDataSet ds = (SS_L_RDR_EXTN_EMPCOSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-비용관리-상세목록
     * @param dm SS_L_RDR_EXTN_EMPCOSTDDM
     * @return SS_L_RDR_EXTN_EMPCOSTDDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPCOSTDDataSet selectEmpCostDetailList(SS_L_RDR_EXTN_EMPCOSTDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPCOSTDDataSet ds = (SS_L_RDR_EXTN_EMPCOSTDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사원확장-비용관리-저장
     * @param dm SS_U_RDR_EXTN_EMPCOSTDM
     * @return SS_U_RDR_EXTN_EMPCOSTDataSet
     * @throws AppException
     */
    public SS_U_RDR_EXTN_EMPCOSTDataSet updateEmpCost(SS_U_RDR_EXTN_EMPCOSTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_EXTN_EMPCOSTDataSet ds = (SS_U_RDR_EXTN_EMPCOSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}

