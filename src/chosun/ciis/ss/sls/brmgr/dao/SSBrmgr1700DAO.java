/***************************************************************************************************
 * ���ϸ� : SSBrmgr1700DAO.java
 * ��� : �����濵-�������������� ���� DAO
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
 * �����濵-�������������� ���� DAO
 */
public class SSBrmgr1700DAO {

    /**
     * �����濵-������������-�ʱ�ȭ��
     * @param dm SS_L_RDR_MOVMWORK_INITDM ��ü
     * @return SS_L_RDR_MOVMWORK_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_RDR_MOVMWORK_INITDataSet initRdrMovm(SS_L_RDR_MOVMWORK_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_MOVMWORK_INITDataSet ds = (SS_L_RDR_MOVMWORK_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-������������-���
     * @param dm SS_L_RDR_MOVMWORKDM ��ü
     * @return SS_L_RDR_MOVMWORKDataSet ��ü
     * @throws AppException
     */
    public SS_L_RDR_MOVMWORKDataSet selectRdrMovmList(SS_L_RDR_MOVMWORKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_MOVMWORKDataSet ds = (SS_L_RDR_MOVMWORKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-������������-��
     * @param dm SS_S_RDR_MOVMWORKDM ��ü
     * @return SS_S_RDR_MOVMWORKDataSet ��ü
     * @throws AppException
     */
    public SS_S_RDR_MOVMWORKDataSet selectRdrMovmDetail(SS_S_RDR_MOVMWORKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_MOVMWORKDataSet ds = (SS_S_RDR_MOVMWORKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-������������-���Ȯ��
     * @param dm SS_U_RDR_MOVMWORKDM ��ü
     * @return SS_U_RDR_MOVMWORKDataSet ��ü
     * @throws AppException
     */
    public SS_U_RDR_MOVMWORKDataSet updateRdrMovm(SS_U_RDR_MOVMWORKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_MOVMWORKDataSet ds = (SS_U_RDR_MOVMWORKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}