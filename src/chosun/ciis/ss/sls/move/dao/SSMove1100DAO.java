/***************************************************************************************************
* 파일명 : SSMove1100DAO.java
* 기능 : 이사독자-마감을 위한 DAO
* 작성일자 : 2004-01-07
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

/**
 * 이사독자-마감을 위한 DAO
 */
public class SSMove1100DAO {
    /**
     * 이사독자-마감-초기화면
     * @param dm SS_L_MOVM_RDRCLOS_INITDM
     * @return SS_L_MOVM_RDRCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDRCLOS_INITDataSet moveClosInit(SS_L_MOVM_RDRCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDRCLOS_INITDataSet ds = (SS_L_MOVM_RDRCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-마감-목록
     * @param dm SS_L_MOVM_RDRCLOSDM
     * @return SS_L_MOVM_RDRCLOSDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDR_CLOSDataSet selectMoveClosList(SS_L_MOVM_RDR_CLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDR_CLOSDataSet ds = (SS_L_MOVM_RDR_CLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-마감-상세
     * @param dm SS_S_MOVM_RDRCLOSDM
     * @return SS_S_MOVM_RDRCLOSDataSet
     * @throws AppException
     */
    public SS_S_MOVM_RDR_CLOSDataSet selectMoveClosDetail(SS_S_MOVM_RDR_CLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MOVM_RDR_CLOSDataSet ds = (SS_S_MOVM_RDR_CLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-마감-저장(등록)
     * @param dm SS_A_MOVM_RDRCLOSDM
     * @return SS_A_MOVM_RDRCLOSDataSet
     * @throws AppException
     */
    public SS_A_MOVM_RDR_CLOSDataSet insertMoveClos(SS_A_MOVM_RDR_CLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MOVM_RDR_CLOSDataSet ds = (SS_A_MOVM_RDR_CLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-마감-저장(수정)
     * @param dm SS_A_MOVM_RDRCLOSDM
     * @return SS_A_MOVM_RDRCLOSDataSet
     * @throws AppException
     */
    public SS_A_MOVM_RDR_CLOS_DETAILDataSet saveMoveClos(SS_A_MOVM_RDR_CLOS_DETAILDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MOVM_RDR_CLOS_DETAILDataSet ds = (SS_A_MOVM_RDR_CLOS_DETAILDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
