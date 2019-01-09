/***************************************************************************************************
 * �Լ���   : PSBill1201DAO.java
 * ó������ : ����-�ϰ��Ա� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004-03-30
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
 * ����-�ϰ��Ա�
 */
public class PSBill1201DAO {


    /**
     * ���μ������ ��ȸ
     * @param PS_L_BILL_TACOM_GRRCPCMDM
     * @return PS_L_BILL_TACOM_GRRCPCMDataSet
     **/
    public PS_L_BILL_TACOM_GRRCPCMDataSet selectLumprcpmList(PS_L_BILL_TACOM_GRRCPCMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_TACOM_GRRCPCMDataSet ds = (PS_L_BILL_TACOM_GRRCPCMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * ���μ������ �� ��ȸ
     * @param PS_L_TACOD_GRRCPCMDM
     * @return PS_L_TACOD_GRRCPCMDataSet
     **/
    public PS_L_BILL_TACOD_GRRCPCMDataSet selectLumprcpmDetail(PS_L_BILL_TACOD_GRRCPCMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_TACOD_GRRCPCMDataSet ds = (PS_L_BILL_TACOD_GRRCPCMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

}