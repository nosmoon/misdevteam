/***************************************************************************************************
 * ���ϸ� : SSBrmgr1300DAO.java
 * ��� : �����濵-�μ����� ������û,��û(�μ����)�� ���� DAO
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
 * �����濵-�μ����� ������û,��û(����)�� ���� DAO
 */
public class SSBrmgr1300DAO {

    /**
     * �����濵-�μ����� ������û,��û(����)-�ʱ�ȭ
     * @param dm SS_L_QTYAPLC_INITDM
     * @return SS_L_QTYAPLC_INITDataSet
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
     * �����濵-�μ����� ������û(����)-��ȸ
     * @param dm SS_L_QTYAPLC_MAIN_NWSPDM
     * @return SS_L_QTYAPLC_MAIN_NWSPDataSet
     * @throws AppException
     */
    public SS_L_QTYAPLC_MAIN_NWSPDataSet selectQtyaplcMainNwspList(SS_L_QTYAPLC_MAIN_NWSPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_MAIN_NWSPDataSet ds = (SS_L_QTYAPLC_MAIN_NWSPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�μ����� ������û(����) ����
     * @param dm SS_U_QTYAPLC_MAIN_NWSP_CLOSDM
     * @return SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet
     * @throws AppException
     */
	public boolean updateQtyaplcMainNwspClos(SS_U_QTYAPLC_MAIN_NWSP_CLOSDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet ds = (SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

    /**
     * �����濵-�μ����� ��û(����)-��ȸ
     * @param dm SS_L_QTYAPLCDM
     * @return SS_L_QTYAPLCDataSet
     * @throws AppException
     */
    public SS_L_QTYAPLCDataSet selectQtyaplcList(SS_L_QTYAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLCDataSet ds = (SS_L_QTYAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�μ����� ��û(����)-����
     * @param dm SS_U_QTYAPLC_CLOSDM
     * @return SS_U_QTYAPLC_CLOSDataSet
     * @throws AppException
     */
	public boolean updateQtyaplcClos(SS_U_QTYAPLC_CLOSDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_QTYAPLC_CLOSDataSet ds = (SS_U_QTYAPLC_CLOSDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}