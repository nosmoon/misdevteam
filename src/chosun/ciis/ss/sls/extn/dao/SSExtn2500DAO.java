/***************************************************************************************************
 * ���ϸ� : SSExtn2100DAO.java
 * ��� :
 * �ۼ����� : 2009-05-20
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
 * Ȯ����Ȳ-����Ȯ���� ���� DAO
 */
public class SSExtn2500DAO {
    
    /**
     * Ȯ����Ȳ-��üȮ��-Ȯ���� ���ε�
     * @param dm SS_I_EXTN_PATYRDRDM
     * @return SS_I_EXTN_PATYRDRDataSet
     * @throws AppException
     */
    public SS_I_EXTN_PATYRDR_NEWDataSet uploadExtn(SS_I_EXTN_PATYRDR_NEWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_PATYRDR_NEWDataSet ds = (SS_I_EXTN_PATYRDR_NEWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-��üȮ��-Ȯ���� ��ȸ
     * @param dm SS_L_EXTN_PATYDM
     * @return SS_L_EXTN_PATYDataSet
     * @throws AppException
     */
    public SS_L_EXTN_PATY_NEWDataSet getUserInfo(SS_L_EXTN_PATY_NEWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_PATY_NEWDataSet ds = (SS_L_EXTN_PATY_NEWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
