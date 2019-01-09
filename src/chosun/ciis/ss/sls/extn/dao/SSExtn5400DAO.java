/***************************************************************************************************
 * ���ϸ� : SSExtn5400DAO.java
 * ��� : ����Ŀ�Ȯ��-������������(�����ȸ)
 * �ۼ����� : 2017-10-11
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
public class SSExtn5400DAO {
		
	public SS_SLS_EXTN_5400_ADataSet initExtn5400(SS_SLS_EXTN_5400_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5400_ADataSet ds = (SS_SLS_EXTN_5400_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5410_LDataSet selectExtn5410(SS_SLS_EXTN_5410_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5410_LDataSet ds = (SS_SLS_EXTN_5410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5420_LDataSet selectExtn5420(SS_SLS_EXTN_5420_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5420_LDataSet ds = (SS_SLS_EXTN_5420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}    