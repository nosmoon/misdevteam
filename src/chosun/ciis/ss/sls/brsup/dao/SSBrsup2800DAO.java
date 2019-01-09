/***************************************************************************************************
* ���ϸ� : SSBrsup2800DAO.java
* ��� : ��������-������Ȳ-�������-13��������
* �ۼ����� : 2016-05-03
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ��������-����-����������
 */

public class SSBrsup2800DAO {
    
    /**
     * ��������-����-����������-�ʱ�ȭ��   
     */
    public SS_SLS_BRSUP_2800_ADataSet initBrsup2800(SS_SLS_BRSUP_2800_ADM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2800_ADataSet ds = (SS_SLS_BRSUP_2800_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    
    public SS_SLS_BRSUP_2810_LDataSet searchBrsup2810(SS_SLS_BRSUP_2810_LDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2810_LDataSet ds = (SS_SLS_BRSUP_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
}