/***************************************************************************************************
* ���ϸ� : SSExtn2280EJB.java
* ��� : �ϰ�Ȯ������ ���� EJB Remote Interface
* �ۼ����� : 2011-03-30
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
 * Ȯ����Ȳ-�ϰ�Ȯ���� �� ���� DAO
 */

public class SSExtn2280DAO {
    
    /**
     * Ȯ����Ȳ-�ϰ�Ȯ��-���
     * @param dm SS_A_BATCH_EXTNDM
     * @return SS_A_BATCH_EXTNDataSet
     * @throws AppException
     */
    public SS_A_BATCH_EXTNDataSet batchExtnJob(SS_A_BATCH_EXTNDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_A_BATCH_EXTNDataSet ds = (SS_A_BATCH_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("appexception occured : "+ds.errcode+" "+ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ����Ȳ-�ϰ�Ȯ��-��ȸ
     * @param dm SS_A_BATCH_EXTNDM
     * @return SS_A_BATCH_EXTNDataSet
     * @throws AppException
     */
    public SS_L_BATCH_EXTNDataSet listBatchExtnJob(SS_L_BATCH_EXTNDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_BATCH_EXTNDataSet ds = (SS_L_BATCH_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("appexception occured : "+ds.errcode+" "+ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_IMTMDataSet IMTM(SS_L_IMTMDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_IMTMDataSet ds = (SS_L_IMTMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("appexception occured : "+ds.errcode+" "+ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
