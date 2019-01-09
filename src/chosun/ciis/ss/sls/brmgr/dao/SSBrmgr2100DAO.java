/***************************************************************************************************
* ���ϸ� : SSBrmgr2100DAO.java
* ��� : ��������-�������������� ���� DAO
* �ۼ����� : 2013-1-25
* �ۼ��� : ������
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ��������-������������ ���� DAO
 */

public class SSBrmgr2100DAO {
    /**
     * ��������-������������-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_BO_PROXY_INITDataSet initBoProxy(SS_L_BO_PROXY_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_PROXY_INITDataSet ds = (SS_L_BO_PROXY_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 
    /**
     * ��������-������������-���
     * @param dm SS_L_QTY_SPDM
     * @return SS_L_QTY_SPDataSet
     * @throws AppException
     */
    public SS_L_BO_PROXYDataSet selectBoProxyList(SS_L_BO_PROXYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_PROXYDataSet ds = (SS_L_BO_PROXYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}