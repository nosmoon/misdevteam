/***************************************************************************************************
 * ���ϸ�   : PSSend2001DAO.java
 * ���     : �߼�-�����߰��߼� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2003-11-18
 * �ۼ���   : ���ȯ
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
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-�����߰��߼�
 */
public class PSSend2001DAO {

    /**
     * �����߰��߼�ó�� �ڵ���� �ʱ� Combo Box����
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
     * �����߰��߼� ����Ʈ ��ȸ
     * @param dm PS_L_SEND_GIROADDMDM
     * @return PS_L_SEND_GIROADDMDataSet
     * @throws AppException
     */
    public PS_L_SEND_GIROADDMDataSet selectList(PS_L_SEND_GIROADDMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_GIROADDMDataSet ds = (PS_L_SEND_GIROADDMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߰��߼� ������ ���/����
     * @param dm PS_A_SEND_GIROADDMDM
     * @return boolean
     * @throws AppException
     */
    public boolean aceessGiroaddmsend(PS_A_SEND_GIROADDMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_A_SEND_GIROADDMDataSet ds = (PS_A_SEND_GIROADDMDataSet) manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }else{
          return true;
        }
    }

    /**
     * �����߰��߼� ����
     * @param dm PS_D_SEND_GIROADDMDM
     * @return boolean
     * @throws AppException
     */
    public boolean deleteList(PS_D_SEND_GIROADDMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_D_SEND_GIROADDMDataSet ds = (PS_D_SEND_GIROADDMDataSet) manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }else{
            return true;
        }
    }

}