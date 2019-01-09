/***************************************************************************************************
 * ���ϸ� : SSBrmgr1000DAO.java
 * ��� : �����濵-�����μ���Ȳ ���� DAO
 * �ۼ����� : 2004-03-12
 * �ۼ��� : ����ȫ
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

/**
 * �����濵-�����μ���Ȳ ���� DAO
 */
public class SSBrmgr1000DAO {

    /**
     * �����濵-�����μ���Ȳ �ʱ�ȭ
     * @param dm SS_L_BOSENDPCOND_INITDM ��ü
     * @return SS_L_BOSENDPCOND_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_BOSENDPCOND_INITDataSet selectInitList(SS_L_BOSENDPCOND_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOSENDPCOND_INITDataSet ds = (SS_L_BOSENDPCOND_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�����μ���Ȳ ��ȸ
     * @param dm SS_L_BOSENDPCONDDM ��ü
     * @return SS_L_BOSENDPCONDDataSet ��ü
     * @throws AppException
     */
    public SS_L_BOSENDPCONDDataSet selectBoqtypcondList(SS_L_BOSENDPCONDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOSENDPCONDDataSet ds = (SS_L_BOSENDPCONDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�����μ���Ȳ ��������
     * @param dm SS_P_BOSENDPCONDDM ��ü
     * @return SS_P_BOSENDPCONDDataSet ��ü
     * @throws AppException
     */
    public SS_P_BOSENDPCONDDataSet selectBoqtypcondEXCEL(SS_P_BOSENDPCONDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_BOSENDPCONDDataSet ds = (SS_P_BOSENDPCONDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * �����濵-�����μ���Ȳ ��
     * @param dm SS_P_BOSENDPCONDDM ��ü
     * @return SS_P_BOSENDPCONDDataSet ��ü
     * @throws AppException
     */
    public SL_I_ABCDataSet selectBoqtypcondDetailList(SL_I_ABCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_I_ABCDataSet ds = (SL_I_ABCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
