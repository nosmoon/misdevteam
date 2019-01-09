/***************************************************************************************************
 * ���ϸ� : SSExtn4500DAO.java
 * ��� : ����������DAO
 * �ۼ����� : 2016.01.29
 * �ۼ��� : �弱��
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
 * �������˵��ڰ��� DAO
 */
public class SSExtn4500DAO {

    /**
     * ����������-��ȸ
     * @param  SS_L_FREENWSPDM
     * @return SS_L_FREENWSPDataSet
     * @throws AppException
     */
    public SS_L_FREENWSPDataSet freeNwspList(SS_L_FREENWSPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_FREENWSPDataSet ds = (SS_L_FREENWSPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }







}
