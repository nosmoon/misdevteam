/***************************************************************************************************
 * �Լ���   : PSAllow2101DAO.java
 * ó������ : ����-�μ�Ƽ����� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2007-11-22
 * �ۼ���   : ������
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
 * ����- �μ�Ƽ�����
 */
public class PSAllow2101DAO {

    /**
     * �μ�Ƽ����� �ʱ�ȭ��
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
     * �μ�Ƽ����� ��ȸȭ��
     * @param PS_L_ALON_RSLTDM
     * @return PS_L_ALON_RSLTDataSet
     */
    public PS_L_ALON_PRSLTDataSet selectRsltList(PS_L_ALON_PRSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_PRSLTDataSet ds = (PS_L_ALON_PRSLTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �μ�Ƽ����� ����
     * @param PS_A_ALONRSLTDM
     * @return PS_A_ALONRSLTDataSet
     */
    public PS_A_ALONPRSNTDataSet accessAlon(PS_A_ALONPRSNTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_ALONPRSNTDataSet ds = (PS_A_ALONPRSNTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}