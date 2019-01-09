/***************************************************************************************************
* ���ϸ� : SSHealth1100DAO.java
* ��� : ��ũ�ϸ���
* �ۼ����� : 2015-1-5
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.health.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.dm.*;

public class SSHealth1100DAO {
        
    public SS_L_WORKBOOK_SENDCLSDataSet selectWorkbookSend(SS_L_WORKBOOK_SENDCLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WORKBOOK_SENDCLSDataSet ds = (SS_L_WORKBOOK_SENDCLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_S_WORKBOOK_SENDCLSDataSet detailWorkbookSend(SS_S_WORKBOOK_SENDCLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_WORKBOOK_SENDCLSDataSet ds = (SS_S_WORKBOOK_SENDCLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_WORKBOOK_SENDCLSDataSet saveWorkbookSend(SS_A_WORKBOOK_SENDCLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WORKBOOK_SENDCLSDataSet ds = (SS_A_WORKBOOK_SENDCLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
