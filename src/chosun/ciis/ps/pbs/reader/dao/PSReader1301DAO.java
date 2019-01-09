/***************************************************************************************************
 * ���ϸ�   : PSReader1301DAO.java
 * ���     : ����-�����û ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004-02-24
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-�����û
 */
public class PSReader1301DAO {

    /**
     * �����û �ʱ�ȭ��
     * @param PS_S_RDR_ARBTDM
     * @return PS_S_RDR_ARBTDataSet
     */
    public PS_S_RDR_ARBTDataSet selectCodeList(PS_S_RDR_ARBTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_RDR_ARBTDataSet ds = (PS_S_RDR_ARBTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����û ��ȸȭ��
     * @param PS_L_RDR_ARBTDM
     * @return PS_L_RDR_ARBTDataSet
     **/
    public PS_L_RDR_ARBTDataSet selectArbtList(PS_L_RDR_ARBTDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_RDR_ARBTDataSet ds = (PS_L_RDR_ARBTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * �����û ����ó��
     * @param dm PS_U_RDR_ARBTDM
     * @return boolean
     * @throws AppException
     **/
    public boolean updateArbt(PS_U_RDR_ARBTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_RDR_ARBTDataSet ds = (PS_U_RDR_ARBTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }
    /**
     * �����û �񱳴���� ��ȸȭ��
     * @param PS_L_ARBT_CMPROBJDM
     * @return PS_L_ARBT_CMPROBJDataSet
     **/
    public PS_L_ARBT_CMPROBJDataSet selectArbtCmprobjList(PS_L_ARBT_CMPROBJDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_ARBT_CMPROBJDataSet ds = (PS_L_ARBT_CMPROBJDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * �����û �񱳴���� �󼼳��� ��ȸȭ��
     * @param PS_S_RDR_CMPROBJDM
     * @return PS_S_RDR_CMPROBJDataSet
     **/
    public PS_S_RDR_CMPROBJDataSet selectCmprobjDetail(PS_S_RDR_CMPROBJDM  dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_RDR_CMPROBJDataSet ds = (PS_S_RDR_CMPROBJDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


}
