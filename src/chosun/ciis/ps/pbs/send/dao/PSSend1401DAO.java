/***********************************************
 * �Լ���   : PSSend1401DAO.java
 * ó������ : �߼�-���Ϲ߼�ó�� ���, ��ȸ, ����
 * �ۼ����� : 2004-03-04
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
 * �߼�-���Ϲ߼�ó�� ó�����α׷��� ���, ��ȸ, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSSend1401DAO {

    /**
     * ���Ϲ߼�ó�� �ڵ���� �ʱ� Combo Box����
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
     * ���Ϲ߼�ó�� ����Ʈ ��ȸ
     * @param dm PS_L_SEND_DD_PROCDM
     * @return PS_L_SEND_DD_PROCDataSet
     * @throws AppException
     */
    public PS_L_SEND_DD_PROCDataSet selectList(PS_L_SEND_DD_PROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_DD_PROCDataSet ds = (PS_L_SEND_DD_PROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���Ϲ߼�ó�� �߼۹���� ����ȸ
     * @param dm PS_L_SEND_DD_PROC_DTLSDM
     * @return PS_L_SEND_DD_PROC_DTLSDataSet
     * @throws AppException
     */
    public PS_L_SEND_DD_PROC_DTLSDataSet selectMthdList(PS_L_SEND_DD_PROC_DTLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_DD_PROC_DTLSDataSet ds = (PS_L_SEND_DD_PROC_DTLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���Ϲ߼�ó�� �߼۹���� ����ȸ
     * @param dm PS_P_SEND_DD_STICKERDM
     * @return PS_P_SEND_DD_STICKERDataSet
     * @throws AppException
     */
    public PS_P_SEND_DD_STICKERDataSet printDdSticker(PS_P_SEND_DD_STICKERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_SEND_DD_STICKERDataSet ds = (PS_P_SEND_DD_STICKERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 }