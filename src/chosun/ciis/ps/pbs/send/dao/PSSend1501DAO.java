/***********************************************
 * �Լ���   : PSSend1501DAO.java
 * ó������ : �߼�-�߰��߼�Ȯ�� ���, ��ȸ, ����
 * �ۼ����� : 2004-03-08
 * �ۼ���   : ���ȯ
 ***********************************************
 */

package chosun.ciis.ps.pbs.send.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-�߰��߼�Ȯ�� ó�����α׷��� ���, ��ȸ, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSSend1501DAO {

    /**
     * �߰��߼�Ȯ�� �ڵ���� �ʱ� Combo Box����
     * @param dm PS_S_SEND_LUMP_CNFMDM
     * @return PS_S_SEND_LUMP_CNFMDataSet
     * @throws AppException
     */
    public PS_S_SEND_LUMP_CNFMDataSet selectCombolist(PS_S_SEND_LUMP_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �߰��߼�Ȯ�� ����Ʈ ��ȸ
     * @param dm PS_L_SEND_ADDM_CNFMDM
     * @return PS_L_SEND_ADDM_CNFMDataSet
     * @throws AppException
     */
    public PS_L_SEND_ADDM_CNFMDataSet selectList(PS_L_SEND_ADDM_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_ADDM_CNFMDataSet ds = (PS_L_SEND_ADDM_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �߰��߼�Ȯ�� �߼۹���� ����ȸ
     * @param dm PS_L_SEND_ADDM_MTHD_DTLSDM
     * @return PS_L_SEND_ADDM_MTHD_DTLSDataSet
     * @throws AppException
     */
    public PS_L_SEND_ADDM_MTHD_DTLSDataSet selectMthdList(PS_L_SEND_ADDM_MTHD_DTLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_ADDM_MTHD_DTLSDataSet ds = (PS_L_SEND_ADDM_MTHD_DTLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �߰��߼�Ȯ�� ó��
     * @param dm PS_U_SEND_ADDM_CNFMDM
     * @return boolean
     * @throws AppException
     */
    public boolean updateSendcnfm(PS_U_SEND_ADDM_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_SEND_ADDM_CNFMDataSet ds = (PS_U_SEND_ADDM_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}