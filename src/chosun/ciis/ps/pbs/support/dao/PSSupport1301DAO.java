/***************************************************************************************************
 * ���ϸ�   : PSSupport1301DAO.java
 * ���     : ��������-�̻�ó��
 * �ۼ����� : 2005-02-15
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * ��������-�̻�ó��
 */
public class PSSupport1301DAO {

    /**
     * �̻�ó�� �����˻�
     * @param PS_L_MOVM_RDRDM
     * @return PS_L_MOVM_RDRDataSet
     */
    public PS_L_MOVM_RDRDataSet selectMoveList(PS_L_MOVM_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_MOVM_RDRDataSet ds = (PS_L_MOVM_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �̻�ó�� �󼼳�������
     * @param PS_S_MOVM_RDRDM
     * @return PS_S_MOVM_RDRDataSet
     **/
    public PS_S_MOVM_RDRDataSet selectMoveDetail(PS_S_MOVM_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_MOVM_RDRDataSet ds = (PS_S_MOVM_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �̻�ó�� �������
     * @param PS_U_MOVM_RDRDM
     * @return PS_U_MOVM_RDRDataSet
     **/

    public PS_U_MOVM_RDRDataSet updateBranchMove(PS_U_MOVM_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_MOVM_RDRDataSet ds = (PS_U_MOVM_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}