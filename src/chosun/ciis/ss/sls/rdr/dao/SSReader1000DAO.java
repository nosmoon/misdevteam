/***************************************************************************************************
 * ���ϸ� : SSReader1000DAO.java
 * ��� : ���������� ���� DAO
 * �ۼ����� : 2003-12-26
 * �ۼ��� : ��뼷
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
public class SSReader1000DAO {
    /**
     * ������Ȳ-��������-���ڰ˻� ���
     * @param dm SS_L_RDR_SRCHDM ��ü
     * @return SS_L_RDR_SRCHDataSet ��ü
     * @throws AppException
     */
    public SS_L_RDR_SRCHDataSet selectRdrSrchList(SS_L_RDR_SRCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_SRCHDataSet ds = (SS_L_RDR_SRCHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    // �����̷��� ��������ȭ������ ��ü
}