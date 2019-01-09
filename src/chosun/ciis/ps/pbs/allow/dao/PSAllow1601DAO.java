/***************************************************************************************************
 * �Լ���   : PSAllow1601DAO.java
 * ó������ : ����-��ټ��� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004-03-09
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
 * ����- ��ټ���
 */
public class PSAllow1601DAO {

    /**
     * ��ټ��� �ʱ�ȭ��
     * @param PS_S_EMP_ALON_BASEDM
     * @return PS_S_EMP_ALON_BASEDataSet
     */
    public PS_S_EMP_ALON_BASEDataSet selectCodeList(PS_S_EMP_ALON_BASEDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_EMP_ALON_BASEDataSet ds = (PS_S_EMP_ALON_BASEDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ټ��� ��ȸȭ��
     * @param PS_L_ALON_PRSLTDM
     * @return PS_L_ALON_PRSLTDataSet
     */
    public PS_L_ALON_PRSLTDataSet selectRsltList(PS_L_ALON_PRSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_PRSLTDataSet ds = (PS_L_ALON_PRSLTDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ټ��� ����
     * @param PS_A_ALONPRSNTDM
     * @return PS_A_ALONPRSNTDataSet
     */
    public PS_A_ALONPRSNTDataSet accessAlon(PS_A_ALONPRSNTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_ALONPRSNTDataSet ds = (PS_A_ALONPRSNTDataSet) manager.executeCall(
            dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}