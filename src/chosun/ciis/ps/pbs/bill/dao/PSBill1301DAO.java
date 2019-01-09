/***************************************************************************************************
 * �Լ���   : PSBill1301DAO.java
 * ó������ : ����-�������Ա� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2003-12-12
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

import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * ����-�������Ա�
 */
public class PSBill1301DAO {

    /**
     * ���� ������ �Ա� �ʱ�ȭ��
     * @param PS_S_ABNOR_SEPBKDM
     * @return PS_S_ABNOR_SEPBKDataSet
     */

    public PS_S_ABNOR_SEPBKDataSet selectCodeList(PS_S_ABNOR_SEPBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_ABNOR_SEPBKDataSet ds = (PS_S_ABNOR_SEPBKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * ���� ������ �Ա� ��ȸȭ��
     * @param PS_L_BILL_NONRCPMDM
     * @return PS_L_BILL_NONRCPMDataSet
     **/

    public PS_L_BILL_NONRCPMDataSet selectNonrcpmList(PS_L_BILL_NONRCPMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_NONRCPMDataSet ds = (PS_L_BILL_NONRCPMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * ���μ������ ����ó��
     * @param PS_A_BILL_NONRCPMDM
     * @return boolean
     **/
    public boolean accessNonrcpm(PS_A_BILL_NONRCPMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BILL_NONRCPMDataSet ds = (PS_A_BILL_NONRCPMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException (ds.errcode,ds.errmsg);
        }
        return true;
    }

}
