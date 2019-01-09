/***********************************************
 * �Լ���   : PSSend2301DAO.java
 * ó������ : �߼�-�����߼�
 * �ۼ����� : 2004-03-02
 * �ۼ���   : ����ǥ
 ***********************************************
 */

package chosun.ciis.ps.pbs.send.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-�����߼�ó�� ó�����α׷��� ���, ��ȸ, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSSend2301DAO {

    /**
     * �����߼�ó�� �ڵ���� �ʱ� Combo Box����
     * @param dm PS_S_BO_SEND_INITDM
     * @return PS_S_BO_SEND_INITDataSet
     * @throws AppException
     */
    public PS_S_BO_SEND_INITDataSet selectCombolist(PS_S_BO_SEND_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_BO_SEND_INITDataSet ds = (PS_S_BO_SEND_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼�ó�� ����Ʈ ��ȸ
     * @param dm PS_L_SEND_PBLMEDISENDBODM
     * @return PS_L_SEND_PBLMEDISENDBODataSet
     * @throws AppException
     */
    public PS_L_SEND_PBLMEDISENDBODataSet selectList(PS_L_SEND_PBLMEDISENDBODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_PBLMEDISENDBODataSet ds = (PS_L_SEND_PBLMEDISENDBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼�ó�� ������ ����ȸ
     * @param dm PS_L_BOSEND_LUMPDM
     * @return PS_L_BOSEND_LUMPDataSet
     * @throws AppException
     */
    public PS_L_BOSEND_LUMPDataSet selectBoList(PS_L_BOSEND_LUMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BOSEND_LUMPDataSet ds = (PS_L_BOSEND_LUMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼�ó�� ��� ����
     * @param dm PS_P_SEND_PBLMEDISENDBODataSet
     * @return PS_P_SEND_PBLMEDISENDBODM
     * @throws AppException
     */
    public PS_P_SEND_PBLMEDISENDBODataSet printSticker(PS_P_SEND_PBLMEDISENDBODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_SEND_PBLMEDISENDBODataSet ds = (PS_P_SEND_PBLMEDISENDBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼۵��� ����Ʈ ��ȸ
     * @param dm PS_L_BO_SEND_LISTDM
     * @return PS_L_BO_SEND_LISTDataSet
     * @throws AppException
     */
    public PS_L_BO_SEND_LISTDataSet selectSendBoList(PS_L_BO_SEND_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BO_SEND_LISTDataSet ds = (PS_L_BO_SEND_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����߼۵��� ����Ʈ ��ȸ
     * @param dm PS_P_BO_SEND_LISTDM
     * @return PS_P_BO_SEND_LISTDataSet
     * @throws AppException
     */
    public PS_P_BO_SEND_LISTDataSet selectSendBoPrint(PS_P_BO_SEND_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_BO_SEND_LISTDataSet ds = (PS_P_BO_SEND_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

 }
