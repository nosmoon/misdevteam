/***************************************************************************************************
 * �Լ���   : PSBill1701DAO.java
 * ó������ : ����-�ڵ���ü��û���� �޴��� �����ͺ��̽����� �޼ҵ�
 * �ۼ����� : 2006-04-14
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.bill.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.dao.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * �ڵ���ü��û���� ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSBill1701DAO {

    /**
     * �ڵ���ü��û �����ȸȭ�� �ʱ�ȭ
     * @param dm PS_L_AUTO_SHIFT_APLC_INITDM
     * @return PS_L_AUTO_SHIFT_APLC_INITDataSet
     * @throws AppException
     */
    public PS_L_AUTO_SHIFT_APLC_INITDataSet selectCodeList(PS_L_AUTO_SHIFT_APLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_AUTO_SHIFT_APLC_INITDataSet ds = (PS_L_AUTO_SHIFT_APLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ڵ���ü��û �����ȸ
     * @param dm PS_L_AUTO_SHIFT_APLCDM
     * @return PS_L_AUTO_SHIFT_APLCDataSet
     * @throws AppException
     */
    public PS_L_AUTO_SHIFT_APLCDataSet selectAplcList(PS_L_AUTO_SHIFT_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_AUTO_SHIFT_APLCDataSet ds = (PS_L_AUTO_SHIFT_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ڵ���ü��û Ȯ��/���
     * @param dm PS_U_APLCSTATDM
     * @return PS_U_APLCSTATDataSet
     * @throws AppException
     */
    public PS_U_APLCSTATDataSet updateAplc(PS_U_APLCSTATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_APLCSTATDataSet ds = (PS_U_APLCSTATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ڵ���ü��û �󼼺���
     * @param dm PS_S_APLCDM
     * @return PS_S_APLCDataSet
     * @throws AppException
     */
    public PS_S_APLCDataSet selectAplcDetail(PS_S_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_APLCDataSet ds = (PS_S_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���ڹ�ȣ�� ��ü����Ʈ ��ȸ�ϱ�
     * @param dm PS_L_MEDIDM
     * @return PS_L_MEDIDataSet
     * @throws AppException
     * /
    public PS_L_MEDIDataSet selectMediList(PS_L_MEDIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_MEDIDataSet ds = (PS_L_MEDIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� �����ϱ�
     * @param dm PS_U_APLCINFODM
     * @return PS_U_APLCINFODataSet
     * @throws AppException
     */
    public PS_U_APLCINFODataSet updateAplcInfo(PS_U_APLCINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_APLCINFODataSet ds = (PS_U_APLCINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
