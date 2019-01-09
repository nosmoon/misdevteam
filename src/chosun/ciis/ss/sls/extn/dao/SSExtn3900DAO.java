/***************************************************************************************************
 * ���ϸ� : SSExtn3900DAO.java
 * ��� : ����ó�̻� ���� ��ȸ
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
public class SSExtn3900DAO {

    /**
     * �ʱ�ȭ��
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_3900_ADataSet initExtn3900(SS_SLS_EXTN_3900_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3900_ADataSet ds = (SS_SLS_EXTN_3900_ADataSet) manager.executeCall(dm);
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
    public SS_SLS_EXTN_3910_LDataSet selectExtn3910(SS_SLS_EXTN_3910_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_3910_LDataSet ds = (SS_SLS_EXTN_3910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
