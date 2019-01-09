/***************************************************************************************************
* 파일명 : SSMove1300DAO.java
* 기능 : 이사독자-송금을 위한 DAO
* 작성일자 : 2004-01-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 이사독자-송금을 위한 DAO
 */

public class SSMove1300DAO {
    /**
     * 이사독자-송금-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet moveRmttInit(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-송금-목록
     * @param dm SS_L_MOVM_RDR_RMTTDM
     * @return SS_L_MOVM_RDR_RMTTDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDR_RMTTDataSet selectMoveRmttList(SS_L_MOVM_RDR_RMTTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDR_RMTTDataSet ds = (SS_L_MOVM_RDR_RMTTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-송금-인쇄
     * @param dm SS_L_MOVM_RDR_RMTT_PRINTDM
     * @return SS_L_MOVM_RDR_RMTT_PRINTDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDR_RMTT_PRINTDataSet printMoveRmttList(SS_L_MOVM_RDR_RMTT_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDR_RMTT_PRINTDataSet ds = (SS_L_MOVM_RDR_RMTT_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}