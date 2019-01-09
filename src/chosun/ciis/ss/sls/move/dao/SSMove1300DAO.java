/***************************************************************************************************
* ���ϸ� : SSMove1300DAO.java
* ��� : �̻絶��-�۱��� ���� DAO
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
 * �̻絶��-�۱��� ���� DAO
 */

public class SSMove1300DAO {
    /**
     * �̻絶��-�۱�-�ʱ�ȭ��
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
     * �̻絶��-�۱�-���
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
     * �̻絶��-�۱�-�μ�
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