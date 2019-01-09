/***************************************************************************************************
* ���ϸ� : SSBrsup1300DAO.java
* ��� : ��������-���غ���-���,�űԽ�û,�����û�� ���� DAO
* �ۼ����� : 2004-02-10
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ��������-���غ���-���,�űԽ�û,�����û�� ���� DAO
 */

public class SSBrsup1300DAO {
    /**
     * ��������-���غ���-���-���
     * @param dm SS_L_INSRDM
     * @return SS_L_INSRDataSet
     * @throws AppException
     */
    public SS_L_INSRDataSet selectInsrList(SS_L_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRDataSet ds = (SS_L_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-��
     * @param dm SS_S_INSRDM
     * @return SS_S_INSRDataSet
     * @throws AppException
     */
    public SS_S_INSRDataSet selectInsrDetail(SS_S_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INSRDataSet ds = (SS_S_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-���
     * @param dm SS_A_INSRDM
     * @return SS_A_INSRDataSet
     * @throws AppException
     */
    public SS_A_INSRDataSet insertInsr(SS_A_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRDataSet ds = (SS_A_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-����
     * @param dm SS_A_INSRDM
     * @return SS_A_INSRDataSet
     * @throws AppException
     */
    public SS_A_INSRDataSet updateInsr(SS_A_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRDataSet ds = (SS_A_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-���-����
     * @param dm SS_A_INSRDM
     * @return SS_A_INSRDataSet
     * @throws AppException
     */
    public SS_A_INSRDataSet deleteInsr(SS_A_INSRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_INSRDataSet ds = (SS_A_INSRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-��û-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLC_INITDataSet initInsrAplc(SS_L_INSRAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLC_INITDataSet ds = (SS_L_INSRAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-��û-���
     * @param dm SS_L_INSRAPLCDM
     * @return SS_L_INSRAPLCDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLCDataSet selectInsrAplcList(SS_L_INSRAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLCDataSet ds = (SS_L_INSRAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-��û-����(����)
     * @param dm SS_U_INSRAPLCDM
     * @return SS_U_INSRAPLCDataSet
     * @throws AppException
     */
    public SS_U_INSRAPLCDataSet updateInsrAplc(SS_U_INSRAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_INSRAPLCDataSet ds = (SS_U_INSRAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-��û-��
     * @param dm SS_S_INSRAPLCDM
     * @return SS_S_INSRAPLCDataSet
     * @throws AppException
     */
    public SS_S_INSRAPLCDataSet selectInsrAplcDetail(SS_S_INSRAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INSRAPLCDataSet ds = (SS_S_INSRAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-����-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLC_INITDataSet initInsrChg(SS_L_INSRAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLC_INITDataSet ds = (SS_L_INSRAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-���غ���-����-���
     * @param dm SS_L_INSRAPLC_CHGDM
     * @return SS_L_INSRAPLC_CHGDataSet
     * @throws AppException
     */
    public SS_L_INSRAPLC_CHGDataSet selectInsrChgList(SS_L_INSRAPLC_CHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_INSRAPLC_CHGDataSet ds = (SS_L_INSRAPLC_CHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}