/***************************************************************************************************
 * �Լ���   : PSBill1901DAO.java
 * ó������ : ����-�ڵ���üû�������� �޴��� �����ͺ��̽����� �޼ҵ�
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
 * �ڵ���üû�������� ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSBill1901DAO {

    /**
     * �ڵ���üû��������
     * @param dm PS_L_SHFT_CLAM_SSUMDM
     * @return PS_L_SHFT_CLAM_SSUMDataSet
     * @throws AppException
     */
    public PS_L_SHFT_CLAM_SSUMDataSet selectClamSsum(PS_L_SHFT_CLAM_SSUMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SHFT_CLAM_SSUMDataSet ds = (PS_L_SHFT_CLAM_SSUMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ڵ���üû�����
     * @param dm PS_L_SHFT_CLAM_OCOMDM
     * @return PS_L_SHFT_CLAM_OCOMDataSet
     * @throws AppException
     */
    public PS_L_SHFT_CLAM_OCOMDataSet selectClamOcomList(PS_L_SHFT_CLAM_OCOMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SHFT_CLAM_OCOMDataSet ds = (PS_L_SHFT_CLAM_OCOMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
