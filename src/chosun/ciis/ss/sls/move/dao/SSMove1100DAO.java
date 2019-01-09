/***************************************************************************************************
* ���ϸ� : SSMove1100DAO.java
* ��� : �̻絶��-������ ���� DAO
* �ۼ����� : 2004-01-07
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

/**
 * �̻絶��-������ ���� DAO
 */
public class SSMove1100DAO {
    /**
     * �̻絶��-����-�ʱ�ȭ��
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
     * �̻絶��-����-���
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
     * �̻絶��-����-��
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
     * �̻絶��-����-����(���)
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
     * �̻絶��-����-����(����)
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
