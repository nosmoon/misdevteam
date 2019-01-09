/***************************************************************************************************
 * �Լ���   : PSBill1101DAO.java
 * ó������ : ����-�����Ա� ȭ���� ��� �̺�Ʈ�� ó��
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
 * ����-�����Ա�
 */
public class PSBill1101DAO {

    /**
     * �����ڵ� ��ȸ
     * @param PS_S_BILL_SEPRDM
     * @return PS_S_BILL_SEPRDataSet
     */
    public PS_S_BILL_SEPRDataSet selectCodeList(PS_S_BILL_SEPRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_BILL_SEPRDataSet ds = (PS_S_BILL_SEPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����Աݳ��� ��ȸ
     * @param PS_L_BILL_SEPRDM
     * @return PS_L_BILL_SEPRDataSet
     **/
    public PS_L_BILL_SEPRDataSet selectSeprrecpList(PS_L_BILL_SEPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_SEPRDataSet ds = (PS_L_BILL_SEPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * �����Աݳ��� ó��
     * @param PS_A_BILL_SEPRDM
     * @return PS_A_BILL_SEPRDataSet
     **/
    public boolean accessSeprrcpm(PS_A_BILL_SEPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BILL_SEPRDataSet ds = (PS_A_BILL_SEPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return true;
    }

}