/***************************************************************************************************
 * ���ϸ� : SSExtn5200DAO.java
 * ��� : ����Ŀ�Ȯ��-�������� ����ó��
 * �ۼ����� : 2016-10-05
 * �ۼ��� : ������
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;



/**
 * DAO
 */
public class SSExtn5200DAO {
		
    public SS_SLS_EXTN_5210_LDataSet selectExtn5210(SS_SLS_EXTN_5210_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5210_LDataSet ds = (SS_SLS_EXTN_5210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5220_UDataSet updateExtn5220(SS_SLS_EXTN_5220_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5220_UDataSet ds = (SS_SLS_EXTN_5220_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_5230_UDataSet updateExtn5230(SS_SLS_EXTN_5230_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5230_UDataSet ds = (SS_SLS_EXTN_5230_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}    