/***************************************************************************************************
 * ���ϸ� : SSExtn3500DAO.java
 * ��� : �繫���� ���ļ��� ��ȸ
 * �ۼ����� : 2015-11-10
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
public class SSExtn3500DAO {

    /**
     * �ʱ�ȭ��
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_3500_ADataSet initExtn3500(SS_SLS_EXTN_3500_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3500_ADataSet ds = (SS_SLS_EXTN_3500_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_3510_LDataSet selectExtn3510(SS_SLS_EXTN_3510_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3510_LDataSet ds = (SS_SLS_EXTN_3510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
