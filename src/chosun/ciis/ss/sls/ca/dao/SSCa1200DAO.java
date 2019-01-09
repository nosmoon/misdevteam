/***************************************************************************************************
* ���ϸ�   : SSCa1200DAO.java
* ���     : ���̹�����-���̹���������
* �ۼ����� : 2005-06-22
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

public class SSCa1200DAO {
    /**
     * ���̹�����-���̹���������-��ȸ
     * @param dm SS_L_CYBALON_STAFPAYDM
     * @return SS_L_CYBALON_STAFPAYDataSet
     * @throws AppException
     */
    public SS_L_CYBALON_STAFPAYDataSet selectStafpayList(SS_L_CYBALON_STAFPAYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CYBALON_STAFPAYDataSet ds = (SS_L_CYBALON_STAFPAYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���̹�����-���̹���������-DOWNLOAD
     * @param dm SS_P_CYBALON_STAFPAYDM
     * @return SS_P_CYBALON_STAFPAYDataSet
     * @throws AppException
     */
    public SS_P_CYBALON_STAFPAYDataSet selectDownloadList(SS_P_CYBALON_STAFPAYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_CYBALON_STAFPAYDataSet ds = (SS_P_CYBALON_STAFPAYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}