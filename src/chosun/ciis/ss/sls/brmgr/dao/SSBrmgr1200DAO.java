/***************************************************************************************************
 * ���ϸ� : SSBrmgr1200DAO.java
 * ��� : �����濵-�μ����� ������û,��û(���)�� ���� DAO
 * �ۼ����� : 2004-03-18
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
* �������� : ���縦 ���� ����ID, �������� �μ���Ȳ �������� �߰�.
* ������ :   Ȳ����
* �������� : 2009.4.30
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;

/**
 * �����濵-�μ����� ������û,��û(���)�� ���� DAO
 */
public class SSBrmgr1200DAO {

    /**
     * �����濵-�μ����� ������û,��û(���)�� �ʱ�ȭ
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
     * �����濵-�μ����� ������û(���)�� ��ȸ
     * @param dm SS_L_QTYAPLC_MAIN_NWSPDM ��ü
     * @return SS_L_QTYAPLC_MAIN_NWSPDataSet ��ü
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
     * �����濵-�μ����� ������û(���) ����
     * @param dm SS_U_QTYAPLC_MAIN_NWSPDM ��ü
     * @return SS_U_QTYAPLC_MAIN_NWSPDataSet ��ü
     * @throws AppException
     */
	public boolean updateQtyaplcMainNwsp(SS_U_QTYAPLC_MAIN_NWSPDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_QTYAPLC_MAIN_NWSPDataSet ds = (SS_U_QTYAPLC_MAIN_NWSPDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

    /**
     * �����濵-�μ����� ������û(���) �����ڵ� ��ȸ
     * @param dm SS_L_QTYAPLC_DOCIDDM ��ü
     * @return SS_L_QTYAPLC_DOCIDDataSet ��ü
     * @throws AppException
     */
	public SS_L_QTYAPLC_DOCIDDataSet selectQtyaplcDocID(SS_L_QTYAPLC_DOCIDDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_L_QTYAPLC_DOCIDDataSet ds = (SS_L_QTYAPLC_DOCIDDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
     * �����濵-�μ����� ������û(���) �������� �μ���Ȳ ��ȸ
     * @param dm SS_L_QTYAPLC_ILGYEDM ��ü
	 * @return SS_L_QTYAPLC_ILGYEDataSet ��ü
     * @throws AppException
     */
	public SS_L_QTYAPLC_ILGYEDataSet selectQtyaplcIlgye(SS_L_QTYAPLC_ILGYEDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_L_QTYAPLC_ILGYEDataSet ds = (SS_L_QTYAPLC_ILGYEDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
    /**
     * �����濵-�μ����� ������û(����)-�μ�
     * @param dm SS_L_QTYAPLC_MAINNWSP_PRINTDM
     * @return SS_L_QTYAPLC_MAINNWSP_PRINTDataSet
     * @throws AppException
     */
     public SS_L_QTYAPLC_MAINNWSP_PRINTDataSet printQtyaplcMainNwspClosList(SS_L_QTYAPLC_MAINNWSP_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_MAINNWSP_PRINTDataSet ds = (SS_L_QTYAPLC_MAINNWSP_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�μ����� ��û(���)�� ��ȸ
     * @param dm SS_L_QTYAPLCDM ��ü
     * @return SS_L_QTYAPLCDataSet ��ü
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
     * �����濵-�μ����� ��û(���) ����
     * @param dm SS_U_QTYAPLCDM ��ü
     * @return SS_U_QTYAPLCDataSet ��ü
     * @throws AppException
     */
	public boolean updateQtyaplc(SS_U_QTYAPLCDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_QTYAPLCDataSet ds = (SS_U_QTYAPLCDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}