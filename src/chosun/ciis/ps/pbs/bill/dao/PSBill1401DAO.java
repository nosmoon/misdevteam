/***************************************************************************************************
 * �Լ���   : PSBill1401DAO.java
 * ó������ : ����-�ʰ��Ա� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2003-11-18
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.bill.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.dao.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * ����-�ʰ��Ա�
 */
public class PSBill1401DAO {

    /**
     * �ʰ��Ա�ó�� �ʱ�ȭ�� �����ڵ��� ��ȸ
     * @param dm PS_C_EXCSRCPMPROCDM
     * @return PS_C_EXCSRCPMPROCDataSet
     * @throws AppException
     */
    public PS_C_EXCSRCPMPROCDataSet selectCombolist(PS_C_EXCSRCPMPROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_C_EXCSRCPMPROCDataSet ds = (PS_C_EXCSRCPMPROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ʰ��Ա�ó�� ����Ʈ ��ȸ
     * @param dm PS_L_BILL_EXCSRCPMPROCDM
     * @return PS_L_BILL_EXCSRCPMPROCDataSet
     * @throws AppException
     **/
    public PS_L_BILL_EXCSRCPMPROCDataSet selectList(PS_L_BILL_EXCSRCPMPROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_EXCSRCPMPROCDataSet ds = (PS_L_BILL_EXCSRCPMPROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ʰ��Ա�ó�� ������ ���
     * @param dm PS_A_BILL_EXCSRCPMPROCDM
     * @return boolean
     * @throws AppException
     **/
    public boolean aceessExcsamt(PS_A_BILL_EXCSRCPMPROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BILL_EXCSRCPMPROCDataSet ds = (PS_A_BILL_EXCSRCPMPROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * �ʰ��Ա�ó�� ���� �������� �˻�
     * @param dm PB_S_RDRINFO_PARTDM
     * @return PB_S_RDRINFO_PARTDataSet
     * @throws AppException
     */
    public PB_S_RDRINFO_PARTDataSet selectRdrinfoPart(PB_S_RDRINFO_PARTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PB_S_RDRINFO_PARTDataSet ds = (PB_S_RDRINFO_PARTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}