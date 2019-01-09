/***********************************************
 * �Լ���   : PSSend1601DAO.java
 * ó������ : �߼�-�߰��߼�ó�� ���, ��ȸ, ����
 * �ۼ����� : 2004-03-10
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
 * �߼�-�߰��߼�ó�� ó�����α׷��� ���, ��ȸ, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSSend1601DAO {

    /**
     * �߰��߼�ó�� �ڵ���� �ʱ� Combo Box����
     * @param dm PS_S_SEND_LUMP_PROCDM
     * @return PS_S_SEND_LUMP_PROCDataSet
     * @throws AppException
     */
    public PS_S_SEND_LUMP_PROCDataSet selectCombolist(PS_S_SEND_LUMP_PROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �߰��߼�ó�� ����Ʈ ��ȸ
     * @param dm PS_L_SEND_ADDM_PROCDM
     * @return PS_L_SEND_ADDM_PROCDataSet
     * @throws AppException
     */
    public PS_L_SEND_ADDM_PROCDataSet selectList(PS_L_SEND_ADDM_PROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_ADDM_PROCDataSet ds = (PS_L_SEND_ADDM_PROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �߰��߼�ó�� �߼۹���� ����ȸ
     * @param dm PS_L_SEND_ADDM_PROC_DTLSDM
     * @return PS_L_SEND_ADDM_PROC_DTLSDataSet
     * @throws AppException
     */
    public PS_L_SEND_ADDM_PROC_DTLSDataSet selectMthdList(PS_L_SEND_ADDM_PROC_DTLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_ADDM_PROC_DTLSDataSet ds = (PS_L_SEND_ADDM_PROC_DTLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * �߰��߼�ó�� �߼۹���� ����
     * @param dm PS_P_SEND_ADDM_STICKERDM
     * @return PS_P_SEND_ADDM_STICKERDataSet
     * @throws AppException
     */
    public PS_P_SEND_ADDM_STICKERDataSet printAddmSticker(PS_P_SEND_ADDM_STICKERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_SEND_ADDM_STICKERDataSet ds = (PS_P_SEND_ADDM_STICKERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


 }