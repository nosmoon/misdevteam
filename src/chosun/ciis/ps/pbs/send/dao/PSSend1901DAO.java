/***************************************************************************************************
 * ���ϸ�   : PSSend1901DAO.java
 * ���     : �߼�-��������߼� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004/03/11
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.send.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-��������߼�
 */
public class PSSend1901DAO {

    /**
     * ��������߼�ó�� �ڵ���� �ʱ� Combo Box����
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
     * ��������߼� ��� ��ȸ
     * @param dm PS_L_SEND_GIRONORMDM
     * @return PS_L_SEND_GIRONORMDataSet
     * @throws AppException
     */
    public PS_L_SEND_GIRONORMDataSet selectNormsendList(PS_L_SEND_GIRONORMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_GIRONORMDataSet ds = (PS_L_SEND_GIRONORMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }
}