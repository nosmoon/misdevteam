/***************************************************************************************************
 * �Լ���   : PSAllow1701DAO.java
 * ó������ : ����-ķ���ΰ��� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 2004-03-14
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * ����-ķ���ΰ���
 */
public class PSAllow1701DAO {
    public PSAllow1701DAO() {
    }

    /**
     * ķ���ΰ��� �ʱ�ȭ��
     * @param PS_S_EMP_ALON_BASEDM
     * @return PS_S_EMP_ALON_BASEDataSet
     */
    public PS_S_EMP_ALON_BASEDataSet selectCodeList(PS_S_EMP_ALON_BASEDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_EMP_ALON_BASEDataSet ds = (PS_S_EMP_ALON_BASEDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ���ΰ��� ����
     * @param PS_I_BO_CMPDM
     * @return PS_I_BO_CMPDataSet
     **/
    public PS_I_BO_CMPDataSet insertCampAlon(PS_I_BO_CMPDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_BO_CMPDataSet ds = (PS_I_BO_CMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ���ΰ��� �˻�
     * @param PS_L_CAMP_SEARCHDM
     * @return PS_L_CAMP_SEARCHDataSet
     **/
    public PS_L_CAMP_SEARCHDataSet selectCampAlon(PS_L_CAMP_SEARCHDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_CAMP_SEARCHDataSet ds = (PS_L_CAMP_SEARCHDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ���ΰ��� ����
     * @param PS_D_CAMP_PTCRDM
     * @return PS_D_CAMP_PTCRDataSet
     **/
    public PS_D_CAMP_PTCRDataSet deleteCampAlon(PS_D_CAMP_PTCRDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_CAMP_PTCRDataSet ds = (PS_D_CAMP_PTCRDataSet) manager.executeCall(
            dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ���ΰ��� ķ���� �󼼳���
     * @param PS_S_CAMPAIGNDM
     * @return PS_S_CAMPAIGNDataSet
     **/
    public PS_S_CAMPAIGNDataSet selectCampaign(PS_S_CAMPAIGNDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_CAMPAIGNDataSet ds = (PS_S_CAMPAIGNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ���ΰ��� ���ķ���� ���� �˻�
     * @param PS_L_EMPCAMP_SEARCHDM
     * @return PS_L_EMPCAMP_SEARCHDataSet
     **/
    public PS_L_EMPCAMP_SEARCHDataSet selectEmpCampaign(PS_L_EMPCAMP_SEARCHDM
        dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_EMPCAMP_SEARCHDataSet ds = (PS_L_EMPCAMP_SEARCHDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ķ���ΰ��� ���ķ���� ���� ���
     * @param PS_A_EMPCAMP_ALONDM
     * @return PS_A_EMPCAMP_ALONDataSet
     **/
    public PS_A_EMPCAMP_ALONDataSet insertEmpCampAlon(PS_A_EMPCAMP_ALONDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_EMPCAMP_ALONDataSet ds = (PS_A_EMPCAMP_ALONDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}