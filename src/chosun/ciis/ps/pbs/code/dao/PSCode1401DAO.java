/***********************************************
 * �Լ���   : PSCode1401DAO.java
 * ó������ : �ڵ�-���������ڵ� ���, ��ȸ, ����, ����
 * �ۼ����� : 2004-02-20
 * �ۼ���   : ���ȣ
 ***********************************************
 */

package chosun.ciis.ps.pbs.code.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * �ڵ�-���� �����ڵ����α׷��� ���, ��ȸ, ����, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSCode1401DAO {

    /**
     * ���������ڵ���� �ʱ�ȭ�� �����ڵ��� ��ȸ
     * @param dm PS_S_CMPYBO_INTGDM
     * @return PS_S_CMPYBO_INTGDataSet
     * @throws AppException
     */
    public PS_S_CMPYBO_INTGDataSet selectCombolist(PS_S_CMPYBO_INTGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_CMPYBO_INTGDataSet ds = (PS_S_CMPYBO_INTGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���������ڵ� ����Ʈ ��ȸ
     * @param dm PS_L_CMPYBO_INTGDM
     * @return PS_L_CMPYBO_INTGDataSet
     * @throws AppException
     **/
    public PS_L_CMPYBO_INTGDataSet selectCmpybolist(PS_L_CMPYBO_INTGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_CMPYBO_INTGDataSet ds = (PS_L_CMPYBO_INTGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���������ڵ� ����
     * @param dm PS_I_CMPYBO_INTGDM
     * @return boolean
     * @throws AppException
     **/
    public boolean insertCmpybo(PS_I_CMPYBO_INTGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_CMPYBO_INTGDataSet ds = (PS_I_CMPYBO_INTGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }


}
