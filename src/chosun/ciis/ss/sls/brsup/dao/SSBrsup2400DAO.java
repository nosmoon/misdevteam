/***************************************************************************************************
 * ���ϸ�   : SSBrsup2400DAO.java
 * ���     : �ְ���������-��޺����긶��
 * �ۼ����� : 2007-04-13
 * �ۼ���   : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

public class SSBrsup2400DAO {
    /**
     * �ְ���������-��޺����긶��-���������
     * @param dm CO_A_WEEKCHOSUNCLOSDM
     * @return CO_A_WEEKCHOSUNCLOSDataSet
     * @throws AppException
     */
    public CO_A_WEEKCHOSUNCLOSDataSet ClosandCancel(CO_A_WEEKCHOSUNCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_WEEKCHOSUNCLOSDataSet ds = (CO_A_WEEKCHOSUNCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ְ���������-��޺����긶��-�ʱ�ȭ��
     * @param dm SS_L_WEEKSND_CLOSPTCRDM
     * @return SS_L_WEEKSND_CLOSPTCRDataSet
     * @throws AppException
     */
    public SS_L_WEEKSND_CLOSPTCRDataSet initClosList(SS_L_WEEKSND_CLOSPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WEEKSND_CLOSPTCRDataSet ds = (SS_L_WEEKSND_CLOSPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��������-�ְ���������-�۱ݸ�� ��������
     * @param dm SS_L_WEEKSND_CLOS_PRINTDM
     * @return SS_L_WEEKSND_CLOS_PRINTDataSet
     * @throws AppException
     */
    public SS_L_WEEKSND_CLOS_PRINTDataSet closListExcel(SS_L_WEEKSND_CLOS_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WEEKSND_CLOS_PRINTDataSet ds = (SS_L_WEEKSND_CLOS_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ְ���������-��޺����긶��-�ʱ�ȭ��
     * @param dm SS_L_WEEKSND_CLOSPTCR_SERNODM
     * @return SS_L_WEEKSND_CLOSPTCR_SERNODataSet
     * @throws AppException
     */
    public SS_L_WEEKSND_CLOSPTCR_SERNODataSet closSernoList(SS_L_WEEKSND_CLOSPTCR_SERNODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = (SS_L_WEEKSND_CLOSPTCR_SERNODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
