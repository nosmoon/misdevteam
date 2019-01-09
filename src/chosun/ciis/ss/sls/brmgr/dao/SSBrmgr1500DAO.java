/***************************************************************************************************
 * ���ϸ� : SSBrmgr1500DAO.java
 * ��� : �����濵-������ ����� ��Ȳ�� ���� DAO
 * �ۼ����� : 2004-02-24
 * �ۼ��� : �輺��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �����濵-������ ����� ��Ȳ�� ���� DAO
 */
public class SSBrmgr1500DAO {

    /**
     * �����濵-������ ����� ��Ȳ-�ʱ�ȭ��(�μ���ȸ, ���� ��� ��ȸ, ���� ���� ��ȸ)
     * @param dm SS_L_FCT_FRFT_INITDM ��ü
     * @return SS_L_FCT_FRFT_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_FCT_FRFT_INITDataSet selectCodeList(SS_L_FCT_FRFT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_FCT_FRFT_INITDataSet ds = (SS_L_FCT_FRFT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-������ ����� ��Ȳ-��ȸ ȭ��
     * @param dm SS_L_FCT_FRFT_LISTDM ��ü
     * @return SS_L_FCT_FRFT_LISTDataSet ��ü
     * @throws AppException
     */
    public SS_L_FCT_FRFT_LISTDataSet selectCommList(SS_L_FCT_FRFT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_FCT_FRFT_LISTDataSet ds = (SS_L_FCT_FRFT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �����濵-������ ����� ��Ȳ-��
     * @param dm SS_S_FCT_FRFTDM ��ü
     * @return SS_S_FCT_FRFTDataSet ��ü
     * @throws AppException
     */
    public SS_S_FCT_FRFTDataSet selectFctFrftDetail(SS_S_FCT_FRFTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_FCT_FRFTDataSet ds = (SS_S_FCT_FRFTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    /**
     * �����濵-������ ����� ��Ȳ-�Է� ���� ���� ȭ��
     * @param dm SS_A_FCT_FRFTDM ��ü
     * @return SS_A_FCT_FRFTDataSet ��ü
     * @throws AppException
     */
    public SS_A_FCT_FRFTDataSet accessFctFrft(SS_A_FCT_FRFTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_FCT_FRFTDataSet ds = (SS_A_FCT_FRFTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


}
