/***************************************************************************************************
* 파일명 : SSMove1200DAO.java
* 기능 : 이사독자-비용을 위한 DAO
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
 * 이사독자-비용을 위한 DAO
 */

public class SSMove1200DAO {

    /**
     * 이사독자-비용-목록
     * @param dm SS_L_MOVM_RDRCOSTDM
     * @return SS_L_MOVM_RDRCOSTDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDR_COSTDataSet selectMoveCostList(SS_L_MOVM_RDR_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDR_COSTDataSet ds = (SS_L_MOVM_RDR_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-비용-재생성
     * @param dm SS_L_MOVM_RDRCOSTDDM
     * @return SS_L_MOVM_RDRCOSTDDataSet
     * @throws AppException
     */
    public SS_A_MOVM_RDR_COSTDataSet rebuildMoveCost(SS_A_MOVM_RDR_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MOVM_RDR_COSTDataSet ds = (SS_A_MOVM_RDR_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_S_MOVM_RDR_COSTDataSet detailMoveCost(SS_S_MOVM_RDR_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MOVM_RDR_COSTDataSet ds = (SS_S_MOVM_RDR_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_U_MOVM_RDR_COST_BOACCTDataSet saveMoveBoacct(SS_U_MOVM_RDR_COST_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_MOVM_RDR_COST_BOACCTDataSet ds = (SS_U_MOVM_RDR_COST_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}