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

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * Ȯ����Ȳ-��û��Ȳ �� ���� DAO
 */
public class SSExtn2300DAO {
    /**
     * Ȯ����Ȳ-��û��Ȳ �ʱ�ȭ��
     * @param dm SS_L_RDR_XTN_INITDM
     * @return SS_L_RDR_XTN_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_RDR_STATS_INITDataSet init(SS_L_EXTN_RDR_STATS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_RDR_STATS_INITDataSet ds = (SS_L_EXTN_RDR_STATS_INITDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-��û��Ȳ Ȯ���û ���
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_EXTN_RDR_STATSDataSet selectRdrExtnStatList(SS_L_EXTN_RDR_STATSDM dm) throws AppException{    	
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_RDR_STATSDataSet ds = (SS_L_EXTN_RDR_STATSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
