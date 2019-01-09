/***************************************************************************************************
 * �Լ���   : PSAllow1901DAO.java
 * ó������ : ����-���ݼ��� ȭ���� ��� �̺�Ʈ�� ó��
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
 * ����- ���ݼ���
 */
public class PSAllow1901DAO {

    /**
     * ���ݼ��� �ʱ�ȭ��
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
     * ���ݼ��� ��ȸȭ��
     * @param PS_L_ALON_RSLTDM
     * @return PS_L_ALON_RSLTDataSet
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
     * ���ݼ��� ����
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