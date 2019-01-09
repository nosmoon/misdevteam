/***************************************************************************************************
 * ���ϸ� : SSExtn4400DAO.java
 * ��� : ����ó �ߺ� ����
 * �ۼ����� : 2015-12-11
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
public class SSExtn4400DAO {

    /**
     * �ʱ�ȭ��
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_4400_ADataSet initExtn4400(SS_SLS_EXTN_4400_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4400_ADataSet ds = (SS_SLS_EXTN_4400_ADataSet) manager.executeCall(dm);
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
    public SS_SLS_EXTN_4410_LDataSet selectExtn4410(SS_SLS_EXTN_4410_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4410_LDataSet ds = (SS_SLS_EXTN_4410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
