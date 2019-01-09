/***************************************************************************************************
* ���ϸ� : SSMove1200DAO.java
* ��� : �̻絶��-����� ���� DAO
* �ۼ����� : 2004-01-09
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �̻絶��-����� ���� DAO
 */

public class SSMove1200DAO {

    /**
     * �̻絶��-���-���
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
     * �̻絶��-���-�����
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