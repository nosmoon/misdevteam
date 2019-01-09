/***********************************************
 * �Լ���   : PSCode1501DAO.java
 * ó������ : �ڵ�-����������°���
 * �ۼ����� : 2006-11-09
 * �ۼ���   : ����ǥ
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
public class PSCode1501DAO {

    /**
     * ����������°��� �ʱ�ȭ�� �����ڵ��� ��ȸ
     * @param dm PS_L_BOACCTDM
     * @return PS_L_BOACCTDataSet
     * @throws AppException
     */
    public PS_L_BOACCTDataSet selectCombolist(PS_L_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����������°��� ����Ʈ ��ȸ
     * @param dm PS_L_BOACCTDM
     * @return PS_L_BOACCTDataSet
     * @throws AppException
     **/
    public PS_L_BOACCTDataSet selectBoacctlist(PS_L_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����������°��� ����/����/����
     * @param dm PS_A_BOACCTDM
     * @return boolean
     * @throws AppException
     **/
    public boolean accessBoacct(PS_A_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BOACCTDataSet ds = (PS_A_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }
}
