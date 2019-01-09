/***************************************************************************************************
 * ���ϸ� : SSBrsup3000DAO.java
 * ��� : ��������-����-��������̷� ���� DAO
 * �ۼ����� : 2017-12-26
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
 *  ��������-����-��������̷�
 */

public class SSBrsup3000DAO {

    /**
     *  ��������-����-��������̷�-�ʱ�ȭ��
     * @param dm SS_SLS_BRSUP_3000_ADM
     * @return SS_SLS_BRSUP_3000_ADataSet
     * @throws AppException
     */

    public SS_SLS_BRSUP_3000_ADataSet initBrsup3000(SS_SLS_BRSUP_3000_ADM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_3000_ADataSet ds = (SS_SLS_BRSUP_3000_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     *  ��������-����-��������̷�-����Ʈ
     * @param dm SS_SLS_BRSUP_3010_LDM
     * @return SS_SLS_BRSUP_3010_LDataSet
     * @throws AppException
     */

    public SS_SLS_BRSUP_3010_LDataSet selectBrsup3010(SS_SLS_BRSUP_3010_LDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_3010_LDataSet ds = (SS_SLS_BRSUP_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}