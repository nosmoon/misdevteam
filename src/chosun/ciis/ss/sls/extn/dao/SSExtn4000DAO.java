/***************************************************************************************************
 * ���ϸ� : SSExtn4000DAO.java
 * ��� : �ٺμ� �Է� ���� ��ȸ
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
public class SSExtn4000DAO {

    /**
     * �ʱ�ȭ��
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_4000_ADataSet initExtn4000(SS_SLS_EXTN_4000_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4000_ADataSet ds = (SS_SLS_EXTN_4000_ADataSet) manager.executeCall(dm);
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
    public SS_SLS_EXTN_4010_LDataSet selectExtn4010(SS_SLS_EXTN_4010_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4010_LDataSet ds = (SS_SLS_EXTN_4010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
