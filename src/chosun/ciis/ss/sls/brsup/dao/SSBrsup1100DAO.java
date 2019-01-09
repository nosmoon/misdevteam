/***************************************************************************************************
* ���ϸ� : SSBrsup1100DAO.java
* ��� : ��������-�Ź�������ǰ-�߼�,��� ���� DAO
* �ۼ����� : 2004-01-20
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

/**
 * ��������-�Ź�������ǰ-�߼�,��� ���� DAO
 */
public class SSBrsup1100DAO {
    /**
     * ��������-�Ź�������ǰ-�߼�-�ʱ�ȭ��
     * @param dm SS_L_NWSPITEM_CDLSTDM
     * @return SS_L_NWSPITEM_CDLSTDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEM_CDLSTDataSet initNwspItemSend(SS_L_NWSPITEM_CDLSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-�߼�-���
     * @param dm SS_L_NWSPITEMSENDDM
     * @return SS_L_NWSPITEMSENDDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMSENDDataSet selectNwspItemSendList(SS_L_NWSPITEMSENDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMSENDDataSet ds = (SS_L_NWSPITEMSENDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���-�ʱ�ȭ��
     * @param dm SS_L_NWSPITEM_CDLSTDM
     * @return SS_L_NWSPITEM_CDLSTDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEM_CDLSTDataSet initNwspItemAccd(SS_L_NWSPITEM_CDLSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���-���
     * @param dm SS_L_NWSPITEMACCDDM
     * @return SS_L_NWSPITEMACCDDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMACCDDataSet selectNwspItemAccdList(SS_L_NWSPITEMACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMACCDDataSet ds = (SS_L_NWSPITEMACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���-��
     * @param dm SS_S_NWSPITEMACCDDM
     * @return SS_S_NWSPITEMACCDDataSet
     * @throws AppException
     */
    public SS_S_NWSPITEMACCDDataSet selectNwspItemAccdDetail(SS_S_NWSPITEMACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_NWSPITEMACCDDataSet ds = (SS_S_NWSPITEMACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���-���
     * @param dm SS_A_NWSPITEMACCDDM
     * @return SS_A_NWSPITEMACCDDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMACCDDataSet insertNwspItemAccd(SS_A_NWSPITEMACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMACCDDataSet ds = (SS_A_NWSPITEMACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���-����
     * @param dm SS_A_NWSPITEMACCDDM
     * @return SS_A_NWSPITEMACCDDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMACCDDataSet updateNwspItemAccd(SS_A_NWSPITEMACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMACCDDataSet ds = (SS_A_NWSPITEMACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�Ź�������ǰ-���-����
     * @param dm SS_A_NWSPITEMACCDDM
     * @return SS_A_NWSPITEMACCDDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMACCDDataSet deleteNwspItemAccd(SS_A_NWSPITEMACCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMACCDDataSet ds = (SS_A_NWSPITEMACCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}