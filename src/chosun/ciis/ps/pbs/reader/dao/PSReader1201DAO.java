/***************************************************************************************************
 * ���ϸ�   : PSReader1201DAO.java
 * ���     : ����-Ȯ�嵶�ڳ���
 * �ۼ����� : 2004-02-25
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-Ȯ�嵶�ڳ���
 */
public class PSReader1201DAO {
    public PSReader1201DAO() {
    }

    /**
     * Ȯ�嵶�ڳ���-�ʱ� �� �˻�
     * @param PS_L_RDR_EXTN_SEARCHDM
     * @return PS_L_RDR_EXTN_SEARCHDataSet
     */
    public PS_L_RDR_EXTN_SEARCHDataSet selectRdr_Extn_search(PS_L_RDR_EXTN_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_RDR_EXTN_SEARCHDataSet ds = (PS_L_RDR_EXTN_SEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
