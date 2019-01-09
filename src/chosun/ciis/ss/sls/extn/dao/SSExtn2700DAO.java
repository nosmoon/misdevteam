/***************************************************************************************************
* ���ϸ� : SSExtn2700DAO.java
* ��� : ��������� ���� DAO
* �ۼ����� : 2013-3-5
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

/**
 * Ȯ����Ȳ-������� �� ���� DAO
 */
public class SSExtn2700DAO {
    /**
     * Ȯ����Ȳ-������� �ʱ�ȭ��
     * @param dm SS_L_RDR_XTN_INITDM
     * @return SS_L_RDR_XTN_INITDataSet
     * @throws AppException
     */
    public SS_L_EMP_NWSPRDR_INITDataSet init(SS_L_EMP_NWSPRDR_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EMP_NWSPRDR_INITDataSet ds = (SS_L_EMP_NWSPRDR_INITDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_EMP_NWSPRDRDataSet selectEmpNwsprdrList(SS_L_EMP_NWSPRDRDM dm) throws AppException{    	
        DBManager manager = new DBManager("Oracle");
        SS_L_EMP_NWSPRDRDataSet ds = (SS_L_EMP_NWSPRDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_EMP_NWSPRDR_RDRDataSet selectEmpNwsprdrListRdr(SS_L_EMP_NWSPRDR_RDRDM dm) throws AppException{    	
        DBManager manager = new DBManager("Oracle");
        SS_L_EMP_NWSPRDR_RDRDataSet ds = (SS_L_EMP_NWSPRDR_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_EMP_NWSPRDRDataSet updateEmpNwsprdr(SS_A_EMP_NWSPRDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_EMP_NWSPRDRDataSet ds = (SS_A_EMP_NWSPRDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
