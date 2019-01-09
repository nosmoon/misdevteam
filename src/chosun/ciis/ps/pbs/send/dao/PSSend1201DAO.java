/***********************************************
 * �Լ���   : PSSend1201DAO.java
 * ó������ : �߼�-�ϰ��߼�ó�� ���, ��ȸ, ����
 * �ۼ����� : 2004-03-02
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
 * �߼�-�ϰ��߼�ó�� ó�����α׷��� ���, ��ȸ, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSSend1201DAO {

    /**
     * �ϰ��߼�ó�� �ڵ���� �ʱ� Combo Box����
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
     * �ϰ��߼�ó�� ����Ʈ ��ȸ
     * @param dm PS_L_SEND_LUMP_PROCDM
     * @return PS_L_SEND_LUMP_PROCDataSet
     * @throws AppException
     */
    public PS_L_SEND_LUMP_PROCDataSet selectList(PS_L_SEND_LUMP_PROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_LUMP_PROCDataSet ds = (PS_L_SEND_LUMP_PROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ϰ��߼�ó�� �߼۹���� ����ȸ
     * @param dm PS_L_SEND_LUMP_PROC_DTLSDM
     * @return PS_L_SEND_LUMP_PROC_DTLSDataSet
     * @throws AppException
     */
    public PS_L_SEND_LUMP_PROC_DTLSDataSet selectMthdList(PS_L_SEND_LUMP_PROC_DTLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_LUMP_PROC_DTLSDataSet ds = (PS_L_SEND_LUMP_PROC_DTLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ϰ��߼�ó�� ��� ����
     * @param dm PS_P_SEND_LUMP_STICKERDataSet
     * @return PS_P_SEND_LUMP_STICKERDM
     * @throws AppException
     */
    public PS_P_SEND_LUMP_STICKERDataSet printLumpSticker(PS_P_SEND_LUMP_STICKERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_SEND_LUMP_STICKERDataSet ds = (PS_P_SEND_LUMP_STICKERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

 }