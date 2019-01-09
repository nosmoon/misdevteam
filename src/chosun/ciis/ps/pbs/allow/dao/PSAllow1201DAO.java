/***************************************************************************************************
 * �Լ���   : PSAllow1201DAO.java
 * ó������ : ����-����������� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004-02-24
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * ����-�����������
 */
public class PSAllow1201DAO {
    public PSAllow1201DAO() {
    }

    /**
     * �������� �ʱ�ȭ��
     * @param PS_S_EMP_ALONDM
     * @return PS_S_EMP_ALONDataSet
     **/
    public PS_S_EMP_ALONDataSet selectCodeList(PS_S_EMP_ALONDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_EMP_ALONDataSet ds = (PS_S_EMP_ALONDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������� ���系�� ��ȸ
     * @param PS_L_ALON_RSLTDM
     * @return PS_L_ALON_RSLTDataSet
     **/
    public PS_L_ALON_RSLTDataSet selectRsltList(PS_L_ALON_RSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_RSLTDataSet ds = (PS_L_ALON_RSLTDataSet) manager.executeCall(
            dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� ����
     * @param PB_A_ALONRSLTDM
     * @return PB_A_ALONRSLTDataSet
     */
    public PS_A_ALONRSLTDataSet accessAlon(PS_A_ALONRSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_ALONRSLTDataSet ds = (PS_A_ALONRSLTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}