/***************************************************************************************************
* 파일명 : SSExtn1500DAO.java
* 기능 : 확장용역비용을 위한 DAO
* 작성일자 : 2003-12-20
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
 * 확장현황-확장용역비용 을 위한 DAO
 */

public class SSExtn1500DAO {
    /**
     * 확장현황-확장용역비용-(조선IS)-초기화면
     * @param dm SS_L_RDR_EXTN_SERVCLOS_INITDM
     * @return SS_L_RDR_EXTN_SERVCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SERVCLOS_INITDataSet servCostInit(SS_L_RDR_EXTN_SERVCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SERVCLOS_INITDataSet ds = (SS_L_RDR_EXTN_SERVCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(조선IS)-목록
     * @param dm SS_L_RDR_EXTN_SERVCLOSDM
     * @return SS_L_RDR_EXTN_SERVCLOSDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SERVCLOSDataSet selectServCostList(SS_L_RDR_EXTN_SERVCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SERVCLOSDataSet ds = (SS_L_RDR_EXTN_SERVCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(조선IS)-상세
     * @param dm SS_S_RDR_EXTN_SERVCLOSDM
     * @return SS_S_RDR_EXTN_SERVCLOSDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_SERVCLOSDataSet selectServCostDetail(SS_S_RDR_EXTN_SERVCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_SERVCLOSDataSet ds = (SS_S_RDR_EXTN_SERVCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(조선IS)-저장(등록)
     * @param dm SS_A_RDR_EXTN_SERVCLOSDM
     * @return SS_A_RDR_EXTN_SERVCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SERVCLOSDataSet insertServCost(SS_A_RDR_EXTN_SERVCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SERVCLOSDataSet ds = (SS_A_RDR_EXTN_SERVCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(조선IS)-저장(수정)
     * @param dm SS_A_RDR_EXTN_SERVCLOSDM
     * @return SS_A_RDR_EXTN_SERVCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SERVCLOSDataSet updateServCost(SS_A_RDR_EXTN_SERVCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SERVCLOSDataSet ds = (SS_A_RDR_EXTN_SERVCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(조선IS)-삭제
     * @param dm SS_A_RDR_EXTN_SERVCLOSDM
     * @return SS_A_RDR_EXTN_SERVCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SERVCLOSDataSet deleteServCost(SS_A_RDR_EXTN_SERVCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SERVCLOSDataSet ds = (SS_A_RDR_EXTN_SERVCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


/* 20050219 김대섭 추가 */
    /**
     * 확장현황-확장용역비용-(MC)-초기화면
     * @param dm SS_L_RDR_EXTN_MCCLOS_INITDM
     * @return SS_L_RDR_EXTN_MCCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_MCCLOS_INITDataSet MCCostInit(SS_L_RDR_EXTN_MCCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_MCCLOS_INITDataSet ds = (SS_L_RDR_EXTN_MCCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(MC)-목록
     * @param dm SS_L_RDR_EXTN_MCCLOSDM
     * @return SS_L_RDR_EXTN_MCCLOSDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_MCCLOSDataSet selectMCCostList(SS_L_RDR_EXTN_MCCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_MCCLOSDataSet ds = (SS_L_RDR_EXTN_MCCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(MC)-상세
     * @param dm SS_S_RDR_EXTN_MCCLOSDM
     * @return SS_S_RDR_EXTN_MCCLOSDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_MCCLOSDataSet selectMCCostDetail(SS_S_RDR_EXTN_MCCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_MCCLOSDataSet ds = (SS_S_RDR_EXTN_MCCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(MC)-저장(등록)
     * @param dm SS_A_RDR_EXTN_MCCLOSDM
     * @return SS_A_RDR_EXTN_MCCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_MCCLOSDataSet insertMCCost(SS_A_RDR_EXTN_MCCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_MCCLOSDataSet ds = (SS_A_RDR_EXTN_MCCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(MC)-저장(수정)
     * @param dm SS_A_RDR_EXTN_MCCLOSDM
     * @return SS_A_RDR_EXTN_MCCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_MCCLOSDataSet updateMCCost(SS_A_RDR_EXTN_MCCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_MCCLOSDataSet ds = (SS_A_RDR_EXTN_MCCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-(MC)-삭제
     * @param dm SS_A_RDR_EXTN_MCCLOSDM
     * @return SS_A_RDR_EXTN_MCCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_MCCLOSDataSet deleteMCCost(SS_A_RDR_EXTN_MCCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_MCCLOSDataSet ds = (SS_A_RDR_EXTN_MCCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * 확장현황-확장용역비용-(조선IS)-마감
     * @param dm SS_A_RDR_EXTN_SERVCLOS_CLOSDM
     * @return SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet
     * @throws AppException
     */
/* 20050219 김대섭 수정(사용하지 않음) */
/*
    public SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet closeServCost(SS_A_RDR_EXTN_SERVCLOS_CLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet ds = (SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/
    /**
     * 확장현황-확장용역비용-(조선IS)-마감취소
     * @param dm SS_A_RDR_EXTN_SERVCLOS_CLOSDM
     * @return SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet
     * @throws AppException
     */
/* 20050219 김대섭 수정(사용하지 않음) */
/*
    public SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet closeCancelServCost(SS_A_RDR_EXTN_SERVCLOS_CLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet ds = (SS_A_RDR_EXTN_SERVCLOS_CLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/
    /**
     * 확장현황-확장용역비용-실적-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_BO_RSLT_INITDataSet rsltInit(SS_L_RDR_EXTN_BO_RSLT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_BO_RSLT_INITDataSet ds = (SS_L_RDR_EXTN_BO_RSLT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-실적-목록
     * @param dm SS_L_RDR_EXTN_BO_RSLTDM
     * @return SS_L_RDR_EXTN_BO_RSLTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_BO_RSLTDataSet selectBoRsltList(SS_L_RDR_EXTN_BO_RSLTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_BO_RSLTDataSet ds = (SS_L_RDR_EXTN_BO_RSLTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-실적-인쇄
     * @param dm SS_L_RDR_EXTN_BO_RSLT_PRINTDM
     * @return SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet printBoRsltList(SS_L_RDR_EXTN_BO_RSLT_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet ds = (SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-정산내역-목록
     * @param dm SS_L_RDR_EXTN_SERVCOSTDM
     * @return SS_L_RDR_EXTN_SERVCOSTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SERVCOSTDataSet selectServAdjmList(SS_L_RDR_EXTN_SERVCOSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SERVCOSTDataSet ds = (SS_L_RDR_EXTN_SERVCOSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-정산내역-상세 목록
     * @param dm SS_L_RDR_EXTN_SERVCOSTDDM
     * @return SS_L_RDR_EXTN_SERVCOSTDDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SERVCOSTDDataSet selectServAdjmDetailList(SS_L_RDR_EXTN_SERVCOSTDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SERVCOSTDDataSet ds = (SS_L_RDR_EXTN_SERVCOSTDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장용역비용-정산내역-인쇄
     * @param dm SS_L_RDR_EXTN_ISSTAF_PRINTDM
     * @return SS_L_RDR_EXTN_ISSTAF_PRINTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_ISSTAF_PRINTDataSet printServAdjmList(SS_L_RDR_EXTN_ISSTAF_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_ISSTAF_PRINTDataSet ds = (SS_L_RDR_EXTN_ISSTAF_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-지국확장이사통계-초기화면
     * @param dm SS_L_EXTN_MOVM_INITDM
     * @return SS_L_EXTN_MOVM_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_MOVM_INITDataSet extnMovmInit(SS_L_EXTN_MOVM_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_MOVM_INITDataSet ds = (SS_L_EXTN_MOVM_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-지국확장이사통계-목록
     * @param dm SS_L_EXTN_MOVMDM
     * @return SS_L_EXTN_MOVMDataSet
     * @throws AppException
     */
    public SS_L_EXTN_MOVMDataSet selectExtnMovmList(SS_L_EXTN_MOVMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_MOVMDataSet ds = (SS_L_EXTN_MOVMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
