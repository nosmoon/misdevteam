/***************************************************************************************************
* ���ϸ� : SSExtn1000DAO.java
* ��� : Ȯ���û�� ���� DAO
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
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

/**
 * Ȯ����Ȳ-��û��Ȳ �� ���� DAO
 */
public class SSHealth1000DAO {
    /**
     * ��ũ�� ���� �ʱ�ȭ��     
     */
    public SS_L_WORKBOOK_APLC_INITDataSet init(SS_L_WORKBOOK_APLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WORKBOOK_APLC_INITDataSet ds = (SS_L_WORKBOOK_APLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_WORKBOOK_APLCDataSet selectWorkbook(SS_L_WORKBOOK_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WORKBOOK_APLCDataSet ds = (SS_L_WORKBOOK_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_S_WORKBOOK_APLCDataSet detailWorkbook(SS_S_WORKBOOK_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_WORKBOOK_APLCDataSet ds = (SS_S_WORKBOOK_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_WORKBOOK_APLCDataSet saveWorkbook(SS_A_WORKBOOK_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WORKBOOK_APLCDataSet ds = (SS_A_WORKBOOK_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
