/***************************************************************************************************
 * ���ϸ�   : PSSend1701DAO.java
 * ���     : �߼�-���ʽ��Ϲ߼� Ȯ��ó�� ȭ���� ��� �̺�Ʈ�� ó��
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
 * �߼�-���ʽ��Ϲ߼� Ȯ��ó��
 */
public class PSSend1701DAO {

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
     * ���ʽ��Ϲ߼� Ȯ��ó�� ��ȸȭ��
     * @param PS_L_SEND_BNSBKDM
     * @return PS_L_SEND_BNSBKDataSet
     **/
    public PS_L_SEND_BNSBKDataSet selectBnsbkList(PS_L_SEND_BNSBKDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_BNSBKDataSet ds = (PS_L_SEND_BNSBKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * ���ʽ��Ϲ߼� Ȯ��ó�� �󼼳��� ��ȸȭ��
     * @param dm PS_L_SEND_BNSBK_DTLDM
     * @return PS_L_SEND_BNSBK_DTLDataSet
     * @throws AppException
     **/
    public PS_L_SEND_BNSBK_DTLDataSet selectBnsbkDetail(PS_L_SEND_BNSBK_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_BNSBK_DTLDataSet ds = (PS_L_SEND_BNSBK_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return ds;
        }
    }

    /**
     * ���ʽ��Ϲ߼� Ȯ��ó�� ����ó��
     * @param dm PS_U_SEND_BNSBKDM
     * @return boolean
     * @throws AppException
     **/
    public boolean updateBnsbk(PS_U_SEND_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_SEND_BNSBKDataSet ds = (PS_U_SEND_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}
