/***************************************************************************************************
* ���ϸ� : SSExtn1300DAO.java
* ��� : ���Ȯ�� ����,�۱��� ���� DAO
* �ۼ����� : 2003-12-15
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
 * Ȯ����Ȳ-������� �� ���� DAO
 */

public class SSExtn1300DAO {
    /**
     * Ȯ����Ȳ-���Ȯ��-�������-�ʱ�ȭ��
     * @param dm SS_L_EMPCAMPNODM
     * @return SS_L_EMPCAMPNODataSet
     * @throws AppException
     */
    public SS_L_EMPCAMPNODataSet empAlonInit(SS_L_EMPCAMPNODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���Ȯ��-�������-���
     * @param dm SS_L_RDR_EXTN_EMPALONDM
     * @return SS_L_RDR_EXTN_EMPALONDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPALONDataSet selectEmpAlonList(SS_L_RDR_EXTN_EMPALONDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPALONDataSet ds = (SS_L_RDR_EXTN_EMPALONDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���Ȯ��-�������-�󼼸��
     * @param dm SS_L_RDR_EXTN_EMPALONDDM
     * @return SS_L_RDR_EXTN_EMPALONDDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPALONDDataSet selectEmpAlonDetailList(SS_L_RDR_EXTN_EMPALONDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPALONDDataSet ds = (SS_L_RDR_EXTN_EMPALONDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���Ȯ��-�������-����
     * @param dm SS_U_RDR_EXTN_EMPALONDM
     * @return SS_U_RDR_EXTN_EMPALONDataSet
     * @throws AppException
     */
    public SS_U_RDR_EXTN_EMPALONDataSet updateEmpAlon(SS_U_RDR_EXTN_EMPALONDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_EXTN_EMPALONDataSet ds = (SS_U_RDR_EXTN_EMPALONDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���Ȯ��-�۱ݰ���-�ʱ�ȭ��
     * @param dm SS_L_EMPCAMPNODM
     * @return SS_L_EMPCAMPNODataSet
     * @throws AppException
     */
    public SS_L_EMPCAMPNODataSet empRmttInit(SS_L_EMPCAMPNODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���Ȯ��-�۱ݰ���-���
     * @param dm SS_L_RDR_EXTN_EMPRMTTDM
     * @return SS_L_RDR_EXTN_EMPRMTTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPRMTTDataSet selectEmpRmttList(SS_L_RDR_EXTN_EMPRMTTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPRMTTDataSet ds = (SS_L_RDR_EXTN_EMPRMTTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-���Ȯ��-���Ȯ��-�۱� �μ�
     * @param dm SS_L_RDR_EXTN_EMPRMTT_PRINTDM
     * @return SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet printEmpAlonList(SS_L_RDR_EXTN_EMPRMTT_PRINTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet ds = (SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}