/***************************************************************************************************
* ���ϸ� : SSBrmgr1600DAO.java
* ��� : �����濵-�������μ���Ȳ�� ���� DAO
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
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
 * �����濵-�������μ���Ȳ�� ���� DAO
 */

public class SSBrmgr1600DAO {
    /**
     * �����濵-�������μ���Ȳ-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_QTY_SP_INITDataSet initSpQty(SS_L_QTY_SP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTY_SP_INITDataSet ds = (SS_L_QTY_SP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 
    /**
     * �����濵-�������μ���Ȳ-���
     * @param dm SS_L_QTY_SPDM
     * @return SS_L_QTY_SPDataSet
     * @throws AppException
     */
    public SS_L_QTY_SPDataSet selectSpQtyList(SS_L_QTY_SPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTY_SPDataSet ds = (SS_L_QTY_SPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-�������μ���Ȳ-�μ�
     * @param dm SS_L_QTY_SP_EXCELDM
     * @return SS_L_QTY_SP_EXCELDataSet
     * @throws AppException
     */
    public SS_L_QTY_SP_EXCELDataSet printSpQtyExcel(SS_L_QTY_SP_EXCELDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTY_SP_EXCELDataSet ds = (SS_L_QTY_SP_EXCELDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}