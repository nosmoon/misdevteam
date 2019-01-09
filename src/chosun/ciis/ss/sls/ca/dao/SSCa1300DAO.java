/***************************************************************************************************
* ���ϸ�   : SSCa1300DAO.java
* ���     : ���̹�����-���̹����縶��
* �ۼ����� : 2005-07-27
* �ۼ���   : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/

package chosun.ciis.ss.sls.ca.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.dm.*;

public class SSCa1300DAO {
    /**
     * ���̹�����-���̹����縶��-������ȸ
     * @param dm SS_L_CYBALON_CLOSPTCRDM
     * @return SS_L_CYBALON_CLOSPTCRDataSet
     * @throws AppException
     */
    public SS_L_CYBALON_CLOSPTCRDataSet selectAlonClos(SS_L_CYBALON_CLOSPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CYBALON_CLOSPTCRDataSet ds = (SS_L_CYBALON_CLOSPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���̹�����-���̹����縶��-���������
     * @param dm CO_A_CYBALONCLOSDM
     * @return CO_A_CYBALONCLOSDataSet
     * @throws AppException
     */
    public CO_A_CYBALONCLOSDataSet accessAlonClos(CO_A_CYBALONCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_CYBALONCLOSDataSet ds = (CO_A_CYBALONCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}