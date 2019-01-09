/***************************************************************************************************
 * ���ϸ� : SSBrmgr1400DAO.java
 * ��� : �����濵-�μ����� ��û����(�μ����)�� ���� DAO
 * �ۼ����� : 2004-03-18
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
 * �����濵-�μ����� ��û����(�μ����)�� ���� DAO
 */
public class SSBrmgr1400DAO {

    /**
     * �����濵-�μ����� ��û����(�μ����)�� �ʱ�ȭ
     * @param dm SS_L_QTYAPLC_INITDM ��ü
     * @return SS_L_QTYAPLC_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_QTYAPLC_INITDataSet selectInitList(SS_L_QTYAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_INITDataSet ds = (SS_L_QTYAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�μ����� ��û����(�μ����)�� ��ȸ
     * @param dm SS_L_QTYAPLC_VEXCDM ��ü
     * @return SS_L_QTYAPLC_VEXCDataSet ��ü
     * @throws AppException
     */
    public SS_L_QTYAPLC_VEXCDataSet selectQtyaplcVexcList(SS_L_QTYAPLC_VEXCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_VEXCDataSet ds = (SS_L_QTYAPLC_VEXCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�μ����� ��û����(�μ����) ����
     * @param dm SS_A_QTYAPLC_VEXCDM ��ü
     * @return SS_A_QTYAPLC_VEXCDataSet ��ü
     * @throws AppException
     */
	public boolean updateQtyaplcVexc(SS_A_QTYAPLC_VEXCDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_A_QTYAPLC_VEXCDataSet ds = (SS_A_QTYAPLC_VEXCDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}