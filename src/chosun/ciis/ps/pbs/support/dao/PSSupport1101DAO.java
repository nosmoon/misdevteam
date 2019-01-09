/***************************************************************************************************
 * ���ϸ�   : PSSupport1101DAO.java
 * ���     : ��������-������
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
 * ��������-������
 */
public class PSSupport1101DAO {

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
     * �������� ���ڰ˻�
     * @param PS_L_DSCTINFODM
     * @return PS_L_DSCTINFODataSet
     */
    public PS_L_DSCTINFODataSet selectRdrList(PS_L_DSCTINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DSCTINFODataSet ds = (PS_L_DSCTINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� ���
     * @param PS_I_DSCTDM
     * @return PS_I_DSCTDataSet
     */
    public PS_I_DSCTDataSet insertDsct(PS_I_DSCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_DSCTDataSet ds = (PS_I_DSCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}