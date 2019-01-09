/***************************************************************************************************
 * �Լ���   : PSAllow1301DAO.java
 * ó������ : ����-�������� ȭ���� ��� �̺�Ʈ�� ó��
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
 * ����- ��������
 */
public class PSAllow1301DAO {

    /**
     * ����������� �ʱ�ȭ��
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
     * �������� ��ȸȭ��
     * @param PS_L_ALON_RSLT_BASEDM
     * @return PS_L_ALON_RSLT_BASEDataSet
     */
    public PS_L_ALON_RSLT_BASEDataSet selectRsltList(PS_L_ALON_RSLT_BASEDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_RSLT_BASEDataSet ds = (PS_L_ALON_RSLT_BASEDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� ����
     * @param PS_A_ALONRSLTDM
     * @return PS_A_ALONRSLTDataSet
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