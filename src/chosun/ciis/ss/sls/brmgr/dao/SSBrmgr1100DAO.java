/***************************************************************************************************
 * ���ϸ� : SSBrmgr1100DAO.java
 * ��� : �����濵-���ϸ�����Ȳ ���� DAO
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
 * �����濵-���ϸ�����Ȳ ���� DAO
 */
public class SSBrmgr1100DAO {

    /**
     * �����濵-���ϸ�����Ȳ �ʱ�ȭ
     * @param dm SS_L_MIGLLMMTCLOS_INITDM ��ü
     * @return SS_L_MIGLLMMTCLOS_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_MIGLLMMTCLOS_INITDataSet selectInitList(SS_L_MIGLLMMTCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGLLMMTCLOS_INITDataSet ds = (SS_L_MIGLLMMTCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-���ϸ�����Ȳ ��ȸ
     * @param dm SS_L_MIGLLMMTCLOSDM ��ü
     * @return SS_L_MIGLLMMTCLOSDataSet ��ü
     * @throws AppException
     */
    public SS_L_MIGLLMMTCLOSDataSet selectMigllmmtclosList(SS_L_MIGLLMMTCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGLLMMTCLOSDataSet ds = (SS_L_MIGLLMMTCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �����濵-���ϸ�����Ȳ ��
     * @param dm SS_L_MILGPAYDM ��ü
     * @return SS_L_MILGPAYDataSet ��ü
     * @throws AppException
     */
    public SS_L_MILGPAYDataSet selectMilgpayDetail(SS_L_MILGPAYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MILGPAYDataSet ds = (SS_L_MILGPAYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}