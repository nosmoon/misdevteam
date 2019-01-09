/***************************************************************************************************
 * ���ϸ� : SSExtn2000DAO.java
 * ��� :
 * �ۼ����� : 2009-05-14
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
 * Ȯ����Ȳ-������Ȳ�� ���� DAO
 */
public class SSExtn2000DAO {

    /**
     * Ȯ����Ȳ-������Ȳ-�ʱ�ȭ��
     * @param dm SS_L_EXTN_SUSP_INITDM
     * @return SS_L_EXTN_SUSP_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_SUSP_INITDataSet suspInit(SS_L_EXTN_SUSP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_SUSP_INITDataSet ds = (SS_L_EXTN_SUSP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-������Ȳ-��ȸ(������)
     * @param dm SS_L_EXTN_SUSPDM
     * @return SS_L_EXTN_SUSPDataSet
     * @throws AppException
     */
    public SS_L_EXTN_SUSPDataSet selectSuspList(SS_L_EXTN_SUSPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_SUSPDataSet ds = (SS_L_EXTN_SUSPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-������Ȳ-��ȸ(�����Ǻ�)
     * @param dm SS_L_EXTN_SUSP_PERDM
     * @return SS_L_EXTN_SUSP_PERDataSet
     * @throws AppException
     */
    public SS_L_EXTN_SUSP_PERDataSet selectSuspPerList(SS_L_EXTN_SUSP_PERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_SUSP_PERDataSet ds = (SS_L_EXTN_SUSP_PERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
