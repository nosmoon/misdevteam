/***************************************************************************************************
 * ���ϸ� : SSBrinfo1500DAO.java
 * ��� : ����Info-���������� ��Ȳ�� ���� DAO
 * �ۼ����� : 2004-02-09
 * �ۼ��� : �輺��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-������������Ȳ�� ���� DAO
 */
public class SSBrinfo1500DAO {

    /**
     * ����Info-������������Ȳ-�ʱ�ȭ��(�μ���ȸ)
     * @param dm SS_L_NWBUSEOCDDM ��ü
     * @return SS_L_NWBUSEOCDDataSet ��ü
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet selectBuseoList(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-������������Ȳ-�ʱ�ȭ��(�����ȸ)
     * @param dm SS_L_LEASAMT_LISTDM ��ü
     * @return SS_L_LEASAMT_LISTDataSet ��ü
     * @throws AppException
     */

    public SS_L_LEASAMT_LISTDataSet selectLeasamtList(SS_L_LEASAMT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_LEASAMT_LISTDataSet ds = (SS_L_LEASAMT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-������������Ȳ-����ȸ
     * @param dm SS_S_LEASAMTDM ��ü
     * @return SS_S_LEASAMTDataSet ��ü
     * @throws AppException
     */

    public SS_S_LEASAMTDataSet selectDetailView(SS_S_LEASAMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_LEASAMTDataSet ds = (SS_S_LEASAMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-������������Ȳ-���� ����
     * @param dm SS_U_LEASAMTDM ��ü
     * @return SS_U_LEASAMTDataSet ��ü
     * @throws AppException
     */

    public SS_U_LEASAMTDataSet updateDetailView(SS_U_LEASAMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_LEASAMTDataSet ds = (SS_U_LEASAMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


}
