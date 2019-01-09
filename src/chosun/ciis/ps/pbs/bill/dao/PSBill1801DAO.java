/***************************************************************************************************
 * �Լ���   : PSBill1801DAO.java
 * ó������ : ����-�ڵ���üû��������ϰ˻� �޴��� �����ͺ��̽����� �޼ҵ�
 * �ۼ����� : 2006-04-14
 * �ۼ���   : ����ǥ
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
 * �ڵ���üû��������ϰ˻� ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSBill1801DAO {

    /**
     * �ڵ���üû��������ϰ˻�
     * @param dm PS_L_SHFT_CLAM_PLANDM
     * @return PS_L_SHFT_CLAM_PLANDataSet
     * @throws AppException
     */
    public PS_L_SHFT_CLAM_PLANDataSet selectPlanList(PS_L_SHFT_CLAM_PLANDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SHFT_CLAM_PLANDataSet ds = (PS_L_SHFT_CLAM_PLANDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
