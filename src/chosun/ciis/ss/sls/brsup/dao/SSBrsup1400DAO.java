/***************************************************************************************************
* 파일명 : SSBrsup1400DAO.java
* 기능 : 지국지원-상해보험-마감,비용을 위한 DAO
* 작성일자 : 2004-02-20
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
 * 지국지원-상해보험-마감,비용을 위한 DAO
 */

public class SSBrsup1400DAO {
    /**
     * 지국지원-상해보험-마감-목록
     * @param dm SS_L_INSRAPLCCLOSDM
     * @return SS_L_INSRAPLCCLOSDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLCCLOSDataSet selectInsrClosList(SS_L_INSRAPLCCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLCCLOSDataSet ds = (SS_L_INSRAPLCCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-마감-상세
     * @param dm  SS_S_INSRAPLCCLOSDM
     * @return  SS_S_INSRAPLCCLOSDataSet
     * @throws AppException
     */
    public SS_S_INSRAPLCCLOSDataSet selectInsrClosDetail(SS_S_INSRAPLCCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INSRAPLCCLOSDataSet ds = (SS_S_INSRAPLCCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-마감-저장(등록)
     * @param dm SS_A_INSRAPLCCLOSDM
     * @return SS_A_INSRAPLCCLOSDataSet
     * @throws AppException
     */
    public SS_A_INSRAPLCCLOSDataSet insertInsrClos(SS_A_INSRAPLCCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRAPLCCLOSDataSet ds = (SS_A_INSRAPLCCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-마감-저장(수정)
     * @param dm  SS_A_INSRAPLCCLOSDM
     * @return  SS_A_INSRAPLCCLOSDataSet
     * @throws AppException
     */
    public SS_A_INSRAPLCCLOSDataSet updateInsrClos(SS_A_INSRAPLCCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRAPLCCLOSDataSet ds = (SS_A_INSRAPLCCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-마감-삭제
     * @param dm SS_A_INSRAPLCCLOSDM
     * @return SS_A_INSRAPLCCLOSDataSet
     * @throws AppException
     */
    public SS_A_INSRAPLCCLOSDataSet deleteInsrClos(SS_A_INSRAPLCCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRAPLCCLOSDataSet ds = (SS_A_INSRAPLCCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-마감-마감
     * @param dm SS_A_INSRAPLCCLOS_CLOSEDM
     * @return SS_A_INSRAPLCCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_INSRAPLCCLOS_CLOSEDataSet closeInsrClos(SS_A_INSRAPLCCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRAPLCCLOS_CLOSEDataSet ds = (SS_A_INSRAPLCCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-마감-마감취소
     * @param dm SS_A_INSRAPLCCLOS_CLOSEDM
     * @return SS_A_INSRAPLCCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_INSRAPLCCLOS_CLOSEDataSet closeCancelInsrClos(SS_A_INSRAPLCCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRAPLCCLOS_CLOSEDataSet ds = (SS_A_INSRAPLCCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-비용(영업담당)-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet insrCostBusnInit(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-비용(영업담당)-목록
     * @param dm SS_L_INSRCOST_BUSNDM
     * @return SS_L_INSRCOST_BUSNDataSet
     * @throws AppException
     */
    public SS_L_INSRCOST_BUSNDataSet selectInsrCostBusnList(SS_L_INSRCOST_BUSNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRCOST_BUSNDataSet ds = (SS_L_INSRCOST_BUSNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-비용(영업담당)-상세목록
     * @param dm SS_L_INSRCOSTCLMTDM
     * @return SS_L_INSRCOSTCLMTDataSet
     * @throws AppException
     */
    public SS_L_INSRCOSTCLMTDataSet selectInsrCostBusnDetail(SS_L_INSRCOSTCLMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRCOSTCLMTDataSet ds = (SS_L_INSRCOSTCLMTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-비용(영업담당)-저장(등록)
     * @param dm SS_A_INSRCOSTCLMTDM
     * @return SS_A_INSRCOSTCLMTDataSet
     * @throws AppException
     */
    public SS_A_INSRCOSTCLMTDataSet insertInsrCostBusn(SS_A_INSRCOSTCLMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRCOSTCLMTDataSet ds = (SS_A_INSRCOSTCLMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-비용(지원담당)-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet insrCostSplyInit(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-비용(지원담당)-목록
     * @param dm SS_L_INSRCOST_SPLYDM
     * @return SS_L_INSRCOST_SPLYDataSet
     * @throws AppException
     */
    public SS_L_INSRCOST_SPLYDataSet selectInsrCostSplyList(SS_L_INSRCOST_SPLYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRCOST_SPLYDataSet ds = (SS_L_INSRCOST_SPLYDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-상해보험-비용(지원담당)-저장(수정)
     * @param dm SS_U_INSRCOSTDM
     * @return SS_U_INSRCOSTDataSet
     * @throws AppException
     */
    public SS_U_INSRCOSTDataSet updateInsrCostSply(SS_U_INSRCOSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_INSRCOSTDataSet ds = (SS_U_INSRCOSTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}