/***************************************************************************************************
* 파일명 : SSExtn1400DAO.java
* 기능 : 사원확장비용을 위한 DAO
* 작성일자 : 2003-12-17
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
 * 확장현황-확장지원비용 을 위한 DAO
 */

public class SSExtn1400DAO {

    /**
     * 확장현황-확장지원비-목록
     * @param dm SS_L_RDR_EXTN_SLSCLOSDM
     * @return SS_L_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SLSCLOSDataSet selectSlsCostList(SS_L_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SLSCLOSDataSet ds = (SS_L_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-상세
     * @param dm  SS_S_RDR_EXTN_SLSCLOSDM
     * @return  SS_S_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_SLSCLOSDataSet selectSlsCostDetail(SS_S_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_SLSCLOSDataSet ds = (SS_S_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-저장(등록)
     * @param dm SS_A_RDR_EXTN_SLSCLOSDM
     * @return SS_A_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOSDataSet insertSlsCost(SS_A_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = (SS_A_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-저장(수정)
     * @param dm  SS_A_RDR_EXTN_SLSCLOSDM
     * @return  SS_A_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOSDataSet updateSlsCost(SS_A_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = (SS_A_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-삭제
     * @param dm SS_A_RDR_EXTN_SLSCLOSDM
     * @return SS_A_RDR_EXTN_SLSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOSDataSet deleteSlsCost(SS_A_RDR_EXTN_SLSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = (SS_A_RDR_EXTN_SLSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-마감
     * @param dm SS_A_RDR_EXTN_SLSCLOS_CLOSEDM
     * @return SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet closeSlsCost(SS_A_RDR_EXTN_SLSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet ds = (SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-마감취소
     * @param dm SS_A_RDR_EXTN_SLSCLOS_CLOSEDM
     * @return SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet closeCancelSlsCost(SS_A_RDR_EXTN_SLSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet ds = (SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-등록/조회-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet slsAmtInit(SS_L_NWBUSEOCDDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-등록/조회-목록
     * @param dm SS_L_RDR_EXTN_SLSCOSTDM
     * @return SS_L_RDR_EXTN_SLSCOSTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_SLSCOSTDataSet selectSlsAmtList(SS_L_RDR_EXTN_SLSCOSTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_SLSCOSTDataSet ds = (SS_L_RDR_EXTN_SLSCOSTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장지원비-등록/조회-수정
     * @param dm SS_U_RDR_EXTN_SLSCOSTDM
     * @return SS_U_RDR_EXTN_SLSCOSTDataSet
     * @throws AppException
     */
    public SS_U_RDR_EXTN_SLSCOSTDataSet updateSlsAmt(SS_U_RDR_EXTN_SLSCOSTDM dm ) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_EXTN_SLSCOSTDataSet ds = (SS_U_RDR_EXTN_SLSCOSTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}