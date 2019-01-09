/***************************************************************************************************
 * ���ϸ� : SSReader11000DAO.java_����Ͽ�
 * ��� : ���������� ���� DAO
 * �ۼ����� : 2016-12-07
 * �ۼ��� : �弱��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-���������� ���� DAO
 */
public class SSReader11000DAO {
    /**
     * ������Ȳ-��������-���ڰ˻� ���
     * @param dm SS_MO_L_RDR_SRCHDM ��ü
     * @return SS_MO_L_RDR_SRCHDataSet ��ü
     * @throws AppException
     */
    public SS_MO_L_RDR_SRCHDataSet mo_selectRdrSrchList(SS_MO_L_RDR_SRCHDM dm) throws AppException {  //����Ͽ�
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_RDR_SRCHDataSet ds = (SS_MO_L_RDR_SRCHDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }
}