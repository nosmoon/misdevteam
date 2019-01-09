/***************************************************************************************************
* ���ϸ� : SSExtn1100DAO.java
* ��� : ǰ����Ȯ���� ���� DAO
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * Ȯ����Ȳ-ǰ����Ȯ�� �� ���� DAO
 */

public class SSExtn1100DAO {
    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-�ʱ�ȭ��
     * @param dm SS_L_RDR_XTN_EXGCAMP_INITDM
     * @return SS_L_RDR_XTN_EXGCAMP_INITDataSet
     * @throws AppException
     */
    public SS_L_RDR_XTN_EXGCAMP_INITDataSet exgCampInit(SS_L_RDR_XTN_EXGCAMP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_XTN_EXGCAMP_INITDataSet ds = (SS_L_RDR_XTN_EXGCAMP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-���
     * @param dm SS_L_RDR_EXTN_EXGCAMPDM
     * @return SS_L_RDR_EXTN_EXGCAMPDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EXGCAMPDataSet selectExgCampList(SS_L_RDR_EXTN_EXGCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EXGCAMPDataSet ds = (SS_L_RDR_EXTN_EXGCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-��
     * @param dm SS_S_RDR_EXTN_EXGCAMPDM
     * @return SS_S_RDR_EXTN_EXGCAMPDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_EXGCAMPDataSet selectExgCampDetail(SS_S_RDR_EXTN_EXGCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_EXGCAMPDataSet ds = (SS_S_RDR_EXTN_EXGCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����(���)
     * @param dm SS_A_RDR_EXTN_EXGCAMPDM
     * @return SS_A_RDR_EXTN_EXGCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EXGCAMPDataSet insertExgCamp(SS_A_RDR_EXTN_EXGCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EXGCAMPDataSet ds = (SS_A_RDR_EXTN_EXGCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����(����)
     * @param dm SS_A_RDR_EXTN_EXGCAMPDM
     * @return SS_A_RDR_EXTN_EXGCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EXGCAMPDataSet updateExgCamp(SS_A_RDR_EXTN_EXGCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EXGCAMPDataSet ds = (SS_A_RDR_EXTN_EXGCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����
     * @param dm SS_A_RDR_EXTN_EXGCAMPDM
     * @return SS_A_RDR_EXTN_EXGCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EXGCAMPDataSet deleteExgCamp(SS_A_RDR_EXTN_EXGCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EXGCAMPDataSet ds = (SS_A_RDR_EXTN_EXGCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����
     * @param dm SS_A_RDR_EXTN_EXGCAMP_CLOSEDM
     * @return SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet closeExgCamp(SS_A_RDR_EXTN_EXGCAMP_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet ds = (SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-�������
     * @param dm SS_A_RDR_EXTN_EXGCAMP_CLOSEDM
     * @return SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet closeCancelExgCamp(SS_A_RDR_EXTN_EXGCAMP_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet ds = (SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-������-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet exgCostInit(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-������-���
     * @param dm SS_L_RDR_EXTN_EXGCOSTDM
     * @return SS_L_RDR_EXTN_EXGCOSTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EXGCOSTDataSet selectExgCostList(SS_L_RDR_EXTN_EXGCOSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EXGCOSTDataSet ds = (SS_L_RDR_EXTN_EXGCOSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-������-�󼼸��
     * @param dm SS_L_RDR_EXTN_EXGCOSTDDM
     * @return SS_L_RDR_EXTN_EXGCOSTDDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EXGCOSTDDataSet selectExgCostDetailList(SS_L_RDR_EXTN_EXGCOSTDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EXGCOSTDDataSet ds = (SS_L_RDR_EXTN_EXGCOSTDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-������-����(����)
     * @param dm SS_U_RDR_EXTN_EXGCOSTDM
     * @return SS_U_RDR_EXTN_EXGCOSTDataSet
     * @throws AppException
     */
    public SS_U_RDR_EXTN_EXGCOSTDataSet updateExgCost(SS_U_RDR_EXTN_EXGCOSTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_EXTN_EXGCOSTDataSet ds = (SS_U_RDR_EXTN_EXGCOSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-�۱�-�μ�
     * @param dm SS_L_RDR_EXTN_EXGCOST_PRINTDM
     * @return SS_L_RDR_EXTN_EXGCOST_PRINTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EXGCOST_PRINTDataSet printExgCostList(SS_L_RDR_EXTN_EXGCOST_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EXGCOST_PRINTDataSet ds = (SS_L_RDR_EXTN_EXGCOST_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}