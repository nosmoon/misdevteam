/***************************************************************************************************
* ���ϸ� : SSExtn1700DAO.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-������ ���� DAO
* �ۼ����� : 2004-04-06
* �ۼ��� : ����ȫ
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
 * Ȯ����Ȳ-���̹�Ȯ��-������ ���� DAO
 */

public class SSExtn1700DAO {
    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ��
     * @param dm SS_L_RDR_XTN_CYBCAMP_INITDM
     * @return SS_L_RDR_XTN_CYBCAMP_INITDataSet
     * @throws AppException
     */
    public SS_L_RDR_XTN_CYBCAMP_INITDataSet cybCampInit(SS_L_RDR_XTN_CYBCAMP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_XTN_CYBCAMP_INITDataSet ds = (SS_L_RDR_XTN_CYBCAMP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-���
     * @param dm SS_L_RDR_EXTN_CYBCAMPDM
     * @return  SS_L_RDR_EXTN_CYBCAMPDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_CYBCAMPDataSet selectCybCampList(SS_L_RDR_EXTN_CYBCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_CYBCAMPDataSet ds = (SS_L_RDR_EXTN_CYBCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-��
     * @param dm SS_S_RDR_EXTN_CYBCAMPDM
     * @return SS_S_RDR_EXTN_CYBCAMPDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTN_CYBCAMPDataSet selectCybCampDetail(SS_S_RDR_EXTN_CYBCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTN_CYBCAMPDataSet ds = (SS_S_RDR_EXTN_CYBCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-����(���)
     * @param dm SS_A_RDR_EXTN_CYBCAMPDM
     * @return SS_A_RDR_EXTN_CYBCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_CYBCAMPDataSet insertCybCamp(SS_A_RDR_EXTN_CYBCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_CYBCAMPDataSet ds = (SS_A_RDR_EXTN_CYBCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-����(����)
     * @param dm SS_A_RDR_EXTN_CYBCAMPDM
     * @return SS_A_RDR_EXTN_CYBCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_CYBCAMPDataSet updateCybCamp(SS_A_RDR_EXTN_CYBCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_CYBCAMPDataSet ds = (SS_A_RDR_EXTN_CYBCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-����
     * @param dm SS_A_RDR_EXTN_CYBCAMPDM
     * @return SS_A_RDR_EXTN_CYBCAMPDataSet
     * @throws AppException
     */
    public SS_A_RDR_EXTN_CYBCAMPDataSet deleteCybCamp(SS_A_RDR_EXTN_CYBCAMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_CYBCAMPDataSet ds = (SS_A_RDR_EXTN_CYBCAMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-����
     * @param dm SS_A_RDR_EXTN_CYBCAMP_CLOSEDM
     * @return SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet
     * @throws AppException
     */
/*
    public SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet closeCybCamp(SS_A_RDR_EXTN_CYBCAMP_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet ds = (SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/
    /**
     * Ȯ����Ȳ-���̹�Ȯ��-����-�������
     * @param dm SS_A_RDR_EXTN_CYBCAMP_CLOSEDM
     * @return SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet
     * @throws AppException
     */
/*
    public SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet closeCancelCybCamp(SS_A_RDR_EXTN_CYBCAMP_CLOSEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet ds = (SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/
}

