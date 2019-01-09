/***************************************************************************************************
 * ���ϸ�   : PSSend1801DAO.java
 * ���     : �߼�-���ʽ��Ϲ߼� �߼�ó�� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004-02-24
 * �ۼ���   : ���ȣ
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
 * �߼�-���ʽ��Ϲ߼� �߼�ó��
 */
public class PSSend1801DAO {

    /**
     * ���ʽ��Ϲ߼� Ȯ��ó�� �ʱ�ȭ��
     * @param PS_S_SEND_BNSBKDM
     * @return PS_S_SEND_BNSBKDataSet
     */
    public PS_S_SEND_BNSBKDataSet selectCodeList(PS_S_SEND_BNSBKDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_BNSBKDataSet ds = (PS_S_SEND_BNSBKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ʽ��Ϲ߼� �߼�ó�� ��ȸȭ��
     * @param PS_L_SEND_BNSBK_CONDM
     * @return PS_L_SEND_BNSBK_CONDataSet
     **/
    public PS_L_SEND_BNSBK_CONDataSet selectBnsbkList(PS_L_SEND_BNSBK_CONDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_BNSBK_CONDataSet ds = (PS_L_SEND_BNSBK_CONDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ʽ��Ϲ߼� �߼�ó�� �󼼳��� ��ȸȭ��
     * @param dm PS_L_SEND_BNSBK_CON_DTLDM
     * @return PS_L_SEND_BNSBK_CON_DTLDataSet
     * @throws AppException
     **/
    public PS_L_SEND_BNSBK_CON_DTLDataSet selectBnsbkDetail(PS_L_SEND_BNSBK_CON_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_BNSBK_CON_DTLDataSet ds = (PS_L_SEND_BNSBK_CON_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return ds;
        }
    }

    /**
     * ���ʽ��Ϲ߼� �߼�ó�� ����
     * @param dm PS_P_SEND_BNSBK_STICKERDM
     * @return PS_P_SEND_BNSBK_STICKERDataSet
     * @throws AppException
     **/
    public PS_P_SEND_BNSBK_STICKERDataSet printBnsbkSticker(PS_P_SEND_BNSBK_STICKERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_SEND_BNSBK_STICKERDataSet ds = (PS_P_SEND_BNSBK_STICKERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return ds;
        }
    }
}
