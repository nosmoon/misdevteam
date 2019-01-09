/***************************************************************************************************
* ���ϸ�   : SSCa1100DAO.java
* ���     : ���̹�����-���̹�����û��
* �ۼ����� : 2005-06-20
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

public class SSCa1100DAO {
    /**
     * ���̹�����-���̹�����û��-��ȸ
     * @param dm SS_L_CYBALON_BOCLAMDM
     * @return SS_L_CYBALON_BOCLAMDataSet
     * @throws AppException
     */
    public SS_L_CYBALON_BOCLAMDataSet selectClamList(SS_L_CYBALON_BOCLAMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CYBALON_BOCLAMDataSet ds = (SS_L_CYBALON_BOCLAMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���̹�����-���̹�����û��-����
     * @param dm SS_A_CYBALON_BOCLAMCNFMDM
     * @return SS_A_CYBALON_BOCLAMCNFMDataSet
     * @throws AppException
     */
    public SS_A_CYBALON_BOCLAMCNFMDataSet updateCybalon(SS_A_CYBALON_BOCLAMCNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_CYBALON_BOCLAMCNFMDataSet ds = (SS_A_CYBALON_BOCLAMCNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}