/***********************************************
 * �Լ���   : PSCode1301DAO.java
 * ó������ : �ڵ�-���ʽ��� ���, ��ȸ, ����, ����
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
 * �ڵ�-���ʽ���ó�����α׷��� ���, ��ȸ, ����, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSCode1301DAO {

    /**
     * ���ʽ��� �ʱ�ȭ�� �����ڵ��� ��ȸ
     * @param dm PS_C_EXCSRCPMPROCDM
     * @return PS_C_EXCSRCPMPROCDataSet
     * @throws AppException
     */
    public PS_S_BNSBK_CDDataSet selectCodelist(PS_S_BNSBK_CDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_BNSBK_CDDataSet ds = (PS_S_BNSBK_CDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ʽ��� ����Ʈ ��ȸ
     * @param dm PS_L_BNSBKDM
     * @return PS_L_BNSBKDataSet
     * @throws AppException
     **/
    public PS_L_BNSBKDataSet selectBnsbklist(PS_L_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BNSBKDataSet ds = (PS_L_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ʽ��� ���
     * @param dm PS_I_BNSBKDM
     * @return boolean
     * @throws AppException
     **/
    public boolean insertBnsbk(PS_I_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_BNSBKDataSet ds = (PS_I_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * ���ʽ��� ����
     * @param dm PS_U_BNSBKDM
     * @return boolean
     * @throws AppException
     **/
    public boolean updateBnsbk(PS_U_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_BNSBKDataSet ds = (PS_U_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * ���ʽ��� ����
     * @param dm PS_D_BNSBKDM
     * @return boolean
     * @throws AppException
     **/
    public boolean deleteBnsbk(PS_D_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_BNSBKDataSet ds = (PS_D_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}
