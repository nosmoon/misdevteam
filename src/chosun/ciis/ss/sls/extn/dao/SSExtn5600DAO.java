/***************************************************************************************************
 * ���ϸ� : SSExtn5600DAO.java
 * ��� : Ȯ�����-���ⱸ����
 * �ۼ����� : 2018-01-08
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * DAO
 */
public class SSExtn5600DAO {
	
	public SS_SLS_EXTN_5601_LDataSet selectExtn5601(SS_SLS_EXTN_5601_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5601_LDataSet ds = (SS_SLS_EXTN_5601_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_EXTN_5610_LDataSet selectExtn5610(SS_SLS_EXTN_5610_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5610_LDataSet ds = (SS_SLS_EXTN_5610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_5620_IDataSet insertExtn5620(SS_SLS_EXTN_5620_IDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5620_IDataSet ds = (SS_SLS_EXTN_5620_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SS_SLS_EXTN_5630_UDataSet updateExtn5630(SS_SLS_EXTN_5630_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5630_UDataSet ds = (SS_SLS_EXTN_5630_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}    