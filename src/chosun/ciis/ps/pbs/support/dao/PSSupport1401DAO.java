/***************************************************************************************************
 * ���ϸ�   : PSSupport1401DAO.java
 * ���     : ���ݿ����� ��û
 * �ۼ����� : 2005-02-15
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * �������-���ݿ����� ��û
 */
public class PSSupport1401DAO {

    /**
     * ���ݿ����� �ʱ�
     * @param PS_L_DSCT_SPPTDM
     * @return PS_L_DSCT_SPPTDataSet
     */
    public PS_L_DSCT_SPPTDataSet selectCodeList(PS_L_DSCT_SPPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ���ݿ����� �����˻�
     * @param PS_L_CASHRCPTDM
     * @return PS_L_CASHRCPTDataSet
     */
    public PS_L_CASHRCPTDataSet selectCashrcptList(PS_L_CASHRCPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_CASHRCPTDataSet ds = (PS_L_CASHRCPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �̻�ó�� �󼼳�������
     * @param PS_S_CASHRCPTDM
     * @return PS_S_CASHRCPTDataSet
     **/
    public PS_S_CASHRCPTDataSet selectCashrcptDetail(PS_S_CASHRCPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_CASHRCPTDataSet ds = (PS_S_CASHRCPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ݿ����� ��û/���
     * @param CO_A_CASHRCPTRDM
     * @return CO_A_CASHRCPTDataSet
     **/

    public CO_A_CASHRCPTDataSet accessCashrcpt(CO_A_CASHRCPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_CASHRCPTDataSet ds = (CO_A_CASHRCPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}