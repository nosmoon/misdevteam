/***************************************************************************************************
 * ���ϸ�   : PSSupport1201DAO.java
 * ���     : ��������-����ó��
 * �ۼ����� : 2003-11-24
 * �ۼ���   : ���ȣ
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
 * ��������-����ó��
 */
public class PSSupport1201DAO {

    /**
     * �������� �ʱ�
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
     * ��������ó�� �����˻�
     * @param PS_L_DSCTINFODM
     * @return PS_L_DSCTINFODataSet
     */
    public PS_L_DSCT_CATLDataSet selectRdrList(PS_L_DSCT_CATLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DSCT_CATLDataSet ds = (PS_L_DSCT_CATLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� Ȯ�� �� ó�����
     * @param CO_A_DSCTDM
     * @return CO_A_DSCTDataSet
     **/
    public PS_A_DSCTDataSet updateDsct(PS_A_DSCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_DSCTDataSet ds = (PS_A_DSCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� �󼼳�������
     * @param PS_S_DSCT_CATLDM
     * @return PS_S_DSCT_CATLDataSet
     **/
    public PS_S_DSCT_CATLDataSet selectDsctDetail(PS_S_DSCT_CATLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_DSCT_CATLDataSet ds = (PS_S_DSCT_CATLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� Ȯ�� �� �������
     * @param PS_U_DSCTDM
     * @return PS_U_DSCTDataSet
     **/
    public PS_U_DSCTDataSet updateBranchDsct(PS_U_DSCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_DSCTDataSet ds = (PS_U_DSCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}